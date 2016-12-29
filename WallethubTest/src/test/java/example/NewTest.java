package example;

import org.openqa.selenium.By;		
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.Assert;
import org.testng.annotations.Test;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.AfterTest;

public class NewTest {
	private WebDriver driver;
	
	    
	
  @Test
  public void No_of_Open_Accounts() {
	  
	  String OpenAccounts = driver.findElement(By.xpath(".//*[@id='credit-report']/div[1]/div[1]/div[1]/span[1]")).getText();
	  Assert.assertTrue(Integer.parseInt(OpenAccounts) == Integer.parseInt(Util.Open_Accounts));
  }
  
  @Test
  public void No_of_Credit_Inquires() {
	  
	  String CreditInquiries = driver.findElement(By.xpath(".//*[@id='credit-report']/div[1]/div[1]/div[2]/span[1]")).getText();
	  Assert.assertTrue(Integer.parseInt(CreditInquiries) == Integer.parseInt(Util.Credit_Inquires));
  }
  
  @Test
  public void No_of_Collections() {
	  
	  String Collections = driver.findElement(By.xpath(".//*[@id='credit-report']/div[1]/div[1]/div[3]/span[1]")).getText();
	  Assert.assertTrue(Integer.parseInt(Collections) == Integer.parseInt(Util.collections));
  }
  
  @Test
  public void No_of_Public_Records() {
	  
	  String PublicRecords = driver.findElement(By.xpath(".//*[@id='credit-report']/div[1]/div[1]/div[4]/span[1]")).getText();
	  Assert.assertTrue(Integer.parseInt(PublicRecords) == Integer.parseInt(Util.Public_Records));
  }
  
  @Test
  public void Balance_Accounts1() {
	  
	  String NAVYFCUBALANCE = driver.findElement(By.xpath(".//*[@id='credit-report']/section[1]/div[2]/div[2]/div[3]")).getText();
	    String [] Balance = NAVYFCUBALANCE.split("\n", 2);
	    NAVYFCUBALANCE = Balance[1].replaceAll("[$,]", "");
	  Assert.assertTrue(Integer.parseInt(NAVYFCUBALANCE) == Integer.parseInt(Util.NAVYFCU_BALANCE));
  }
  
  @Test
  public void Balance_Accounts2() {
	  
	  String MILSTARBALANCE = driver.findElement(By.xpath(".//*[@id='credit-report']/section[1]/div[2]/div[4]/div[3]")).getText();
	    String [] CHARGEACCOUNTMILSTARBalance = MILSTARBALANCE.split("\n", 2);
	    MILSTARBALANCE = CHARGEACCOUNTMILSTARBalance[1].replaceAll("[$,]", "");
	  Assert.assertTrue(Integer.parseInt(MILSTARBALANCE) == Integer.parseInt(Util.MILSTAR_BALANCE));
  }
  
  @Test
  public void Balance_Accounts3() {
	  
	  String BKOFAMERBALANCE = driver.findElement(By.xpath(".//*[@id='credit-report']/section[1]/div[3]/div[2]/div[3]")).getText();
	    String [] HOMELOANBKOFAMERBalance = BKOFAMERBALANCE.split("\n", 2);
	    BKOFAMERBALANCE = HOMELOANBKOFAMERBalance[1].replaceAll("[$,]", "");
	  Assert.assertTrue(Integer.parseInt(BKOFAMERBALANCE) == Integer.parseInt(Util.BKOFAMER_BALANCE));
  }
  
  @Test
  public void Balance_Accounts4() {
	  
	  String NAVYFCU1BALANCE = driver.findElement(By.xpath(".//*[@id='credit-report']/section[1]/div[4]/div[2]/div[3]")).getText();
	    String [] CARLOANNAVYFCU1Balance = NAVYFCU1BALANCE.split("\n", 2);
	    NAVYFCU1BALANCE = CARLOANNAVYFCU1Balance[1].replaceAll("[$,]", "");
	  Assert.assertTrue(Integer.parseInt(NAVYFCU1BALANCE) == Integer.parseInt(Util.NAVYFCU1_BALANCE));
  }
  @Test  
  public void Balance_Accounts5() {
	  
	String NAVYFCUBALANCE2 = driver.findElement(By.xpath(".//*[@id='credit-report']/section[1]/div[4]/div[4]/div[3]")).getText();
    String [] CARLOANNAVYFCUBalance2 = NAVYFCUBALANCE2.split("\n", 2);
    NAVYFCUBALANCE2 = CARLOANNAVYFCUBalance2[1].replaceAll("[$,]", "");
	  Assert.assertTrue(Integer.parseInt(NAVYFCUBALANCE2) == Integer.parseInt(Util.CARLOANNAVYFCU_Balance2));
  }
  
  @Test
  public void Balance_Accounts6() {
	  
	String SECUREDNAVYFCUBALANCE = driver.findElement(By.xpath(".//*[@id='credit-report']/section[1]/div[5]/div[2]/div[3]")).getText();
    String [] SECUREDNAVYFCUBalance = SECUREDNAVYFCUBALANCE.split("\n", 2);
    SECUREDNAVYFCUBALANCE = SECUREDNAVYFCUBalance[1].replaceAll("[$,]", "");
	  Assert.assertTrue(Integer.parseInt(SECUREDNAVYFCUBALANCE) == Integer.parseInt(Util.SECUREDNAVYFCU_Balance));
  }
  
  @Test
  public void Balance_Accounts7() {
	  
	  String BENFCLHFCUBALANCE = driver.findElement(By.xpath(".//*[@id='credit-report']/section[1]/div[6]/div[2]/div[3]")).getText();
	    String [] LINEOFCREDITBENFCLHFCBalance = BENFCLHFCUBALANCE.split("\n", 2);
	    BENFCLHFCUBALANCE = LINEOFCREDITBENFCLHFCBalance[1].replaceAll("[$,]", "");
	  Assert.assertTrue(Integer.parseInt(BENFCLHFCUBALANCE) == Integer.parseInt(Util.BENFCLHFCU_BALANCE));
  }

  @Test
  public void Balance_Accounts8() {
	  
	  String LINEOFCREDITNAVYFCUBALANCE = driver.findElement(By.xpath(".//*[@id='credit-report']/section[1]/div[6]/div[4]/div[3]")).getText();
	    String [] LINEOFCREDITNAVYFCUBalance = LINEOFCREDITNAVYFCUBALANCE.split("\n", 2);
	    LINEOFCREDITNAVYFCUBALANCE = LINEOFCREDITNAVYFCUBalance[1].replaceAll("[$,]", "");
	  Assert.assertTrue(Integer.parseInt(LINEOFCREDITNAVYFCUBALANCE) == Integer.parseInt(Util.LINEOFCREDITNAVYFCU_BALANCE));
  }

  @Test
  public void Balance_Collections1() {
	  
	  String LVNVFUNDINGBALANCE1 = driver.findElement(By.xpath(".//*[@id='credit-report']/section[1]/div[12]/div[2]/div[3]")).getText();
	    String [] LVNVFUNDINGBalance1 = LVNVFUNDINGBALANCE1.split("\n", 2);
	    LVNVFUNDINGBALANCE1 = LVNVFUNDINGBalance1[1].replaceAll("[$,]", "");
	  Assert.assertTrue(Integer.parseInt(LVNVFUNDINGBALANCE1) == Integer.parseInt(Util.LVNVFUNDING_BALANCE1));
  }
  
  @Test
  public void Balance_Collections2() {
	  
	  String LVNVFUNDINGBALANCE2 = driver.findElement(By.xpath(".//*[@id='credit-report']/section[1]/div[12]/div[4]/div[3]")).getText();
	    String [] LVNVFUNDINGBalance2 = LVNVFUNDINGBALANCE2.split("\n", 2);
	    LVNVFUNDINGBALANCE2 = LVNVFUNDINGBalance2[1].replaceAll("[$,]", "");
	  Assert.assertTrue(Integer.parseInt(LVNVFUNDINGBALANCE2) == Integer.parseInt(Util.LVNVFUNDING_BALANCE2));
  }
  
  @Test
  public void Balance_Collections3() {
	  
	  String MEDDATASYSBALANCE = driver.findElement(By.xpath("//*[@id='credit-report']/section[1]/div[12]/div[6]/div[3]")).getText();
	    String [] MEDDATASYSBalance = MEDDATASYSBALANCE.split("\n", 2);
	    MEDDATASYSBALANCE = MEDDATASYSBalance[1].replaceAll("[$,]", "");
	  Assert.assertTrue(Integer.parseInt(MEDDATASYSBALANCE) == Integer.parseInt(Util.MEDDATASYS_BALANCE));
  }
  
  @Test
  public void Balance_Collections4() {
	  
	  String LVNVFUNDINGBALANCE3 = driver.findElement(By.xpath(".//*[@id='credit-report']/section[1]/div[12]/div[8]/div[3]")).getText();
	    String [] LVNVFUNDINGBalance3 = LVNVFUNDINGBALANCE3.split("\n", 2);
	    LVNVFUNDINGBALANCE3 = LVNVFUNDINGBalance3[1].replaceAll("[$,]", "");
	  Assert.assertTrue(Integer.parseInt(LVNVFUNDINGBALANCE3) == Integer.parseInt(Util.LVNVFUNDING_BALANCE3));
  }
  
  @Test
  public void Amount_PublicRecords() {
	  
	  String TAXLIENRecoderOfDeedsAMOUNT = driver.findElement(By.xpath(".//*[@id='credit-report']/section[1]/div[16]/div[2]/div[3]")).getText().toString();
	    String [] TAXLIENRecoderOfDeedsAmount = TAXLIENRecoderOfDeedsAMOUNT.split("\n", 2);
	    TAXLIENRecoderOfDeedsAMOUNT = TAXLIENRecoderOfDeedsAmount[1].replaceAll("[/]", "");
	  Assert.assertTrue(TAXLIENRecoderOfDeedsAMOUNT.equals(Util.TAXLIENRecoderOfDeeds_AMOUNT));
  }

  @Test
  public void Credit_Inquiry1() {
	  
	  String QUICKENLOANTYPE = driver.findElement(By.xpath(".//*[@id='credit-report']/section[1]/div[18]/div[2]/div[3]")).getText();
	    String [] QUICKENLOANType = QUICKENLOANTYPE.split("\n", 2);
	    QUICKENLOANTYPE = QUICKENLOANType[1];
	  Assert.assertTrue(QUICKENLOANTYPE.equals(Util.QUICKENLOAN_TYPE));
  }

  @Test
  public void Credit_Inquiry2() {
	  
	  String BRCLYSBANKDETYPE = driver.findElement(By.xpath(".//*[@id='credit-report']/section[1]/div[18]/div[4]/div[3]")).getText();
	    String [] BRCLYSBANKDEType = BRCLYSBANKDETYPE.split("\n", 2);
	    BRCLYSBANKDETYPE = BRCLYSBANKDEType[1];
	  Assert.assertTrue(BRCLYSBANKDETYPE.equals(Util.BRCLYSBANKDE_TYPE));
  }

  @BeforeTest
  public void beforeTest() throws Exception {
	  driver = new FirefoxDriver();
	 
	  
	  String[][] testData = Util.getDataFromExcel(Util.FILE_PATH,
  			Util.SHEET_NAME1, Util.TABLE_NAME);
	String username, password;
	
		String[][] test_data = Util.getDataFromExcel(Util.FILE_PATH, Util.SHEET_NAME2, Util.TABLE_NAME2);
		


	//Testing for all parameters stored in the Excel File
	
	    username = testData[0][0]; // get username
	    password = testData[0][1]; // get password
	    Util.Open_Accounts = test_data[0][0];
	    Util.Credit_Inquires = test_data[0][1];
	    Util.collections = test_data[0][2];
	    Util.Public_Records = test_data[0][3];
	    Util.NAVYFCU_BALANCE = test_data[0][4];
	    Util.MILSTAR_BALANCE = test_data[0][5];
	    Util.BKOFAMER_BALANCE = test_data[0][6];
	    Util.NAVYFCU1_BALANCE = test_data[0][7];
	    Util.CARLOANNAVYFCU_Balance2 = test_data[0][8];
	    Util.SECUREDNAVYFCU_Balance = test_data[0][9];
	    Util.BENFCLHFCU_BALANCE = test_data[0][10];
	    Util.LINEOFCREDITNAVYFCU_BALANCE = test_data[0][11];
	    Util.LVNVFUNDING_BALANCE1 = test_data[0][12];
	    Util.LVNVFUNDING_BALANCE2 = test_data[0][13];
	    Util.MEDDATASYS_BALANCE = test_data[0][14];
	    Util.LVNVFUNDING_BALANCE3 = test_data[0][15];
	    Util.TAXLIENRecoderOfDeeds_AMOUNT = test_data[0][16];
	    Util.QUICKENLOAN_TYPE = test_data[0][17];
	    Util.BRCLYSBANKDE_TYPE = test_data[0][18];
	  
	    driver.get(Util.BASE_URL);
	    
	    //Maximize browser
	    driver.manage().window().maximize();
	    
	    Thread.sleep(10000);
	    
	    //Click on the LOGIN link 
	    //driver.findElement(By.className("login")).click();

	    //Enter username
	    driver.findElement(By.name("em")).sendKeys(username);

	    // Enter Password
	    driver.findElement(By.name("pw")).sendKeys(password);
	    
	    //Click Login button
	    driver.findElement(By.xpath(".//*[@id='join-login']/form/div[5]/button[2]")).click();
	    Thread.sleep(10000);
	    
	    //Navigate to CreditReport
	    String CreditReporturl = "https://efdevhub.info/home/credit-report";
	    driver.navigate().to(CreditReporturl);
	    Thread.sleep(15000);
  }

  @AfterTest
  public void afterTest() {
	  //driver.quit();
  }

}
