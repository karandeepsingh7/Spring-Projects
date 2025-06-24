package com.spring_projects.springframework;

import com.spring_projects.springframework.game.GameRunner;
import com.spring_projects.springframework.game.MarioGame;
import com.spring_projects.springframework.game.PacManGame;
import com.spring_projects.springframework.game.SuperContraGame;

public class AppGamingBasicJava {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		var game1 = new MarioGame();
		var game2 = new SuperContraGame();
		var game3 = new PacManGame();
		var gameRunner = new GameRunner(game1);
		var gameRunner2 = new GameRunner(game2);
		var gameRunner3 = new GameRunner(game3);
		gameRunner.run();
		gameRunner2.run();
		gameRunner3.run();
		
		
	}

}
