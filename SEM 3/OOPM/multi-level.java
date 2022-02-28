class Employee{  
	int id;	  
	String fname;  
	Employee(int id,String fname)
	{  
		this.id=id;  
		this.fname=fname;  
	}  
}  
class Emp extends Employee{  
	float salary;  
	Emp(int id,String fname,float salary){  
		super(id,fname);  
		this.salary=salary;  
	}  
	void display(){System.out.println(id+" "+fname+" "+salary);}  
}  
class Test{  
	public static void main(String[] args){  
		Emp e1=new Emp(192120,"Keegan",45000f);  
		e1.display();  
	}
}