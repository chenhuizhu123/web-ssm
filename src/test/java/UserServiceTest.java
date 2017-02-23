import com.cvte.taskssm.dao.UserDao;
import com.cvte.taskssm.model.User;
import org.junit.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.annotation.Rollback;
import org.springframework.transaction.annotation.Transactional;

import javax.annotation.Resource;
import java.util.List;
import java.util.Map;

import static junit.framework.TestCase.assertTrue;

/**
 * Created by cvter on 2017/2/21.
 */
public class UserServiceTest extends BaseJunit4Test {

    @Autowired  //自动注入,默认按名称
    UserDao userDao;

    @Test   //标明是测试方法
    @Transactional   //标明此方法需使用事务
    @Rollback(false)  //标明使用完此方法后事务不回滚,true时为回滚
    public void testSelect( ) {
//        String sql="insert into user(name,password) values(?,?)";
//        Object[] objs=new Object[]{"00","000"};
//        userDao.insert( sql , objs );

        List<User> list=userDao.selectAllUser();
        System.out.println("list: "+list);
        assertTrue(list.size( )>0);
    }

}


