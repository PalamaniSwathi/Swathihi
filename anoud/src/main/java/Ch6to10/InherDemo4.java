package Ch6to10;

public class InherDemo4 {
	public static void main(String[] args) {
		Dominos dominos=new Sitapizza();
		dominos.sellPizza();
	}

}
abstract class Dominos{
	private void makeDough() {
		System.out.println("dough made as per the dominos logic....");
	}
	private void bakePizza() {
		System.out.println("Pizza baked as the dominos logic...");
		
	}
	private void addToppings() {
		System.out.println("Toppings added as per the dominos logic...");
		
	}
	private void packing() {
		System.out.println("Packing done a per dominos logic....");
	}
	final public void makePizza() {
		makeDough();
		bakePizza();
		addToppings();
		packing();
	}
	final public void sellPizza() {
		collectMoney();
		makePizza();
		delivery();
	}
	public abstract void delivery();
	public abstract void collectMoney();
}
class Sitapizza extends Dominos{
	@Override
	public void collectMoney() {
		System.out.println("money is collected in US Dollors...");
	}
	@Override
	public void delivery() {
		System.out.println("delivery done via benz car....");
	}
}
