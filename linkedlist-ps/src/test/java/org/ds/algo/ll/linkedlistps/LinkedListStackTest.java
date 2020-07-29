package org.ds.algo.ll.linkedlistps;

import static org.assertj.core.api.Assertions.assertThat;

import org.junit.jupiter.api.Test;

class LinkedListStackTest {

	@Test
	void testPush() {
		LinkedListStack<Integer> linkedList = new LinkedListStack<Integer>();
		linkedList.push(10);
		assertThat(linkedList.getAllDataAsArray()).asList().containsExactly(10);
		linkedList.push(20);
		linkedList.push(30);

		assertThat(linkedList.getAllDataAsArray()).asList().containsExactly(10, 20, 30);
	}

	@Test
	void testPop() {
		LinkedListStack<Integer> linkedList = new LinkedListStack<Integer>();
		linkedList.push(10);
		linkedList.push(20);
		linkedList.push(30);

		linkedList.pop();
		assertThat(linkedList.getAllDataAsArray()).asList().containsExactly(10, 20);
	}

	@Test
	void testPopEmpty() {
		LinkedListStack<Integer> linkedList = new LinkedListStack<Integer>();
		linkedList.pop();

		assertThat(linkedList.getAllDataAsArray()).isEmpty();
	}

}
