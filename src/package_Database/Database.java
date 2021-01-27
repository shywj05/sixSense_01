package package_Database;

import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.List;
import java.util.Scanner;

import package_VO.CustomerVO;

public class Database {
	

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		//손님 저장 할곳
		List<CustomerVO> cusVO = new ArrayList<>();
		//손님 생성
		CustomerVO c1= new CustomerVO();
		
		c1.setCustomerID("aaaa1");
		c1.setPassword("00001");
		c1.setName("박상빈");
		c1.setAddress("대전");
		c1.setBirthday("930000-1000000");
		c1.setPoint(10000);
		
		CustomerVO c2= new CustomerVO();
		
		c2.setCustomerID("aaaa2");
		c2.setPassword("00001");
		c2.setName("민선");
		c2.setAddress("대전");
		c2.setBirthday("930000-1000000");
		c2.setPoint(10000);
		
		
		CustomerVO c3= new CustomerVO();
		
		c3.setCustomerID("aaaa3");
		c3.setPassword("00001");
		c3.setName("원제");
		c3.setAddress("대전");
		c3.setBirthday("930000-1000000");
		c3.setPoint(10000);
		
		
		CustomerVO c4= new CustomerVO();
		
		c4.setCustomerID("aaaa4");
		c4.setPassword("00001");
		c4.setName("세웅");
		c4.setAddress("대전");
		c4.setBirthday("930000-1000000");
		c4.setPoint(10000);
		
		CustomerVO c5= new CustomerVO();
		
		c5.setCustomerID("aaaa6");
		c5.setPassword("00001");
		c5.setName("학재");
		c5.setAddress("대전");
		c5.setBirthday("930000-1000000");
		c5.setPoint(50000);
		
		
		//cusVO에 손님 저장
		cusVO.add(c1);
		cusVO.add(c2);
		cusVO.add(c3);
		cusVO.add(c4);
		cusVO.add(c5);
		System.out.println(cusVO.toString()+"\r");
		
		System.out.println(cusVO.size());
		
		//날짜 구하는 방법
		SimpleDateFormat format1 = new SimpleDateFormat("yyyy-MM-dd");
		
		Calendar time = Calendar.getInstance();
		
		String format_time1 = format1.format(time.getTime());
		
		System.out.println(format_time1);
	}

}
