public static boolean isScrollable(ResultSet rs){
  if(rs==null)
    return false;

  try{
    int type=rs.getType();
    if(type==ResultSet.TYPE_SCROLL_INSENSIVE||
	type==ResultSet.TYPE_SCROLL_SENSIVE)
      return true;
    return false;
  }catch(SQLException e){
    return false;
  }
}
