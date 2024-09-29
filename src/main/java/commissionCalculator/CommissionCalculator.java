package commissionCalculator;

import entity.Product;

public class CommissionCalculator {


    public int calculateTotalCommission(Product product, Integer productPrize) {
        return calculateBaseCommission(productPrize) + calculateBonusCommission(product, productPrize);
    }

    private int calculateBaseCommission(Integer productPrize){
        return (int) (productPrize * 0.01);
    }

    private int calculateBonusCommission(Product product, Integer productPrize){
        switch (product.getProductName()){
            case "A":
                return calculateBonusCommissionA(productPrize);
            case "B":
                return calculateBonusCommissionB(productPrize);
            case "C":
                return calculateBonusCommissionC(productPrize);
            default:
                return 0;
        }
    }

    private int calculateBonusCommissionA(Integer productPrize){
        if(productPrize <= 999999999)
            return 0;
        if(productPrize <= 1999999999)
            return 25000;
        else
            return 40000;
    }

    private int calculateBonusCommissionB(Integer productPrize){
        if(productPrize <= 799999999)
            return 0;
        if(productPrize <= 1599999999)
            return 30000;
        else
            return 50000;
    }

    private static int calculateBonusCommissionC(Integer productPrize){
        if(productPrize <= 499999999)
            return 0;
        if(productPrize <= 999999999)
            return 20000;
        else
            return 40000;
    }
}
