package gali;

import static org.junit.Assert.*;

import org.junit.Test;

import junit.framework.Assert;

public class PhysicalObjectTest {

	@Test
	public void test() {
		PhysicalObject obj = new PhysicalObject(3);
		obj.setVelocity(1.0f,-1.0f);
		obj.timePassed(2.0f);
		assertEquals(2.0f, obj.getX());
	}

}
