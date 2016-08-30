package day14scope;

import java.text.SimpleDateFormat;
import java.util.Calendar;

public class CalendarPractice {

	public static void main(String[] args) {
		Calendar calendar = Calendar.getInstance();
		calendar.add(Calendar.DATE, 0); // 0 means today, 10 means 10 days from today
		System.out.println(calendar.getTime());
		SimpleDateFormat simpleDateFormat = new SimpleDateFormat("dd-MM-yyyy");
		String string = simpleDateFormat.format(calendar.getTime());
		System.out.println(string);		
	}

}
