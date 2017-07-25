import com.wiscloud.service.UserInfoService;
import org.junit.Before;
import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * Created by Leslie on 2017/4/9.
 */
public class UserInfoTest {
    private UserInfoService userInfoService ;

    @Before
    public void before(){
        @SuppressWarnings("resource")
        ApplicationContext context = new ClassPathXmlApplicationContext(new String[]{"classpath:spring.xml"
                ,"classpath:spring-mybatis.xml"});
        userInfoService = (UserInfoService) context.getBean("userInfoServiceImpl");
    }

    @Test
    public void findUserInfoByUserName(){
        String userName = "李雷";
        System.out.println(userInfoService.findUserInfoByUserName(userName));
    }
}
