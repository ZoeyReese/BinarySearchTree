import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class BinaryTreeTest {

	@Test
	void test() {
		BinaryTree tree = new BinaryTree();
		tree.add(new Node(4));
		tree.add(new Node(1));
		tree.add(new Node(7));
		tree.add(new Node(3));
		System.out.println(tree);
	}

}
