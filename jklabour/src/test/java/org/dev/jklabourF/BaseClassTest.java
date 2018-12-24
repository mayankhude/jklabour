package org.dev.jklabourF;

import java.io.IOException;

import org.dev.jklabour.commonLibS.BaseClass1;
import org.dev.jklabour.commonLibS.FileSet;
import org.testng.annotations.Test;

public class BaseClassTest extends BaseClass1 {

	@Test
	public void test1() throws IOException, Throwable {
		String d = "Samba";
		String p = "ALC";

		FileSet.setExcelData("./excel/data.xlsx", "dist", 1, 1, d);

		FileSet.setExcelData("./excel/data.xlsx", "person", 1, 1, p);

	}

	@Test
	public void test3() throws IOException, Throwable {
		String d = "Jammu";
		String p = "sc";

		FileSet.setExcelData("./excel/data.xlsx", "dist", 1, 1, d);

		FileSet.setExcelData("./excel/data.xlsx", "person", 1, 1, p);

	}

	@Test
	public void test4() throws IOException, Throwable {
		String d = "Jammu";
		String p = "sc";

		FileSet.setExcelData("./excel/data.xlsx", "dist", 1, 1, d);

		FileSet.setExcelData("./excel/data.xlsx", "person", 1, 1, p);

	}

}
