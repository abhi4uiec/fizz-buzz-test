package com.test.fizzbuzz.fizzbuzztest;

import static org.junit.Assert.assertEquals;
import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.Mockito;
import org.mockito.MockitoAnnotations;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.test.context.junit4.SpringRunner;
import org.springframework.test.web.servlet.MockMvc;
import org.springframework.test.web.servlet.MvcResult;
import org.springframework.test.web.servlet.RequestBuilder;
import org.springframework.test.web.servlet.request.MockMvcRequestBuilders;
import org.springframework.test.web.servlet.setup.MockMvcBuilders;
import org.springframework.web.context.WebApplicationContext;

@RunWith(SpringRunner.class)
@SpringBootTest
public class FizzBuzzControllerTests {

	@Autowired
	WebApplicationContext context;

	private MockMvc mockMvc;

	@Before
	public void initTests() {
		MockitoAnnotations.initMocks(this);
		mockMvc = MockMvcBuilders.webAppContextSetup(context).build();
	}

	@Test
	public void testFizzBuzzSuccess() throws Exception
	{
		RequestBuilder requestBuilder = MockMvcRequestBuilders.get("/fizzbuzz/"+Mockito.anyInt()).accept(MediaType.APPLICATION_JSON);

		MvcResult result = mockMvc.perform(requestBuilder).andReturn();

		assertEquals(result.getResponse().getStatus(), HttpStatus.OK.value());
	}

	@Test
	public void testFizzBuzzFailure() throws Exception
	{
		RequestBuilder requestBuilder = MockMvcRequestBuilders.get("/fizzbuzz/invalid").accept(MediaType.APPLICATION_JSON);

		MvcResult result = mockMvc.perform(requestBuilder).andReturn();

		assertEquals(result.getResponse().getStatus(), HttpStatus.BAD_REQUEST.value());
	}

}
