package sample.ds.tree;

import java.util.LinkedList;
import java.util.Queue;

import lombok.Getter;
import lombok.ToString;

@ToString
public class Tree {
	
	@Getter
	Node rootnode;
	Queue<Node> queue = new LinkedList<Node>();
	
	public static Tree builder() {
		return new Tree();
	}

	public void start() {
		System.out.println(this.getClass().getName());
		
		insert(7);
		
		System.out.println(rootnode);
	}
	
	private void insert(int max) {
		
		if (rootnode == null) {
			rootnode = new Node(0);
		}
		
		for ( int i = 1; i < max; i++) {
			insertvalue(i, rootnode);
		}
	}

	/**
	 * Insert element to binary tree.
	 * 
	 */
	private void insertvalue(int i, Node node) {
		Node left = node.getLeft();
		Node right = node.getRight();
		
		if (left == null) {
			node.setLeft(new Node(i));
			queue.clear();
			return;
		}
		if (right == null) {
			node.setRight(new Node(i));
			queue.clear();
			return;
		}
		
		queue.add(left);
		queue.add(right);
		
		insertvalue(i, queue.remove());
		
	}
	
	
}