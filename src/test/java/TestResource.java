import com.ltx.resource.MoocResource;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.BlockJUnit4ClassRunner;

import java.io.IOException;

/**
 * Created by Rain on 2017/1/5.
 */
@RunWith(BlockJUnit4ClassRunner.class)
public class TestResource extends UnitTestBase {
    public TestResource() {
        super("classpath:resource.xml");
    }


    @Test
    public void testSource() throws IOException {
        MoocResource moocResource = super.getBean("moocResource");
        moocResource.source();
    }


}
