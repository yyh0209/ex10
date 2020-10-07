package kr.itedu.ex10.test;

import static org.junit.jupiter.api.Assertions.*;

import javax.management.Query;

import org.junit.Assert;
import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import kr.itedu.ex10.Calc;

class CalcTest {
	
	@Test
	void test() {
		int n1 = 2;
		int n2 = 4;
		//6
		Calc calc = new Calc();
		Assert.assertEquals(n1+n2, calc.sum(n1, n2));
		
		n1=5;
		n2=4;	
		Assert.assertEquals(n1+n2, calc.sum(n1, n2)); //9:
		n1=6;
		n2=20;	
		Assert.assertEquals(n1+n2, calc.sum(n1, n2));
		// 테스트주도개발기법.
	}
}
