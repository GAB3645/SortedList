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
		if (firstNode == null) {
			Node tmp = new Node();
			tmp.setValue(x);
			firstNode = tmp;
			return;
		}

		if (x > firstNode.getValue()) {
			Node newNode = new Node();
			newNode.setValue(x);
			newNode.setNext(null);
			firstNode.setNext(newNode);
			return;
		}

		if (x < firstNode.getValue()) {
			Node newNode = new Node();
			newNode.setValue(x);
			newNode.setNext(firstNode);
			firstNode = newNode;
			return;
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

	// List<Node> lista;
	//
	// public SortedList() {
	// this.lista = new ArrayList<Node>();
	// }
	//
	// public List<Node> getValues() {
	// return Collections.unmodifiableList(lista);
	// }
	//
	// public void addNode(Node node) {
	//
	// if (node == null ) {
	// return;
	// }
	//
	// lista.add(node);
	//
	//
	// }
	//
	// public void removeNode(Node node) {
	//
	// if (!lista.contains(node) && node != null) {
	// return;
	// } else {
	// lista.remove(node);
	// }
	// }

}
