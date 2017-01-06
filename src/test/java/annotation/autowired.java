package annotation;

import com.annotation.autowired.InjectionService;
import com.annotation.test1.BeanAnnotation;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.BlockJUnit4ClassRunner;

/**
 * Created by Rain on 2017/1/6.
 */
@RunWith(BlockJUnit4ClassRunner.class)
public class autowired extends UnitTestBase {
    public autowired() {
        super("classpath:annotation-autowired.xml");
    }

    @Test
    public void testSay() {
        InjectionService service = super.getBean("injectionServiceImpl");
        service.save("sfa");
    }

}
