Result rs=null;
Statement stmt=null;
Connection con=null;

try{
  con=getConnection();
  stmt=con.createStatement(ResultSet.TYPE_SCROLL_INSENSIVE,
                           ResultSet.CONCUR_READ_ONLY);
  String quey="select id,name from employees";
  rs=stmt.executeQuery(query)
}catch(SQLException e){
  //handle the exception
}finally{
  //close resources:ResultSet,Statement,and Connection objects
}
