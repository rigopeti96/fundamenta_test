package entity;

import jakarta.xml.bind.annotation.XmlAttribute;
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlRootElement;
import jakarta.xml.bind.annotation.XmlType;

@XmlRootElement(name = "businessAssociate")
@XmlType(propOrder = { "name", "commission"})
public class BusinessAssociate {
    @XmlElement
    private final String name;
    @XmlElement
    private int commission = 0;

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
}
