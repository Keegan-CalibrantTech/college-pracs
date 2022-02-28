import java.net.*; 
import java.io.*; 
class MyClient_2{ public static void main(String args[])throws Exception{ 
Socket sa=new Socket("localhost",6666); 
DataInputStream dins=new DataInputStream(sa.getInputStream()); 
DataOutputStream douts=new DataOutputStream(sa.getOutputStream()); 
BufferedReader brs=new BufferedReader(new InputStreamReader(System.in)); 

String str3="",str4=""; 
while(!str3.equals("stop")){
str3=brs.readLine(); 
douts.writeUTF(str3); 
douts.flush();
str4=dins.readUTF(); 
System.out.println("Server says: "+str4); 
} 
douts.close(); 
sa.close(); 
}} 
