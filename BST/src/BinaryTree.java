
public class BinaryTree {

	//root node (top of the tree)
	Node root;
	int size;
	
	public BinaryTree() {
		root = null;
		size = 0;
	}
	
	//add a new node to the Binary Tree
	
	//< goes to the left >= goes to the right
	
	public void add(Node newNode) {
		if (root == null) {
			root = newNode;
			size++;
		}else {
//			//figure out if you need to go left or right from current Node
//			Node curr = root;
//			
//			//if you need to traverse
//			while(curr.left != null || curr.right != null) {
//				if (newNode.getData() < curr.getData() && curr.left != null) {
//					curr = curr.left; //"traversal"
//				}else if (newNode.getData() >= curr.getData() && curr.right != null) {
//					curr = curr.right;
//				}else if (curr.left == null && curr.getData() > newNode.getData()){
//					//needs to go to the left, but no left node
//					curr.left = newNode;
//				}else {
//					curr.right = newNode;
//				}
//			}
			add(root, newNode);
			size++;
			
		}
		
		
	}
	
	//recursive helper method
	public void add(Node curr, Node newNode) {
		
		//base case
		if (newNode.getData() < curr.getData()) {
			
			//add - don't recurse
			if (curr.left == null) {
				curr.left = newNode;
			}else { //recursive case
				add(curr.left, newNode);
			}
		}else if (newNode.getData() >= curr.getData()){
			
			if (curr.right == null) {
				curr.right = newNode;
			}else { //recursive case
				add(curr.right, newNode);
			}
		}
	}
	
	public String toString() {
		//for now - implement any way of printing your tree so you can check its content
		String res = "";
		res += root.left +" ";
		res += root.left.right + " ";
		res += root + " ";
		res += root.right + " ";
		return res;
	}
	
	
	
}
