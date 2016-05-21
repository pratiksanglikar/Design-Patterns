package edu.sjsu.pratiksanglikar.factory;

public class FactoryTester {

	public static void main(String[] args) {
		System.out.println("Game started!");
		for(int i = 0; i < 5; i++) {
			Enemy enemy = EnemyFactory.getRandomEnemy();
			doStuffWithEnemy(enemy);
		}

	}

	private static void doStuffWithEnemy(Enemy enemy) {
		enemy.move();
		enemy.followPlayer();
		enemy.attack();
		System.out.println();
	}
}
