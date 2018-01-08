package utils;

import com.thoughtworks.gauge.Step;

public class Dashboard {
    @Step("Navigated to dashboard")
    public void navigateDashbaord()
    {
        System.out.println("---Successfully navigated to dashboard----");
    }
}
