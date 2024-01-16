package mysql;
import java.sql.*;
import java.util.*;
import java.util.Enumeration;
import java.lang.Class;
import java.sql.*;

class driverdemo{
public static void main(String[] args) throws Exception{

  String driverName="org.gjt.mm.mysql.Driver";
  Class driverClass=Class.forName(driverName);
  DriverManager.registerDriver((Driver)driverClass.newInstance());

  java.util.Enumeration e=java.sql.DriverManager.getDrivers();
  while(e.hasMoreElements()){
    Object driverAsObject=e.nextElement();
    System.out.println("JDBC Driver="+driverAsObject);
  }
}
}

