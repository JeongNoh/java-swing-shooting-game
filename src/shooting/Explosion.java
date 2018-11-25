package shooting;

public class Explosion {
	int x, y, ex_cnt, damage;
	
	public Explosion() {
		
	}

	public Explosion(int x, int y, int damage) {
		this.x = x;
		this.y = y;
		this.damage = damage;
		ex_cnt = 0;
	}

	public void effect() {
		ex_cnt++;
	}
}
