package sample.ds.tree;

import lombok.Getter;
import lombok.Setter;
import lombok.ToString;
import lombok.extern.log4j.Log4j2;

@Log4j2 @Getter @Setter @ToString
public class Node {
	
	private int value;
	private Node left;
	private Node right;
	
	public Node(int value) { 
		this.value = value;
	}
	
}
