class Exp7b {
public static void main(String[] args) {
StringBuffer s1= new StringBuffer("Loner");
s1.append("Tiger");
System.out.println(s1);
StringBuffer s2=new StringBuffer("Tiger");
s2.insert(0,"s");
System.out.println(s2);
StringBuffer s3=new StringBuffer("Tiger");
s3.replace(0,2,"zzz");
System.out.println(s3);
StringBuffer s4=new StringBuffer("Tiger");
s4.delete(0,1);
System.out.println(s4);
StringBuffer s5=new StringBuffer("Tiger");
s5.reverse();
System.out.println(s5);
StringBuffer s6=new StringBuffer(“Tiger");
System.out.println(s6.capacity());
StringBuffer s7=new StringBuffer("Tiger");
System.out.println(s7.charAt(4));
StringBuffer s8= new StringBuffer("Tiger");
System.out.println(s8.length());
StringBuffer s9=new StringBuffer("Tiger");
System.out.println(s9.substring(2));
StringBuffer s10=new StringBuffer("Tiger");
s10.substring(0,3);
System.out.println(s10.substring(0,3));
}
}