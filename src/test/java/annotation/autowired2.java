package annotation;

import com.annotation.autowired2.BeanInvoker;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.BlockJUnit4ClassRunner;

/**
 * Created by Rain on 2017/1/6.
 */
@RunWith(BlockJUnit4ClassRunner.class)
public class autowired2 extends UnitTestBase {
    public autowired2() {
        super("classpath:annotation-autowired2.xml");
    }

    @Test
    public void testSay() {
        BeanInvoker beanInvoker = super.getBean("beanInvoker");
        beanInvoker.say();
    }

}
