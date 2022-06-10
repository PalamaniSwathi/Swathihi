package Ch6to10;
import java.lang.ref.SoftReference;
import java.lang.ref.WeakReference;
public class GarbageDemo2 {
	public static void main(String[] args) {
		Runtime r=Runtime.getRuntime();
		System.out.println("Available Memory...:"+r.maxMemory());
		System.out.println("Avaiable Processors...:"+r.availableProcessors());
		System.out.println("Free Memory....:"+r.freeMemory());
		r.gc();
		Food food=new Food();
		System.out.println("Free Memory...:"+r.freeMemory());
		//SoftReference(food);
		WeakReference weak=new WeakReference(food);
		food=null;
		r.gc();
		System.out.println("Free Mmory....:"+r.freeMemory());
		//food=(Food)soft.get();
		food=(Food)weak.get();
		System.out.println(food);
		
	}

}
class Food{
	@Override
	protected void finalize() throws Throwable {
		System.out.println("Finalize for the food object called......");
	}
}
