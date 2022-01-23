package PetShopManagement;

import java.util.Scanner;

public class Guest extends Person
{
    int GuestID;
    Scanner sc = new Scanner(System.in);

    //  INPUT
    @Override
    public void Input()
    {
        System.out.println("Input Guest ID: ");
        GuestID=Integer.parseInt(sc.nextLine());
        System.out.println("Input customer name: ");
        Name=sc.nextLine();

        System.out.println("Input Phone number: ");
        PhoneNo=sc.nextLine();

        System.out.println("Input Year of Birth: ");
        YearofBirth=sc.nextInt();
    }

    //    OUTPUT
    public void Output()
    {
        System.out.println("Customer's name: "+ this.Name +"\nYear of birth: "+ this.YearofBirth+"\nPhone number: "+this.PhoneNo+"\nGuest ID: "+this.GuestID);
    }
}
