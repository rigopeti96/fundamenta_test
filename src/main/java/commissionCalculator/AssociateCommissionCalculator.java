package commissionCalculator;

import entity.BusinessAssociate;
import entity.LineData;

import java.util.ArrayList;
import java.util.List;

public class AssociateCommissionCalculator {
    private final List<BusinessAssociate> associates = new ArrayList<>();
    private List<LineData> readInputDatas = new ArrayList<>();
    private CommissionCalculator commissionCalculator = new CommissionCalculator();

    public AssociateCommissionCalculator(List<LineData> readInputDatas) {
        this.readInputDatas.addAll(readInputDatas);

        associates.add(new BusinessAssociate("Ü1"));
        associates.add(new BusinessAssociate("Ü2"));
        associates.add(new BusinessAssociate("Ü3"));
    }

    public List<BusinessAssociate> calculateAssociatesCommissions() {
        for(LineData actData: readInputDatas) {
            int associateIndex = findAssociateIndex(actData.getBusinessAssociateName());
            if(associateIndex != -1){
                associates.get(associateIndex).increaseCommission(commissionCalculator.calculateTotalCommission(actData.getProduct(), actData.getPrize()));
            }
        }

        return associates;
    }

    private int findAssociateIndex(String associateName) {
        for(int i = 0; i < associates.size(); i++){
            if(associates.get(i).getName().equals(associateName))
                return i;
        }

        return -1;
    }
}
