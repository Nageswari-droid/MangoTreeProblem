public class MangoTree {

    private int rows;
    private int columns;
    private int treeNumber;
    private int[][] gardenMatrix;
    private boolean mangoTreeIsFoundOrNot;

    MangoTree(int rows, int columns, int treeNumber, int[][] gardenMatrix) {
        this.rows = rows;
        this.columns = columns;
        this.treeNumber = treeNumber;
        this.gardenMatrix = gardenMatrix;
    }

    public boolean findTheMangoTree() {
        if (findTheMangoTreeSomeWhere(0, columns, columns, "row") ||
                findTheMangoTreeSomeWhere(rows, 0, rows, "column") ||
                findTheMangoTreeSomeWhere(rows, columns - 1, rows, "column")) {
            return true;
        } else {
            return false;
        }
    }

    public boolean findTheMangoTreeSomeWhere(int rows, int columns, int iteratorLimit, String rowOrColumn) {
        mangoTreeIsFoundOrNot = false;
        for (int i = 0; i < iteratorLimit; i++) {
            if (rowOrColumn.equals("row")) {
                if (gardenMatrix[rows][i] == treeNumber) {
                    mangoTreeIsFoundOrNot = true;
                }
            } else {
                if (gardenMatrix[i][columns] == treeNumber) {
                    mangoTreeIsFoundOrNot = true;
                }
            }
        }
        return mangoTreeIsFoundOrNot;
    }
}
