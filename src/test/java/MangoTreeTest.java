import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.BeforeAll;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class MangoTreeTest {

    private static MangoTree mangoTree;

    @BeforeAll
    public static void setup() {
        mangoTree = new MangoTree(3, 4, 2);
    }

    @Test
    public void checkMangoIsFoundOrNot() {
        assertEquals(true, mangoTree.checkMangoTree());
    }
}
