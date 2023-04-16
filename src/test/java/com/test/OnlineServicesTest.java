package com.test;

import com.constants.Constant;
import com.pages.OnlineServicesPage;
import com.utilities.PrePost;
import com.utility.FileReading;
import org.testng.annotations.Test;

public class OnlineServicesTest extends PrePost {

    @Test
    public void validateAllLabels(){
        OnlineServicesPage onlineServicesPage = new OnlineServicesPage(browser.getDriver());
        TestData = FileReading.readUserProperties(Constant.onlineServices+Constant.slash+"OnlineServices");
        onlineServicesPage.validateTextOnlineServices(TestData.get("Online_services"));
        onlineServicesPage.validateTextBillPay(TestData.get("bill_payLink"));
        onlineServicesPage.validateTextAccountHistory(TestData.get("account_HistoryLink"));
        onlineServicesPage.validateTransferFund(TestData.get("transfer_fundsLink"));
    }
}
