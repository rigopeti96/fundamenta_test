import entity.Product;
import exception.*;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Nested;
import org.junit.jupiter.api.Test;
import validator.Validator;

import static org.junit.jupiter.api.Assertions.assertThrows;
import static org.junit.jupiter.api.Assertions.assertTrue;

public class ValidatorTest {
    private final Validator validator = new Validator();

    @Nested
    @DisplayName("Product validation tests")
    class ProductValidationTest{
        @Test
        @DisplayName("Success")
        public void success(){
            Product productA = new Product("A");
            Product productB = new Product("B");
            Product productC = new Product("C");

            assertTrue(validator.validateProduct(productA));
            assertTrue(validator.validateProduct(productB));
            assertTrue(validator.validateProduct(productC));
        }

        @Test
        @DisplayName("Throws empty exception")
        public void throwsEmptyException(){
            Product product = new Product("");

            assertThrows(ProductTypeIsEmptyException.class, () -> validator.validateProduct(product));
        }

        @Test
        @DisplayName("Throws invalid exception")
        public void throwsInvalidException(){
            Product product = new Product("D");

            assertThrows(ProductTypeIsInvalidException.class, () -> validator.validateProduct(product));
        }
    }

    @Nested
    @DisplayName("Business associate name validation tests")
    class BusinessValidationTest{
        @Test
        @DisplayName("Success")
        public void success(){
            assertTrue(validator.validateBusinessAssociate("Ü1"));
            assertTrue(validator.validateBusinessAssociate("Ü2"));
            assertTrue(validator.validateBusinessAssociate("Ü3"));
        }

        @Test
        @DisplayName("Throws empty exception")
        public void throwsEmptyException(){
            assertThrows(BusinessAssociateIsEmptyException.class, () -> validator.validateBusinessAssociate(""));
        }

        @Test
        @DisplayName("Throws invalid exception")
        public void throwsInvalidException(){
            assertThrows(BusinessAssociateIsInvalidException.class, () -> validator.validateBusinessAssociate("Ü4"));
        }
    }

    @Nested
    @DisplayName("Product prize validation tests")
    class ProductPrizeValidationTest{
        @Test
        @DisplayName("Success")
        public void success(){
            assertTrue(validator.validateProductPrize(0));
            assertTrue(validator.validateProductPrize(10000));
        }

        @Test
        @DisplayName("Throws empty exception")
        public void throwsEmptyException(){
            Integer productPrizeNull = null;

            assertThrows(ProductPrizeIsEmptyException.class, () -> validator.validateProductPrize(productPrizeNull));
        }

        @Test
        @DisplayName("Throws invalid exception")
        public void throwsInvalidException(){
            Integer productLessThanZero = -1;

            assertThrows(ProductPrizeIsInvalidException.class, () -> validator.validateProductPrize(productLessThanZero));
        }
    }
}
