import java.util.Scanner;
import java.io.IOException;

public class ReadLine{
  public static void main(String[] args)throws IOException{
    Scanner scan=new Scanner(System.in);
    System.out.printf("Name: ");
    String name=scan.nextLine();
    System.out.println("name is "+name);
    System.out.printf("Age: ");
    int age=scan.nextInt();
    System.out.println("age is "+age);
    
  }
}

class A{
}
class B{
    public static void main(String[] args){
	System.out.println("hello\n");
    }
}
