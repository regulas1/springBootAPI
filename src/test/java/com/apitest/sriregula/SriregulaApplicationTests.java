package com.apitest.sriregula;

import org.junit.jupiter.api.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.web.servlet.AutoConfigureMockMvc;
import org.springframework.boot.test.autoconfigure.web.servlet.WebMvcTest;
import org.springframework.test.context.junit4.SpringRunner;
import org.springframework.test.web.servlet.MockMvc;
import org.springframework.test.web.servlet.MvcResult;
import org.springframework.test.web.servlet.RequestBuilder;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.get;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.content;

@WebMvcTest(MyController.class)
//@ComponentScan("UserService")
@RunWith(SpringRunner.class)

@AutoConfigureMockMvc

class SriregulaApplicationTests {
	@Autowired
	private MockMvc mvc;



	@Test
	void homeTest()  throws Exception{
		RequestBuilder request = get("/");
		MvcResult result = mvc.perform(request).andReturn();
		assertEquals("Test Home Page",result.getResponse().getContentAsString());
	}
//Unit test passed as string -- unable to run as an array as the parsing is failing and keeps coming as null
	@Test
	void userTest() throws Exception{
		mvc.perform(get("/getusercontacts")).andExpect(content().string("[{\"id\":2,\"email\":\"Shanna@melissa.tv\",\"phone\":\"010-692-6593 x09125\"}]"));
	}
//
//	@Test
//	void userTest2() throws Exception{
//		mvc.perform(get("https://jsonplaceholder.typicode.com/users?id=2")).andExpect(content().string("[{\"id\":2,\"email\":\"Shanna@melissa.tv\",\"phone\":\"010-692-6593 x09125\"}]"));
//	}
//	@Test
//	public void getuserIds(){
//		int userId = given().
//				baseUri("https://jsonplaceholder.typicode.com").
//				contentType("application/json").
//		when().
//				get("/users?id=2").
//		then().
//				extract().
//				response().
//				path("userId");
//		Assert.assertEquals(userId,2);
}









