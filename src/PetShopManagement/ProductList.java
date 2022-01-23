package PetShopManagement;

import java.io.*;
import java.util.ArrayList;

public class ProductList
{

    ArrayList<Product> list;

    public ProductList()
    {
        this.list = new ArrayList<Product>();
    }

    public void SaveToFile()
    {
        try
        {
            File f = new File("ProductList.dat");
            FileOutputStream fos = new FileOutputStream(f);
            ObjectOutputStream ous = new ObjectOutputStream(fos);

            ous.writeObject(new Product(1, "Thuc an cho meo", 50000, 0));
            ous.writeObject(new Product(2, "Cat ve sinh", 150000, 0));
            ous.writeObject(new Product(3, "Ao cho cho", 40000, 0));
            ous.writeObject(new Product(4, "Thuc an cho cho", 50000, 0));
            ous.writeObject(new Product(5, "Chau cat ve sinh cho meo", 170000, 0));
            ous.writeObject(new Product(6, "Vong co cho meo", 55000, 0));
            ous.writeObject(new Product(7, "Chen an cho meo 2 cai", 50000, 0));
            ous.writeObject(new Product(8, "Sua tam cho meo", 98000, 0));
            ous.writeObject(new Product(9, "Cay meo leo", 900000, 0));
            ous.writeObject(new Product(10, "Luoc chai long meo", 70000, 0));

            fos.close();
            ous.close();
            System.out.println("Done");
        }
        catch (Exception e)
        {
            System.out.println("Failed: " + e.getMessage());
        }
    }
    int AGE;

    public void readFile()
    {
        try
        {
            FileInputStream fis = new FileInputStream("ProductList.dat");
            ObjectInputStream ois = new ObjectInputStream(fis);
            Product p = (Product) ois.readObject();
            while (p != null)
            {
                this.list.add(p);
                try
                {
                    p = (Product) ois.readObject();
                }
                catch (Exception e)
                {
                    p = null;
                }
            }
            fis.close();
            ois.close();
        }
        catch (Exception e){}
    }

    public void Format()
    {
        System.out.println("\n");
        System.out.format("%-20s%-20s%30s%20s%20s","Product's ID","Product's name","Product's price per unit","Product's Quantity","Product's Price\n");
        System.out.println("--------------------------------------------------------------------------------------------------------------");
    }

    public Product getItemById(int id)
    {
        int pos = getPosById(id);
        if (pos < 0) return null;
        return list.get(pos);
    }

    public int getPosById(int id)
    {
        for (int i = 0; i < this.list.size(); i++)
        {
            if (this.list.get(i).getProductID() == id)
                return i;
        }
        return -1;
    }
}