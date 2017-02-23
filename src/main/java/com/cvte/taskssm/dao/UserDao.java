package com.cvte.taskssm.dao;

import com.cvte.taskssm.model.User;
import org.apache.ibatis.annotations.Param;
import org.springframework.stereotype.Repository;

import java.util.List;

/**
 * Created by cvter on 2017/2/21.
 */

@Repository
public interface UserDao {

    User selectUserById(@Param("userId") Long userId);

    User selectUserByPhoneOrEmail(@Param("emailOrPhone") String emailOrPhone, @Param("state") Short state);

    List<User> selectAllUser();

    User selectUserByUserNameAndPassword(@Param("username") String username,@Param("password") String password);

    void updateExperience(@Param("user")User user);
}
