package example;

import org.openqa.selenium.By;		
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.Assert;
import org.testng.annotations.Test;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.AfterTest;

public class Dashboard_Test {
	private WebDriver driver;
	
	  
@Test
  public void Balance_LVNV_FUNDING() 
 {
										
//		driver.findElement(By.xpath(".//*[@id='dashboard']/div[3]/section[1]/div[2]/div[1]")).click();
	 	String LFBALANCE1 = driver.findElement(By.xpath(".//*[@id='dashboard']/div[3]/section[1]/div[2]/div[1]/div[4]")).getText();
		String  LFBALANCEBal = LFBALANCE1.replaceAll("[$,]", "");
	    Assert.assertTrue(Integer.parseInt(LFBALANCEBal) == Integer.parseInt(Util.LFBALANCE_1));
//	    driver.findElement(By.xpath(".//*[@id='dashboard-sub-nav']/div/button")).click();

  }

//@Test
//  public void LVNV_FUNDING_Test_02_ACCOUNT_TYPE() 
// {
//	
//	driver.findElement(By.xpath(".//*[@id='dashboard']/div[3]/section[1]/div[2]/div[1]")).click();
//	String LFAT = driver.findElement(By.xpath(".//*[@id='dashboard-sub-page']/div/div/div/section[1]/div[3]/div[1]/div[1]/span[2]")).getText();
//	Assert.assertTrue(LFAT.equals(Util.LFA_T));	
//	 driver.findElement(By.xpath(".//*[@id='dashboard-sub-nav']/div/button")).click();
//  }

//@Test
//  public void LVNV_FUNDING_Test_03_Date_Opened() 
// {
//	  
//	driver.findElement(By.xpath(".//*[@id='dashboard']/div[3]/section[1]/div[2]/div[1]")).click();	
//	String LFDO = driver.findElement(By.xpath(".//*[@id='dashboard-sub-page']/div/div/div/section[1]/div[3]/div[1]/div[2]/span[2]")).getText();
//	Assert.assertTrue(LFDO.equals(Util.LFD_O));	
//	 driver.findElement(By.xpath(".//*[@id='dashboard-sub-nav']/div/button")).click();

//  }

//@Test
//  public void LVNV_FUNDING_Original_Creditor() {
//	  
//		String LFOC = driver.findElement(By.xpath(".//*[@id='dashboard-sub-page']/div/div/div/section[1]/div[3]/div[2]/div[2]/span[2]")).getText();
//	
//
//  }



@Test
  public void Balance_MED_DATA_SYS() {
	  
			String MDSBALANCE = driver.findElement(By.xpath(".//*[@id='dashboard']/div[3]/section[1]/div[2]/div[3]/div[4]")).getText();
	        String  MDSBalance = MDSBALANCE.replaceAll("[$]", "");
	        Assert.assertTrue(Integer.parseInt(MDSBalance) == Integer.parseInt(Util.MDS_BALANCE));	

  }

@Test
  public void Balance_LVNV_FUNDING_1() {
	  
		String NAVYFCU = driver.findElement(By.xpath(".//*[@id='dashboard']/div[3]/section[1]/div[3]/div[1]/div[4]")).getText();
                String  NFBalance = NAVYFCU.replaceAll("[$,]", "");
	Assert.assertTrue(Integer.parseInt(NFBalance) == Integer.parseInt(Util.NFBalance_1));	

  }


@Test
  public void Balance_MIL_STAR() {
	  
		String MILSTAR = driver.findElement(By.xpath(".//*[@id='dashboard']/div[3]/section[1]/div[3]/div[2]/div[4]")).getText();
		String  MSBalance = MILSTAR.replaceAll("[$,]", "");
	Assert.assertTrue(Integer.parseInt(MSBalance) == Integer.parseInt(Util.MS_Balance));	

  }


@Test
  public void Balance_BK_OF_AMER() {
	  
		String BKOFAMER = driver.findElement(By.xpath(".//*[@id='dashboard']/div[3]/section[1]/div[4]/div/div[4]")).getText();
		String  BOABalance = BKOFAMER.replaceAll("[$,]", "");
		System.out.println(Integer.parseInt(BOABalance));
	Assert.assertTrue(Integer.parseInt(BOABalance) == Integer.parseInt(Util.BOA_Balance));	

  }

@Test
  public void Balance_CAR_LOAN_NAVY_FCU() {
	  
		String CRLNF1 = driver.findElement(By.xpath(".//*[@id='dashboard']/div[3]/section[1]/div[5]/div[1]/div[4]")).getText();
		String  CRLNF1Balance = CRLNF1.replaceAll("[$,]", "");
	Assert.assertTrue(Integer.parseInt(CRLNF1Balance) == Integer.parseInt(Util.CRLNF1_Balance));	

  }

@Test
  public void Balance_CAR_LOAN_NAVY_FCU1() {
	  
		String CRLNF2 = driver.findElement(By.xpath(".//*[@id='dashboard']/div[3]/section[1]/div[5]/div[2]/div[4]")).getText();
		String  CRLNF2Balance = CRLNF2.replaceAll("[$,]", "");
	Assert.assertTrue(Integer.parseInt(CRLNF2Balance) == Integer.parseInt(Util.CRLNF2_Balance));	

  }

@Test
  public void Balance_SECURED_NAVY_FCU() {
	  
		String SNF = driver.findElement(By.xpath(".//*[@id='dashboard']/div[3]/section[1]/div[6]/div/div[4]")).getText();
		String  SNFBalance = SNF.replaceAll("[$,]", "");
	Assert.assertTrue(Integer.parseInt(SNFBalance) == Integer.parseInt(Util.SNF_Balance));	

  }

@Test
  public void Balance_LINE_OF_CREDIT_BENFCL_HFC() {
	  
		String LCBF = driver.findElement(By.xpath(".//*[@id='dashboard']/div[3]/section[1]/div[7]/div[1]/div[4]")).getText();
		String  LCBFBalance = LCBF.replaceAll("[$,]", "");
	Assert.assertTrue(Integer.parseInt(LCBFBalance) == Integer.parseInt(Util.LCBF_Balance));	

  }

@Test
  public void Balance_LINE_OF_CREDIT_NAVY_FCU() 
{
	  
		String LCNF = driver.findElement(By.xpath(".//*[@id='dashboard']/div[3]/section[1]/div[7]/div[2]/div[4]")).getText();
		String  LCNFBalance = LCNF.replaceAll("[$,]", "");
	Assert.assertTrue(Integer.parseInt(LCNFBalance) == Integer.parseInt(Util.LCNF_Balance));	

  }

@BeforeTest
public void beforeTest() throws Exception {
	  
	driver = new FirefoxDriver();
	
	  driver.get(Util.BASE_URL);
	    
	    //Maximize browser
	    driver.manage().window().maximize();
	    
	    Thread.sleep(10000);
	 
	  
	  String[][] testData = Util.getDataFromExcel(Util.FILE_PATH,
			Util.SHEET_NAME1, Util.TABLE_NAME);
	String username, password;
	
		String[][] test_data = Util.getDataFromExcel(Util.FILE_PATH, Util.SHEET_NAME2, Util.TABLE_NAME2);
		String[][] test = Util.getDataFromExcel(Util.FILE_PATH, Util.SHEET_NAME3, Util.TABLE_NAME3);
		String[][] test_collections = Util.getDataFromExcel(Util.FILE_PATH, Util.SHEET_NAME4, Util.TABLE_NAME4);
		String[][] test_PublicRecords = Util.getDataFromExcel(Util.FILE_PATH, Util.SHEET_NAME5, Util.TABLE_NAME5);
		String[][] test_CI = Util.getDataFromExcel(Util.FILE_PATH, Util.SHEET_NAME6, Util.TABLE_NAME6);
		String[][] test_PI = Util.getDataFromExcel(Util.FILE_PATH, Util.SHEET_NAME7, Util.TABLE_NAME7);
		
		


	//Testing for all parameters stored in the Excel File
	
	    username = testData[0][0]; // get username
	    password = testData[0][1]; // get password


//All parameters stored in the Excel File for CreditReport_Accounts
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
  Util.Name_Address = test_data[0][19];
  Util.Name_Address_1 = test_data[0][20];
  Util.CC_NAVYFCUstatus = test_data[0][21];
  Util.AC_no = test_data[0][22];
  Util.DO_1 = test_data[0][23];
  Util.A_T = test_data[0][24];
  Util.CL_1 = test_data[0][25];
  Util.HB_1 = test_data[0][26];
  Util.RES_1 = test_data[0][27];
  Util.A_D = test_data[0][28];
  Util.REM_1 = test_data[0][29];
  Util.C_I = test_data[0][30];
  Util.L_R = test_data[0][31];
  Util.A_P_D = test_data[0][32];
  Util.PH_1 = test_data[0][33];

//All parameters stored in the Excel File for CreditReport_Collections
  	Util.LVNVFUNDING_BALANCE1 = test_collections[0][0];
	    Util.LVNVFUNDING_BALANCE2 = test_collections[0][1];
	    Util.MEDDATASYS_BALANCE = test_collections[0][2];
	    Util.LVNVFUNDING_BALANCE3 = test_collections[0][3];
	    Util.DO_C = test_collections[0][4];
	    Util.LR_C = test_collections[0][5];
	    Util.OC_C = test_collections[0][6];
	    Util.Res_C = test_collections[0][7];
	    Util.AD_C = test_collections[0][8];
	    Util.AC_C = test_collections[0][9];
	    Util.Rem_C = test_collections[0][10];
	    Util.AN_C = test_collections[0][11];
	    Util.HB_C = test_collections[0][12];
	    Util.CI_C = test_collections[0][13];

//All parameters stored in the Excel File for CreditReport_CreditInquiries
	    Util.INQL_T = test_CI[0][0];
	    Util.INQL_D = test_CI[0][1];
	    Util.INQL_ERD = test_CI[0][2];
	    Util.INQL_ICD = test_CI[0][3];
	    Util.INBT = test_CI[0][4];

//All parameters stored in the Excel File for CreditReport_Personal Information
	    Util.PINR_1 = test_PI[0][0];
	    Util.PINR_2 = test_PI[0][1];
	    Util.PICA_1 = test_PI[0][2];
	    Util.PICA_2 = test_PI[0][3];
	    Util.PIPA_1 = test_PI[0][4];
	    Util.PIPA_2 = test_PI[0][5];
	    Util.PI_PA_1 = test_PI[0][6];
	    Util.PI_PA_2 = test_PI[0][7];
	    Util.PICE_1 = test_PI[0][8];
	    Util.PICE_2 = test_PI[0][9];

//All parameters stored in the Excel File for CreditReport_Public Records
	    Util.TLRD_A = test_PublicRecords[0][0];
	    Util.TLRD_S = test_PublicRecords[0][1];
	    Util.TLRDD_F = test_PublicRecords[0][2];
	    Util.TLRDC_D = test_PublicRecords[0][3];
	    Util.TLRDR_N = test_PublicRecords[0][4];
	    Util.TLRD_C = test_PublicRecords[0][5];
	    Util.TLRDD_C = test_PublicRecords[0][6];
	    
	    
	    Util.R_T = test[0][0];
	    Util.LFBALANCE_1 = test[0][1];
	    Util.LFBALANCE_2 = test[0][2];
	    Util.MDS_BALANCE = test[0][3];
	    Util.LFBALANCE_3 = test[0][4];
	    Util.NFBalance_1 = test[0][5];
	    Util.MS_Balance = test[0][6];
	    Util.BOA_Balance = test[0][7];
	    Util.CRLNF1_Balance = test[0][8];
	    Util.CRLNF2_Balance = test[0][9];
	    Util.SNF_Balance = test[0][10];
	    Util.LCBF_Balance = test[0][11];
	    Util.LCNF_Balance = test[0][12];
	    Util.LFA_T = test[0][13];
	    Util.LFD_O = test[0][14];
	    Util.LFO_C = test[0][15];
	    Util.A_N = test[0][16];
	    Util.H_B = test[0][17];
	    Util.LFC_I = test[0][18];
	    Util.Re_s = test[0][19];
	    Util.LFA_D = test[0][20];
	    Util.A_C = test[0][21];
	    Util.Re_m = test[0][22];
	  
	  
	    
	    //Click on the LOGIN link 
	    //driver.findElement(By.className("login")).click();

	    //Enter username
	    driver.findElement(By.name("em")).sendKeys(username);

	    // Enter Password
	    driver.findElement(By.name("pw")).sendKeys(password);
	    Thread.sleep(10000);
	    
	    //Click Login button
	    driver.findElement(By.xpath(".//*[@id='join-login']/form/div[5]/button[2]")).click();
//	    String Dashboard = "https://efdevhub.info/home/dashboard";
//	    driver.navigate().to(Dashboard);
	    Thread.sleep(20000);
	    
}

}

