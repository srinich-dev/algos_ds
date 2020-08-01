package org.ds.algo.ll.linkedlistps;

import org.ds.algo.ll.Node;

public class InsertNodeInSortedLL {

	public void insertNodeInSortedList(LinkedList<Integer> linkedList, Integer element) {
		Node<Integer> currNode = linkedList.getHead();
		Node<Integer> matchingNode = null;
		if (currNode == null) {
			linkedList.add(element);
		}
		while (currNode != null && currNode.getNext() != null) {
			if (currNode.getData() <= element && currNode.getNext().getData() >= element) {
				matchingNode = currNode.getNext();
				break;
			} else {
				currNode = currNode.getNext();
			}
		}

		Node<Integer> newNode = new Node<Integer>(element, matchingNode);
		currNode.setNext(newNode);
	}

}
