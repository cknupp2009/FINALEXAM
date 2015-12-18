package QuestionC;

import static org.junit.Assert.*;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;

public class Rectangle_Test {

	@BeforeClass
	public static void setUpBeforeClass() throws Exception {
	}

	@AfterClass
	public static void tearDownAfterClass() throws Exception {
	}

	@Before
	public void setUp(x=-1, y= -2) throws Exception {IllegalRectangle("Sorry must be a positive number")
	}

	@After
	public void tearDown() throws Exception {
	}

	@Test
	public void Rectangle_Test1() {
		
		Rectangle r2 = new Rectangle(-5, -10);
		assertTrue(r2.ComputeArea() == 50);
	}
	
	@Test
	public void Rectangle_Test2() {
		
	
		Rectangle r2 = new Rectangle(-5, -10);
		assertTrue(r2.ComputeArea() == 50);
	}
	

}
