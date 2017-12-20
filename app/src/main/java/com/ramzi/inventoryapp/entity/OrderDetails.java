package com.ramzi.inventoryapp.entity;

import android.arch.persistence.room.Entity;
import android.arch.persistence.room.ForeignKey;
import android.arch.persistence.room.PrimaryKey;
import android.widget.ProgressBar;

import java.io.Serializable;

/**
 * Created by user on 12/20/2017.
 */
@Entity(tableName = "orderDetails", foreignKeys = {@ForeignKey(entity = Order.class, parentColumns = "orderId", childColumns = "orderID"),
        @ForeignKey(entity = Product.class, parentColumns = "productId", childColumns = "productID")
})

public class OrderDetails implements Serializable {
    @PrimaryKey(autoGenerate = true)
    private int id;
    private int orderID;
    private int productID;
    private int finalPrice;
    private int quantity;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getOrderID() {
        return orderID;
    }

    public void setOrderID(int orderID) {
        this.orderID = orderID;
    }

    public int getProductID() {
        return productID;
    }

    public void setProductID(int productID) {
        this.productID = productID;
    }

    public int getFinalPrice() {
        return finalPrice;
    }

    public void setFinalPrice(int finalPrice) {
        this.finalPrice = finalPrice;
    }

    public int getQuantity() {
        return quantity;
    }

    public void setQuantity(int quantity) {
        this.quantity = quantity;
    }
}
