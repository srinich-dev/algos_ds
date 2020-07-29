package org.ds.algo.ll.linkedlistps;

import java.util.ArrayList;
import java.util.List;

public class LinkedList<T> {

	private Node<T> head;

	public void add(T data) {
		Node<T> newNode = new Node<T>(data, null);

		if (this.head == null) {
			this.head = newNode;
		} else {
			Node<T> currentNode = head;
			while (currentNode.getNext() != null) {
				currentNode = currentNode.getNext();
			}
			currentNode.setNext(newNode);
		}
	}

	public void remove(T data) {
		if (data != null && data.equals(head.getData())) {
			this.head = null;
			return;
		}

		Node<T> previousNode = head;
		Node<T> currentNode = head.getNext();
		while (currentNode != null) {
			if (currentNode.getData().equals(data)) {
				previousNode.setNext(currentNode.getNext());
				break;
			} else {
				previousNode = currentNode;
			}
			currentNode = currentNode.getNext();
		}
	}

	public List<T> getAllDataAsArray() {
		List<T> data = new ArrayList<>();
		while (this.head != null) {
			data.add(head.getData());
			head = head.getNext();
		}

		return data;
	}

}
