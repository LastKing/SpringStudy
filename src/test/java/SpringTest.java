import com.ltx.test2.OneInterface;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import javax.annotation.Resource;

/**
 * Created by Rain on 2017/1/11.
 */
@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(locations = "classpath:beans.xml")
public class SpringTest {
    @Resource
    private OneInterface oneInterface;

    @Test
    public void test() {
        System.out.println(oneInterface.hello("this is spring-test"));
    }
}
