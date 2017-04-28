package gali;

public class PhysicalObject {
	
	private float x = 0;
	private float y = 0;
	private float vx = 0;
	private float vy = 0;
	private float ax = 0;
	private float ay = 0;
	private float m;
	public PhysicalObject(float m_) {
		m = m_;
	}

	public void setVelocity(float vx_, float vy_) {
		vx = vx_;
		vy = vy_;
	}

	public void timePassed(float dt) {
		x = x + vx * dt;
		y = y + vy * dt;
		vx = vx + ( dt * ax ) / m;
		vy = vy + ( dt * ay ) / m;
	}

	public float getX() {
		return x;
	}
//	public float getY() {
//		return y;
//	}

	public float getY() {
		return y;
	}

	public void applyForce(float fx, float fy) {
		ax = fx;
		ay  = fy;
	}

	public float getVX() {
		return vx;
	}
	
	public float getVY() {
		return vy;
	}

	public void applyForceInDirection(float f, double diraction) {
		applyForce(f * (float)Math.cos(diraction), f * (float)Math.sin(diraction));
	}
	
	
}
