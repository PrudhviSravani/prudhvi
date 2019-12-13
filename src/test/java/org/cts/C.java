package org.cts;

import org.junit.Assert;
import org.junit.Ignore;
import org.junit.Test;

public class C {
	@Test
	public void tc1() {
	Assert.assertTrue(true);
	Assert.assertTrue(true);
	Assert.assertTrue(true);
}

	@Test
	public void tc2() {
	Assert.assertTrue(true);
	Assert.assertTrue(false);
	Assert.assertTrue(true);
	}
	@Ignore
	@Test
	public void tc3() {
	Assert.assertTrue(false);
	Assert.assertTrue(true);
	Assert.assertTrue(true);
}
	}
