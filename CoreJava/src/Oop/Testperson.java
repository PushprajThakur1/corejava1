package Oop;

import java.text.ParseException;
import java.text.SimpleDateFormat;

public class Testperson {
	public static void main(String[] args) throws ParseException {
		Person s = new Person ();
		
		SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");
		
		s.setstr("pushpraj");
		s.SetD(sdf.parse("15/07/2005"));
		s.setAddress("jawar");
		
		System.out.println(s.getStr());
		System.out.println(s.getD());
		System.out.println(s.getAddress());
		System.out.println(s.getAVG_AGE());
		
		
		
	}

}
