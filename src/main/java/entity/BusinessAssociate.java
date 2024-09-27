package entity;

public class BusinessAssociate {
    private final String name;
    private int commission = 0;

    public BusinessAssociate(String name){
        this.name = name;
    }

    public String getName(){
        return name;
    }

    public int getCommission(){
        return commission;
    }

    public void increaseComission(int increment){
        commission+= increment;
    }
}
