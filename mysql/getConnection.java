import java.sql.*;
import java.util.List;
public class getConnection{
  static{
    try {
      Class.forName("org.gjt.mm.mysql.Driver");
    }catch(ClassNotFoundException e){
      e.printStackTrace();
    }
  }
  public static void main(String[] args){
    String dbURL="jdbc:mysql://localhost:3306/";
    String user="root";
    String passwd="flower";
    Connection con=null;

    try{
      con=DriverManager.getConnection(dbURL,
	                              user,
				      passwd);
    }catch(SQLException e){
      e.printStackTrace();
    }finally{
      try{
	con.close();
      }catch(SQLException e){
	e.printStackTrace();
      }
    }
  }
}
      
      
