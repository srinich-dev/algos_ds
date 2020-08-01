package org.ds.algo.ll.linkedlistps;

import java.util.ArrayList;
import java.util.List;

import org.ds.algo.ll.Node;

public class LinkedList<T> {

	private Node<T> head;

	public void setHead(Node<T> head) {
		this.head = head;
	}

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
		Node<T> currentNode = this.head;
		while (currentNode != null) {
			data.add(currentNode.getData());
			currentNode = currentNode.getNext();
		}

		return data;
	}

	public void displayLinkedList() {
		Node<T> currentNode = this.head;
		while (currentNode != null) {
			System.out.print(currentNode.getData() + ", ");
			currentNode = currentNode.getNext();
		}
		System.out.println();
	}

	public Node<T> getHead() {
		return this.head;
	}

}
