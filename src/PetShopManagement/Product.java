package PetShopManagement;

import java.io.Serializable;

public class Product implements Serializable
{
    public int ProductID;
    public String ProductName;
    private int UnitPrice;
    private int Quantity;
    int Price;

    //    CONSTRUCTOR
    public Product(int productID, String productName, int unitPrice, int quantity)
    {
        ProductID = productID;
        ProductName = productName;
        UnitPrice = unitPrice;
        Quantity = quantity;
    }

    public Product() {}

    //    GETTER SETTER
    public int getProductID()
    {
        return ProductID;
    }

    public int getUnitPrice()
    {
        return UnitPrice;
    }

    public int getQuantity()
    {
        return Quantity;
    }

    public int getPrice()
    {
        return Price;
    }

    public int setQuantity(int quantity)
    {
        Quantity = quantity;
        return quantity;
    }

    // COMPUTE PRICE
    public int computePrice()
    {
        return this.setPrice(this.getQuantity() * this.getUnitPrice());
    }


    public int setPrice(int price)
    {
        Price = price;
        return price;
    }

    public String toString()
    {
        return String.format("%-20d%-25s%17d%20d%20d",ProductID,ProductName,UnitPrice,Quantity,Price);
    }
}