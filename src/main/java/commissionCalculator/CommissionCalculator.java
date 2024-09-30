package commissionCalculator;

import entity.Product;

public class CommissionCalculator {

    public int calculateBaseCommission(Integer productPrize){
        return (int) (productPrize * 0.01);
    }
}
