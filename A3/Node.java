public class Node {
    int value;
    Node left;
    Node right;

    Node(int value) {
        this.value = value;
        right = null;
        left = null;
    }

    static boolean start = false;
    static boolean subtree(Node tree1, Node tree2){
        if (tree2 == null)
            return true;
        if (tree1 == null)
            return false;
        if (tree1.value != tree2.value)
            if (!start)
                return subtree(tree1.left,tree2) || subtree(tree1.right, tree2);
            else
                return false;
        else
            start = true;
        return subtree(tree1.left,tree2.left) && subtree(tree1.right, tree2.right);
    }

    public static void main(String[] args) {
        Node tree1 = new Node(5);
        tree1.left = new Node(3);
        tree1.right = new Node(8);
        tree1.left.left = new Node(1);
        tree1.left.right = new Node(4);
        tree1.right.left = new Node(7);
        tree1.right.left.left = new Node(6);
        tree1.right.right = new Node(9);
        tree1.right.right.right = new Node(10);

        Node tree2 = new Node(8);
        tree2.left = new Node(7);
        tree2.right = new Node(10   );

        System.out.println("Tree2 is a subtree of tree1: "+  Node.subtree(tree1,tree2));
    }
}
