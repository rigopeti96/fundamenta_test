package validator;

import entity.Product;
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
     * @return
     */
    public boolean validateBusinessAssociate(){


        return true;
    }

    /**
     *
     * @return
     */
    public boolean validateIncrement(){

        return true;
    }
}
