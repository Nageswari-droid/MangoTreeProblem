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

        MangoTree mangoTree = new MangoTree(numberOfRows, numberOfColumns, numberOfTree);

        if (mangoTree.checkMangoTree()) {
            System.out.println("The given tree is a mango tree!");
        } else {
            System.out.println("The given tree is not a mango tree!");
        }
    }
}
