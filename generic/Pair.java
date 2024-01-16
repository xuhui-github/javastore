package generic;
class Pair<T> {
  private T first;
  private T second;

  public Pair(T first,T second){
	this.first=first;
	this.second=second;
  }
  public Pair(){
	first=null;
	second=null;
  }

  public T getFirst(){
	return first;
  }
  public T getSecond(){
	return second;
  }
  public void setFirst(T first){
	this.first=first;
  }
  public void setSecond(T last){
	this.second=second;
  }
}

