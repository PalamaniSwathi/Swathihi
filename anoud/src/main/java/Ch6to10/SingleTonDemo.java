package Ch6to10;

public class SingleTonDemo {

	public static void main(String[] args) {
		DBConnection.getDBCon();
		DBConnection.getDBCon();
		DBConnection.getDBCon();
		DBConnection.getDBCon();
		DBConnection.getDBCon();
		DBConnection.getDBCon();
		

	}

}
class DBConnection{
	private DBConnection() {
		System.out.println("DBCon object created...");
	}
	private static DBConnection dbcon;
	public static DBConnection getDBCon() {
		if(dbcon==null) {
			dbcon=new DBConnection();
			return dbcon;
		}
		else {
			return dbcon;
		}
	}
}
