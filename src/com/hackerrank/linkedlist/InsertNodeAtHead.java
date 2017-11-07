package com.hackerrank.linkedlist;

public class InsertNodeAtHead {

	public static void main(String[] args) {
		Node node = new Node();
		node.data = 2;
		Node insert = Insert(node, 3);
		System.out.println(insert.data);
	}

	static Node Insert(Node head, int data) {
		// This is a "method-only" submission.
		// You only need to complete this method.
		if (head == null) {
			head = new Node();
			head.data = data;
			return head;
		} else {
			Node node = new Node();
			node.data = data;
			node.next = head;
			return node;
		}
	}
}
