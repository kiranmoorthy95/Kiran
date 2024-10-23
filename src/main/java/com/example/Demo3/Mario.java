package com.example.Demo3;

import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Component;

@Component
@Primary
public class Mario implements GamingConsole {

	public void play() {
		
		System.out.println("Spring...:)");
		System.out.println("Mario Game Starts here.....");
	}

}
