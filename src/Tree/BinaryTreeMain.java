package Tree;

public class BinaryTreeMain {
    public static void main(String[] args) {
        BinaryTree bt = new BinaryTree();

//        bt.add(6);
//        bt.add(4);
//        bt.add(8);
//        bt.add(3);
//        bt.add(5);
//        bt.add(7);
//        bt.add(9);
//        bt.add(10);
//        bt.add(15);

        bt.addRecursive(6);
        bt.addRecursive(4);
        bt.addRecursive(8);
        bt.addRecursive(3);
        bt.addRecursive(5);
        bt.addRecursive(7);
        bt.addRecursive(9);
        bt.addRecursive(10);
        bt.addRecursive(15);



        bt.traversePreOrder(bt.root);
        System.out.println("");
        bt.traverseInOrder(bt.root);
        System.out.println("");
        bt.traversePostOrder(bt.root);
        System.out.println("");

        // Pemanggilan method findMinMaxValue()
        bt.findMinMaxValues();

        // leaf nodes
        System.out.print("Leaf Nodes: ");
        bt.displayLeafNodes(bt.root);
        System.out.println();

        // count leaf
        int leafCount = bt.countLeafNodes(bt.root);
        System.out.println("Jumlah Leaf Nodes: " + leafCount);

        System.out.println("Find " + bt.find(5));
        bt.delete(8);
        bt.traversePreOrder(bt.root);
        System.out.println("");

    }
}
