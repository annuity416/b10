package co.pragra.b10.manager;

public class Person implements IPerson {

    private String name;
    private String adddress;

    public Person (String name, String adddress){
        this.name = name;
        this.adddress = adddress;
    }

    @Override
    public String getName() {
        return this.name;
    }

    @Override
    public void setName(String name) {
        this.name = name;
    }

    @Override
    public void changeAddress(String address) {
        this.adddress = address;
    }

    @Override
    public void printDetails(String details) {
        this.details = details;

    }
}
