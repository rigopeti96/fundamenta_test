package xml_generator;

import entity.AllBusinessAssociate;
import entity.BusinessAssociate;
import jakarta.xml.bind.JAXBContext;
import jakarta.xml.bind.JAXBException;
import jakarta.xml.bind.Marshaller;

import java.io.File;
import java.io.StringWriter;
import java.util.List;

public class XmlGenerator {
    StringWriter stringWriter = new StringWriter();

    public void generateOutputXml(AllBusinessAssociate listBusinessAssociates) throws JAXBException {
        JAXBContext jaxbContext = JAXBContext.newInstance(AllBusinessAssociate.class);
        Marshaller jaxbMarshaller = jaxbContext.createMarshaller();
        jaxbMarshaller.setProperty(Marshaller.JAXB_FORMATTED_OUTPUT, true);
        jaxbMarshaller.marshal(listBusinessAssociates, new File("associates.xml"));
    }
}
