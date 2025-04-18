package org.apache.commons.lang3;

class StringUtilsTest {

    // 测试 isEmpty()
    public void testIsEmpty() {
        boolean result1 = StringUtils.isEmpty(null);
        boolean result2 = StringUtils.isEmpty("");
        boolean result3 = StringUtils.isEmpty("hello");

        if (!result1 ||!result2 || result3) {
            System.out.println("testIsEmpty 测试失败");
        } else {
            System.out.println("testIsEmpty 测试通过");
        }
    }

    // 测试 isBlank()
    public void testIsBlank() {
        boolean result1 = StringUtils.isBlank(null);
        boolean result2 = StringUtils.isBlank("");
        boolean result3 = StringUtils.isBlank("   ");
        boolean result4 = StringUtils.isBlank("hello");

        if (!result1 ||!result2 ||!result3 || result4) {
            System.out.println("testIsBlank 测试失败");
        } else {
            System.out.println("testIsBlank 测试通过");
        }
    }

    // 测试 equals()
    public void testEquals() {
        boolean result1 = StringUtils.equals("hello", "hello");
        boolean result2 = StringUtils.equals("hello", "world");
        boolean result3 = StringUtils.equals(null, null);
        boolean result4 = StringUtils.equals(null, "hello");
        boolean result5 = StringUtils.equals("hello", null);

        if (!result1 || result2 ||!result3 || result4 || result5) {
            System.out.println("testEquals 测试失败");
        } else {
            System.out.println("testEquals 测试通过");
        }
    }

    // 测试 reverse()
    public void testReverse() {
        String result1 = StringUtils.reverse("hello");
        String result2 = StringUtils.reverse("");
        String result3 = StringUtils.reverse(null);

        if (!"olleh".equals(result1) ||!"".equals(result2) || result3 != null) {
            System.out.println("testReverse 测试失败");
        } else {
            System.out.println("testReverse 测试通过");
        }
    }

    public static void main(String[] args) {
        StringUtilsTest test = new StringUtilsTest();
        test.testIsEmpty();
        test.testIsBlank();
        test.testEquals();
        test.testReverse();
    }
}