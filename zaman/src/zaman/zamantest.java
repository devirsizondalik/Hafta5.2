package zaman;

import java.util.Scanner;

public class zamantest {

	public static void main(String[] args) {
		int hour;
		int minute;
		int second;
		Scanner input=new Scanner (System.in);
		
		System.out.println("Saati Gitiniz: ");
		hour=input.nextInt();
		
		System.out.println("Dakikayı Gitiniz: ");
		minute=input.nextInt();
		
		System.out.println("Saniyeyi Gitiniz: ");
		second=input.nextInt();
		
		time1 z=new time1(hour, minute, second);
		System.out.println(z.display());
		z.setHour(11);
		System.out.println(z.display());
		z.setsaat(25, 33, 45);
		System.out.println(z.display());
		time1.say();
		time1 z2=new time1(hour, second);
		time1 z3=new time1(hour);
		System.out.println(z.display());
		System.out.println(z2.display());
		System.out.println(z3.display());
		

	}

}
