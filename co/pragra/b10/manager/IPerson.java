package co.pragra.b10.manager;

/**
 * This is method return name of the person
 */
public interface IPerson {
    String getName();
    void setName(String name);
    void changeAddress(String address);
    void printDetails (String details);

}
