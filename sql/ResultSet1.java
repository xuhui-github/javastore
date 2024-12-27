ResultSet rs=null;
Statement stmt=null;
Connection con=null;

try{
  con=getConnection();

  stmt=con.createStatement(
      ResultSet.TYPE_SCROLL_SENSIVE,
      ResultSet.CONCUR_READ_ONLY);
  String query="select id,name from employees";
  rs=stmt.executeQuey(query);
}catch(SQLException e){
}finally{
}
