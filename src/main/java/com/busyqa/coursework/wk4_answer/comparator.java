package com.busyqa.coursework.wk4_answer;

import java.util.Comparator;
import java.util.Map.Entry;

public class comparator implements Comparator<Entry<Integer,String>> {

	@Override
	public int compare(Entry<Integer,String> e1, Entry<Integer,String> e2) {
		// TODO Auto-generated method stub
		return e1.getKey().compareTo(e2.getKey());
		
	}

}
