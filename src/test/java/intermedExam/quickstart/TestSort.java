package intermedExam.quickstart;
import intermedExam.quickstart.MyListUtil;
import static org.junit.Assert.*;

import java.util.Arrays;
import java.util.List;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;


public class TestSort {

	@BeforeClass
	public static void prepareTest() throws Exception {
		MyListUtil mlu=new MyListUtil();
	}

	@AfterClass
	public static void tearDownAfterClass() throws Exception {
	}

	@Before
	public void prepareT() throws Exception {
		MyListUtil mlu=new MyListUtil();
	}

	@After
	public void tearDown() throws Exception {
	}

	@Test
	public void testCrescente() {
		MyListUtil mlu=new MyListUtil();
		List<Integer>num=Arrays.asList(4,6,1,2,9,8);  
		assertEquals(Arrays.asList(1,2,4,6,8,9),mlu.Crescente(num));
	}
	@Test
	public void testDecrescente() {
		MyListUtil mlu=new MyListUtil();
		List<Integer>num=Arrays.asList(4,6,1,2,9,8);  
		assertEquals(Arrays.asList(9,8,6,4,2,1),mlu.Decrescente(num));
	}
}

