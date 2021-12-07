package Trees;
// non-recursive java program for inorder traversal
import java.util.Stack;


/* Class to print the inorder traversal */
class BinaryTree
{
	Node root;
	void inorder()
	{
		if (root == null)
			return;


		Stack<Node> s = new Stack<Node>();
		Node curr = root;
		

		// traverse the tree
		while (curr != null || s.size() > 0)
		{

			/* Reach the left most Node of the
			curr Node */
			while (curr != null)
			{
				/* place pointer to a tree node on
				the stack before traversing
				the node's left subtree */
				s.push(curr);
				curr = curr.left;
			}

			/* Current must be NULL at this point */
			curr = s.pop();

			System.out.print(curr.data + " ");

			/* we have visited the node and its
			left subtree. Now, it's right
			subtree's turn */
			curr = curr.right;
		}
	}

	// Iterative function to perform postorder traversal on the tree
    public static void postorderIterative(Node root)
    {
        // create an empty stack and push the root node
        Stack<Node> stack = new Stack<Node>();
        stack.push(root);
    
        // create another stack to store postorder traversal
        Stack<Integer> out = new Stack<Integer>();
    
        // loop till stack is empty
        while (!stack.empty())
        {
            // pop a node from the stack and push the data into the output stack
            Node curr = stack.pop();
            out.push(curr.data);
    
            // push the left and right child of the popped node into the stack
            if (curr.left != null) {
                stack.push(curr.left);
            }
    
            if (curr.right != null) {
                stack.push(curr.right);
            }
        }
    
        // print postorder traversal
        while (!out.empty()) {
            System.out.print(out.pop() + " ");
        }
    }

	public static void main(String args[])
	{

		/* creating a binary tree and entering
		the nodes */
		BinaryTree tree = new BinaryTree();
		tree.root = new Node(1);
		tree.root.left = new Node(2);
		tree.root.right = new Node(3);
		tree.root.left.left = new Node(4);
		tree.root.left.right = new Node(5);
		tree.inorder();
	}
}
