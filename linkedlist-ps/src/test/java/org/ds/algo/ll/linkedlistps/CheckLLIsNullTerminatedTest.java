package org.ds.algo.ll.linkedlistps;

import static org.assertj.core.api.Assertions.assertThat;

import org.junit.jupiter.api.Test;

class CheckLLIsNullTerminatedTest {

	@Test
	void testCheckIfLLisNullTerminatedOrCyclicTrue() {
		CircularLinkedList<Integer> circularLinkedList = new CircularLinkedList<>();
		circularLinkedList.createCircularLinkedList(new Integer[] { 1, 2, 3, 4, 5, 6, 7, 8, 9 });

		CheckLLIsNullTerminated nullTerminated = new CheckLLIsNullTerminated();
		Integer checkNull = nullTerminated.checkIfLLisNullTerminatedOrCyclic(circularLinkedList);
		assertThat(checkNull).isNotNull();
		System.out.println(checkNull);
	}
	
	
	@Test
	void testCheckIfLLisNullTerminatedOrCyclicTrueWithFewAdditionalNodes() {
		CircularLinkedList<Integer> circularLinkedList = new CircularLinkedList<>();
		circularLinkedList.createCircularLinkedList(new Integer[] { 1, 2, 3, 4, 5 }, new Integer[] {6, 7, 8, 9, 10, 11, 12, 13, 14});

		CheckLLIsNullTerminated nullTerminated = new CheckLLIsNullTerminated();
		Integer checkNull = nullTerminated.checkIfLLisNullTerminatedOrCyclic(circularLinkedList);
		assertThat(checkNull).isNotNull();
		System.out.println(checkNull);
	}
}
