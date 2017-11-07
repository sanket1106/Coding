package com.hackerrank.linkedlist;

public class PrintLinkedList {

	public static void main(String[] args) {

	}

	public static void Print(Node head) {
		if (head == null) {
			return;
		} else {
			while (head != null) {
				System.out.println(head.data);
				head = head.next;
			}
		}
	}
}
