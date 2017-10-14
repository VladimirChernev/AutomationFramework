package pages.enums;

public enum ProductColor {

    CORALBLUE("Coral Blue"),
    ORCHIDGRAY("Orchid Gray");

    private String productColor;

    ProductColor(String productColor){
        this.productColor = productColor;
    }

    public String getProductColor() {
        return productColor;
    }


}
