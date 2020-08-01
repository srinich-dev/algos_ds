package org.ds.algo.ll.linkedlistps;

import org.ds.algo.ll.Node;

public class CircularLinkedList<T> {

	private Node<T> head;

	public void createCircularLinkedList(T[] data) {

		Node<T> newNode = new Node<T>(data[0], null);
		this.head = newNode;
		Node<T> currentNode = head;
		for (int i = 0; i < data.length - 1; i++) {
			currentNode.setNext(new Node<T>(data[i], null));
		}
		currentNode.setNext(new Node<T>(data[data.length-1], head));
	}
	
	public void createCircularLinkedList(T[] start, T[] data) {

		Node<T> newNode = new Node<T>(data[0], null);
		this.head = newNode;
		Node<T> currentNode = head;
		for (int i = 0; i < start.length; i++) {
			currentNode.setNext(new Node<T>(start[i], null));
		}
		
		Node<T> circleBeginNode = currentNode;
		for (int i = 0; i < data.length - 1; i++) {
			currentNode.setNext(new Node<T>(data[i], null));
		}
		currentNode.setNext(new Node<T>(data[data.length-1], circleBeginNode));
	}

	public Node<T> getHead() {
		return head;
	}

	public void setHead(Node<T> head) {
		this.head = head;
	}
}
