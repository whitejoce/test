import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.Matchers.*;
import static org.junit.Assert.*;

import java.util.Arrays;
import java.util.Collection;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import org.junit.runner.RunWith;

import org.junit.runners.Parameterized;
import org.junit.runners.Parameterized.Parameters;

@RunWith(Parameterized.class)
public class ProblemTest {
	private static Problem test;
	private int a,b;
	private int expected;
	
	public ProblemTest(int a, int b, int expected) {
		super();
		this.a = a;
		this.b = b;
		this.expected = expected;
	}

	@Parameters
	public static Collection<Object[]> data() {
		return Arrays.asList(new Object[][] {
			{1,1,2}
		});
	}
	
	@BeforeClass
	public static void setUpBeforeClass() throws Exception {
		test = new Problem();
	}

	@AfterClass
	public static void tearDownAfterClass() throws Exception {
	}

	@Before
	public void setUp() throws Exception {
	}

	@After
	public void tearDown() throws Exception {
	}

	@Test
	public void testFunc() {
		assertThat(test.func(1,1), equalTo(2));  //assertThat
		assertEquals(expected,test.func(a,b));   //assertEquals
		assertThat(test.func(1,1), startsWith("3"));  //startsWith
	}
}
