package util;

import entity.BusinessAssociate;
import entity.Product;
import exception.IncrementIsInvalidException;
import exception.ProductTypeIsEmptyException;
import exception.ProductTypeIsInvalidException;
import validator.Validator;

import java.util.ArrayList;
import java.util.List;

public class InputProcessor {
    private final List<String> rawData = new ArrayList<>();
    private Validator validator = new Validator();
    private final List<BusinessAssociate> associates = new ArrayList<>();

    public InputProcessor(List<String> rawData){
        this.rawData.addAll(rawData);

        associates.add(new BusinessAssociate("Ü1"));
        associates.add(new BusinessAssociate("Ü2"));
        associates.add(new BusinessAssociate("Ü3"));
    }

    private void processLines(){
        for(int i = 0; i < rawData.size(); i++){
            String[] parts = rawData.get(i).split("\\|");
            try{
                validateParts(parts);
            } catch (RuntimeException e){
                //TODO: change catchable exception type and create log
                e.printStackTrace();
            }


        }
    }


    private boolean validateParts(String[] parts){
        Product product = new Product(parts[0]);
        Integer increment = Integer.parseInt(parts[2]);

        return validator.validateProduct(product) && validator.validateBusinessAssociate(parts[1]) && validator.validateIncrement(increment);
    }
}
