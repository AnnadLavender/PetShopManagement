package PetShopManagement;

public abstract class Person implements Interface
{
    String Name;
    int YearofBirth;
    String PhoneNo;

    public Person() {}

    @Override
    public abstract void Output();
    public abstract void Input();
}