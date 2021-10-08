package TestNgAssignment;


import java.io.IOException;


import org.openqa.selenium.By;

import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;


public class CreateLead extends BaseClass{
@Test(dataProvider="fetchData")
	public void getCreateLead(String cmpnyName,String name,String secName,String number ) throws IOException{
	
		driver.findElement(By.linkText("Leads")).click();
		driver.findElement(By.linkText("Create Lead")).click();
		driver.findElement(By.id("createLeadForm_companyName")).sendKeys(cmpnyName);
		driver.findElement(By.id("createLeadForm_firstName")).sendKeys(name);
		driver.findElement(By.id("createLeadForm_lastName")).sendKeys(secName);
		driver.findElement(By.id("createLeadForm_primaryPhoneNumber")).sendKeys(number);
		driver.findElement(By.name("submitButton")).click();
		
}

@DataProvider(name = "fetchData")
public String[][] getData() throws IOException {
	ExcelSheet obj = new ExcelSheet();

	return obj.excelSheet("CreateLead");

}

}







