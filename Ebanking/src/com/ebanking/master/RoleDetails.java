package com.ebanking.master;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class RoleDetails 
{

	@FindBy(id="btnRoles")
	WebElement NRole;
	
	@FindBy(xpath="/html/body/div/form/table/tbody/tr/td/table/tbody/tr[2]/td/table/tbody/tr/td[3]/table/tbody/tr/td[1]/a/img")
	WebElement RHome;
	
    public void NewRole() 
    {
    	NRole.click();
    }
    
    public void Rhom() 
    {
    	RHome.click();
    }
}
