import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.nio.file.attribute.BasicFileAttributeView;
import java.nio.file.attribute.FileTime;
import java.nio.file.attribute.*;
import java.nio.file.attribute.DosFileAttributes;

import static java.nio.file.LinkOption.NOFOLLOW_LINKS;
public class iodemo{
  public static void main(String[] args){
	Path path=Paths.get("/home/xuhui/java/io","iodemo.java");
	Long time=System.currentTimeMillis();
	FileTime fileTime=FileTime.fromMillis(time);
	try{
	  Files.getFileAttributeView(path, BasicFileAttributeView.class).setTimes(fileTime,fileTime,fileTime);
	  Files.setAttribute(path,"basic:creationTime",fileTime,NOFOLLOW_LINKS);
	}catch(IOException e){
	  System.err.println(e);
	}

	time=System.currentTimeMillis();
	time += 1000000;
	 fileTime=FileTime.fromMillis(time);
	try{
	  Files.setLastModifiedTime(path,fileTime);
	  fileTime creationTime=(FileTime)Files.getAttribute(path,"basic:lastAccessTime",NOFOLLOW_LINKS);
	  System.out.println("creationTime is " + fileTime);
	}catch(IOException e){
	  System.err.println(e);
	}
  }
}

