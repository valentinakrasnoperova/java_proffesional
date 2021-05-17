package homework11.task3;

import org.xml.sax.Attributes;
import org.xml.sax.helpers.DefaultHandler;

import javax.xml.parsers.SAXParser;
import javax.xml.parsers.SAXParserFactory;

public class AnimalParser {
    public static void main(String[] args) {
        try {
            SAXParserFactory parserFactory = SAXParserFactory.newInstance();
            SAXParser saxParser = parserFactory.newSAXParser();

            DefaultHandler handler = new DefaultHandler() {
                boolean name = false;
                boolean breed = false;

                @Override
                public void startElement(String uri, String localName, String qName, Attributes attributes)  {
                    if (qName.equalsIgnoreCase("name")) {
                        name = true;

                    }
                    if (qName.equalsIgnoreCase("breed")) {
                        breed = true;
                    }
                }

                @Override
                public void characters(char[] ch, int start, int length)  {
                    if (name) {
                        System.out.println("Name is: " + new String(ch, start, length));
                        name = false;
                    }
                    if (breed) {
                        System.out.println("Breed is: " + new String(ch, start, length));
                        breed = false;
                    }
                }
            };
            saxParser.parse("/home/user/IdeaProjects/java_professional/src/main/java/homework11/task3/animal.xml", handler);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

}
