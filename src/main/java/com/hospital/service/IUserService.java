package com.hospital.service;

import com.hospital.model.User;

public interface IUserService {

	public Integer saveUser(User user);
	public User findByUsername(String username);
}
