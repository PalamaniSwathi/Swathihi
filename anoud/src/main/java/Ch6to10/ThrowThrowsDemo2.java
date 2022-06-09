package Ch6to10;

public class ThrowThrowsDemo2 {
	
		public static void main(String[] args)throws Exception{
			YesBank yb=new YesBank();
			//try{
			yb.withDraw(1000000);
			//}catch(Exception e){
			//System.out.println(e);
		    //}
			System.out.println("business continues...");
		}
		}
		class YesBank{
			public void withDraw(int amt)throws MaxLimitException{
				if(amt>100000) {
					throw new MaxLimitException();
				}
			}
		}
		class MaxLimitException extends Exception{
			
		}


