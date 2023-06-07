package Tree;

public class BinaryTreeArray {
    int[] data;
    int idxLast;

    public BinaryTreeArray() {
        data = new int[10];
        idxLast = -1;
    }

    void add(int data) {
        if (idxLast < this.data.length - 1) {
            idxLast++;
            this.data[idxLast] = data;
        } else {
            System.out.println("Tree is full. Cannot add data.");
        }
    }

    void traversePreOrder() {
        traversePreOrder(0);
    }

    private void traversePreOrder(int idxStart) {
        if (idxStart <= idxLast) {
            System.out.print(data[idxStart] + " ");
            traversePreOrder(2 * idxStart + 1);
            traversePreOrder(2 * idxStart + 2);
        }
    }

    void traversePostOrder() {
        traversePostOrder(0);
    }

    private void traversePostOrder(int idxStart) {
        if (idxStart <= idxLast) {
            traversePostOrder(2 * idxStart + 1);
            traversePostOrder(2 * idxStart + 2);
            System.out.print(data[idxStart] + " ");
        }
    }

    void populateData(int data[], int idxLast){
        this.data = data;
        this.idxLast = idxLast;
    }

    void traverseinOrder(int idxStart){
        if (idxStart <= idxLast){
            traverseinOrder(2 * idxStart + 1);
            System.out.print(data[idxStart] + " ");
            traverseinOrder(2 * idxStart + 2);
        }
    }
}
