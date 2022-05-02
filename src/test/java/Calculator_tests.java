import org.testng.Assert;
import org.testng.annotations.Test;

public class Calculator_tests {
    @Test(priority = 1)
    //@DisplayName("2 + 1 = 3")
    void addTwoNumbers() {
        Calculator calculator = new Calculator();
        Assert.assertEquals(3, calculator.add(2,1), "2 + 1 should equal 3");
    }

    @Test(priority = 2)
    //@DisplayName("2 - 1 = 1")
    void subractsTwoNumbers() {
        Calculator calculator = new Calculator();
        Assert.assertEquals(1, calculator.subtract(2, 1), "2 - 1 should equal 1");
    }

    @Test(priority = 3)
    //@DisplayName("2 * 3 = 6")
    void multiplyTwoNumbers() {
        Calculator calculator = new Calculator();
        Assert.assertEquals(6, calculator.muliply(2,3), "2 * 3 should equal 6");
    }

    @Test(priority = 4)
    //@DisplayName("6 / 2 = 3")
    void divideTwoNumbers() {
        Calculator calculator = new Calculator();
        Assert.assertEquals(3, calculator.divide(6,2), "6 / 2 should equal 3");
    }
}
