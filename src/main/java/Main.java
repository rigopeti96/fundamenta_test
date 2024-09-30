import commissionCalculator.AssociateCommissionCalculator;
import commissionCalculator.BonusCalculator;
import commissionCalculator.CommissionCalculator;
import entity.AllBusinessAssociate;
import entity.BusinessAssociate;
import entity.LineData;
import jakarta.xml.bind.JAXBContext;
import jakarta.xml.bind.JAXBException;
import jakarta.xml.bind.Marshaller;
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlElementWrapper;
import util.InputProcessor;
import util.InputReader;
import xml_generator.XmlGenerator;

import java.io.File;
import java.io.StringWriter;
import java.util.List;


public class Main {
    public static void main(String[] args) {
        BonusCalculator bonusCalculator = new BonusCalculator();
        InputReader inputReader = new InputReader();
        List<String> readLines = inputReader.readInputTxt();

        InputProcessor inputProcessor = new InputProcessor(readLines);
        List<LineData> processedLines = inputProcessor.processLines();

        AssociateCommissionCalculator commissionCalculator = new AssociateCommissionCalculator(processedLines);

        List<BusinessAssociate> associates  = commissionCalculator.calculateAssociatesCommissions();

        for (BusinessAssociate businessAssociate : associates) {
            int totalBonusCommission = bonusCalculator.calculateTotalBonus(businessAssociate.getCommissionProductA(), businessAssociate.getCommissionProductB(), businessAssociate.getCommissionProductC());
            businessAssociate.increaseCommission(totalBonusCommission);
        }

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


