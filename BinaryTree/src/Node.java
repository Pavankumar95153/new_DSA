public class Node {
    int data;
    Node left, right;
    Node(int value){
        data = value;
        left = null;
        right = null;
    }
}

class Depth{
    static int height(Node root){
        if( root == null){
            return -1;
        }
        int lheight = height(root.left);
        int rheight = height(root.right);
        return Math.max(lheight,rheight)+1;
    }

    public static void main(String[] args) {
        Node root = new Node(12);
        root.left = new Node(8);
        root.right = new Node(18);
//        root.left.left = new Node(5);
//        root.right.right = new Node(11);
        System.out.println("height of the tree-->"+height(root));
    }
}