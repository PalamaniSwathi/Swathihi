package Ch6to10;

public class ExcepDemo6 {
	public static void main(String[] args) {
		Race race=new Race();
		System.out.println("race started.....");
		//race.driveBike(150);
		try {
			race.driveBike(150);
		}catch(Exception e) {
			System.out.println(e);
		}
		System.out.println("race finished.......");
	}

}
class Race{
	public void driveBike(int speed)throws Exception{
		if(speed>100){
			throw new Exception();
		}
	}
}
