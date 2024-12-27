import java.sql.*;
import java.util.List;
public class getConnection{
  static{
    try {
      Class.forName("com.mysql.cj.jdbc.Driver");
    }catch(ClassNotFoundException e){
      e.printStackTrace();
    }
  }
  public static void main(String[] args){
    String dbURL="jdbc:mysql://localhost:3306/";
    String user="xuhui";
    String passwd="flower";
    Connection con=null;

    try{
      con=DriverManager.getConnection(dbURL,
	                              user,
				      passwd);
      System.out.println("connected mysql");
    }catch(SQLException e){
      e.printStackTrace();
    }finally{
      try{
	con.close();
	System.out.println("closed mysql");
      }catch(SQLException e){
	e.printStackTrace();
      }
    }
  }
}
      
      
