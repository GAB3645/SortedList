package com.jaewa;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNotNull;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

class SortedListTest {

	private SortedList list;

	@BeforeEach
	public void setUp() {
		list = new SortedList();
	}

	@Test
	void testSetUp() {
		assertNotNull(list);

		int[] result = list.getValues();

		assertNotNull(result);

		assertEquals(0, result.length);

	}

	@Test
	void testAdd() {
		list.add(3);

		int[] result = list.getValues();

		assertEquals(1, result.length);
		assertEquals(3, result[0]);

	}

	@Test
	void testAddAfter() {
		list.add(3);
		list.add(5);

		int[] result = list.getValues();

		assertEquals(2, result.length);
		assertEquals(3, result[0]);
		assertEquals(5, result[1]);

	}

	@Test
	void testAddBefore() {
		list.add(3);
		list.add(1);

		int[] result = list.getValues();

		assertEquals(2, result.length);
		assertEquals(1, result[0]);
		assertEquals(3, result[1]);

	}

	@Test
	void testDoubleNumber(){
		list.add(3);
		list.add(1);
		list.add(3);

		int[] result = list.getValues();
		assertEquals(2, result.length);
		
	}

	@Test
	void testAddAfterAndBefore() {
		list.add(3);
		list.add(1);
		list.add(5);

		int[] result = list.getValues();

		assertEquals(3, result.length);
		assertEquals(1, result[0]);
		assertEquals(3, result[1]);
		assertEquals(5, result[2]);

	}

	// TODO sortedlist.add
	// TODO sortedlist.remove
	// TODO sortedlist.getvalues
}
