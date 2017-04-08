package gali;

public class PhysicalObject {
	
	private float x = 0;
	private float y = 0;
	private float vx = 0;
	private float vy = 0;
	public PhysicalObject(float m) {
	}

	public void setVelocity(float vx_, float vy_) {
		vx = vx_;
		vy = vy_;
	}

	public void timePassed(float dt) {
		x = x + vx * dt;
		y = y + vy * dt; 
		
	}

	public float getX() {
		return x;
	}
//	public float getY() {
//		return y;
//	}

	public float getY() {
		// TODO Auto-generated method stub
		return y;
	}
	
}
