import com.idark.service.DemoService;
import com.idark.service.impl.DemoServiceImpl;

/**
 * @description:
 * @author: Administrator
 * @create: 2018/8/3 16:31
 * @email: 43352901@qq.com
 */
public class Main {
    public static void main(String[] args) {

        //面向接口编程
        DemoService demo = new DemoServiceImpl();
        demo.say("idark");
    }
}
