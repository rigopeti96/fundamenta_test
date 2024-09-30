package commissionCalculator;

public class BonusCalculator {
    public Integer calculateTotalBonus(Integer productPrizeA, Integer productPrizeB,  Integer productPrizeC){
        return calculateBonusCommissionA(productPrizeA) + calculateBonusCommissionB(productPrizeB) + calculateBonusCommissionC(productPrizeC);
    }

    private int calculateBonusCommissionA(Integer productPrize){
        if(productPrize <= 9999999)
            return 0;
        if(productPrize <= 19999999)
            return 25000;
        else
            return 40000;
    }

    private int calculateBonusCommissionB(Integer productPrize){
        if(productPrize <= 7999999)
            return 0;
        if(productPrize <= 15999999)
            return 30000;
        else
            return 50000;
    }

    private static int calculateBonusCommissionC(Integer productPrize){
        if(productPrize <= 4999999)
            return 0;
        if(productPrize <= 9999999)
            return 20000;
        else
            return 40000;
    }
}
