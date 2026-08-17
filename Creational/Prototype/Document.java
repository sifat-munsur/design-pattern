package Creational.Prototype;

import java.util.ArrayList;
import java.util.List;

public class Document implements Cloneable {
    
    private String title;
    private String customerName;
    private String companyName;
    private List<String> items;
    private Address billingAddress;
    private Metadata metadata;

    public Document(String title,
                    String customerName,
                    String companyName,
                    List<String> items,
                    Address billingAddress,
                    Metadata metadata){

            this.title = title;
            this.customerName = companyName;
            this.companyName = companyName;
            this.items = items;
            this.billingAddress = billingAddress;
            this.metadata = metadata;
    }

    @Override
    public Document clone(){
        try {
            Document copy = (Document) super.clone();
            copy.items = new ArrayList<>(items);
            copy.billingAddress = this.billingAddress.clone();
            copy.metadata = this.metadata.clone();
            return copy;
            
        } catch (CloneNotSupportedException e) {
            throw new RuntimeException(e);
        }  
    }

    public void setCustomerName(String customerName){
        this.customerName = customerName;
    }

    public void addItem(String item){
        items.add(item);
    }

    public void print() {

        System.out.println("Title: " + title);
        System.out.println("Customer: " + customerName);
        System.out.println("Company: " + companyName);
        System.out.println("Items: " + items);
        System.out.println("Address: " + billingAddress);
        System.out.println("Metadata: " + metadata);

        System.out.println();
    }


}
