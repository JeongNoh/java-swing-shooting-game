package shooting;

public class Missile {
	int x;
	int y;
	int angle;
	int speed;
	int who;

	Missile(int x, int y, int speed) {
		this.x = x;
		this.y = y;
		this.speed = speed;
	}

	Missile(int x, int y, int angle, int speed) {
		this.x = x;
		this.y = y;
		this.angle = angle;
		this.speed = speed;
	}

	Missile(int x, int y, int angle, int speed, int who) {
		this.x = x;
		this.y = y;
		this.angle = angle;
		this.speed = speed;
		this.who = who;
	}

	public void move() {
		x += Math.cos(Math.toRadians(angle)) * speed;
		y += Math.sin(Math.toRadians(angle)) * speed;
	}
}
