import commissionCalculator.AssociateCommissionCalculator;
import commissionCalculator.CommissionCalculator;
import entity.AllBusinessAssociate;
import entity.BusinessAssociate;
import entity.LineData;
import jakarta.xml.bind.JAXBContext;
import jakarta.xml.bind.JAXBException;
import jakarta.xml.bind.Marshaller;
import util.InputProcessor;
import util.InputReader;
import xml_generator.XmlGenerator;

import java.io.File;
import java.io.StringWriter;
import java.util.List;


public class Main {
    public static void main(String[] args) {
        InputReader inputReader = new InputReader();
        List<String> readLines = inputReader.readInputTxt();

        InputProcessor inputProcessor = new InputProcessor(readLines);
        List<LineData> processedLines = inputProcessor.processLines();

        AssociateCommissionCalculator commissionCalculator = new AssociateCommissionCalculator(processedLines);
        List<BusinessAssociate> associates  = commissionCalculator.calculateAssociatesCommissions();

        AllBusinessAssociate allBusinessAssociate = new AllBusinessAssociate();
        allBusinessAssociate.setBusinessAssociates(associates);
        XmlGenerator xmlGenerator = new XmlGenerator();
        try {
            xmlGenerator.generateOutputXml(allBusinessAssociate);
        } catch (JAXBException e) {
            e.printStackTrace();
        }
    }
}


