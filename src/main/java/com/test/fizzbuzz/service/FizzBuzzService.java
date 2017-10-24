package com.test.fizzbuzz.service;

import java.util.List;
import java.util.stream.IntStream;
import org.springframework.stereotype.Service;
import com.test.fizzbuzz.model.FizzBuzz;

@Service
public class FizzBuzzService {

	public FizzBuzz getFizzBuzzGroup(Integer limit) {		
		FizzBuzz fizBuzz=new FizzBuzz();
		List<Integer> fizzList = fizBuzz.getFizzList();
		List<Integer> buzzList=fizBuzz.getBuzzList();
		List<Integer> fizzBuzzList=fizBuzz.getFizzBuzzList();
		
		// Using Streams introduced by Java 8
		IntStream.rangeClosed(1, limit)
		.mapToObj(i -> i % 3 == 0 ? (i % 5 == 0 ? fizzBuzzList.add(i) : fizzList.add(i)) : (i % 5 == 0 ? buzzList.add(i) : i)).count();
		
		fizBuzz.setFizzList(fizzList);
		fizBuzz.setBuzzList(buzzList);
		fizBuzz.setFizzBuzzList(fizzBuzzList);
		return fizBuzz;
	}

}
