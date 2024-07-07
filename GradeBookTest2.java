import static org.junit.Assert.*;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

public class GradeBookTest2 {
	private GradeBook GradeBook1, GradeBook2;
	@Before
	public void setUp() throws Exception {
		GradeBook1 = new GradeBook(5);
		GradeBook2= new GradeBook(5);
		
		//put some scores for each grade books which has a scores array
		GradeBook1.addScore(3.0);
		GradeBook1.addScore(4.0);
		
		GradeBook2.addScore(1.0);
		GradeBook2.addScore(3.0);
		

		
		
	}
    
	@After
	public void tearDown() throws Exception {
		GradeBook1=GradeBook2= null;
	}

	@Test
	public void testGradeBook() {
		
		assertFalse(GradeBook1.equals(GradeBook2));

	}

	@Test
	public void testAddScore() {
		assertEquals(true, GradeBook1.addScore(3.0));
		assertEquals(true, GradeBook2.addScore(4.0));
	}

	@Test
	public void testSum() {
		assertEquals(7.0, GradeBook1.sum(),.001);
		assertEquals(4.00, GradeBook2.sum(),.001);
		
	}

	@Test
	public void testMinimum() {
		 assertEquals(3.0, GradeBook1.minimum(),.001);
		 assertEquals(1.0, GradeBook2.minimum(),.001);
		
	}

	@Test
	public void testFinalScore() {
		assertEquals(4.0, GradeBook1.finalScore(),.001);
		assertEquals(3.0, GradeBook2.finalScore(),.001);
	}
    @Test
    public void testGetScoreSize() {
    	assertEquals(2,GradeBook1.getScoreSize());
    	assertEquals(2,GradeBook2.getScoreSize());
    }
    @Test
    public void testToString() {
    	assertEquals("3.0 4.0 ",GradeBook1.toString());
    	assertEquals("1.0 3.0 ",GradeBook2.toString());
    }
    
    
    
}
