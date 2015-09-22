package MainPackage;

import static org.junit.Assert.*;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;

public class AccountTest {
	
	private static Account myAccount;

	@BeforeClass
	public static void setUpBeforeClass() throws Exception {
		myAccount = new Account(1122, 20000);
	}

	@AfterClass
	public static void tearDownAfterClass() throws Exception {
	}

	@Before
	public void setUp() throws Exception {

	}

	@After
	public void tearDown() throws Exception {
	}

	@Test
	public void test() {
		assert (myAccount.getId() == 1122);
		assert (myAccount.getBalance() == 20000);
	}

}
