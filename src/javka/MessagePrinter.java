package javka;

public class MessagePrinter {

    MessageProducer producer=new MessageProducerImpl();
    public void printMessage(){
        String message = producer.getMessage();
        System.out.println(message);
    }
}
