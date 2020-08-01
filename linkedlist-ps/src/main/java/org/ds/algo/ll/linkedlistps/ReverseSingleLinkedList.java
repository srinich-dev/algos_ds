package org.ds.algo.ll.linkedlistps;

import org.ds.algo.ll.Node;

public class ReverseSingleLinkedList {

	public void reverseLinkedList(LinkedList<Integer> linkedList) {

		Node<Integer> current = linkedList.getHead();
		Node<Integer> tempNode = null;
		Node<Integer> previous = null;

		while (current != null) {
			tempNode = current.getNext();
			current.setNext(previous);
			previous = current;
			current = tempNode;
			if (current != null) {
				linkedList.setHead(current);
			}
		}

	}
}
