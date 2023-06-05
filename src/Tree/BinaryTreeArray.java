package Tree;

public class BinaryTreeArray {
    int[] data;
    int idxLast;

    public BinaryTreeArray(){
        data = new int[10];
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
