package Creational.Prototype;

public class Address implements Cloneable{
    
    private String city;
    private String country;

    public Address(String city, String country){
        this.city = city;
        this.country = country;
    }

    @Override
    public Address clone(){
        try{
            return (Address) super.clone();
        }
        catch(CloneNotSupportedException e){
            throw new RuntimeException("e");
        }
    }

    @Override
    public String toString(){
        return city+ ", " + country;
    }


}
