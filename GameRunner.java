package LooseDemo.LooseDemo;
public class GameRunner {

	
	private GamingConsole obj;
	
	public GameRunner(GamingConsole obj) {
		this.obj=obj;	
		
	}
	
	public void run() {
		
		obj.play();
	}
	
	
}
