import entity.Product;
import exception.ProductTypeIsEmptyException;
import exception.ProductTypeIsInvalidException;
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
    class BusinessValidationTest{

    }
}
