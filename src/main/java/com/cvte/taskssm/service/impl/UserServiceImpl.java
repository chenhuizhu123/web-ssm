package com.cvte.taskssm.service.impl;

import com.cvte.taskssm.dao.UserDao;
import com.cvte.taskssm.service.UserService;
import com.cvte.taskssm.model.User;
import org.springframework.cache.annotation.Cacheable;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import javax.annotation.Resource;
import java.util.List;

/**
 * Created by cvter on 2017/2/21.
 */

@Service
@Transactional(rollbackFor = Exception.class)
public class UserServiceImpl implements UserService {
    
    @Resource
    private UserDao userDao;

    public void updateExperience(User user) {
        userDao.updateExperience(user);
    }
    //@Cacheable("getUserById")
    public User getUserById(Long userId) {
        return userDao.selectUserById(userId);
    }

    public User login(String username, String password) {
        return userDao.selectUserByUserNameAndPassword(username,password);
    }

    public User getUserByPhoneOrEmail(String emailOrPhone, Short state) {
        return userDao.selectUserByPhoneOrEmail(emailOrPhone,state);
    }
    
    public List<User> getAllUser() {
        return userDao.selectAllUser();
    }
}
