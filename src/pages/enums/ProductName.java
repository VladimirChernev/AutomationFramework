package pages.enums;

public enum ProductName {

    SAMSUNGGALAXYS8("SAMSUNG Galaxy S8 G950 64GB");

    private String productName;

    ProductName(String productName){
        this.productName = productName;
    }

    public String getProductName() {
        return productName;
    }

}
