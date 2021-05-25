import java.util.*;

public class GardenTree {
    public static void main(String args[]) {
        Scanner scanner = new Scanner(System.in);
        int numberOfRows, numberOfColumns, numberOfTree;

        System.out.println("Enter the number of rows : ");
        numberOfRows = scanner.nextInt();
        System.out.println("\nEnter the number of columns : ");
        numberOfColumns = scanner.nextInt();
        System.out.println("\nEnter the tree number : ");
        numberOfTree = scanner.nextInt();

        GardenTree gardenTree = new GardenTree();
        int gardenMatrix[][] = gardenTree.getGardenView(numberOfRows, numberOfColumns);

        MangoTree mangoTree = new MangoTree(numberOfRows, numberOfColumns, numberOfTree, gardenMatrix);

        if (mangoTree.findTheMangoTree()) {
            System.out.println("The given tree is a mango tree!");
        } else {
            System.out.println("The given tree is not a mango tree!");
        }
    }

    public int[][] getGardenView(int rows, int columns) {
        int gardenMatrix[][] = new int[rows][columns];
        int treeNumbers = 1;
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < columns; j++) {
                gardenMatrix[i][j] = treeNumbers;
                treeNumbers++;
            }
        }

        return gardenMatrix;
    }
}
