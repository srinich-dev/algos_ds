package org.ds.algo.ll.linkedlistps;

import org.ds.algo.ll.Node;

public class FindMiddleElementOfLL {

	public Integer findMiddleElementOfLL(LinkedList<Integer> linkedList) {

		Node<Integer> p1Node = linkedList.getHead();
		Node<Integer> p2Node = linkedList.getHead();

		while (p2Node != null) {
			if (p2Node.getNext() != null) {
				p1Node = p1Node.getNext();
				p2Node = p2Node.getNext().getNext();
			} else {
				p2Node = p2Node.getNext();
			}
		}

		return p1Node.getData();
	}

}
