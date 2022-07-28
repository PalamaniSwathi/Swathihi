package practice;

public class CommandPattern {
	public static void main(String[] args) {
		UniversalRemote.useRemote();
	}

}
class UniversalRemote{
	public static void useRemote() {
		System.out.println("Demontration of Remote...");
		Tv tv=new Tv();
		SetTopBox settopbox=new SetTopBox();
		SoundSystem soundsystem=new SoundSystem();
		Netflix netflix=new Netflix();
		
		FatherNewsChannelCommand fncc=new FatherNewsChannelCommand(tv,settopbox,soundsystem,netflix);
		MotherSerialChannelCommand mscc=new MotherSerialChannelCommand(tv,settopbox,soundsystem,netflix);
		MotherOldMoviesCommand momc=new MotherOldMoviesCommand(tv,settopbox,soundsystem,netflix);
		
		Remote universalremote=new Remote();
		universalremote.executeCommand(1);
		universalremote.setCommand(fncc, 0);
		universalremote.setCommand(mscc, 1);
		universalremote.setCommand(momc, 2);
		
		System.out.println("father started watch the news channel...");
		 universalremote.executeCommand(0);
	}
}
class Tv{
	public void av1(){
		System.out.println("tv switched av mode...");
		
	}
	public void switchon() {
		System.out.println(" tv switch on...");
	}
}
class SetTopBox{
	public void newschannel() {
		System.out.println("watch the news channel...");
	}
	public void serialchannel() {
		System.out.println("watch the serial channel...");
	}
	
}
class SoundSystem{
	public void lowsound() {
		System.out.println("decreases the sound...");
	}
	
}
class Netflix{
	public void oldmovies() {
		System.out.println("watch the old movies...");
	}
	
}
interface Command{
	public void excute();
}
class FatherNewsChannelCommand implements Command{
	Tv tv;SetTopBox settopbox;SoundSystem soundsystem;Netflix netflix;
	public FatherNewsChannelCommand(Tv tv,SetTopBox settopbox,SoundSystem soundsystem,Netflix netflix) {
           this.tv=tv;
           this.settopbox=settopbox;
           this.soundsystem=soundsystem;
           this.netflix=netflix;
	}
	@Override
	public void excute() {
		System.out.println("started the news channel command...");
		tv.av1();
		tv.switchon();
		settopbox.newschannel();
		soundsystem.lowsound();
		System.out.println("Dad enjoy your news channel...");
		
	}
}
class MotherSerialChannelCommand implements Command{
	Tv tv;SetTopBox settopbox;SoundSystem soundsystem;Netflix netflix;
	public MotherSerialChannelCommand(Tv tv,SetTopBox settopbox,SoundSystem soundsystem,Netflix netflix) {
	          this.tv=tv;
	          this.settopbox=settopbox;
	          this.soundsystem=soundsystem;
	          this.netflix=netflix;
	}
	@Override
	public void excute() {
		System.out.println("Started the Serial channel command...");
		tv.av1();
		tv.switchon();
		settopbox.newschannel();
		soundsystem.lowsound();
		System.out.println("Mom enjoy your Serials...");
		
	}
}
class MotherOldMoviesCommand implements Command{
	Tv tv;SetTopBox settopbox;SoundSystem soundsystem;Netflix netflix;
	public MotherOldMoviesCommand(Tv tv,SetTopBox settopbox,SoundSystem soundsystem,Netflix netflix) {
		this.tv=tv;
		this.settopbox=settopbox;
		this.soundsystem=soundsystem;
		this.netflix=netflix;
	}
	@Override
	public void excute() {
		System.out.println("Started the old movies command...");
		tv.av1();
		tv.switchon();
		settopbox.newschannel();
		soundsystem.lowsound();
		System.out.println("Mom enjoy your old movies...");
		
	}
}
class DummyCommand implements Command{
	@Override
	public void excute() {
		System.out.println("Iam a Dummy button...");
		
	}
}
class Remote{
	Command command[]=new Command[5];
	public Remote() {
		for(int i=0;i<command.length;i++) {
			command[i]=new DummyCommand();
		}
	}
	public void setCommand(Command command,int slot) {
		this.command[slot]=command;
	}
	public void executeCommand(int slot) {
		command[slot].excute();
	}
}