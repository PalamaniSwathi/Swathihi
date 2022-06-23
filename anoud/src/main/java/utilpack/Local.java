package utilpack;

import java.util.Scanner;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;
import java.time.ZoneId;
import java.time.ZonedDateTime;
class Local{
    public static void main(String args[])
    {
    	double speed,distance,time;
        int count =0;
        Scanner sc=new Scanner(System.in);
        
        System.out.println("enter speed in kmph");
        speed = sc.nextDouble();
        
        System.out.println("enter distance in km");
        distance = sc.nextDouble();
        
        TotalTime Cab = new TotalTime();
        time = Cab.TimeRequired(speed,distance);
        System.out.println("time taken in hrs is :"+time);
        
        LocalDate ld = LocalDate.now();
        System.out.println("starting date:"+ld);
        
        LocalTime lt = LocalTime.now();
        System.out.println("Staring time:"+lt);
        
        LocalDateTime ldt=LocalDateTime.of(ld, lt);
        
        ZonedDateTime Zdt=ZonedDateTime.of(ldt, ZoneId.of("Asia/Calcutta"));
        System.out.println(Zdt);
        Cab.DaysRequired(time,Zdt);      
       
    }
}

 abstract class RequiredDays{
    int count = 0;
    public void DaysRequired(double time,ZonedDateTime Zdt)
    {
          while(time>0){
            String week = String.valueOf(Zdt.getDayOfWeek());
            
            int    month = Zdt.getMonthValue();
            int    date  = Zdt.getDayOfMonth();
            int    year  = Zdt.getYear();
            if((week.equals("SUNDAY"))||(month==1 && (date==26 || date==1)||(month==8 && date==15)||(year%4==0 && month==02))){
                Zdt = Zdt.plusDays(1);
            }
            else if(week.equals("SATURDAY")){
               Zdt = Zdt.plusDays(1);
               count=count+1;
               time=time-4;
            }
            else{
               Zdt = Zdt.plusDays(1);
               count=count+1;
               time=time-12;
            }
        }
        System.out.println("No.of days required to reach destination is :"+count+" days");
        System.out.println("Reach destination on :"+Zdt);
    }
}
  class TotalTime extends RequiredDays{
	  public double TimeRequired(double speed,double distance) {
		  double Time=distance/speed;
		  return Time;
		  
	  }
  }