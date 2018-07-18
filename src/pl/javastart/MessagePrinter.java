package pl.javastart;

public class MessagePrinter {

    MessageProducer producer=new MessageProducer();

    public void printMessage() {
     String message=producer.getMessge();
        System.out.println(message);
    }
}
