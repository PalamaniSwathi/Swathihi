package practice;



public class BuilderPattern {
	public static void main(String[] args) {
		
	
	Computer comp=new Computer.ComputerBuilder("500GB","2GB").setGraphicsCardEnabled(true).setBluetoothEnabled(true).build();
	  System.out.println(comp);
	}
}
class Computer{
	private String HDD;
	private String RAM;
	
	private boolean isGraphicscardEnabled;
	private boolean isBluetoothEnabled;
	
	public String getHDD() {
		return HDD;
	}
		
		public String getRAM() {
			return RAM;
	}
		public boolean getisGraphicscardEnabled() {
			return isGraphicscardEnabled;
		
		}
		public boolean getisbluetoothEnabled() {
			return isBluetoothEnabled;
		}
		public Computer(ComputerBuilder builder) {
			this.HDD=builder.HDD;
			this.RAM=builder.RAM;
			this.isGraphicscardEnabled=builder.isGraphicscardEnabled;
			this.isBluetoothEnabled=builder.isBluetoothEnabled;
			
		}
          	

public static class ComputerBuilder{
	public String HDD;
	public String RAM;
	
	public boolean isGraphicscardEnabled;
	public boolean isBluetoothEnabled;
	
	public ComputerBuilder(String hdd,String ram) {
		this.HDD=hdd;
		this.RAM=ram;
	}
		public ComputerBuilder setGraphicsCardEnabled(boolean isGraphicsCardEnabled) {
			this.isGraphicscardEnabled = isGraphicsCardEnabled;
			return this;
		}
		public ComputerBuilder setBluetoothEnabled(boolean isBluetoothEnabled) {
			this.isBluetoothEnabled = isBluetoothEnabled;
			return this;
		}
		public Computer build(){
			return new Computer(this);
		
	}
	
}

}
