import java.net.*; 
import java.io.*; 
class MyServer1{ 
public static void main(String args[])throws Exception{ 
ServerSocket ss=new ServerSocket(6666); 
Socket s=ss.accept(); 
Socket sa=ss.accept(); 
DataInputStream din=new DataInputStream(s.getInputStream()); 
DataOutputStream dout=new DataOutputStream(s.getOutputStream()); 
BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
DataInputStream dins=new DataInputStream(sa.getInputStream()); 
DataOutputStream douts=new DataOutputStream(sa.getOutputStream()); 
BufferedReader brs=new BufferedReader(new InputStreamReader(System.in)); 
String str="",str2="",str3="",str4=""; 
while(!str.equals("stop")){ 
str=din.readUTF(); 
System.out.println("client1 says: "+str); 
str2=br.readLine(); 
dout.writeUTF(str2); 
dout.flush(); 
str3=dins.readUTF(); 
System.out.println("client2 says: "+str3); 
str4=brs.readLine(); 
douts.writeUTF(str4); 
douts.flush(); 
} 
din.close(); 
s.close(); 
dins.close(); 
sa.close(); 
ss.close(); 
}}
