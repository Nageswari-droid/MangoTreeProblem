import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.BeforeAll;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class MangoTreeTest {

    private static MangoTree mangoTree;

    @BeforeAll
    public static void setup() {
        int[][] gardenViewMatrix = {{1, 2, 3, 4}, {5, 6, 7, 8}, {9, 10, 11, 12}};
        mangoTree = new MangoTree(3, 4, 9, gardenViewMatrix);
    }

    @Test
    public void checkMangoIsFoundOrNot() {
        assertEquals(true, mangoTree.findTheMangoTree());
    }

    @Test
    public void checkMangoTreeInFirstRowOrFirstColumnOrLastRow() {
        int rows = 3;
        int columns = 4;
        assertEquals(false, mangoTree.findTheMangoTreeSomeWhere(0, columns, columns, "row"));
        assertEquals(true, mangoTree.findTheMangoTreeSomeWhere(rows, 0, rows, "column"));
        assertEquals(false, mangoTree.findTheMangoTreeSomeWhere(rows, columns - 1, rows, "column"));
    }
}
