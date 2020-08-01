package org.ds.algo.ll.linkedlistps;

import org.junit.jupiter.api.Test;

class InsertNodeInSortedLLTest {

	@Test
	void testInsertNodeInSortedList() {
		InsertNodeInSortedLL insertNodeInSortedLL = new InsertNodeInSortedLL();
		LinkedList<Integer> linkedList = new LinkedList<Integer>();
		linkedList.add(1);
		linkedList.add(2);
		linkedList.add(3);
		linkedList.add(5);
		
		linkedList.displayLinkedList();
		insertNodeInSortedLL.insertNodeInSortedList(linkedList, 4);
		linkedList.displayLinkedList();
	}
	
	@Test
	void testInsertNodeInSortedList2() {
		InsertNodeInSortedLL insertNodeInSortedLL = new InsertNodeInSortedLL();
		LinkedList<Integer> linkedList = new LinkedList<Integer>();
		linkedList.add(1);
		linkedList.add(2);
		linkedList.add(3);
		linkedList.add(4);
		linkedList.add(7);
		linkedList.add(15);
		
		linkedList.displayLinkedList();
		insertNodeInSortedLL.insertNodeInSortedList(linkedList, 7);
		linkedList.displayLinkedList();
	}

}
