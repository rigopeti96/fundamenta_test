package xml_generator;

import entity.AllBusinessAssociate;
import entity.BusinessAssociate;
import jakarta.xml.bind.JAXBContext;
import jakarta.xml.bind.JAXBException;
import jakarta.xml.bind.Marshaller;

import java.io.File;
import java.util.List;

public class XmlGenerator {
    public void generateOutputXml(AllBusinessAssociate associates) throws JAXBException {
        JAXBContext jaxbContext = JAXBContext.newInstance(BusinessAssociate.class);
        Marshaller jaxbMarshaller = jaxbContext.createMarshaller();
        jaxbMarshaller.setProperty(Marshaller.JAXB_FORMATTED_OUTPUT, Boolean.TRUE);
        jaxbMarshaller.marshal(associates, new File("output.xml"));
    }
}
