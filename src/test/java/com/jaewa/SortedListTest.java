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
		list.add(4);

		int[] result = list.getValues();

		assertEquals(4, result.length);
		assertEquals(1, result[0]);
		assertEquals(3, result[1]);
		assertEquals(5, result[3]);
		assertEquals(4, result[2]);

	}
	@Test
	void testRemove() { //! test rimozione numero presente nella lista
		list.add(3);
		list.add(1);
		list.add(5);
		list.add(4);
		list.add(2);

		int[] result = list.getValues();
		assertEquals(5, result.length);

		list.remove(3);
		result = list.getValues();
		assertEquals(4, result.length);
	}

	@Test
	void testRemove2() { //! test rimozione numero non presente nella lista

		list.add(1);
		list.add(5);
		list.add(4);
		list.add(2);

		int[] result = list.getValues();
		assertEquals(4, result.length);

		list.remove(3);
		result = list.getValues();
		assertEquals(4, result.length);
	}

	@Test
	void testGetValues() {
		list.add(3);
		list.add(1);
		list.add(5);


		int[] result = list.getValues();
		assertEquals(3, result.length);
	}

	

}
