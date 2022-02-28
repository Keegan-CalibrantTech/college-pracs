class Book{
	String Name;
	int pages;
	double price;
	Book(String n,int p,double pr){
		Name = n;
		pages=p;
		price=pr;
	}

	void Display(){
			System.out.println("Name of book : "+Name);
			System.out.println("Pages : "+pages);
			System.out.println("Price : "+price);
			System.out.println("");
	}
}

 class Exp3{
	public static void main(String args[]){
		Book[] obj = new Book[5];
		obj[0]= new Book("Life of Pie",1332,590);
		obj[1]= new Book("Java refrence book",984,399);
		obj[2]= new Book("The Little",590,250);
		obj[3]= new Book("Shapness of sword",600,385);
		obj[4]= new Book("Hardworking Boys",402,200);

		obj[0].Display();
		obj[1].Display();
		obj[2].Display();
		obj[3].Display();
		obj[4].Display();
	}
}
