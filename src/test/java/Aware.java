import com.ltx.test3.InjectionService;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.BlockJUnit4ClassRunner;

/**
 * Created by Rain on 2017/1/5.
 */
@RunWith(BlockJUnit4ClassRunner.class)
public class Aware extends UnitTestBase {

    public Aware() {
        super("classpath:aware.xml");
    }

    @Test
    public void testMoocApplicationContext() {
        System.out.println("testMoocApplicationContext : " + super.getBean("moocApplicationContext"));
    }

    @Test
    public void testMoocBeanName() {
        System.out.println("testMoocBeanName : " + super.getBean("moocBeanName").hashCode());
    }


}
