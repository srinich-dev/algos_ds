package org.ds.algo.ll.linkedlistps;

import org.junit.jupiter.api.Test;

class ReverseSingleLinkedListTest {

	@Test
	void testReverseLinkedList() {

		LinkedList<Integer> linkedList = new LinkedList<Integer>();
		linkedList.add(1);
		linkedList.add(2);
		linkedList.add(3);
		linkedList.add(4);

		linkedList.displayLinkedList();

		ReverseSingleLinkedList reverseSingleLinkedList = new ReverseSingleLinkedList();
		reverseSingleLinkedList.reverseLinkedList(linkedList);

		linkedList.displayLinkedList();
	}

}
