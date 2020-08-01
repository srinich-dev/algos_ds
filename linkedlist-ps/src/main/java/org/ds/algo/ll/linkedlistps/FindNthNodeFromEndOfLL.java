package org.ds.algo.ll.linkedlistps;

import org.ds.algo.ll.Node;

public class FindNthNodeFromEndOfLL {

	public int findNthNodeFromEndOfLL(LinkedList<Integer> linkedList, int k) {

		Node<Integer> p2Node = linkedList.getHead();
		Node<Integer> p1Node = linkedList.getHead();
		int p1 = 1;
		int p2 = 1;
		while (p2Node != null && p2 <= k) {
			p2Node = p2Node.getNext();
			p2++;
		}

		while (p2Node != null && (p2 - p1 == k)) {
			p1Node = p1Node.getNext();
			p2Node = p2Node.getNext();
			p1++;
			p2++;
		}

		return p1Node.getData();
	}

}
