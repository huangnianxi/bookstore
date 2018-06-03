package com.bookstore.mapper;

import org.springframework.stereotype.Repository;

import com.bookstore.entity.User;

@Repository
public interface UserMapper {
	public User getUser(String userName);

	// 插入用户
	public int insertUser(User user);
}
