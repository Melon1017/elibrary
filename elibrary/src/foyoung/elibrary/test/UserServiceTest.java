package foyoung.elibrary.test;

import static org.junit.Assert.fail;

import org.junit.Before;
import org.junit.Test;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import foyuang.elibrary.entity.User;
import foyuang.elibrary.service.UserService;

public class UserServiceTest {
    UserService userService;
	@Before 
	public void init() {
		ClassPathXmlApplicationContext ctx = 
				 new ClassPathXmlApplicationContext("applicationContext.xml"); 
		userService=(UserService) ctx.getBean("userService");
	}
	@Test
	public void testRegist() {
		User user=new User();
		user.setName("xing");
		user.setPassword("12345678");
		user.setEmail("1151283452@qq.com");
		userService.regist(user);
	}

}
