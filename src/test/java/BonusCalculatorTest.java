import commissionCalculator.BonusCalculator;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Nested;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertTrue;

public class BonusCalculatorTest {
    BonusCalculator bc = new BonusCalculator();

    @Nested
    @DisplayName("Product type A bonus tests")
    class ProductTypeABonusTests {
        @Test
        @DisplayName("Less than 10 millions")
        void lessThan10Millions() {
            Integer productPrize = 5000000;
            assertEquals(0, bc.calculateTotalBonus(productPrize, 0, 0));
        }

        @Test
        @DisplayName("Between 10 and 20 millions")
        void between10And20Millions() {
            Integer productPrize = 15000000;
            assertEquals(25000, bc.calculateTotalBonus(productPrize, 0, 0));
        }

        @Test
        @DisplayName("Over 20 millions")
        void over20Millions() {
            Integer productPrize = 25000000;
            assertEquals(40000, bc.calculateTotalBonus(productPrize, 0, 0));
        }
    }

    @Nested
    @DisplayName("Product type B bonus tests")
    class ProductTypeBBonusTests {
        @Test
        @DisplayName("Less than 8 millions")
        void lessThan8Millions() {
            Integer productPrize = 4500000;
            assertEquals(0, bc.calculateTotalBonus(0, productPrize, 0));
        }

        @Test
        @DisplayName("Between 8 and 16 millions")
        void between8And16Millions() {
            Integer productPrize = 14500000;
            assertEquals(30000, bc.calculateTotalBonus(0, productPrize, 0));
        }

        @Test
        @DisplayName("Over 20 millions")
        void over20Millions() {
            Integer productPrize = 17000000;
            assertEquals(50000, bc.calculateTotalBonus(0, productPrize, 0));
        }
    }

    @Nested
    @DisplayName("Product type C bonus tests")
    class ProductTypeCBonusTests {
        @Test
        @DisplayName("Less than 5 millions")
        void lessThan8Millions() {
            Integer productPrize = 3500000;
            assertEquals(0, bc.calculateTotalBonus(0, 0, productPrize));
        }

        @Test
        @DisplayName("Between 5 and 10 millions")
        void between8And16Millions() {
            Integer productPrize = 7500000;
            assertEquals(20000, bc.calculateTotalBonus(0, 0, productPrize));
        }

        @Test
        @DisplayName("Over 10 millions")
        void over20Millions() {
            Integer productPrize = 13000000;
            assertEquals(40000, bc.calculateTotalBonus(0, 0, productPrize));
        }
    }

    @Nested
    @DisplayName("Multiple bonus tests")
    class MultipleBonusTests {
        @Test
        @DisplayName("Product A is less than 5 millions and Product C is over 10 millions")
        void productAIsLessThan5MillionsAndProductCIsOver10Millions() {
            Integer productPrizeA = 3500000;
            Integer productPrizeC = 13000000;
            assertEquals(40000, bc.calculateTotalBonus(productPrizeA, 0, productPrizeC));
        }

        @Test
        @DisplayName("Product B is Between 8 and 16 millions and Product C is over 10 millions")
        void productBIsBetween10MillionsAndProductCIsOver10Millions() {
            Integer productPrizeB = 9500000;
            Integer productPrizeC = 13000000;
            assertEquals(70000, bc.calculateTotalBonus(0, productPrizeB, productPrizeC));
        }

        @Test
        @DisplayName("All products are 10 millions")
        void over20Millions() {
            Integer productPrizeA = 13000000;
            Integer productPrizeB = 13000000;
            Integer productPrizeC = 13000000;
            assertEquals(95000, bc.calculateTotalBonus(productPrizeA, productPrizeB, productPrizeC));
        }
    }
}
