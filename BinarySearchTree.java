class Node {
	int value;
	Node l,r;
	public Node(int value, Node left, Node right) {
        this.value = value;
        this.l = left;
        this.r = right;
    }
	
	public String toString() {		
		return " [ Node : value = " + value + " : left = " + l + " : right = "+ r + " ] ";		
	}
}

public class BinarySearchTree {
	
	public static void main(String[] args) {
		
		Node n17 = new Node(17, null, null);
		Node n16 = new Node(16, null, n17);
		
		Node n19 = new Node(19, null, null);
		Node n18= new Node(18, n16, n19);
		
		Node n10 = new Node(10, null, null);
		Node n15 = new Node(15, n10, n18);
		
		Node n25 = new Node(25, null, null);
		Node n20 = new Node(20, n15, n25);        
        
        System.out.println(contains(n20, 17));	

	}
	
	public static boolean contains(Node node, int value) {
		Node temp = node;
		while(temp!= null) {
			System.out.println(temp);
			if ( temp.value == value) {
				return true;
			} else if( value < temp.value) {
				temp = temp.l;				
			} else if(value > temp.value ) {
				temp = temp.r;	
			}
		}		
		return false;		
	}
	
	//addNode
	//deleteNode
	//getRoot
	//printTree
	
}	


	


