package Ch6to10;

public class Transaction implements Cloneable{
	private static Transaction transObj;
	int amt;
	private Transaction() {
		System.out.println("Transaction object created.....");
	}
	public static Transaction
	createTransactionObject() {
		if(transObj==null) {
			transObj=new Transaction();
			return transObj;
		}
		else {
			return transObj.createClone();//new Transaction();//transObj;//.createClone();
			}
	}
	private Transaction createClone() {
		try {
			return(Transaction)super.clone();
		}catch(Exception e) {
			System.out.println(e);
			return null;
		}
	}

}
