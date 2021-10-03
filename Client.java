import java.net.*;
import java.io.*;
class Client
{
  public static void main(String args[])throws Exception
   {
     String msg;
    Socket sk=new Socket(InetAddress.getLocalHost(),1095);
    System.out.println(" client is connected"+sk.isConnected());
    System.out.println(" port"+sk.getPort());
    System.out.println(" Local port"+sk.getLocalPort());
    System.out.println(" Message from server ");
    String servermsg;
    DataInputStream dis=new DataInputStream(sk.getInputStream());
   while(true)
    {
       servermsg=new String(dis.readUTF());
       System.out.println(servermsg);
    } 
  }
}