package org.SeleniumAuto1;


import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class TestFirstNG {

    @BeforeMethod
    void login()
    {
        System.out.println("This is login..");
    }

    @AfterMethod
    void logout()
    {
        System.out.println("this is logout...");
    }

    @Test(priority=1)
    void search()
    {
        System.out.println("this is search...");
    }


    @Test(priority=2)
    void AdvancedSearch()
    {
        System.out.println("this advanced search....");
    }


}
