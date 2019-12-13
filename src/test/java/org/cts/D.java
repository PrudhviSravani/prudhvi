package org.cts;

import org.junit.Assert;
import org.junit.Ignore;
import org.junit.Test;

public class D {
	
		@Test
		public void tc4() {
		Assert.assertTrue(true);
		Assert.assertTrue(true);
		Assert.assertTrue(true);
	}

		@Test
		public void tc5() {
		Assert.assertTrue(true);
		Assert.assertTrue(false);
		Assert.assertTrue(true);
		}
		@Ignore
		@Test
		public void tc6() {
		Assert.assertTrue(false);
		Assert.assertTrue(true);
		Assert.assertTrue(true);
	}
		}



