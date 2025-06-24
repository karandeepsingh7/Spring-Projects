package com.spring_projects.springframework.game;

public class GameRunner {
	private GamingConsole gamer;

	public GameRunner(GamingConsole gameParameter) {
		// TODO Auto-generated constructor stub
		gamer = gameParameter;
	}

	public void run() {
		// TODO Auto-generated method stub
		gamer.up();
		gamer.down();
		gamer.left();
		gamer.right();
	}

}
