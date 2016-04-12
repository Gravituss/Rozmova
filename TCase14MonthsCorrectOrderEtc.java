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
		
		months[0] = "мес€ц";
		months[1] = "€нвар€";
		months[2] = "феврал€";
		months[3] = "марта";
		months[4] = "апрел€";
		months[5] = "ма€";
		months[6] = "июн€";
		months[7] = "июл€";
		months[8] = "августа";
		months[9] = "сент€бр€";
		months[10] = "окт€бр€";
		months[11] = "но€бр€";		
		months[12] = "декабр€";
		
		boolean correct = true;
		
		for (int p=0; p < 13; p++){
			
			if (!CommonMethods.getElement(p, CommonMethods.ID_MONTH_OF_BIRTH_REG).equals(months[p])){
				correct = false;
			}
		}
		
		assertTrue(correct);
		
	}
}
