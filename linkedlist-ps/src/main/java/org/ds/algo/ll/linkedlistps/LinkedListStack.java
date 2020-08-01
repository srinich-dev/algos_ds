package org.ds.algo.ll.linkedlistps;

import java.util.ArrayList;
import java.util.List;

import org.ds.algo.ll.Node;

public class LinkedListStack<T> {

	private Node<T> head;

	private Node<T> top;

	public void push(T data) {
		Node<T> newNode = new Node<T>(data, null);

		if (this.head == null && this.top == null) {
			this.head = newNode;
			this.top = newNode;
		} else {
			this.top.setNext(newNode);
			this.top = newNode;
		}
	}

	public void pop() {
		if (this.top != null && this.head != null) {
			Node<T> previous = null;
			Node<T> current = head;
			while (!current.equals(top)) {
				previous = current;
				current = current.getNext();
			}
			this.top = previous;
			this.top.setNext(null);
		}
	}

	public List<T> getAllDataAsArray() {
		List<T> data = new ArrayList<>();
		Node<T> start = head;
		while (start != null) {
			data.add(start.getData());
			start = start.getNext();
		}

		return data;
	}

}
