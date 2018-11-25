package shooting;

public class Boss {
	public int x, y, hp = 0;
	
	Boss(){}
	
	Boss(int x, int y, int hp){
		this.x = x;
		this.y = y;
		this.hp = hp;
	}
	
	public void appear() {
		if(y < 100 ) {
			y += 3;
		}
	}
}
