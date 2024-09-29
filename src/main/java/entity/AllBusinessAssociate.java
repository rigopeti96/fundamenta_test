package entity;

import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlRootElement;

import java.util.ArrayList;
import java.util.List;

@XmlRootElement(name = "businessAssociates")
@XmlAccessorType(XmlAccessType.FIELD)
public class AllBusinessAssociate {

    @XmlElement(name = "businessAssociate")
    private List<BusinessAssociate> businessAssociates = new ArrayList<>();

    public List<BusinessAssociate> getBusinessAssociates() {
        return businessAssociates;
    }

    public void setBusinessAssociates(List<BusinessAssociate> businessAssociates) {
        this.businessAssociates = businessAssociates;
    }
}
