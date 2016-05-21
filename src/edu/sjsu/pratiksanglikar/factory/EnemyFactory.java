package edu.sjsu.pratiksanglikar.factory;

public class EnemyFactory {
	public static Enemy getRandomEnemy() {
		int random = 1 + (int)(Math.random() * 11);
		if(random % 2 == 0) {
			return new Zombunny();
		} else {
			return new Zombear();
		}
	}
}
