package org.ds.algo.ll.linkedlistps;

import static org.assertj.core.api.Assertions.assertThat;

import org.junit.jupiter.api.Test;

class FindMiddleElementOfLLTest {

	@Test
	void testFindMiddleElementOfLL() {
		LinkedList<Integer> linkedList = new LinkedList<Integer>();
		linkedList.add(1);
		linkedList.add(2);
		linkedList.add(3);
		linkedList.add(4);
		linkedList.add(5);

		FindMiddleElementOfLL findMiddleElementOfLL = new FindMiddleElementOfLL();
		Integer middle = findMiddleElementOfLL.findMiddleElementOfLL(linkedList);

		assertThat(middle).isEqualTo(3);

	}
	
	@Test
	void testFindMiddleElementOfLLEven() {
		LinkedList<Integer> linkedList = new LinkedList<Integer>();
		linkedList.add(1);
		linkedList.add(2);
		linkedList.add(3);
		linkedList.add(4);
		linkedList.add(5);
		linkedList.add(6);

		FindMiddleElementOfLL findMiddleElementOfLL = new FindMiddleElementOfLL();
		Integer middle = findMiddleElementOfLL.findMiddleElementOfLL(linkedList);

		assertThat(middle).isEqualTo(4);

	}

	
	@Test
	void testFindMiddleElementOfLLSingle() {
		LinkedList<Integer> linkedList = new LinkedList<Integer>();
		linkedList.add(1);

		FindMiddleElementOfLL findMiddleElementOfLL = new FindMiddleElementOfLL();
		Integer middle = findMiddleElementOfLL.findMiddleElementOfLL(linkedList);

		assertThat(middle).isEqualTo(1);

	}
}
