package practice;

public class TemplateMethod {
	public static void main(String[] args) {
		HouseTemplete housetype=new WoodenHouse();
		
		housetype.buildHouse();
		System.out.println("**********");
		housetype=new GlassHouse();
		housetype.buildHouse();
	}

}
abstract class HouseTemplete{
	public final void buildHouse() {
		buildFoundation();
		buildPillars();
		buildWalls();
		buildWindows();
		System.out.println("Building Glass Windows");
	}

	private void buildWindows() {
		System.out.println("Building Glass Windows...");
		
	}

	public abstract void buildWalls();

	public abstract void buildPillars();

	private void buildFoundation() {
		System.out.println("Building foundation with cement,iron,Sand");
		
	}
	
}
class GlassHouse extends HouseTemplete{
	@Override
	public void buildWalls() {
		System.out.println("Building Glass Walls");
	}
	@Override
	public void buildPillars() {
		System.out.println("Building Pillars with glass coasting");
		
	}
}
class WoodenHouse extends HouseTemplete{
	@Override
	public void buildWalls() {
		System.out.println("Building Wooden Walls");
		
	}
	@Override
	public void buildPillars() {
		System.out.println("Building Pillars with Wood coating");
		
	}
}
