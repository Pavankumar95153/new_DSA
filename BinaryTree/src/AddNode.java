public class AddNode {
    int data;
    AddNode left,right;
    AddNode(int value){
        data = value;
        left = null;
        right = null;
    }
}
class Add{
    static int height(AddNode root){
        if(root != null){
            return -1;
        }
        int lheight = height(root.left);
        int rheight = height(root.right);
        return Math.max(lheight,rheight)+1;
    }
    public static void main(String[] args) {
        AddNode root = new AddNode(5);
        root.right = new AddNode(9);
        root.left = new AddNode(4);
        System.out.println("root of the tree is -->"+root.left.data);
        System.out.println("height of the tree is --->"+ height(root));
    }
}