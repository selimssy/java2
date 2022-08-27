package api;

import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;

public class Ex05_Date_sdf_Calendar {

	public static void main(String[] args) {
		
		// Date Ŭ���� : ���� �ý����� �ð����� ��ü�� ����
		// �� �ܿ��� �� ������� �ʴ´�
		Date now = new Date();  // util ��Ű���� �ִ°� import�ؾ�!
		System.out.println(now);  // Sat Aug 27 19:05:23 KST 2022
		
		
		// ���� -> ���ڿ��� ��ȯ
		SimpleDateFormat date = new SimpleDateFormat("yyyy.MM.dd");
		SimpleDateFormat time = new SimpleDateFormat("a hh:mm:ss");   // a�� ��������
		
		
		System.out.println(date.format(now));  // 2022.08.27
		System.out.println(time.format(now));  // ���� 07:09:07
		
		
		
		
		
		// Calendar Ŭ����
		
		Calendar cal = Calendar.getInstance();
		
		int year = cal.get(Calendar.YEAR);
		
		// ��ǻ���� ���� ����� ���� �ٸ���(��ǻ���� ���� 0������ 11������ / ���� ��� ���� ���߷��� +1�� �����!)
		int month = cal.get(Calendar.MONTH) + 1;
		int day = cal.get(Calendar.DAY_OF_MONTH);
		
		System.out.printf("������ ��¥ : %d�� %d�� %d�� \n", year, month, day);   // ������ ��¥ : 2022�� 8�� 27�� 
		
		
		cal.get(Calendar.HOUR);  // 12�ð���
		int hour = cal.get(Calendar.HOUR_OF_DAY);  // 24�ð���
		
		int minute = cal.get(Calendar.MINUTE);
		
		int second = cal.get(Calendar.SECOND);
		
		System.out.printf("���� �ð� : %d�� %d�� %d��\n", hour, minute, second);  // ���� �ð� : 19�� 16�� 33��
		
		
		
		// Date Ŭ������ Calendar Ŭ���� ���� ����ϴ��� ������ �˾ƺ���
		
	}

}
