public class Main {
    public static void main(String[] args) {

        BinarySearchNode binarySearchNode = new BinarySearchNode();
        binarySearchNode.insert(47);
        binarySearchNode.insert(21);
        binarySearchNode.insert(76);
        binarySearchNode.insert(18);
        binarySearchNode.insert(52);
        binarySearchNode.insert(82);
        binarySearchNode.insert(27);

        System.out.println(binarySearchNode.root.left.right.value);
        System.out.println(binarySearchNode.contains(18));


    }
}