package com.PSP6308;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class MathExam6308Test {

	@Test
	void testZzz() {
		MathExam6308.zzz(5);
		assertEquals(5, MathExam6308.str.length);
	}

	@Test
	void testXxx() {
		MathExam6308.xxx(5);
		assertEquals(5, MathExam6308.str.length); 
	}

	@Test
	void testTtt() {
		MathExam6308.ttt(5);
		assertEquals(5, MathExam6308.str.length);
	}

	@Test
	void testRem() {
		String[] strArr = {"1","3","+"};
		assertEquals("4", MathExam6308.rem(strArr));
	}

}
