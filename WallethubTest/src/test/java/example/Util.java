package example;
import java.io.File;
// Needed to make Selenium work with Excel
import jxl.Cell;
import jxl.Sheet;
import jxl.Workbook;

/*
 * Declare some common parameters for scripts
 * You can change them to adapt your environment
 *
 */

public class Util {
	
    // You can change the information of your data file here
    public static final String FILE_PATH = "testData.xls"; // File Path
    public static final String SHEET_NAME1 = "Data"; // Sheet name
    public static final String SHEET_NAME2 = "Test_data";
    public static final String SHEET_NAME3 = "Test_dataMywallet";// Sheet name
    public static final String SHEET_NAME4 = "Test_dataCollections";// Sheet name
    public static final String SHEET_NAME5 = "Test_dataPublicRecords";// Sheet name
    public static final String SHEET_NAME6 = "Test_dataCreditInquries";// Sheet name
    public static final String SHEET_NAME7 = "Test_dataPersonalInformation";// Sheet name
    public static final String TABLE_NAME = "testData"; // Name of data table
    public static final String TABLE_NAME2 = "test_Data";
    public static final String TABLE_NAME3 = "test";
    public static final String TABLE_NAME4 = "test_collections";
    public static final String TABLE_NAME5 = "test_PublicRecords";
    public static final String TABLE_NAME6 = "test_CI";
    public static final String TABLE_NAME7 = "test_PI";
    public static final int WAIT_TIME = 60; // Delay time to wait the website
					    // launch completely
    public static final String BASE_URL = "https://efdevhub.info/join/login";



    /* You can change the Path of FireFox base on your environment here */
    //public static final String FIREFOX_PATH = "D:\\Software's\\Firefox\\firefox-sdk\\bin\\firefox.exe";
    public static String Open_Accounts; 
    public static String Credit_Inquires;
    public static String collections;
    public static String Public_Records;
    public static String NAVYFCU_BALANCE;
    public static String MILSTAR_BALANCE;
    public static String BKOFAMER_BALANCE;
    public static String NAVYFCU1_BALANCE;
    public static String CARLOANNAVYFCU_Balance2;
    public static String SECUREDNAVYFCU_Balance;
    public static String BENFCLHFCU_BALANCE;
    public static String LINEOFCREDITNAVYFCU_BALANCE;
    public static String LVNVFUNDING_BALANCE1;
    public static String MEDDATASYS_BALANCE;
    public static String LVNVFUNDING_BALANCE3;
    public static String LVNVFUNDING_BALANCE2;
    public static String TAXLIENRecoderOfDeeds_AMOUNT;
    public static String QUICKENLOAN_TYPE;
    public static String BRCLYSBANKDE_TYPE;

    public static String LFBALANCE_1;
    public static String LFBALANCE_2;
    public static String MDS_BALANCE;
    public static String LFBALANCE_3;
    public static String NFBalance_1;
    public static String MS_Balance;
    public static String BOA_Balance;
    public static String CRLNF1_Balance;
    public static String CRLNF2_Balance;
    public static String SNF_Balance;
    public static String LCBF_Balance;
    public static String LCNF_Balance;
    public static String LFA_T;
    public static String LFD_O;
    public static String LFO_C;
    public static String A_N;
    public static String H_B;
    public static String LFC_I;
    public static String Re_s;
    public static String LFA_D;
    public static String A_C;
    public static String Re_m;    
    public static String Name_Address;
    public static String Name_Address_1;
    public static String CC_NAVYFCUstatus;
    public static String AC_no;
    public static String DO_1;
    public static String A_T;
    public static String CL_1;
    public static String HB_1;
    public static String RES_1;
    public static String A_D;
    public static String REM_1;
    public static String C_I;
    public static String L_R;
    public static String A_P_D;
    public static String PH_1;
    public static String DO_C;
    public static String LR_C;
    public static String OC_C;
    public static String Res_C;
    public static String AD_C;
    public static String AC_C;
    public static String Rem_C;
    public static String AN_C;
    public static String HB_C;
    public static String CI_C;
    public static String R_T;
    
    //Declaration of Varialbles for Creditreport_PublicRecords
    public static String TLRD_A;
    public static String TLRD_S;
    public static String TLRDD_F;
    public static String TLRDC_D;
    public static String TLRDR_N;
    public static String TLRD_C; 
    public static String TLRDD_C;
    
    //Declaration of Variables for Creditreport_Credit Inquiries
    public static String INQL_T;
    public static String INQL_D;
    public static String INQL_ERD;
    public static String INQL_ICD;
    public static String INBT;
    
    //Declaration of Variables for Creditreport_Personal Information
    public static String PINR_1;
    public static String PINR_2;
    public static String PICA_1;
    public static String PICA_2;
    public static String PIPA_1;
    public static String PIPA_2;
    public static String PI_PA_1;
    public static String PI_PA_2;
    public static String PICE_1;
    public static String PICE_2;


    /**
	 * This method reads the data from the Sheet name "Data" of file
	 * "testData.xls"
	 * 
	 * 
	 * @param xlFilePath
	 *            : Path of excel file
	 * @param sheetName
	 *            : Sheet name which contains test data
	 * @param tableName
	 *            : Table name is used to mark the start and end position of the
	 *            test data table. The method will find the cell which contains
	 *            the table name to find position of data table
	 * @return a 2 dimensions array to store all the test data read from excel
	 * @throws Exception
	 */
    public static String[][] getDataFromExcel(String xlFilePath,
			String sheetName, String tableName) throws Exception {
		// Declare a 2 dimensions array to store all the test data read from
		// excel
		String[][] tabArray = null;

		// get the workbook file. Provide the path of excel file
		Workbook workbook = Workbook.getWorkbook(new File(xlFilePath));
		// get the sheet name
		Sheet sheet = workbook.getSheet(sheetName);

		int startRow, startCol, endRow, endCol, ci, cj;

		// find cell position which contain first appear table name
		Cell tableStart = sheet.findCell(tableName);
		// Row position of FIRST appear table name
		startRow = tableStart.getRow();
		// Col position of FIRST appear table name
		startCol = tableStart.getColumn();

		// find cell position which contain last appear table name
		Cell tableEnd = sheet.findCell(tableName, startCol + 1, startRow + 1,
				100, 64000, false);
		// Row position of LAST appear table name
		endRow = tableEnd.getRow();
		// Col position of LAST appear table name
		endCol = tableEnd.getColumn();

		tabArray = new String[endRow - startRow - 1][endCol - startCol - 1];
		ci = 0;

		// Store all data in an array
		for (int i = startRow + 1; i < endRow; i++, ci++) {
			cj = 0;
			for (int j = startCol + 1; j < endCol; j++, cj++) {
				//Get content of each cell and store to each array element.
				tabArray[ci][cj] = sheet.getCell(j, i).getContents();
			}
		}

		return (tabArray);
	}


}
