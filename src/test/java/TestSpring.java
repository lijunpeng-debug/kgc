import cn.kgc.spring.impl.A4;
import cn.kgc.spring.impl.Gray;
import cn.kgc.spring.print.Print;
import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * Created with IDEA
 * author:bdqn kgc zhou qi chao
 * Date:2019/9/2
 * Time:15:06
 */
public class TestSpring {
    /*@Test
    public void test01(){
        Print print = new Print();

        print.setInkBox(new Gray());
        print.setPaper(new A4());

        print.show();
    }*/

    @Test
    public void test02(){
        ApplicationContext ioc = new ClassPathXmlApplicationContext("config/applicationContext.xml");
        Print bean = ioc.getBean(Print.class);
        bean.show();

    }
}
