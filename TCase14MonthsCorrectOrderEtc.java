import static org.junit.Assert.*;

import org.junit.AfterClass;
import org.junit.BeforeClass;
import org.junit.Test;


// This test case checks if the combobox for birth month has totally correct elements,
// including their order

// EXPECTED RESULT: Order of months is correct, spelling is correct
// Pass/fail: pass

public class TCase14MonthsCorrectOrderEtc {

	@BeforeClass
	public static void setUpBeforeClass() throws Exception {
	}

	@AfterClass
	public static void tearDownAfterClass() throws Exception {
		CommonMethods.driver.quit();
	}

	@Test
	public void test() {
		
		CommonMethods.openPageSelectRussianAndClickRegister();
		int [] i = new int [13];
		
		for (int p=0; p < 13; p++){
			i[p] = p;
		}
		
		String [] months = new String [13];
		
		months[0] = "�����";
		months[1] = "������";
		months[2] = "�������";
		months[3] = "�����";
		months[4] = "������";
		months[5] = "���";
		months[6] = "����";
		months[7] = "����";
		months[8] = "�������";
		months[9] = "��������";
		months[10] = "�������";
		months[11] = "������";		
		months[12] = "�������";
		
		boolean correct = true;
		
		for (int p=0; p < 13; p++){
			
			if (!CommonMethods.getElement(p, CommonMethods.ID_MONTH_OF_BIRTH_REG).equals(months[p])){
				correct = false;
			}
		}
		
		assertTrue(correct);
		
	}
}
