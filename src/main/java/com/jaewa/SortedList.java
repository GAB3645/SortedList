package com.jaewa;

public class SortedList {

	private Node firstNode;

	public int[] getValues() {
		if (firstNode == null) {
			return new int[0];
		}

		int[] result = new int[size()];
		int i = 0;
		Node cur = firstNode;
		while (cur != null) {
			result[i] = cur.getValue();
			cur = cur.getNext();
			i++;
		}

		return result;

	}

	public void add(int x) {
		if(contains(x)) return; //! controllo numero gia presente

		if (firstNode == null) {
			Node tmp = new Node();
			tmp.setValue(x);
			firstNode = tmp;
			return;
		}
	
		Node prev = null;
		Node cur = firstNode;

		while (cur != null && x > cur.getValue()) {
			prev = cur;
			cur = cur.getNext();
		}
	
		Node newNode = new Node();
		newNode.setValue(x);
	
		if (prev == null) {
			newNode.setNext(firstNode);
			firstNode = newNode;
		} else {
			newNode.setNext(prev.getNext());
			prev.setNext(newNode);
		}
	}

	public int size() {
		int result = 0;
		Node cur = firstNode;
		while (cur != null) {
			result++;
			cur = cur.getNext();
		}

		return result;
	}

	private boolean contains(int x) {
		Node current = firstNode;
		while (current != null) {
			if (current.getValue() == x) {
				return true;
			}
			current = current.getNext();
		}
		return false;
	}

	public void remove(int x) {
		Node current = firstNode;	
		Node previous = null;

		while (current != null) {
			if (current.getValue() == x) {
				if (previous == null) {
					firstNode = current.getNext();
				} else {
					previous.setNext(current.getNext());
				}
				return;
			}
			
			previous = current;
			current = current.getNext();
		}
	}

}
