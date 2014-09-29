package hw.maint;

import static org.junit.Assert.*;

import java.io.File;

import org.junit.Before;
import org.junit.Test;

public class TestCaseForJVM {
	
	@Before
    public void setUp() throws Exception {
		JVM j= new JVM(0, 0, 0);
    }
	
	@Test
	public void testReader(){
		getClass().getClassLoader().getResourceAsStream("/bin/test.txt");
	}
	
	@Test
	public void test() {
		JVM j= new JVM(10, 10, 10);
		assertEquals(1, j.iteratorBytecode());
	}
	
	@Test
	public void testIsosceles() {
		JVM j= new JVM(10, 5, 10);
		assertEquals(2, j.iteratorBytecode());
	}

	@Test
	public void testScalene() {
		JVM j= new JVM(3, 5, 10);
		assertEquals(3, j.iteratorBytecode());
	}
	
	@Test
	public void testNT() {
		JVM j= new JVM(0, -5, 10);
		assertEquals(0, j.iteratorBytecode());
	}
}
