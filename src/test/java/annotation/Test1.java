package annotation;

import com.annotation.test1.BeanAnnotation;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.BlockJUnit4ClassRunner;

/**
 * Created by Rain on 2017/1/6.
 */
@RunWith(BlockJUnit4ClassRunner.class)
public class Test1 extends UnitTestBase {

    public Test1() {
        super("classpath:annotation-bean.xml");
    }

    @Test
    public void testSay() {
//        BeanAnnotation bean = super.getBean("beanAnnotation");
        BeanAnnotation bean = super.getBean("bean");
        bean.say("this is test");
    }

    @Test
    public void testScope() {
        BeanAnnotation bean = super.getBean("bean");

        bean.myHash();

        BeanAnnotation bean2 = super.getBean("bean");

        bean2.myHash();
    }
}
