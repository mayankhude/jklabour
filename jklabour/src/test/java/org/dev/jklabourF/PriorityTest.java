package org.dev.jklabourF;

import org.testng.annotations.Test;

public class PriorityTest {
	@Test(priority = 1)
	public void test1() {
		System.out.println(" test1  successfully complete");
	}

	@Test(priority = 3)
	public void test2() {
		System.out.println(" test2  successfully complete");
	}

	@Test(priority = 0)
	public void test3() {
		System.out.println(" test3 successfully complete");
	}

}
