import org.junit.platform.suite.api.SelectClasses;
import org.junit.platform.suite.api.Suite;

@Suite
@SelectClasses({
        StringUtilsTest.class
        // 可以在这里添加其他需要包含的测试类
})
public class AllTests {
    // 这个类可以是空的，只需要注解即可
}
