package validator;

import entity.Product;
import exception.*;

import java.util.Arrays;
import java.util.List;

public class Validator {
    /**
     * Validate if the read product name is correct
     * @param product: Product created based on read line
     * @return true if product is valid
     */
    public boolean validateProduct(Product product){
        List<String> list = Arrays.asList("A", "B", "C");

        if(product.getProductName().isEmpty() || product.getProductName() == null)
            throw new ProductTypeIsEmptyException("Product type must not be empty!", new RuntimeException());

        if(!list.contains(product.getProductName()))
            throw new ProductTypeIsInvalidException("Product type is not valid!", new RuntimeException());

        return true;
    }

    /**
     *
     * @param associateName
     * @return
     */
    public boolean validateBusinessAssociate(String associateName){
        List<String> list = Arrays.asList("Ü1", "Ü2", "Ü3");

        if(associateName.isEmpty())
            throw new BusinessAssociateIsEmptyException("Business Associate name must not be empty!", new RuntimeException());

        if(!list.contains(associateName))
            throw new BusinessAssociateIsInvalidException("Business Associate name is not valid!", new RuntimeException());

        return true;
    }

    /**
     *
     * @param productPrize
     * @return
     */
    public boolean validateProductPrize(Integer productPrize){
        if(productPrize == null)
            throw new ProductPrizeIsEmptyException("Product prize must not be null!", new RuntimeException());

        if(productPrize < 0)
            throw new ProductPrizeIsInvalidException("Product prize must not be a negative number!", new RuntimeException());

        return true;
    }
}
