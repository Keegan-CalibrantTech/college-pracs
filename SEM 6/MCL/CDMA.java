import java.util.*;

public class CDMA {

	private int[][] wtable;
	private int[][] copy;
	private int[] channel_sequence;

	public void setUp(int[] data, int num_stations)
	{

		wtable = new int[num_stations][num_stations];
		copy = new int[num_stations][num_stations];

		tableStationData(num_stations, 0, num_stations - 1, 0, num_stations - 1, false);

		showTableStationData(num_stations);

		for (int i = 0; i < num_stations; i++) {

			for (int j = 0; j < num_stations; j++) {
				copy[i][j] = wtable[i][j];
				wtable[i][j] *= data[i];
			}
		}

		channel_sequence = new int[num_stations];

		for (int i = 0; i < num_stations; i++) {

			for (int j = 0; j < num_stations; j++) {
				channel_sequence[i] += wtable[j][i];
			}
		}
	}

	public void listenTo(int sourceStation, int num_stations)
	{
		int innerProduct = 0;
		
		for (int i = 0; i < num_stations; i++) {
			innerProduct += copy[sourceStation][i] * channel_sequence[i];
		}
		
		System.out.println("The data received is: " +
							(innerProduct / num_stations));
	}

	public int tableStationData(int len, int i1, int i2, int j1, int j2, boolean isBar)
	{
		if (len == 2) {

			if (!isBar) {

				wtable[i1][j1] = 1;
				wtable[i1][j2] = 1;
				wtable[i2][j1] = 1;
				wtable[i2][j2] = -1;
			}
			else {

				wtable[i1][j1] = -1;
				wtable[i1][j2] = -1;
				wtable[i2][j1] = -1;
				wtable[i2][j2] = +1;
			}

			return 0;
		}
		
		int midi = (i1 + i2) / 2;
		int midj = (j1 + j2) / 2;

		tableStationData(len / 2, i1, midi, j1, midj, isBar);
		tableStationData(len / 2, i1, midi, midj + 1, j2, isBar);
		tableStationData(len / 2, midi + 1, i2, j1, midj, isBar);
		tableStationData(len / 2, midi + 1, i2, midj + 1, j2, !isBar);

		return 0;
	}

	public void showTableStationData(int num_stations)
	{

		System.out.print("\n");

		for (int i = 0; i < num_stations; i++) {
			for (int j = 0; j < num_stations; j++) {
				System.out.print(wtable[i][j] + " ");
			}
			System.out.print("\n");
		}
		System.out.println("-------------------------");
		System.out.print("\n");
	}
	
	// Driver Code
	public static void main(String[] args)
	{
		Scanner sc= new Scanner(System.in);
        int num_stations = 4;
		
		int[] data = new int[num_stations];
		System.out.print("Enter the data bits corresponding to each station:");
        for(int i=0; i<num_stations; i++)  
        {  
        //reading array elements from the user   
            data[i]=sc.nextInt();  
        }  
		
		CDMA channel = new CDMA();
		
		channel.setUp(data, num_stations);

		// station you want to listen to
        System.out.print("Enter station you want to listen to: ");  
        int sourceStation= sc.nextInt();

		channel.listenTo(sourceStation, num_stations);
	}
}
