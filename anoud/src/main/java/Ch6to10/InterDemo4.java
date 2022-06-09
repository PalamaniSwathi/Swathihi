package Ch6to10;

public class InterDemo4 {
	public static void main(String[] args) {
		//1. Anonymous 2. Method Referencing 3. Lambda 4. Muthur teacher
		
		//1. Anonymous inner class implementation
		new FInterOne() {			
			@Override
			public void met() {
				System.out.println("anonymous inner class met called..");				
			}
		}.met();
		
		//Method Referencing...
		FInterOne one=InterDemo4::mymethod;
		one.met();
		
		//Lambda
		FInterOne oneLambda=()->{System.out.println("logic in lambda called...");};
		
		//muthu teacher style
		FInterOne oneMuthu=new MyFInterOneImpl();
		oneMuthu.met();
		
		//PART 2
		//Anonymous
		int value=new FInterTwo() {
			
			@Override
			public int met() {
				// TODO Auto-generated method stub
				return 100;
			}
		}.met();
		System.out.println("Value of first inter...anonymous.:"+value);
		
		//Method referencing
		FInterTwo two=new InterDemo4()::mymethod2;
		value=two.met();
		System.out.println("Value of first inter-method ref..:"+value);
		
		FInterTwo twoLambda=()->{return 1000;};
		value=twoLambda.met();
		System.out.println("Value of first inter ---lambda :"+value);
		
		//Muthu style
		FInterTwo twoMuthu=new MyFInterTwoImpl();
		value=twoMuthu.met();
		System.out.println("value of first inter...muthu..:"+value);
		
		//PART 3
		//Anonymous
		String val=new FInterThree() {			
			@Override
			public String met(int i, String s) {
				// TODO Auto-generated method stub
				return i+":"+s;
			}
		}.met(10, "anonymous");
		System.out.println("Value....:"+val);
		
		//Method Referencing
		FInterThree three=new InterDemo4()::mymethod3;
		val=three.met(1000, "method ref");
		System.out.println("value...:"+val);
		//Lambda
		FInterThree threeLambda=(int num,String str)->{return num+":"+str;};
		val=threeLambda.met(101010, "lambda world");
		System.out.println("value..:"+val);
		
		//PART 4
		//Anonymous
		MyAccount myaccount=new MyAccount();
		myaccount.balance=1000;
		MyAccount my=new FInterFour() {
			
			@Override
			public MyAccount transfer(MyAccount act, int amt) {
				// TODO Auto-generated method stub
				act.balance=(act.balance-amt);
				return act;
			}
		}.transfer(myaccount,500);
		System.out.println("Balance..:"+my.balance);
		
		//Method Referencing
		FInterFour four=new InterDemo4()::mymethod4;
		MyAccount ac=four.transfer(myaccount, 100);
		System.out.println("Method ref...:"+ac.balance);
		
		//Lambda
		FInterFour fourLambda=(myc,amt)->{
			myc.balance=(myc.balance-amt);
			return myc;
		};
		ac=fourLambda.transfer(myaccount, 200);
		System.out.println("value..lambda..:"+ac.balance);
		
	}
	public static void mymethod() {
		System.out.println("my method called...");
	}
	public int mymethod2() {
		return 1000;
	}
	public String mymethod3(int i,String s) {
		return i+":"+s;
	}
	public MyAccount mymethod4(MyAccount act,int amt) {
		act.balance=(act.balance-amt);
		return act;
	}
}
class MyFInterOneImpl implements FInterOne{
	@Override
	public void met() {
		System.out.println("met normal old implementation called...");
	}
}
class MyFInterTwoImpl implements FInterTwo{
	@Override
	public int met() {
		return 10000;
	}
}
//Functional interfaces - Interface with only one method
interface FInterOne{
	public void met();
}
interface FInterTwo{
	public int met();
}
interface FInterThree{
	public String met(int i,String s);
}
interface FInterFour{
	public MyAccount transfer(MyAccount act,int amt);
}
class MyAccount {
	int balance;
}