package homework11.task2;

import javax.xml.stream.XMLOutputFactory;
import javax.xml.stream.XMLStreamException;
import javax.xml.stream.XMLStreamWriter;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;

public class Main {
    public static void main(String[] args) {
        XMLOutputFactory factory = XMLOutputFactory.newFactory();
        try {
            XMLStreamWriter writer = factory.createXMLStreamWriter(new FileOutputStream("/home/user/IdeaProjects/java_professional/src/main/java/homework11/task2/city.xml"));

            writer.writeStartDocument("UTF-8", "1.0");
            writer.writeStartElement("city");
            writer.writeAttribute("size", "small");
            writer.writeCharacters("Lviv");
            writer.writeEndElement();

            writer.writeStartElement("street");
            writer.writeCharacters("Naukova");
            writer.writeEndElement();

            writer.writeStartElement("house");
            writer.writeCharacters("33");
            writer.writeEndElement();

            writer.writeEndDocument();

        } catch (XMLStreamException | FileNotFoundException e) {
            e.printStackTrace();
        }


    }
}
