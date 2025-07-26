
class NodeT{
    int data;
    NodeT  left,right;
    NodeT(int value){
        data = value;
        left = right= null;
    }

}
public class TreeTraversal {


    static void inOrderTraversal(NodeT node){
        if(node != null){
            inOrderTraversal(node.left);
            System.out.print(" "+node.data);
            inOrderTraversal(node.right);
        }
    }
    static void preOrderTraversal(NodeT node){
        if(node != null){
            System.out.print(" "+node.data+" ");
            preOrderTraversal(node.left);
            preOrderTraversal(node.right);
        }
    }

    static void postOrderTraversal(NodeT node){
        if(node!=null){
            postOrderTraversal(node.left);
            postOrderTraversal(node.right);
            System.out.print(" "+node.data);
        }
    }

    public static void main(String[] args) {
        NodeT root = new NodeT(5);
        root.left= new NodeT(4);
        root.right = new NodeT(6);
        root.left.left = new NodeT(3);
        root.right.right = new NodeT(10);
        root.left.right = new NodeT(7);
        root.right.left = new NodeT(2);
        System.out.println("\nInorder Traversal");
        inOrderTraversal(root);
        System.out.println("\nPreOrder Traversal");
        preOrderTraversal(root);
        System.out.println("\nPostOrder Traversal");
        postOrderTraversal(root);
    }
}