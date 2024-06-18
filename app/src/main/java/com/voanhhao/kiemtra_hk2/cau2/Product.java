package com.voanhhao.kiemtra_hk2.cau2;

public class Product {
    int productCode;
    String productId;
    String productName;
    double productPrice;

    public Product(int productCode, String productId, String productName, double productPrice) {
        this.productCode = productCode;
        this.productId = productId;
        this.productName = productName;
        this.productPrice = productPrice;
    }

    public int getProductCode() {
        return productCode;
    }

    public void setProductCode(int productCode) {
        this.productCode = productCode;
    }

    public String getProductId() {
        return productId;
    }

    public void setProductId(String productId) {
        this.productId = productId;
    }

    public String getProductName() {
        return productName;
    }

    public void setProductName(String productName) {
        this.productName = productName;
    }

    public double getProductPrice() {
        return productPrice;
    }

    public void setProductPrice(double productPrice) {
        this.productPrice = productPrice;
    }
}
