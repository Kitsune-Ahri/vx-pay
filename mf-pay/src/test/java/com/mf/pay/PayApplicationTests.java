package com.mf.pay;

import com.mf.pay.dao.Category;
import com.mf.pay.dao.CategoryMapper;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

@SpringBootTest
@RunWith(SpringRunner.class)
public class PayApplicationTests {

	@Autowired
	private CategoryMapper categoryMapper;

	@Test
	public void contextLoads() {

		System.out.println("Unit Test");
		Category category = categoryMapper.findById(100007);
		System.out.println(category.toString());

	}

}
