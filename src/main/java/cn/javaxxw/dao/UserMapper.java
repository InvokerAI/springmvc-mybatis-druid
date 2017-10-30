package cn.javaxxw.dao;


import java.util.List;

import cn.javaxxw.model.User;

public interface UserMapper {
	
	int addUser(User user);
	
	List<User> selectAllUser();
	
	int deleteUserById(Integer id);

}
