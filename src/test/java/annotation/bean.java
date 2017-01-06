package annotation;

import com.annotation.bean.MyDriverManager;
import com.annotation.bean.Store;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.BlockJUnit4ClassRunner;

/**
 * Created by Rain on 2017/1/6.
 */
@RunWith(BlockJUnit4ClassRunner.class)
public class bean extends UnitTestBase {
    public bean() {
        super("classpath*:annotation-bean.xml");
    }

    @Test
    public void testSay() {
//        Store store = super.getBean("getStringStore");
        Store store = super.getBean("stringStore");
        System.out.println(store.getClass().getName());
    }

    @Test
    public void testManager() {
        MyDriverManager myDriverManager = super.getBean("myDriverManager");
        System.out.println(myDriverManager.getClass().getName());
    }

}
