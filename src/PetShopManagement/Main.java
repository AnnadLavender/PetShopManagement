package PetShopManagement;

import java.util.Scanner;

public class Main
{
    public static void main(String []args)
    {
        Scanner sc = new Scanner(System.in);
        Menu menu = new Menu();
        Guest guest = new Guest();
        Cart cart = new Cart();
        ProductList list = new ProductList();

        int choose;
        //Save data to file
       list.SaveToFile();

        //Open File
//        list.readFile();

//        do
//        {
//            menu.Menu();
//            System.out.println("Choose the option: ");
//            choose = sc.nextInt();
//
//            switch (choose)
//            {
//                case 1:
//                    System.out.println("----------Create bill----------");
//                    //        Input Guest's data
//                    guest.Input();
//                    guest.Output();
//
//                    //        Input cart
//                    cart.CartInput();
//                    cart.Output();
//                    break;
//                case 2:
//                    System.out.println("----------Add product----------");
//                    //        Add Product
//                    cart.AddProduct();
//                    cart.Output();
//                    break;
//                case 3:
//                    System.out.println("----------Delete product----------");
//                    //        Delete Product
//                    cart.DeleteProduct(list);
//                    cart.Output();
//                    break;
//                case 4:
//                    System.out.println("----------Edit product----------");
//                    //        Edit product
//                    cart.EditProduct(list);
//                    cart.Output();
//                    break;
//                case 5:
//                    System.out.println("----------Sort product----------");
//                    //        Sort product
//                    cart.SortProduct();
//                    cart.Output();
//                    break;
//                case 6:
//                    System.out.println("----------Output full bill----------");
//                    //        Output full bill
//                    guest.Output();
//                    cart.Output();
//                    break;
//
//                case 7:
//                    System.out.println("Exit");
//                    break;
//
//                default:
//                    System.out.println("No choice");
//                    break;
//            }
//        }
//        while (choose !=7);
    }
}