package com.spring_projects.springframework;

import org.springframework.beans.BeansException;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import com.spring_projects.springframework.game.GameRunner;
import com.spring_projects.springframework.game.GamingConsole;
import com.spring_projects.springframework.game.MarioGame;
import com.spring_projects.springframework.game.PacManGame;
import com.spring_projects.springframework.game.SuperContraGame;

public class App03GamingSpringBeans {

	public static void main(String[] args) {
		
		try (var context = new AnnotationConfigApplicationContext(GamingConfiguration.class)) {
			context.getBean(GamingConsole.class).up();
			context.getBean(GameRunner.class).run();
		} catch (BeansException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		
		
		/*// Without Spring
		var game1 = new MarioGame();
		var game2 = new SuperContraGame();
		var game3 = new PacManGame();
		var gameRunner = new GameRunner(game1);
		var gameRunner2 = new GameRunner(game2);
		var gameRunner3 = new GameRunner(game3);
		gameRunner.run();
		gameRunner2.run();
		gameRunner3.run();
		*/
		
	}

}
