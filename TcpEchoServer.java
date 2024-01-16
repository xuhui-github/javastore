import java.net.*;
import java.io.*;

public class TcpEchoServer{
	private static final int BUFSIZE=32;
	public static void main(String[] args)throws IOException{
		if(args.length!=1)
		throw new IllegalArgumentException("Parameter<s> :(port)");

		int port=Integer.parseInt(args[0]);
		ServerSocket server=new ServerSocket(port);

		byte buf[]=new byte[BUFSIZE];
		int count=0;
		while(true){
			Socket client=server.accept();
			System.out.println("Client come from "+client.getInetAddress().getHostAddress()+" port "+client.getPort());
			InputStream client_in=client.getInputStream();
			OutputStream client_out=client.getOutputStream();
			while((count=client_in.read(buf))!=-1)
			client_out.write(buf,0,count);
			client.close();

		}
	}
}