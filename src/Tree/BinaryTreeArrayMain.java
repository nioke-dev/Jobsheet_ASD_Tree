package Tree;

public class BinaryTreeArrayMain {
    public static void main(String[] args) {
        BinaryTreeArray bta = new BinaryTreeArray();
        bta.add(6);
        bta.add(4);
        bta.add(8);
        bta.add(3);
        bta.add(5);
        bta.add(7);
        bta.add(9);

        System.out.print("Pre-order traversal: ");
        bta.traversePreOrder();
        System.out.println();

        System.out.print("Post-order traversal: ");
        bta.traversePostOrder();
        System.out.println();
    }
}
