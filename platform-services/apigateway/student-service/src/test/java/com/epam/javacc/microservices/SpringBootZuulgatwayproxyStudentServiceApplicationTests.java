package com.epam.javacc.microservices;

import io.restassured.RestAssured;
import io.restassured.response.Response;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import static junit.framework.TestCase.assertEquals;

@RunWith(SpringRunner.class)
@SpringBootTest
public class SpringBootZuulgatwayproxyStudentServiceApplicationTests {

	@Test
	public void contextLoads() {
	}

	@Test
	public void whenSendRequestToFooResource_thenOK() {
		Response response = RestAssured.get("http://localhost:8090/echoStudentName/Kate");
		assertEquals(200, response.getStatusCode());
	}

}
