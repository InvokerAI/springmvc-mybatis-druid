package cn.javaxx.test;

import org.junit.Before;
import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import cn.javaxxw.service.UserService;

public class UserTest {
	
	private UserService userService;
	
	@Before
    public void before(){                                                                   
        @SuppressWarnings("resource")
        ApplicationContext context = new ClassPathXmlApplicationContext(new String[]{"classpath:applicationContext.xml"
                ,"classpath:applicationContext-mybatis.xml"});
        userService = (UserService) context.getBean("userService");
    }
	
	@Test
    public void addUser(){
        System.out.println(userService.addUser("tuyong", "trazen", "1", 18));
    }
	
	
	
	

}
