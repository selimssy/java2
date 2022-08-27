package api;

import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;

public class Ex05_Date_sdf_Calendar {

	public static void main(String[] args) {
		
		// Date 클래스 : 현재 시스템의 시간으로 객체를 만듦
		// 그 외에는 잘 사용하지 않는다
		Date now = new Date();  // util 패키지에 있는거 import해야!
		System.out.println(now);  // Sat Aug 27 19:05:23 KST 2022
		
		
		// 포맷 -> 문자열로 반환
		SimpleDateFormat date = new SimpleDateFormat("yyyy.MM.dd");
		SimpleDateFormat time = new SimpleDateFormat("a hh:mm:ss");   // a는 오전오후
		
		
		System.out.println(date.format(now));  // 2022.08.27
		System.out.println(time.format(now));  // 오후 07:09:07
		
		
		
		
		
		// Calendar 클래스
		
		Calendar cal = Calendar.getInstance();
		
		int year = cal.get(Calendar.YEAR);
		
		// 컴퓨터의 월과 사람의 월은 다르다(컴퓨터의 월은 0월부터 11월까지 / 따라서 사람 월에 맞추려면 +1을 해줘야!)
		int month = cal.get(Calendar.MONTH) + 1;
		int day = cal.get(Calendar.DAY_OF_MONTH);
		
		System.out.printf("오늘의 날짜 : %d년 %d월 %d일 \n", year, month, day);   // 오늘의 날짜 : 2022년 8월 27일 
		
		
		cal.get(Calendar.HOUR);  // 12시간제
		int hour = cal.get(Calendar.HOUR_OF_DAY);  // 24시간제
		
		int minute = cal.get(Calendar.MINUTE);
		
		int second = cal.get(Calendar.SECOND);
		
		System.out.printf("현재 시간 : %d시 %d분 %d초\n", hour, minute, second);  // 현재 시간 : 19시 16분 33초
		
		
		
		// Date 클래스랑 Calendar 클래스 언제 사용하는지 차이점 알아보자
		
	}

}
