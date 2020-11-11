package com.test;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;

import java.util.Arrays;
import java.util.List;

import org.junit.BeforeClass;
import org.junit.Test;

import com.coding.HomeExo;


public class HomeExoTest {

	
	static List<Integer> listData ;
    static List<List<Integer>> partititions ;
	static int limit=0;

	@BeforeClass
	public static void setupTest() {
		    listData = Arrays.asList(1, 2, 3, 4, 5, 10, 23);

	}
	
	@Test
	public  void verifSousPartition4() {
		 limit=2;
	    	partititions = HomeExo.partitition(listData, limit);

		assertEquals(4, partititions.size());
		assertEquals(limit, partititions.get(0).size());
		assertEquals( Arrays.asList(1, 2),  partititions.get(0));
	}	
	
	
	@Test
	public  void verifSousPartition3() {
		limit=3;
		partititions = HomeExo.partitition(listData, limit);
	
		assertEquals(3, partititions.size());
		assertEquals(limit, partititions.get(0).size());
		assertEquals( Arrays.asList(1, 2, 3),  partititions.get(0));
		assertEquals( Arrays.asList(23),  partititions.get(2));
	}	
	
}
