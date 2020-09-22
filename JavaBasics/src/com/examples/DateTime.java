package com.examples;

import java.time.*;

public class DateTime {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		LocalDate date = LocalDate.now();
        LocalTime time = LocalTime.now();
        System.out.println("Date: "+date);
        System.out.println("Time: "+time);
        int dd = date.getDayOfMonth();
        int mm = date.getMonthValue();
        int yyyy = date.getYear();
        System.out.println(dd+" day of "+mm+" month  and year is "+yyyy);
        System.out.printf("\n%d-%d-%d",dd,mm,yyyy);
        System.out.println(" ");
        
        int hour = time.getHour();
        int mins = time.getMinute();
        int secs = time.getSecond();
        int nsecs = time.getNano();
        
        System.out.println(hour+"::"+mins+" ::" +secs);
        
        
        LocalDateTime ldt = LocalDateTime.now();
        System.out.println(ldt);
        
        System.out.println(ldt.minusDays(1));

 

        ZoneId zone = ZoneId.systemDefault(); 
        System.out.println(zone);
        
        ZoneId la = ZoneId.of("America/Los_Angeles");
        ZonedDateTime zt = ZonedDateTime.now(la);
        System.out.println(zt);
        
        
        LocalDate today = LocalDate.now();
        LocalDate birthday = LocalDate.of(1989,06,15);
        Period p = Period.between(birthday,today);
        System.out.printf("age is %d year %d months %d days",p.getYears(),p.getMonths(),p.getDays());
        

	}

}
