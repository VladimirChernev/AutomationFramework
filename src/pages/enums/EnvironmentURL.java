package pages.enums;

public enum EnvironmentURL {

    LIVE("https://www.rakuten.de/"),
    BETA("url"),
    DEV("url"),
    LIVEADMIN("url"),
    BETAADMIN("url"),
    DEVADMIN("url");

    private String environmentURL;

    EnvironmentURL(String environmentURL){
        this.environmentURL = environmentURL;
    }

    public String getEnvironmentURL() {
        return environmentURL;
    }

}
