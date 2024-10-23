package com.example.Demo3;

import org.springframework.stereotype.Component;

@Component
public class GameRunner {

	
	private GamingConsole obj;
	
	public GameRunner(GamingConsole obj) {
		this.obj=obj;	
		
	}
	
	public void run() {
		
		obj.play();
	}
	
	
}
