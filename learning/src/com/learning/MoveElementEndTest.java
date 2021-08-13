package com.learning;

import static org.junit.jupiter.api.Assertions.*;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import org.junit.jupiter.api.Test;

class MoveElementEndTest {

	@Test
	void test1() {
		int toMove = 2;
		MoveElementEnd mE = new MoveElementEnd();
		int[] array = {2,1,2,2,2,3,4,2};
		
		int[] outputArray = mE.moveEle(array,toMove);
		int len = outputArray.length -1;
		int[] expectedArray =  {4,1,3,2,2,2,2,2};
		assertTrue(outputArray[len] == expectedArray[len]);
	}
	

}
