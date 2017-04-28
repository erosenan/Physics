package gali;

import static org.junit.Assert.*;

import org.junit.Test;

import junit.framework.Assert;

public class PhysicalObjectTest {

	@Test
	public void testVelocity() {
		PhysicalObject obj = new PhysicalObject(3);
		obj.setVelocity(1.0f,-1.0f);
		obj.timePassed(2.0f);
		assertEquals(2.0f, obj.getX(),0.0001);
		assertEquals(-2.0f, obj.getY(),0.0001);
		obj.setVelocity(0f,0f);
		obj.timePassed(1.0f);
		assertEquals(2.0f, obj.getX(),0.0001);
		assertEquals(-2.0f, obj.getY(),0.0001);
	}
	
	@Test
	public void testAcceleration() {
		PhysicalObject obj = new PhysicalObject(1f);
		obj.applyForce(1f, -1f);
		obj.timePassed(2f);
		assertEquals(2f, obj.getVX(), 0.0001);
		assertEquals(-2f, obj.getVY(), 0.0001);
	}

	@Test
	public void testForce() {
		PhysicalObject obj = new PhysicalObject(2f);
		obj.applyForce(1f, -1f);
		obj.timePassed(2f);
		assertEquals(1f, obj.getVX(), 0.0001);
		assertEquals(-1f, obj.getVY(), 0.0001);
	}
	
	@Test
	public void testDirectonalForce() {
		PhysicalObject obj = new PhysicalObject(2f);
		obj.applyForceInDirection(2f, Math.atan2(3f, -2f));
		obj.timePassed(1f);
		assertEquals(1f*1f, obj.getVX() * obj.getVX() + obj.getVY() * obj.getVY(), 0.0001);
		assertEquals(3f/-2f, obj.getVY()/obj.getVX(), 0.0001);
	}

}
