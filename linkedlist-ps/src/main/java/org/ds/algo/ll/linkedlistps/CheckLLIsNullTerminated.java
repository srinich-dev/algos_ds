package org.ds.algo.ll.linkedlistps;

import org.ds.algo.ll.Node;

public class CheckLLIsNullTerminated {

	public Integer checkIfLLisNullTerminatedOrCyclic(CircularLinkedList<Integer> linkedList) {

		Node<Integer> p1Node = null;
		Node<Integer> p2Node = linkedList.getHead();

		while (p2Node != null && !p2Node.equals(p1Node) && p2Node.getNext() != null) {
			if (p1Node == null) {
				p1Node = linkedList.getHead();
				p2Node = p2Node.getNext().getNext();
			} else {
				p1Node = p1Node.getNext();
				p2Node = p2Node.getNext().getNext();
			}
		}

		if (p2Node != null) {
			return p2Node.getData();
		}

		return null;
	}

}
