package com.cvte.taskssm.service;

import com.cvte.taskssm.model.User;

import java.util.List;

/**
 * Created by cvter on 2017/2/21.
 */
public interface UserService {

    List<User> getAllUser();

    User getUserByPhoneOrEmail(String emailOrPhone, Short state);

    User getUserById(Long userId);

    User login(String username, String password);

    void updateExperience(User user);
}
