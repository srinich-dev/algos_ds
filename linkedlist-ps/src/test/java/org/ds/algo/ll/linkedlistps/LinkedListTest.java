package org.ds.algo.ll.linkedlistps;

import static org.assertj.core.api.Assertions.assertThat;

import org.junit.jupiter.api.Test;

class LinkedListTest {

	@Test
	void testAdd() {
		LinkedList<Integer> linkedList = new LinkedList<Integer>();
		linkedList.add(1);
		linkedList.add(2);
		linkedList.add(3);
		linkedList.add(4);

		assertThat(linkedList.getAllDataAsArray()).asList().containsExactly(1, 2, 3, 4);
	}

	@Test
	void testRemove() {
		LinkedList<Integer> linkedList = new LinkedList<>();
		linkedList.add(1);
		linkedList.add(2);
		linkedList.add(3);
		linkedList.add(4);

		linkedList.remove(3);
		linkedList.remove(2);
		assertThat(linkedList.getAllDataAsArray()).asList().containsExactly(1, 4);
	}

}
