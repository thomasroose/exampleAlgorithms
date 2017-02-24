package algoritmen;

import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test;

public class TestLinkedList {
	
	LinkedList<String> linkedlist;

	@Before
	public void setUp() throws Exception {
		linkedlist = new LinkedList<String>("1");
	}

	@Test
	public void testFirst() {
		
		assertEquals("1", linkedlist.first());
	}
	
	@Test
	public void testAppend(){
		linkedlist.prepend("2");
		assertEquals("2",linkedlist.first());
	}

}
