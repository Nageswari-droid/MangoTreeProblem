import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.BeforeAll;

import static org.junit.jupiter.api.Assertions.assertArrayEquals;

public class GardenTreeTest {

    private static GardenTree gardenTree;

    @BeforeAll
    public static void setup() {
        gardenTree = new GardenTree();
    }

    @Test
    public void checkTheGardenView() {
        int expectedMatrix[][] = {{1, 2, 3, 4}, {5, 6, 7, 8}, {9, 10, 11, 12}};
        assertArrayEquals(expectedMatrix, gardenTree.getGardenView(3, 4));
    }
}
