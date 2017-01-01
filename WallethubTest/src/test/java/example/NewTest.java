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
  public void Static_Data_No_of_Open_Accounts() {
	  
	  String OpenAccounts = driver.findElement(By.xpath(".//*[@id='credit-report']/div[1]/div[1]/div[1]/span[1]")).getText();
	  Assert.assertTrue(Integer.parseInt(OpenAccounts) == Integer.parseInt(Util.Open_Accounts));
  }
  
  @Test
  public void Static_Data_No_of_Credit_Inquires() {
	  
	  String CreditInquiries = driver.findElement(By.xpath(".//*[@id='credit-report']/div[1]/div[1]/div[2]/span[1]")).getText();
	  Assert.assertTrue(Integer.parseInt(CreditInquiries) == Integer.parseInt(Util.Credit_Inquires));
  }
  
  @Test
  public void Static_Data_No_of_Collections() {
	  
	  String Collections = driver.findElement(By.xpath(".//*[@id='credit-report']/div[1]/div[1]/div[3]/span[1]")).getText();
	  Assert.assertTrue(Integer.parseInt(Collections) == Integer.parseInt(Util.collections));
  }
  
  @Test
  public void Static_Data_No_of_Public_Records() {
	  
	  String PublicRecords = driver.findElement(By.xpath(".//*[@id='credit-report']/div[1]/div[1]/div[4]/span[1]")).getText();
	  Assert.assertTrue(Integer.parseInt(PublicRecords) == Integer.parseInt(Util.Public_Records));
  }
  
  @Test
  public void Static_Data_Balance_Accounts1() {
	  
	  String NAVYFCUBALANCE = driver.findElement(By.xpath(".//*[@id='credit-report']/section[1]/div[2]/div[2]/div[3]")).getText();
	    String [] Balance = NAVYFCUBALANCE.split("\n", 2);
	    NAVYFCUBALANCE = Balance[1].replaceAll("[$,]", "");
	  Assert.assertTrue(Integer.parseInt(NAVYFCUBALANCE) == Integer.parseInt(Util.NAVYFCU_BALANCE));
  }
  
  @Test
  public void Static_Data_Balance_Accounts2() {
	  
	  String MILSTARBALANCE = driver.findElement(By.xpath(".//*[@id='credit-report']/section[1]/div[2]/div[4]/div[3]")).getText();
	    String [] CHARGEACCOUNTMILSTARBalance = MILSTARBALANCE.split("\n", 2);
	    MILSTARBALANCE = CHARGEACCOUNTMILSTARBalance[1].replaceAll("[$,]", "");
	  Assert.assertTrue(Integer.parseInt(MILSTARBALANCE) == Integer.parseInt(Util.MILSTAR_BALANCE));
  }
  
  @Test
  public void Static_Data_Balance_Accounts3() {
	  
	  String BKOFAMERBALANCE = driver.findElement(By.xpath(".//*[@id='credit-report']/section[1]/div[3]/div[2]/div[3]")).getText();
	    String [] HOMELOANBKOFAMERBalance = BKOFAMERBALANCE.split("\n", 2);
	    BKOFAMERBALANCE = HOMELOANBKOFAMERBalance[1].replaceAll("[$,]", "");
	  Assert.assertTrue(Integer.parseInt(BKOFAMERBALANCE) == Integer.parseInt(Util.BKOFAMER_BALANCE));
  }
  
  @Test
  public void Static_Data_Balance_Accounts4() {
	  
	  String NAVYFCU1BALANCE = driver.findElement(By.xpath(".//*[@id='credit-report']/section[1]/div[4]/div[2]/div[3]")).getText();
	    String [] CARLOANNAVYFCU1Balance = NAVYFCU1BALANCE.split("\n", 2);
	    NAVYFCU1BALANCE = CARLOANNAVYFCU1Balance[1].replaceAll("[$,]", "");
	  Assert.assertTrue(Integer.parseInt(NAVYFCU1BALANCE) == Integer.parseInt(Util.NAVYFCU1_BALANCE));
  }
  @Test  
  public void Static_Data_Balance_Accounts5() {
	  
	String NAVYFCUBALANCE2 = driver.findElement(By.xpath(".//*[@id='credit-report']/section[1]/div[4]/div[4]/div[3]")).getText();
    String [] CARLOANNAVYFCUBalance2 = NAVYFCUBALANCE2.split("\n", 2);
    NAVYFCUBALANCE2 = CARLOANNAVYFCUBalance2[1].replaceAll("[$,]", "");
	  Assert.assertTrue(Integer.parseInt(NAVYFCUBALANCE2) == Integer.parseInt(Util.CARLOANNAVYFCU_Balance2));
  }
  
  @Test
  public void Static_Data_Balance_Accounts6() {
	  
	String SECUREDNAVYFCUBALANCE = driver.findElement(By.xpath(".//*[@id='credit-report']/section[1]/div[5]/div[2]/div[3]")).getText();
    String [] SECUREDNAVYFCUBalance = SECUREDNAVYFCUBALANCE.split("\n", 2);
    SECUREDNAVYFCUBALANCE = SECUREDNAVYFCUBalance[1].replaceAll("[$,]", "");
	  Assert.assertTrue(Integer.parseInt(SECUREDNAVYFCUBALANCE) == Integer.parseInt(Util.SECUREDNAVYFCU_Balance));
  }
  
  @Test
  public void Static_Data_Balance_Accounts7() {
	  
	  String BENFCLHFCUBALANCE = driver.findElement(By.xpath(".//*[@id='credit-report']/section[1]/div[6]/div[2]/div[3]")).getText();
	    String [] LINEOFCREDITBENFCLHFCBalance = BENFCLHFCUBALANCE.split("\n", 2);
	    BENFCLHFCUBALANCE = LINEOFCREDITBENFCLHFCBalance[1].replaceAll("[$,]", "");
	  Assert.assertTrue(Integer.parseInt(BENFCLHFCUBALANCE) == Integer.parseInt(Util.BENFCLHFCU_BALANCE));
  }

  @Test
  public void Static_Data_Balance_Accounts8() {
	  
	  String LINEOFCREDITNAVYFCUBALANCE = driver.findElement(By.xpath(".//*[@id='credit-report']/section[1]/div[6]/div[4]/div[3]")).getText();
	    String [] LINEOFCREDITNAVYFCUBalance = LINEOFCREDITNAVYFCUBALANCE.split("\n", 2);
	    LINEOFCREDITNAVYFCUBALANCE = LINEOFCREDITNAVYFCUBalance[1].replaceAll("[$,]", "");
	  Assert.assertTrue(Integer.parseInt(LINEOFCREDITNAVYFCUBALANCE) == Integer.parseInt(Util.LINEOFCREDITNAVYFCU_BALANCE));
  }

  @Test
  public void Static_Data_Balance_Collections1() {
	  
	  String LVNVFUNDINGBALANCE1 = driver.findElement(By.xpath(".//*[@id='credit-report']/section[1]/div[12]/div[2]/div[3]")).getText();
	    String [] LVNVFUNDINGBalance1 = LVNVFUNDINGBALANCE1.split("\n", 2);
	    LVNVFUNDINGBALANCE1 = LVNVFUNDINGBalance1[1].replaceAll("[$,]", "");
	  Assert.assertTrue(Integer.parseInt(LVNVFUNDINGBALANCE1) == Integer.parseInt(Util.LVNVFUNDING_BALANCE1));
  }
  
  @Test
  public void Static_Data_Balance_Collections2() {
	  
	  String LVNVFUNDINGBALANCE2 = driver.findElement(By.xpath(".//*[@id='credit-report']/section[1]/div[12]/div[4]/div[3]")).getText();
	    String [] LVNVFUNDINGBalance2 = LVNVFUNDINGBALANCE2.split("\n", 2);
	    LVNVFUNDINGBALANCE2 = LVNVFUNDINGBalance2[1].replaceAll("[$,]", "");
	  Assert.assertTrue(Integer.parseInt(LVNVFUNDINGBALANCE2) == Integer.parseInt(Util.LVNVFUNDING_BALANCE2));
  }
  
  @Test
  public void Static_Data_Balance_Collections3() {
	  
	  String MEDDATASYSBALANCE = driver.findElement(By.xpath("//*[@id='credit-report']/section[1]/div[12]/div[6]/div[3]")).getText();
	    String [] MEDDATASYSBalance = MEDDATASYSBALANCE.split("\n", 2);
	    MEDDATASYSBALANCE = MEDDATASYSBalance[1].replaceAll("[$,]", "");
	  Assert.assertTrue(Integer.parseInt(MEDDATASYSBALANCE) == Integer.parseInt(Util.MEDDATASYS_BALANCE));
  }
  
  @Test
  public void Static_Data_Balance_Collections4() {
	  
	  String LVNVFUNDINGBALANCE3 = driver.findElement(By.xpath(".//*[@id='credit-report']/section[1]/div[12]/div[8]/div[3]")).getText();
	    String [] LVNVFUNDINGBalance3 = LVNVFUNDINGBALANCE3.split("\n", 2);
	    LVNVFUNDINGBALANCE3 = LVNVFUNDINGBalance3[1].replaceAll("[$,]", "");
	  Assert.assertTrue(Integer.parseInt(LVNVFUNDINGBALANCE3) == Integer.parseInt(Util.LVNVFUNDING_BALANCE3));
  }
  
  @Test
  public void Static_Data_Amount_PublicRecords() {
	  
	  String TAXLIENRecoderOfDeedsAMOUNT = driver.findElement(By.xpath(".//*[@id='credit-report']/section[1]/div[16]/div[2]/div[3]")).getText().toString();
	    String [] TAXLIENRecoderOfDeedsAmount = TAXLIENRecoderOfDeedsAMOUNT.split("\n", 2);
	    TAXLIENRecoderOfDeedsAMOUNT = TAXLIENRecoderOfDeedsAmount[1].replaceAll("[/]", "");
	  Assert.assertTrue(TAXLIENRecoderOfDeedsAMOUNT.equals(Util.TAXLIENRecoderOfDeeds_AMOUNT));
  }

  @Test
  public void Static_Data_Credit_Inquiry1() {
	  
	  String QUICKENLOANTYPE = driver.findElement(By.xpath(".//*[@id='credit-report']/section[1]/div[18]/div[2]/div[3]")).getText();
	    String [] QUICKENLOANType = QUICKENLOANTYPE.split("\n", 2);
	    QUICKENLOANTYPE = QUICKENLOANType[1];
	  Assert.assertTrue(QUICKENLOANTYPE.equals(Util.QUICKENLOAN_TYPE));
  }

  @Test
  public void Static_Data_Credit_Inquiry2() {
	  
	  String BRCLYSBANKDETYPE = driver.findElement(By.xpath(".//*[@id='credit-report']/section[1]/div[18]/div[4]/div[3]")).getText();
	    String [] BRCLYSBANKDEType = BRCLYSBANKDETYPE.split("\n", 2);
	    BRCLYSBANKDETYPE = BRCLYSBANKDEType[1];
	  Assert.assertTrue(BRCLYSBANKDETYPE.equals(Util.BRCLYSBANKDE_TYPE));
  }
  

@Test
  public void Static_Data_Validation_Name_and_Address() {
	  
		String Name = driver.findElement(By.xpath(".//*[@id='credit-report']/div[1]/h2")).getText().toString();
	        String [] Name_1 = Name.split("\n");
	 Assert.assertTrue(Name_1[0].trim().equals(Util.Name_Address.trim()));	
         Assert.assertTrue(Name_1[1].trim().equals(Util.Name_Address_1.trim()));

  }

@Test
  public void Static_Data_Validation_closed_under_Open_Accounts() {
	  
		String CUO = driver.findElement(By.xpath(".//*[@id='credit-report']/div[1]/div[1]/div[1]/span[3]")).getText();
	        String [] CUO_1 = CUO.split(" ");
	        String CUA = driver.findElement(By.xpath(".//*[@id='credit-report']/section[1]/div[7]/div/span")).getText();
		 String [] CUA_1 = CUA.split(" ");
	 Assert.assertTrue(Integer.parseInt(CUO_1[0]) == Integer.parseInt(CUA_1[0]));	

  }
@Test
  public void Zstatic_Validation_A1_AA_Credit_Card_NAVY_FCU_under_Accounts() throws Exception  {
	  	driver.findElement(By.xpath(".//*[@id='credit-report']/section[1]/div[2]/div[2]")).click();
	  	driver.wait(1000);
		String CCNAVYFCUstatus = driver.findElement(By.xpath(".//*[@id='credit-report']/section[1]/div[2]/div[2]/div[2]/span[2]")).getText();
	 Assert.assertTrue(CCNAVYFCUstatus.equals(Util.CC_NAVYFCUstatus));	

  }

@Test
  public void Zstatic_Validation_A1_Credit_Card_NAVYFCU_Account_Number() {
	  
		String ACno = driver.findElement(By.xpath(".//*[@id='credit-report']/section[1]/div[2]/section/div[1]/div[2]/div[1]/span[2]")).getText();
	    	String ACno1 = ACno.substring(0,8);
	 Assert.assertTrue(ACno1.toString().equals(Util.AC_no.toString()));	

  }

@Test
  public void Zstatic_Validation_A1_Credit_Card_NAVYFCU_Date_Opened() {
	  
		String DO = driver.findElement(By.xpath(".//*[@id='credit-report']/section[1]/div[2]/section/div[1]/div[2]/div[2]/span[2]")).getText();
	 Assert.assertTrue(DO.equals(Util.DO_1));	

  }

@Test
  public void Zstatic_Validation_A1_Credit_Card_NAVYFCU_Account_Type() {
	  
		String AT = driver.findElement(By.xpath(".//*[@id='credit-report']/section[1]/div[2]/section/div[1]/div[2]/div[4]/span[2]")).getText();
	 Assert.assertTrue(AT.equals(Util.A_T));	

  }

@Test
  public void Zstatic_Validation_A1_Credit_Card_NAVYFCU_Credit_Limit() {
	  
		String CL = driver.findElement(By.xpath(".//*[@id='credit-report']/section[1]/div[2]/section/div[1]/div[2]/div[5]/span[2]")).getText();
	    	String C_L = CL.substring(1);
	 Assert.assertTrue(C_L.equals(Util.CL_1));	

  }

@Test
  public void Zstatic_Validation_A1_Credit_Card_NAVYFCU_Highest_Balance() {
	  
		String HB = driver.findElement(By.xpath(".//*[@id='credit-report']/section[1]/div[2]/section/div[1]/div[2]/div[6]/span[2]")).getText();
	    	String H_B = HB.substring(1);
	 Assert.assertTrue(H_B.equals(Util.HB_1));	

  }

@Test
  public void Zstatic_Validation_A1_Credit_Card_NAVYFCU_Responsibility() {
	  
		String RES = driver.findElement(By.xpath(".//*[@id='credit-report']/section[1]/div[2]/section/div[1]/div[2]/div[7]/span[2]")).getText();
	 Assert.assertTrue(RES.equals(Util.RES_1));	

  }

@Test
  public void Zstatic_Validation_A1_Credit_Card_NAVYFCU_Account_Disputed() {
	  
		String AD = driver.findElement(By.xpath(".//*[@id='credit-report']/section[1]/div[2]/section/div[1]/div[2]/div[8]/span[2]")).getText();
	 Assert.assertTrue(AD.equals(Util.A_D));	

  }

@Test
  public void Zstatic_Validation_A1_Credit_Card_NAVYFCU_Remarks() {
	  
		String REM = driver.findElement(By.xpath(".//*[@id='credit-report']/section[1]/div[2]/section/div[1]/div[2]/div[9]/span[2]")).getText();
    	 Assert.assertTrue(REM.equals(Util.REM_1));	

  }

@Test
  public void Zstatic_Validation_A1_Credit_Card_NAVYFCU_Creditor_info() {
	  
		String CI = driver.findElement(By.xpath(".//*[@id='credit-report']/section[1]/div[2]/section/div[1]/div[2]/div[10]/span[2]")).getText();
	 Assert.assertTrue(CI.equals(Util.C_I));	

  }

@Test
  public void Zstatic_Validation_A1_Credit_Card_NAVYFCU_Last_Reported() {
	  
		String LR = driver.findElement(By.xpath(".//*[@id='credit-report']/section[1]/div[2]/section/div[1]/div[1]/div[1]/span")).getText();
		System.out.println(LR );
		System.out.println(Util.L_R);
		Assert.assertTrue(LR.equals(Util.L_R));	

  }

@Test
  public void Zstatic_Validation_A1_Credit_Card_NAVYFCU_Amount_Past_Due() {
	  
		String APD = driver.findElement(By.xpath(".//*[@id='credit-report']/section[1]/div[2]/section/div[1]/div[1]/div[2]/span[2]")).getText();
	    	String AP_D = APD.substring(1);
	 Assert.assertTrue(AP_D.equals(Util.A_P_D));	

  }

@Test
  public void Zstatic_Validation_A1_Credit_Card_NAVYFCU_Payment_History() {
	  
		String PH = driver.findElement(By.xpath(".//*[@id='credit-report']/section[1]/div[2]/section/div[1]/div[1]/div[3]/span")).getText().toString();
	 Assert.assertTrue(PH.trim().replaceAll(" +", " ").equals((Util.PH_1).trim().replaceAll(" +", " ")));	

  }


@Test
  public void Zstatic_Validation_A2_Collections_AA_LVNV_FUNDING() {
	  	
		driver.findElement(By.xpath(".//*[@id='credit-report']/section[1]/div[12]/div[2]")).click();
		String DO = driver.findElement(By.xpath(".//*[@id='credit-report']/section[1]/div[12]/div[2]/div[2]")).getText();
    	        String [] D_O = DO.split("\n", 2);
	 Assert.assertTrue(D_O[1].equals(Util.DO_C));	

  }

@Test
  public void Zstatic_Validation_A2_Collections_LVNV_FUNDING_LAST_REPORTED() {
	  
		String LR = driver.findElement(By.xpath(".//*[@id='credit-report']/section[1]/div[12]/section/div[1]/div[2]/div[2]/span")).getText();
	 Assert.assertTrue(LR.equals(Util.LR_C));	

  }

@Test
  public void Zstatic_Validation_A2_Collections_LVNV_FUNDING_Original_Creditor() {
	  
		String OC = driver.findElement(By.xpath(".//*[@id='credit-report']/section[1]/div[12]/section/div[1]/div[2]/div[3]/span[2]")).getText();
	 Assert.assertTrue(OC.equals(Util.OC_C));	

  }

@Test
  public void Zstatic_Validation_A2_Collections_LVNV_FUNDING_Responsibility() {
	  
		String Res = driver.findElement(By.xpath(".//*[@id='credit-report']/section[1]/div[12]/section/div[1]/div[2]/div[4]/span[2]")).getText();
	 Assert.assertTrue(Res.equals(Util.Res_C));	

  }

@Test
  public void Zstatic_Validation_A2_Collections_LVNV_FUNDING_Account_Disputed() {
	  
		String AD = driver.findElement(By.xpath(".//*[@id='credit-report']/section[1]/div[12]/section/div[1]/div[2]/div[5]/span[2]")).getText();
	 Assert.assertTrue(AD.equals(Util.AD_C));	

  }

@Test
  public void Zstatic_Validation_A2_Collections_LVNV_FUNDING_Account_Condition() {
	  
		String AC = driver.findElement(By.xpath(".//*[@id='credit-report']/section[1]/div[12]/section/div[1]/div[2]/div[6]/span[2]")).getText();
	 Assert.assertTrue(AC.equals(Util.AC_C));	

  }

@Test
  public void Zstatic_Validation_A2_Collections_LVNV_FUNDING_Remarks() {
	  
		String Rem = driver.findElement(By.xpath(".//*[@id='credit-report']/section[1]/div[12]/section/div[1]/div[2]/div[7]/div/span")).getText();
	 Assert.assertTrue(Rem.equals(Util.Rem_C));	

  }

@Test
  public void Zstatic_Validation_A2_Collections_LVNV_FUNDING_Account_Number() {
	  
		String AN = driver.findElement(By.xpath(".//*[@id='credit-report']/section[1]/div[12]/section/div[1]/div[1]/div[1]/span[2]")).getText();
    	    	String AN1 = AN.substring(0, 11);
    	    	String AN_1 = AN1.replaceAll("[X]", "");
    	    	String AN_C1 = Util.AN_C.replaceAll("[X]", "");
	 Assert.assertTrue(AN_1.toString().equals(AN_C1.toString()));	

  }

@Test
  public void Zstatic_Validation_A2_Collections_LVNV_FUNDING_Highest_Balance() {
	  
		String HB = driver.findElement(By.xpath(".//*[@id='credit-report']/section[1]/div[12]/section/div[1]/div[1]/div[2]/span[2]")).getText();
    	   	String H_B = HB.substring(1);
	 Assert.assertTrue(H_B.equals(Util.HB_C));	

  }

@Test
  public void Zstatic_Validation_A2_Collections_LVNV_FUNDING_Creditorinfo() {
	  
		String CI = driver.findElement(By.xpath(".//*[@id='credit-report']/section[1]/div[12]/section/div[1]/div[1]/div[3]/span[2]")).getText();
	 Assert.assertTrue(CI.equals(Util.CI_C));	

  }

@Test
  public void Zstatic_Validation_A2_Collections_LVNV_FUNDING_Balance() {
	  
		String LVNVFUNDINGBALANCE1 = driver.findElement(By.xpath(".//*[@id='credit-report']/section[1]/div[12]/div[2]/div[3]")).getText();
    	        String [] LVNVFUNDINGBalance1 = LVNVFUNDINGBALANCE1.split("\n", 2);
    	        LVNVFUNDINGBALANCE1 = LVNVFUNDINGBalance1[1].replaceAll("[$,]", "");
	 Assert.assertTrue(Integer.parseInt(LVNVFUNDINGBALANCE1) == Integer.parseInt(Util.LVNVFUNDING_BALANCE1));	

  }

@Test
  public void Zstatic_Validation_A2_Collections_Collections_LVNV_FUNDING2() {
	  
		String LVNVFUNDINGBALANCE2 = driver.findElement(By.xpath(".//*[@id='credit-report']/section[1]/div[12]/div[4]/div[3]")).getText();
    	        String [] LVNVFUNDINGBalance2 = LVNVFUNDINGBALANCE2.split("\n", 2);
    	        LVNVFUNDINGBALANCE2 = LVNVFUNDINGBalance2[1].replaceAll("[$,]", "");
	 Assert.assertTrue(Integer.parseInt(LVNVFUNDINGBALANCE2) == Integer.parseInt(Util.LVNVFUNDING_BALANCE2));	

  }

@Test
  public void Zstatic_Validation_A2_Collections_Collections_MED_DATA_SYS() {
	  
		String MEDDATASYSBALANCE = driver.findElement(By.xpath("//*[@id='credit-report']/section[1]/div[12]/div[6]/div[3]")).getText();
    	        String [] MEDDATASYSBalance = MEDDATASYSBALANCE.split("\n", 2);
    	        MEDDATASYSBALANCE = MEDDATASYSBalance[1].replaceAll("[$,]", "");
	 Assert.assertTrue(Integer.parseInt(MEDDATASYSBALANCE) == Integer.parseInt(Util.MEDDATASYS_BALANCE));	

  }

@Test
  public void Zstatic_Validation_A2_Collections_Collections_LVNV_FUNDING1() {
	  
		String LVNVFUNDINGBALANCE3 = driver.findElement(By.xpath(".//*[@id='credit-report']/section[1]/div[12]/div[8]/div[3]")).getText();
    	        String [] LVNVFUNDINGBalance3 = LVNVFUNDINGBALANCE3.split("\n", 2);
    	        LVNVFUNDINGBALANCE3 = LVNVFUNDINGBalance3[1].replaceAll("[$,]", "");
	 Assert.assertTrue(Integer.parseInt(LVNVFUNDINGBALANCE3) == Integer.parseInt(Util.LVNVFUNDING_BALANCE3));	

  }

@Test
  public void Zstatic_Validation_A2_Collections_Personal_Information_for_Names_Reported() {
	  
		String PINR = driver.findElement(By.xpath(".//*[@id='credit-report']/section[2]/div[2]/div[1]/div")).getText();
          	String[] PI_NR = PINR.split("\n", 3);
	 Assert.assertTrue(PI_NR[1].equals(Util.PINR_1));
	Assert.assertTrue(PI_NR[2].equals(Util.PINR_2));	

  }

@Test
  public void Static_Data_Validation_personal_Information_For_Current_Address() {
	  
		String PICA = driver.findElement(By.xpath(".//*[@id='credit-report']/section[2]/div[2]/div[2]/div[1]")).getText();
          	String[] PI_CA = PICA.split("\n", 3);
	 Assert.assertTrue(PI_CA[1].equals(Util.PICA_1));
	Assert.assertTrue(PI_CA[2].equals(Util.PICA_2));	

  }

@Test
  public void Static_Data_Validation_personal_Information_For_Previous_Address1() {
	  
		String PIPA1 = driver.findElement(By.xpath(".//*[@id='credit-report']/section[2]/div[2]/div[2]/div[2]")).getText();
          	String [] PI_PA1 = PIPA1.split("\n", 3);
	 Assert.assertTrue(PI_PA1[1].equals(Util.PIPA_1));
	Assert.assertTrue(PI_PA1[2].equals(Util.PIPA_2));	

  }


@Test
  public void Static_Data_Validation_personal_Information_For_Previous_Address2() {
	  
		String PIPA2 = driver.findElement(By.xpath(".//*[@id='credit-report']/section[2]/div[2]/div[2]/div[3]")).getText();
          	String [] PI_PA2 = PIPA2.split("\n", 3);
	 Assert.assertTrue(PI_PA2[1].equals(Util.PI_PA_1));
	Assert.assertTrue(PI_PA2[2].equals(Util.PI_PA_2));	

  }


@Test
  public void Static_Data_Validation_personal_Information_For_Current_Employer() {
	  
		String PICE = driver.findElement(By.xpath(".//*[@id='credit-report']/section[2]/div[2]/div[3]/div")).getText();
          	String[] PI_CE = PICE.split("\n", 3);
	 Assert.assertTrue(PI_CE[1].equals(Util.PICE_1));
	Assert.assertTrue(PI_CE[2].replace("\n", "").equals(Util.PICE_2));	

  }

//@Test
//  public void LVNV_FUNDING_Under_MyWallet() {
//	  
//		driver.findElement(By.xpath(".//*[@id='dashboard']/div[3]/section[1]/div[2]/div[1]")).click();
//	 	String LFBALANCE1 = driver.findElement(By.xpath(".//*[@id='dashboard']/div[3]/section[1]/div[2]/div[1]/div[4]")).getText();
//		String  LFBALANCEBal = LFBALANCE1.replaceAll("[$,]", "");
//	Assert.assertTrue(Integer.parseInt(LFBALANCEBal) == Integer.parseInt(Util.LFBALANCE_1));	
//
//  }
//
//@Test
//  public void LVNV_FUNDING_ACCOUNT_TYPE() {
//	  
//		String LFAT = driver.findElement(By.xpath(".//*[@id='dashboard-sub-page']/div/div/div/section[1]/div[3]/div[1]/div[1]/span[2]")).getText();
//	Assert.assertTrue(LFAT.equals(Util.LFA_T));	
//
//  }
//
//@Test
//  public void LVNV_FUNDING_Date_Opened() {
//	  
//		String LFDO = driver.findElement(By.xpath(".//*[@id='dashboard-sub-page']/div/div/div/section[1]/div[3]/div[1]/div[2]/span[2]")).getText();
//	Assert.assertTrue(LFDO.equals(Util.LFD_O));	
//
//  }
//
////@Test
////  public void LVNV_FUNDING_Original_Creditor() {
////	  
////		String LFOC = driver.findElement(By.xpath(".//*[@id='dashboard-sub-page']/div/div/div/section[1]/div[3]/div[2]/div[2]/span[2]")).getText();
////	
////
////  }
//
//
//
//
//
//@Test
//  public void MED_DATA_SYS() {
//	  
//		String MDSBALANCE = driver.findElement(By.xpath(".//*[@id='dashboard']/div[3]/section[1]/div[2]/div[3]/div[4]")).getText();
//	        String  MDSBalance = MDSBALANCE.replaceAll("[$]", "");
//	Assert.assertTrue(Integer.parseInt(MDSBalance) == Integer.parseInt(Util.MDS_BALANCE));	
//
//  }
//
//@Test
//  public void LVNV_FUNDING() {
//	  
//		String NAVYFCU = driver.findElement(By.xpath(".//*[@id='dashboard']/div[3]/section[1]/div[3]/div[1]/div[4]")).getText();
//                String  NFBalance = NAVYFCU.replaceAll("[$,]", "");
//	Assert.assertTrue(Integer.parseInt(NFBalance) == Integer.parseInt(Util.NFBalance_1));	
//
//  }
//
//
//@Test
//  public void MIL_STAR() {
//	  
//		String MILSTAR = driver.findElement(By.xpath(".//*[@id='dashboard']/div[3]/section[1]/div[3]/div[2]/div[4]")).getText();
//		String  MSBalance = MILSTAR.replaceAll("[$,]", "");
//	Assert.assertTrue(Integer.parseInt(MSBalance) == Integer.parseInt(Util.MS_Balance));	
//
//  }
//
//
//@Test
//  public void BK_OF_AMER() {
//	  
//		String BKOFAMER = driver.findElement(By.xpath(".//*[@id='dashboard']/div[3]/section[1]/div[4]/div/div[4]")).getText();
//		String  BOABalance = BKOFAMER.replaceAll("[$,]", "");
//	Assert.assertTrue(Integer.parseInt(BOABalance) == Integer.parseInt(Util.BOA_Balance));	
//
//  }
//
//@Test
//  public void CAR_LOAN_NAVY_FCU() {
//	  
//		String CRLNF1 = driver.findElement(By.xpath(".//*[@id='dashboard']/div[3]/section[1]/div[5]/div[1]/div[4]")).getText();
//		String  CRLNF1Balance = CRLNF1.replaceAll("[$,]", "");
//	Assert.assertTrue(Integer.parseInt(CRLNF1Balance) == Integer.parseInt(Util.CRLNF1_Balance));	
//
//  }
//
//@Test
//  public void CAR_LOAN_NAVY_FCU1() {
//	  
//		String CRLNF2 = driver.findElement(By.xpath(".//*[@id='dashboard']/div[3]/section[1]/div[5]/div[2]/div[4]")).getText();
//		String  CRLNF2Balance = CRLNF2.replaceAll("[$,]", "");
//	Assert.assertTrue(Integer.parseInt(CRLNF2Balance) == Integer.parseInt(Util.CRLNF2_Balance));	
//
//  }
//
//@Test
//  public void SECURED_NAVY_FCU() {
//	  
//		String SNF = driver.findElement(By.xpath(".//*[@id='dashboard']/div[3]/section[1]/div[6]/div/div[4]")).getText();
//		String  SNFBalance = SNF.replaceAll("[$,]", "");
//	Assert.assertTrue(Integer.parseInt(SNFBalance) == Integer.parseInt(Util.SNF_Balance));	
//
//  }
//
//@Test
//  public void LINE_OF_CREDIT_BENFCL_HFC() {
//	  
//		String LCBF = driver.findElement(By.xpath(".//*[@id='dashboard']/div[3]/section[1]/div[7]/div[1]/div[4]")).getText();
//		String  LCBFBalance = LCBF.replaceAll("[$,]", "");
//	Assert.assertTrue(Integer.parseInt(LCBFBalance) == Integer.parseInt(Util.LCBF_Balance));	
//
//  }
//
//@Test
//  public void LINE_OF_CREDIT_NAVY_FCU() {
//	  
//		String LCNF = driver.findElement(By.xpath(".//*[@id='dashboard']/div[3]/section[1]/div[7]/div[2]/div[4]")).getText();
//		String  LCNFBalance = LCNF.replaceAll("[$,]", "");
//	Assert.assertTrue(Integer.parseInt(LCNFBalance) == Integer.parseInt(Util.LCNF_Balance));	
//
//  }




  @BeforeTest
  public void beforeTest() throws Exception {
	  driver = new FirefoxDriver();
	 
	  
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
	    Thread.sleep(20000);
	    
	    //Navigate to CreditReport
	    String CreditReporturl = "https://efdevhub.info/home/credit-report";
	    driver.navigate().to(CreditReporturl);
	    Thread.sleep(25000);
  }

  @AfterTest
  public void afterTest() {
	  //driver.quit();
  }

}
