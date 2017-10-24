package com.test.fizzbuzz.controller;

import javax.inject.Inject;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.bind.annotation.RestController;

import com.test.fizzbuzz.model.FizzBuzz;
import com.test.fizzbuzz.service.FizzBuzzService;

import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import io.swagger.annotations.ApiParam;

@RestController
@Api(tags = {"fizzbuzz"})
public class FizzBuzzController {

	@Inject
	private FizzBuzzService fizzBuzzService;

	@RequestMapping(value = "/fizzbuzz/{limit}",
			method = RequestMethod.GET,
			produces = {"application/json"})
	@ResponseStatus(HttpStatus.OK)
	@ApiOperation(value = "Fizzbuzz as a web service", notes = "This service should consume an upper boundry as a path parameter, and determine which numbers would print \"Fizz\", \"Buzz\", and \"FizzBuzz\"")
	public @ResponseBody FizzBuzz getFizzBuzzGrouped(@ApiParam(value = "Upper bound as an integer", required = true)
	@PathVariable("limit") Integer limit) throws Exception 
	{
		return fizzBuzzService.getFizzBuzzGroup(limit);

	}

}
