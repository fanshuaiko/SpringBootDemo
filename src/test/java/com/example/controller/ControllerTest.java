package com.example.controller;


import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.web.servlet.AutoConfigureMockMvc;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;
import org.springframework.test.web.servlet.MockMvc;
import org.springframework.test.web.servlet.request.MockMvcRequestBuilders;
import org.springframework.test.web.servlet.result.MockMvcResultMatchers;
/**
 * 对controller中的api进行测试
 * @author fan
 * 创建时间：2018年6月20日
 */
@RunWith(SpringRunner.class)
@SpringBootTest
@AutoConfigureMockMvc
public class ControllerTest {

	@Autowired
	private MockMvc mockMvc;
	/**
	 * 测试访问路径为/controller/studentProperty
	 */
	@Test
	public void studentProperty() {
			try {
				mockMvc.perform(MockMvcRequestBuilders.get("/controller/studentProperty")) //根据实际使用get、post、put等
				.andExpect(MockMvcResultMatchers.status().isOk()) //对返回的状态码进行判断，如果返回的是200则成功
				.andExpect(MockMvcResultMatchers.content().string("张三:25")); //对返回的内容进行判断
			} catch (Exception e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
	}
	/**
	 * 测试访问路径为/controller/findById/1
	 */
	@Test
	public void findById() {
		try {
			mockMvc.perform(MockMvcRequestBuilders.get("/controller/findById/1")).andExpect(MockMvcResultMatchers.status().isOk());
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

}
