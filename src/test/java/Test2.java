import com.ltx.test2.OneInterface;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.BlockJUnit4ClassRunner;

/**
 * Created by Rain on 2017/1/5.
 */
@RunWith(BlockJUnit4ClassRunner.class)
public class Test2 extends UnitTestBase {

    public Test2() {
        super("classpath*:beans.xml");
    }

    @Test
    public void testHello() {
        OneInterface oneInterface = super.getBean("oneInterface");
        System.out.printf(oneInterface.hello("我的输出"));
    }


}
