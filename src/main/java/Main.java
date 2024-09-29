import entity.BusinessAssociate;
import entity.LineData;
import jakarta.xml.bind.JAXBContext;
import jakarta.xml.bind.JAXBException;
import jakarta.xml.bind.Marshaller;
import util.InputProcessor;
import util.InputReader;

import java.io.File;
import java.io.StringWriter;
import java.util.List;


public class Main {
    public static void main(String[] args) {
        InputReader inputReader = new InputReader();
        List<String> readLines = inputReader.readInputTxt();

        InputProcessor inputProcessor = new InputProcessor(readLines);
        List<LineData> processedLines = inputProcessor.processLines();

    }
}


