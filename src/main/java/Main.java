import entity.BusinessAssociate;
import jakarta.xml.bind.JAXBContext;
import jakarta.xml.bind.JAXBException;
import jakarta.xml.bind.Marshaller;
import util.InputReader;

import java.io.File;
import java.io.StringWriter;


public class Main {
    public static void main(String[] args) throws JAXBException {
        //InputReader reader = new InputReader();
        //reader.readInputTxt();

        BusinessAssociate businessAccociateParse = new BusinessAssociate("aladár", 3452);

        JAXBContext jaxbContext = JAXBContext.newInstance(BusinessAssociate.class);
        Marshaller jaxbMarshaller = jaxbContext.createMarshaller();
        jaxbMarshaller.setProperty(Marshaller.JAXB_FORMATTED_OUTPUT, Boolean.TRUE);
        jaxbMarshaller.marshal(businessAccociateParse, new File("output.xml"));
    }
}


