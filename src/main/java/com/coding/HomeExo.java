package com.coding;

import java.util.ArrayList;
import java.util.List;

/**
 * @author oussama
 * 
 *
 */
public class HomeExo {

	// Fonction principale
	
	/**
	 * @param  nums  contient 
	 * @param  limit est la taille de sous partition
	 * @return list des sous partition
	 */
	public static List<List<Integer>> partitition(List<Integer> nums, final int limit) {
		List<List<Integer>> listPartitions = new ArrayList<List<Integer>>();
		for (int i = 0; i < nums.size(); i = i + limit) {
			List<Integer> sousList = nums.subList(i, nums.size());
			if (i + limit < nums.size()) {
				sousList = nums.subList(i, i + limit);
			}
			listPartitions.add(sousList);
		}
		return listPartitions;
	}
}
