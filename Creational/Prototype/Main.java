package Creational.Prototype;

import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        
        DocumentRegistry registry = new DocumentRegistry();

        Document invoicePrototype = new Document(
            "INVOICE",
            "Default Customer",
            "ABC Corporation",
            new ArrayList<>(
                List.of(
                    "Java Course",
                    "Spring Boot Course"
                )
            ),
            new Address("Dhaka", "Bangladesh"),
            new Metadata("Admin", "1.0"));


        registry.register("invoice", invoicePrototype);


        // Create document 1
        Document invoice1 =
                registry.create("invoice");

        invoice1.setCustomerName("Sifat");
        invoice1.addItem("Design Pattern Course");


        // Create document 2
        Document invoice2 =
                registry.create("invoice");

        invoice2.setCustomerName("Rahim");
        invoice2.addItem("Spring Security Course");


        invoice1.print();
        invoice2.print();
            
    }
}
