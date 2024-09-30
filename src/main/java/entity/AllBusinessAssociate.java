package entity;

import jakarta.xml.bind.annotation.*;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

@XmlRootElement(name = "allBusinessAssociates")
@XmlAccessorType(XmlAccessType.FIELD)
public class AllBusinessAssociate {

    private List<BusinessAssociate> businessAssociates = new ArrayList<>();

    public List<BusinessAssociate> getBusinessAssociates() {
        return businessAssociates;
    }

    public void setBusinessAssociates(List<BusinessAssociate> businessAssociates) {
        this.businessAssociates = businessAssociates;
    }
}
