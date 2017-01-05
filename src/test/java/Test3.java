import com.ltx.test3.InjectionService;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.BlockJUnit4ClassRunner;

/**
 * Created by Rain on 2017/1/5.
 */
@RunWith(BlockJUnit4ClassRunner.class)
public class Test3 extends UnitTestBase {

    public Test3() {
        super("classpath:test3-inject.xml");
    }

    @Test
    public void testSetter() {
        InjectionService service = super.getBean("injectionService");
        service.save("fds");
    }

    @Test
    public void beanSingle() {
        InjectionService service = super.getBean("injectionService");
        InjectionService service2 = super.getBean("injectionService");
        System.out.println(service == service2);
        super.getBean("injectionService");
    }

}
