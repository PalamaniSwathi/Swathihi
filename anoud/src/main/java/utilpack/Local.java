package utilpack;
import java.util.Scanner;
import java.time.LocalDate;
import java.time.LocalTime;
public class Local {
	 public static void main(String args[])
	    {
		
	        double speed,distance,time;
	        int count =0;
	        Scanner sc=new Scanner(System.in);
	        System.out.println("enter speed in kmph");
	        speed = sc.nextDouble();
	        System.out.println("enter distance in km");
	        distance = sc.nextDouble();
	        time = distance / speed ;
	        System.out.println("time taken in hrs is :"+time);
	        LocalDate ld = LocalDate.now();
	        System.out.println("starting date:"+ld);
	        LocalTime lt = LocalTime.now();
	        System.out.println("starting time:"+lt);
	        while(time>0){
	            String week = String.valueOf(ld.getDayOfWeek());
	            if(week.equals("SUNDay")){
	                ld = ld.plusDays(1);
	            }
	            else if(week.equals("SATURDAY")) {
	               ld = ld.plusDays(1);
	               count=count+1;
	               time=time-4;
	            }
	            else{
	               ld = ld.plusDays(1);
	               count=count+1;
	               time=time-12;
	            }
	        }
	        System.out.println("No.of days required to reach destination is :"+count+" days");
	     
	        System.out.println("Reach destination on :"+ld);
	    }

}

