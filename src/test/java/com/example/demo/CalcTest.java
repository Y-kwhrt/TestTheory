package com.example.demo;

//import static org.assertj.core.api.Assertions.assertThat;
//import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.assertj.core.api.Assertions.*;
import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;

import com.example.demo.Calc;

public class CalcTest {
	static Calc calc = null;
	@BeforeAll
	static void テスト前処理() {
	    calc = new Calc();
	}
	@Test
	void addテスト_正常() {
		// AbstractThrowableAssert
//		assertThatThrownBy(() -> {
//	}).
//		 ThrowableTypeAssert
//	    assertThatExceptionOfType(ArithmeticException.class)
//	    .isThrownBy(() -> {calc.div(5, 0);})
//	    .withMessageContaining("/ by zero");
		assertEquals(calc.add(1, 3),4);
		
		assertEquals(calc.sub(5, 2),3);
		
		assertEquals(calc.div(5, 2),2);
		
		
		
		Throwable thrown = catchThrowable(() ->{
			calc.div(4, 0);
		});
		
		
	}
	@AfterAll
	static void テスト後処理() {
	    calc = null;
	}
}
