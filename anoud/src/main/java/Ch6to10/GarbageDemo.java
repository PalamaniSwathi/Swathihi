package Ch6to10;

public class GarbageDemo {
public static void main(String[] args) {
	Runtime r=Runtime.getRuntime();
	System.out.println("Available Memory....:"+r.maxMemory());
	System.out.println("Available Processors...:"+r.availableProcessors());
	System.out.println("Free Memory.....:"+r.freeMemory());
	r.gc();
	System.out.println("Free Memory.....:"+r.freeMemory());
	GrandFather tatha=new GrandFather();
	System.out.println("Free Memory....:"+r.freeMemory());
	//System.out.println(tatha.getGold());
	tatha=null;
	//System.out.println(tatha.getGold());
	System.out.println("after tathas death...:"+r.freeMemory());
	System.out.println("tatha kariyam starts....");
	r.gc();
	System.out.println("After tathas kariyam...:"+r.freeMemory());
}
}
class GrandFather{
	String age;
	private String gold="under the tree......";
    public GrandFather() {
    	for(int i=0;i<1000;i++) {
    		
    	}
    }
    protected String getGold() {
    	return "The Gold is...:"+gold;
    }
    @Override
    protected void finalize()throws Throwable{
    	System.out.println(getGold());
    }
}