package annotation;

import com.annotation.bean.StoreConfig;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.BlockJUnit4ClassRunner;

/**
 * Created by Rain on 2017/1/6.
 */
@RunWith(BlockJUnit4ClassRunner.class)
public class bean extends UnitTestBase {
    public bean() {
        super("classpath:annotation-bean.xml");
    }

    @Test
    public void testSay() {
        StoreConfig store = super.getBean("getStringStore");
        System.out.println(store.getClass().getName());
    }

}
