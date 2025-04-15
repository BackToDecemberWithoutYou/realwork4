import org.apache.commons.lang3.StringUtils;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;


public class StringUtilsTest {

    //测试 isEmpty()
    @Test
    public void testIsEmpty() {
        assertTrue(StringUtils.isEmpty(null));
        assertTrue(StringUtils.isEmpty(""));
        assertFalse(StringUtils.isEmpty("hello"));
    }

    //测试 isBlank()
    @Test
    public void testIsBlank() {
        assertTrue(StringUtils.isBlank(null));
        assertTrue(StringUtils.isBlank(""));
        assertTrue(StringUtils.isBlank("   "));
        assertFalse(StringUtils.isBlank("hello"));
    }

    //测试 equals()   已经注入了缺陷！！！
    @Test
    public void testEquals() {
        assertTrue(StringUtils.equals("hello", "hello"));
        assertFalse(StringUtils.equals("hello", "world"));
        assertTrue(StringUtils.equals(null, null));
        assertFalse(StringUtils.equals(null, "hello"));
        assertFalse(StringUtils.equals("hello", null));
    }

    @Test
    public void testReverse() {
        assertEquals("olleh", StringUtils.reverse("hello"));
        assertEquals("", StringUtils.reverse(""));
        assertEquals(null, StringUtils.reverse(null));
    }
}
