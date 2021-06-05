public class MangoTree {

    private int rows;
    private int columns;
    private int treeNumber;

    MangoTree(int rows, int columns, int treeNumber) {
        this.rows = rows;
        this.columns = columns;
        this.treeNumber = treeNumber;
    }

    public boolean checkMangoTree(){
        return (treeNumber % columns == 0 || treeNumber % columns == 1 || treeNumber % columns == treeNumber);
    }
}
