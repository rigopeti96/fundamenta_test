package util;

import entity.BusinessAssociate;
import entity.LineData;
import entity.Product;
import exception.ValidationException;
import validator.Validator;

import java.util.ArrayList;
import java.util.List;

public class InputProcessor {
    private final List<String> rawData = new ArrayList<>();
    private Validator validator = new Validator();
    private List<LineData> readInputData = new ArrayList<>();

    public InputProcessor(List<String> rawData){
        this.rawData.addAll(rawData);
    }

    public List<LineData> processLines(){
        for (String rawDataItem : rawData) {
            String[] parts = rawDataItem.split("\\|");
            try {
                if (validateParts(parts)) {
                    readInputData.add(new LineData(new Product(parts[0]), parts[1], Integer.parseInt(parts[2])));
                }
            } catch (ValidationException e) {
                e.printStackTrace();
            }
        }

        return readInputData;
    }

    private boolean validateParts(String[] parts) throws ValidationException{
        Product product = new Product(parts[0]);
        Integer productPrize = Integer.parseInt(parts[2]);

        return validator.validateBusinessAssociate(parts[1]) && validator.validateProductPrize(productPrize);
    }
}
