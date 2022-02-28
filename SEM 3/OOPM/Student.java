class Student
{
     int roll,age,number;
     String name;
     Student()
     {
          roll=0;
          name=null;
          age=0;
          course=null;
     }
     Student(int r,String n,int a,int c)
     {
          roll=r;
          course=c;
          int l,temp=0,k=10;
	  int r[]=new int[10];
          l = n.length();
          for(int i=0;i<l;i++)
          {
               char ch;
               ch=n.charAt(i);
               if(ch<'A' || ch>'Z' && ch<'a' || ch>'z')
                    temp=1;
          }
	  for(int j=0;j<k;j++)
	  {
		r[j]=sc.nextInt();
		
	  }
	  try
	  {
          	if(r[i]<0||r[i]>9);
			throw new NumberNotValidException();
		else
			number=
          }	
          try
          {
               if(temp==1)
                    throw new NameNotValidException();
               else
                    name=n;
          }
          catch(NameNotValidException e2)
          {
               System.out.println(e2);
          }
          try
          {
               if(a>=15 && a<=21)
                    age=a;
               else
                    throw new AgeNotWithInRangeException();
          }
          catch(AgeNotWithInRangeException e1)
          {
               System.out.println(e1);
          }
     }
     void display()
     {
          System.out.println("Roll Name Age Course");
          System.out.println("---------------------");
          System.out.println(roll+" "+name+" "+age+" " +course);
     }
}