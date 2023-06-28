package com.fssa.mb.day18.solved;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import com.fssa.mb.sampleprogram.day18.solved.ValidationUtil;

public class TestValidationUtil {
	
	@Test // Annotation is marker for JUNIT to run this method automatically
	public void testPostiveValidateAge() {
		Assertions.assertTrue(ValidationUtil.validateAge(9));
	}
	
	@Test
	public void testNegativeValidateAge() {
		try {
			ValidationUtil.validateAge(-9);
			Assertions.fail("ValidateAge failed");
		}
		catch(IllegalArgumentException ex) {
			Assertions.assertEquals("Invalid age", ex.getMessage());
		}
	}
	

}