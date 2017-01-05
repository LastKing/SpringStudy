import com.ltx.autowiring.AutoWiringService;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.BlockJUnit4ClassRunner;

/**
 * Created by Rain on 2017/1/5.
 */
@RunWith(BlockJUnit4ClassRunner.class)
public class AutoWiring extends UnitTestBase {

    public AutoWiring() {
        super("classpath:auto-wiring.xml");
    }

    @Test
    public void testSay() {
        AutoWiringService service = super.getBean("autoWiringService");
        service.say();
    }

}