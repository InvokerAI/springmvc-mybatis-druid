package cn.javaxxw.service;

import javax.annotation.Resource;

import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import cn.javaxxw.dao.UserMapper;
import cn.javaxxw.model.User;

@Service("userService")
public class UserService {
	
	@Resource
	private UserMapper userMapper;
	
	
	@Transactional
	public User addUser(String userName,String nickName,String sex,Integer old){
		
		User user = new User();
		user.setNickName(nickName);
		user.setUserName(userName);
		user.setOld(old);
		user.setSex(sex);
		int id = userMapper.addUser(user);
		user.setId(id);
		return user;
	}
	

}
