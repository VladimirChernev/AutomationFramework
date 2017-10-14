package pages.enums;

public enum ProductLink {

    SAMSUNGGALAXYS8("//www.rakuten.de/produkt/samsung-galaxy-s8-g950-64gb-1888707440.html"),
    OTHERPRODUCTLINK("url");

    private String productLink;

    ProductLink(String productLink){
        this.productLink = productLink;
    }

    public String getProductLink() {
        return productLink;
    }

}
