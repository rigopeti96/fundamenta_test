package entity;

import jakarta.xml.bind.annotation.XmlAttribute;
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlRootElement;
import jakarta.xml.bind.annotation.XmlType;

public class BusinessAssociate {
    @XmlElement
    private final String name;
    @XmlElement
    private int commission = 0;

    private int commissionProductA = 0;
    private int commissionProductB = 0;
    private int commissionProductC = 0;

    public BusinessAssociate(){name = null;}
    public BusinessAssociate(String name){
        this.name = name;
    }
    public BusinessAssociate(String name, Integer commission){
        this.name = name;
        this.commission = commission;
    }

    public String getName(){
        return name;
    }

    public int getCommission(){
        return commission;
    }

    public void increaseCommission(int increment){
        commission+= increment;
    }

    public int getCommissionProductA() {
        return commissionProductA;
    }

    public int getCommissionProductB() {
        return commissionProductB;
    }

    public int getCommissionProductC() {
        return commissionProductC;
    }

    public void increaseCommissionProductA(int increment){
        commissionProductA+= increment;
    }

    public void increaseCommissionProductB(int increment){
        commissionProductB+= increment;
    }

    public void increaseCommissionProductC(int increment){
        commissionProductC+= increment;
    }
}
