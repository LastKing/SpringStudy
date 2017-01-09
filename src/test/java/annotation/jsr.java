package annotation;

import com.annotation.jsr.JsrService;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.BlockJUnit4ClassRunner;

/**
 * Created by Rain on 2017/1/9.
 */
@RunWith(BlockJUnit4ClassRunner.class)
public class jsr extends UnitTestBase {

    public jsr() {
        super("classpath*:annotation-jsr.xml");
    }

    @Test
    public void testSave() {
        JsrService service = getBean("jsrService");
        service.save();
    }


}
