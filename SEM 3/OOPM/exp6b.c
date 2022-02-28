import java.util.*;
public class SumofRowColumn  
{  
    public static void main(String[] args) {  
        int i, j, rows, cols, sumCol;  
          
            
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter number of rows in the array: ");
        rows = sc.nextInt();
        System.out.print("Enter number of columns in the array: ");
        cols = sc.nextInt();
        int arr[][] = new int[rows][cols];
        System.out.println("Enter elements of the array: ");
        for(i=0; i<rows; i++)
        {
            for(j=0; j<cols; j++)
                arr[i][j] = sc.nextInt();
        }
            
          
        //Calculates sum of each column of given matrix  
        for(i = 0; i < cols; i++){  
            sumCol = 0;  
            for(j = 0; j < rows; j++){  
              sumCol = sumCol + arr[j][i];  
            }  
            System.out.println("Sum of " + (i+1) +" column: " + sumCol);  
        }  
    }  
}