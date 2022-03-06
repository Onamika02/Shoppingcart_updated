package com.modelPackage;

//This class define the Product Model and it has hardcoded dataset

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;



public class ProductListModel {
    public int productID;
    public String productName;
    public double productPrice;
    public String imageSrc;
    public ProductListModel(){}

    public static List<ProductListModel> productLists = Arrays.asList(
            new ProductListModel(1,"Nike shoes Limited edition",40000,"./images/nike.jpg"),
            new ProductListModel(2,"Dell Laptop",50000,"./images/product2.jpg"),
            new ProductListModel(3,"Hp probook",71000,"./images/product1.jpg"),
            new ProductListModel(4,"Blue Earrings",1000,"./images/earrings.jpg"),
            new ProductListModel(5,"Redmi note 10 Phone",25000,"./images/phone.jpg"),
            new ProductListModel(6,"Bracelet",500,"./images/Bracelet.jpg"),
            new ProductListModel(7,"Prada Black Bag",30000,"./images/Prada.jpg"),
            new ProductListModel(8,"Doel Laptop",55000,"./images/product1.jpg")
    );
    public ProductListModel(int productID, String productName, double productPrice, String imageSrc) {
        this.productID = productID;
        this.productName = productName;
        this.productPrice = productPrice;
        this.imageSrc = imageSrc;
    }

}
