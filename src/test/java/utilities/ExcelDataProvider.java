package utilities;

import java.io.IOException;
import org.testng.annotations.DataProvider;

public class ExcelDataProvider {

	@DataProvider(name = "LoginData")
	public static Object[][] Readexcelvalue() throws IOException {
		Object[][] data = ReadInputfromExcel.ReadvaluesfromExcel("TestData/UserData", "LoginData");
		return data;
	}
}
