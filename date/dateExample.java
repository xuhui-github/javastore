import java.time.LocalDate;
import java.util.Date;
import java.time.LocalTime;
import java.time.LocalDateTime;
public class dateExample{
	public static void main(String[] args){
		Date date=new Date();
		System.out.println(date);
		
		System.out.println(date.toLocaleString());
		System.out.println(date.toGMTString());
		System.out.println(date.getDay());

		LocalDate localDate=LocalDate.now();
		System.out.println(localDate.getDayOfWeek());
	}
}





