import com.massita.l011.StepikTasks;
import org.testng.Assert;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class StepikTasksTest {


    @DataProvider(name = "DecompositionData")

    public static Object[][] testData() {

        return new Object[][] {
                { 1, "1" },
                { 2, "1 1\n2"},
                { 3, "1 1 1\n2 1\n3"},
                { 4, "1 1 1 1\n2 1 1\n2 2\n3 1\n4"},
        };
    }

    @Test(dataProvider = "DecompositionData")

    public void test(Integer inputData, String outputData) {
        Assert.assertEquals(StepikTasks.decomposeInt(inputData), outputData);
    }


}
