package validator;

import entity.Product;
import exception.IncrementIsEmptyException;
import exception.IncrementIsInvalidException;
import exception.ProductTypeIsEmptyException;
import exception.ProductTypeIsInvalidException;

public class Validator {
    /**
     * Validate if the read product name is correct
     * @param product: Product created based on read line
     * @return true if product is valid
     */
    public boolean validateProduct(Product product){
        String[] acceptableProductNames = {"A", "B", "C"};

        if(product.getProductName().isEmpty() || product.getProductName().equals(""))
            throw new ProductTypeIsEmptyException("Product type must not be empty!", new RuntimeException());

        for (String item : acceptableProductNames) {
            if (!product.getProductName().contains(item))
                throw new ProductTypeIsInvalidException("Product type name is invalid!", new RuntimeException());
        }

        return true;
    }

    /**
     *
     * @param associateName
     * @return
     */
    public boolean validateBusinessAssociate(String associateName){


        return true;
    }

    /**
     *
     * @param increment
     * @return
     */
    public boolean validateIncrement(Integer increment){
        if(increment == null)
            throw new IncrementIsEmptyException("Increment must not be null!", new RuntimeException());

        if(increment < 0)
            throw new IncrementIsInvalidException("Increment must not be a negative number!", new RuntimeException());

        return true;
    }
}
