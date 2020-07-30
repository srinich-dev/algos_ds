package org.ds.algo.ll.linkedlistps;

import static org.assertj.core.api.Assertions.assertThat;

import org.junit.jupiter.api.Test;

class FindNthNodeFromEndOfLLTest {

	@Test
	void testFindNthNodeFromEndOfLL() {
		LinkedList<Integer> linkedList = new LinkedList<Integer>();
		linkedList.add(10);
		linkedList.add(20);
		linkedList.add(30);
		linkedList.add(40);
		linkedList.add(50);
		linkedList.add(60);
		linkedList.add(70);
		linkedList.add(80);

		FindNthNodeFromEndOfLL findNthNodeFromEndOfLL = new FindNthNodeFromEndOfLL();
		int data = findNthNodeFromEndOfLL.findNthNodeFromEndOfLL(linkedList, 6);

		assertThat(data).isEqualTo(30);
	}
	
	@Test
	void testFindNthNodeFromEndOfLLEnd() {
		LinkedList<Integer> linkedList = new LinkedList<Integer>();
		linkedList.add(10);
		linkedList.add(20);
		linkedList.add(30);
		linkedList.add(40);
		linkedList.add(50);
		linkedList.add(60);
		linkedList.add(70);
		linkedList.add(80);

		FindNthNodeFromEndOfLL findNthNodeFromEndOfLL = new FindNthNodeFromEndOfLL();
		int data = findNthNodeFromEndOfLL.findNthNodeFromEndOfLL(linkedList, 1);

		assertThat(data).isEqualTo(80);
	}
	
	@Test
	void testFindNthNodeFromEndOfLLFirst() {
		LinkedList<Integer> linkedList = new LinkedList<Integer>();
		linkedList.add(10);
		linkedList.add(20);
		linkedList.add(30);
		linkedList.add(40);
		linkedList.add(50);
		linkedList.add(60);
		linkedList.add(70);
		linkedList.add(80);

		FindNthNodeFromEndOfLL findNthNodeFromEndOfLL = new FindNthNodeFromEndOfLL();
		int data = findNthNodeFromEndOfLL.findNthNodeFromEndOfLL(linkedList, 8);

		assertThat(data).isEqualTo(10);
	}

}
