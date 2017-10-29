package com.test.fizzbuzz.service;

import java.util.LinkedList;
import java.util.stream.IntStream;
import org.springframework.stereotype.Service;
import com.test.fizzbuzz.model.FizzBuzz;

@Service
public class FizzBuzzService {

	public FizzBuzz getFizzBuzzGroup(Integer limit) {		
		FizzBuzz fizBuzz=new FizzBuzz();
		LinkedList<Integer> fizzList = fizBuzz.getFizzList();
		LinkedList<Integer> buzzList=fizBuzz.getBuzzList();
		LinkedList<Integer> fizzBuzzList=fizBuzz.getFizzBuzzList();
		
		// Using Streams introduced by Java 8
		IntStream.rangeClosed(1, limit)
		.mapToObj(i -> i % 3 == 0 ? (i % 5 == 0 ? fizzBuzzList.add(i) : fizzList.add(i)) : (i % 5 == 0 ? buzzList.add(i) : i)).count();
		
		fizBuzz.setFizzList(fizzList);
		fizBuzz.setBuzzList(buzzList);
		fizBuzz.setFizzBuzzList(fizzBuzzList);
		return fizBuzz;
	}

}
