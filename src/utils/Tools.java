package utils;

import org.openqa.selenium.JavascriptExecutor;

public class Tools extends Browser{

    static public void setWebElementVisibleTrue(String by) {
        if (driver instanceof JavascriptExecutor) {
            ((JavascriptExecutor)driver)
                    .executeScript("document.getElementById('"+by+"').style.display='block';");
        }
    }

    public boolean verifyTextPresent(final String text) {
        boolean isPresent = false;
        int br=0;
        while (!isPresent&&br<=15) {
            try {
                br++;
                isPresent = driver.getPageSource().contains(text);
                if (isPresent) return true;
                Thread.sleep(1000);
            } catch (Exception e) {
                e.printStackTrace();
            }

        }

        return false;
    }
}
