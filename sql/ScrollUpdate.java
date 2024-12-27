try{
  con=getConnection();
  stmt=con.createStatement(
      ResultSet.TYPE_SCROLL_SENSIVE,
      ResultSet.CONCUR_UPDATABLE);
  rs=stmt.executeQuey("select * from my_table");

  rs.first();
  rs.updateString("column_1","new data");
  rs.updateRow();
  //rs.cancelRowUpdates();
}catch(SQLException e){
  //handle exception
}finally{
}
