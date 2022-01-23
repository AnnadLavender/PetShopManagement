package PetShopManagement;


import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.Scanner;

public class Cart
{
    //lam console a`
    Scanner sc = new Scanner(System.in);
    ArrayList<Product> list;
    int Total = 0;
    Guest guest;
    int Quantity;

    //CONSTRUCTOR
    public Cart()
    {
        this.list = new ArrayList<>();
    }

    //    INPUT
    public Product CartInput()
    {
        ProductList pList = new ProductList();
        pList.readFile();
        int ID;

        System.out.println("How many product's types do you want to buy?");
        int n = Integer.parseInt(sc.nextLine());

        int Quantity = 0;
        for (int i = 0; i < n; i++)
        {
            System.out.println("Input product's ID: ");
            ID = Integer.parseInt(sc.nextLine());
            Product item = pList.getItemById(ID);

            if (item != null)
            {
                System.out.println("Input product's quantity: ");
                Quantity = Integer.parseInt(sc.nextLine());

                item.setQuantity(Quantity);
                item.computePrice();
                pList.Format();
                System.out.println(item);
                Total += item.getPrice();

                this.list.add(item);
            }
            else
            {
                System.out.println("Product doesn't exist");
            }
        }
        return null;
    }

    //    OUTPUT
    public void Output()
    {
        ProductList pList = new ProductList();
        pList.Format();

        for (Product pd : list)
        {
            System.out.println(pd);
        }
        System.out.println("TOTAL: " + Total);
    }

    //    ADD PRODUCT
    public void AddProduct()
    {
        ProductList pList = new ProductList();
        pList.readFile();
        int Quantity = 0;
        int ID;

        System.out.println("How many product's types do you want to add?");
        int n = Integer.parseInt(sc.nextLine());

        for (int i = 0; i < n; i++)
        {
            System.out.println("Input product's ID: ");
            ID = Integer.parseInt(sc.nextLine());
            Product item = pList.getItemById(ID);
            if (item != null)
            {
                System.out.println("Input product's quantity: ");
                Quantity = Integer.parseInt(sc.nextLine());

                item.setQuantity(Quantity);
                item.computePrice();
                pList.Format();
                System.out.println(item);
                Total += item.getPrice();

                this.list.add(item);
            }
            else
            {
                System.out.println("Product doesn't exist");
            }
        }
    }

    //    DELETE PRODUCT
    public void DeleteProduct(ProductList pList)
    {
        pList.readFile();

        System.out.println("Input product you want to delete: ");
        int ID = Integer.parseInt(sc.nextLine());

//        FIND product to REMOVE
        for (int i = 0; i < list.size(); i++)
        {
            if(ID==this.list.get(i).ProductID)
            {
                Total -= this.list.get(i).getPrice();
                list.remove(i);
            }
        }
    }

    //    EDIT PRODUCT
    public void EditProduct(ProductList pList)
    {
        pList.readFile();

        System.out.println("Input product you want to change: ");
        int ID = Integer.parseInt(sc.nextLine());

//        FIND product to EDIT
        for (int i = 0; i < list.size(); i++)
        {
            if(ID==this.list.get(i).ProductID)
            {
                Total -= this.list.get(i).getPrice();
                list.remove(i);
            }
        }

        System.out.println("Input product's ID: ");
        ID = Integer.parseInt(sc.nextLine());
        Product item = pList.getItemById(ID);

        if (item != null)
        {
            System.out.println("Input product's quantity: ");
            Quantity = Integer.parseInt(sc.nextLine());

            item.setQuantity(Quantity);
            item.computePrice();
            pList.Format();
            System.out.println(item);
            Total += item.getPrice();

            this.list.add(item);
        }
        else
        {
            System.out.println("Product doesn't exist");
        }
    }

    //    SORT PRODUCT
    public void SortProduct()
    {
        Collections.sort(this.list, new Comparator<Product>()
        {
            @Override
            public int compare(Product o1, Product o2)
            {
                return o1.getProductID() - o2.getProductID();
            }
        });
    }
}