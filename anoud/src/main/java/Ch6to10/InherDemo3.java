package Ch6to10;



public class InherDemo3 {
	public static void main(String[] args) {
		Hall1 hall=new BirthdayHall();
		hall=new MarriageHall();
	}

}
abstract class Hall1{
	
}
class BirthdayHall extends Hall1{
	
}
class MarriageHall extends Hall1{
	
}
class BadPaintBrush{
	public void doPaint(int i) {
		if(i==1) {
			System.out.println("red color");
		}
		else if(i==2) {
			System.out.println("blue color");
		}
		
	}
}
class PaintBrush{
	public void doPaint(Paint p){
		System.out.println(p);
	}
		
	}
abstract class Paintt{}
class BluePaint extends Paintt{}
class GreenPaint extends Paintt{}
	
class BadDog{
	public void play(String item){ 
		if(item.equals("stick")) {
			System.out.println("runnimng....");
		}
		else if(item.equals("stone")) {
			System.out.println("biting...");
		}
		else if(item.equals("biscuit")) {
			System.out.println("enjoying...");
		}
		
	}
}
class GoodDog{
	public void play(Item item) {
		item.display();
		
	}
}
abstract class Item{
	public abstract void display(); {
		
		
	}
	class Stone1 extends Item{
		@Override
		public void display() {
			System.out.println("bitting...");
		}
	}
	class Stick2 extends Item{
		@Override
		public void display() {
			System.out.println("running...");
		}
	}
	class Biscuit2 extends Item{
		@Override
		public void display() {
			System.out.println("enjoying...");
		}
	}
	
}