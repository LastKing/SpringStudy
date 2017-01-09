package aop;

import com.aop.aspectj.biz.MoocBiz;
import com.aop.schema.advice.Fit;
import com.aop.schema.advice.biz.AspectBiz;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.BlockJUnit4ClassRunner;

/**
 * Created by Rain on 2017/1/9.
 */
@RunWith(BlockJUnit4ClassRunner.class)
public class Apectj extends UnitTestBase {

    public Apectj() {
        super("classpath:aop-aspectj.xml");
//        super("classpath:aware.xml");
    }

    @Test
    public void testSave() {
        MoocBiz moocBiz = super.getBean("moocBiz");
        moocBiz.save("this  is test ");
    }

}
