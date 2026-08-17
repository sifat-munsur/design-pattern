package Creational.Prototype;

public class Metadata implements Cloneable{

    private String createdBy;
    private String version;

    public Metadata(String createdBy, String version){
        this.createdBy = createdBy;
        this.version = version;
    }

    @Override
    public Metadata clone(){
        try {
            return (Metadata) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new RuntimeException("e");
        }
    }

    @Override
    public String toString(){
        return createdBy+ ", " + version;
    }
    
}
