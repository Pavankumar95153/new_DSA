import java.util.LinkedList;
import java.util.Queue;

public class LevelOrderTraversal  {
    public static class TreeNode {
        int data;
        TreeNode left;
        TreeNode right;

        public TreeNode(int data) {
            this.data = data;
        }
    }
public static void levelOrderTraversal(TreeNode node){
    Queue queue = new LinkedList<>();
    queue.add(node);

    while(!queue.isEmpty()){
         TreeNode nodeData = (TreeNode) queue.poll();
         System.out.print(nodeData.data+ " ");

         if(nodeData.left != null){
             queue.add(nodeData.left);
         }

         if(nodeData.right != null){
             queue.add(nodeData.right);
         }

    }
}

public  static TreeNode createBinaryTree()
{
    TreeNode rootNode = new TreeNode(7);
    rootNode.left = new TreeNode(6);
    rootNode.right = new TreeNode(5);
    rootNode.left.left = new TreeNode(4);
    rootNode.left.right = new TreeNode(3);

    rootNode.right.left = new TreeNode(2);
    rootNode.right.right = new TreeNode(1);

return rootNode;
}
public static void main(String[] args){
        levelOrderTraversal(createBinaryTree());
}

}