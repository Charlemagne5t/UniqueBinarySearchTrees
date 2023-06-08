import org.example.Solution;
import org.junit.Assert;
import org.junit.Test;

public class SolutionTest {
    @Test
    public void numTreeTest1() {
        int n = 3;
        int output = 5;
        Assert.assertEquals(output, new Solution().numTrees(n));
    }

    @Test
    public void numTreeTest2() {
        int n = 1;
        int output = 1;
        Assert.assertEquals(output, new Solution().numTrees(n));
    }
}
