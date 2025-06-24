package com.spring_projects.springframework;

import com.spring_projects.springframework.game.GameRunner;
import com.spring_projects.springframework.game.MarioGame;
import com.spring_projects.springframework.game.SuperContraGame;

public class AppGamingBasicJava {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		var game1 = new MarioGame();
		var game2 = new SuperContraGame();
		var gameRunner = new GameRunner(game1);
		var gameRunner2 = new GameRunner(game2);
		gameRunner.run();
		gameRunner2.run();
		
		
	}

}
