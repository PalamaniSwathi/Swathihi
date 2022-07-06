package jdk5andabove;

public class GenericsDemo {
public static void main(String[] args) {
	//GoodPaintBrushVer2 gp=new GoodPaintBrushVer2();
	GoodPaintBrushVer3<Air> gp3=new GoodPaintBrushVer3<>();
	Water water=new Water();
	Air dryair=new Air();
	
	//gp3.setObj(water);
	gp3.setObj(dryair);
	
	//water=(Water)gp3.getObj();
	dryair=(Air)gp3.getObj();
	
	//water.sprinkle();
	dryair.dusting();
	
}
}
class Water{
	public void sprinkle() {
		System.out.println("water is sprinkled....");
		
	}
}
class Air{
	public void dusting() {
		System.out.println("dusting.......");
		
	}
}
class BadPaintBrush{
	public void doPaint(int i) {
		if(i==1) {
			System.out.println("red....");
		}
		else if(i==2) {
			System.out.println("blue....");
		}
		
	}
}
class GoodPaintBrush{
	Paint paint;
	public void doPaint() {
		System.out.println(paint);
		
	}
}
abstract class Paint{}
class RedPaint extends Paint{}
class BluePaint extends Paint{}
class GoodPaintBrushVer2{
	private Object obj;
	public Object getObj() {
		return this.obj;
	}
	public void setObj(Object obj) {
		this.obj=obj;
	}
	
}
class GoodPaintBrushVer3<T>{
	private T obj;
	public T getObj() {
		return this.obj;
	}
	public void setObj(T obj) {
		this.obj=obj;
	}
}