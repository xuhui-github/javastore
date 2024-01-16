public enum Season3{
  WINTER {
    public void printHours(){
      System.out.println("short hours");
    }
    public String getName(){
      return this.name();
    }
  },SUMMER {
    public void printHours(){
      System.out.println("long hours");
    }},SPRING,FALL;

    public void printHours(){
      System.out.println("default hours");
    }
    public static void main(String[] args){
      for(Season3 s3 : Season3.values())
	s3.printHours();
      Season3 val=Season3.FALL;
      val.printHours();
      Season3.WINTER.printHours();
      String name=Season3.WINTER.getName();
      System.out.println("name is "+name);
    }
  }
