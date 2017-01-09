package aop;

import com.aop.schema.advice.biz.AspectBiz;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.BlockJUnit4ClassRunner;

/**
 * Created by Rain on 2017/1/9.
 */
@RunWith(BlockJUnit4ClassRunner.class)
public class AOPSchemaAdvice extends UnitTestBase {

    public AOPSchemaAdvice() {
        super("classpath:aop-schema-advice.xml");
//        super("classpath:aware.xml");
    }

    @Test
    public void testBiz() {
        AspectBiz biz = super.getBean("aspectBiz");
        biz.biz();
    }

    @Test
    public void testInit() {
        AspectBiz biz = super.getBean("aspectBiz");
        biz.init("test", 34);
    }

}
