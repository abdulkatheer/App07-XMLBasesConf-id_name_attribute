package test;

import beans.Bike;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Client {
    public static void main(String[] args) {
        ApplicationContext context = new ClassPathXmlApplicationContext("resources/applicationContext.xml");

        //getting using id attribute
        System.out.println("Gettting using 'id' attribute");
        System.out.println("-----------------------------");
        Bike apache180 = (Bike) context.getBean("apache180");
        apache180.getBikeDetails();

        //getting using name attribute
        System.out.println("Gettting using 'name' attribute");
        System.out.println("---------------------------------");
        Bike pulsar180 = (Bike) context.getBean("pulsar180");
        Bike pulsar180a = (Bike) context.getBean("pulsar");
        pulsar180.getBikeDetails();
        pulsar180a.getBikeDetails();

        //getting using both id and name
        System.out.println("Gettting using both 'id' and 'name' attribute");
        System.out.println("----------------------------------------------");
        Bike duke350 = (Bike) context.getBean("duke350");
        Bike duke350a = (Bike) context.getBean("duke");
        Bike duke350b = (Bike) context.getBean("lean350");
        duke350.getBikeDetails();
        duke350a.getBikeDetails();
        duke350b.getBikeDetails();
    }
}
