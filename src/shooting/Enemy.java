package shooting;

public class Enemy {
	int x, y, speed;

	Enemy(int x, int y, int speed) {
		this.x = x;
		this.y = y;
		this.speed = speed;
	}

	public void move() {
		y += speed;
	}
}
