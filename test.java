import java.io.File;
import java.nio.*;
import java.io.StringBufferInputStream;
import java.sql.Connection;
public class test{

  
    public static void main(String[] args){ 
        String str=new String("eh");
		StringBufferInputStream in=new StringBufferInputStream(str);
		int count=0;
		byte buf[] =new byte[1024];
		
		while((count=in.read(buf,0,1024))!=-1){
		  String content=new String(buf,0,count);
		  		
		  System.out.println("count="+count+" str="+ new String(buf,0,count) );

		}
		







        
    }
}
