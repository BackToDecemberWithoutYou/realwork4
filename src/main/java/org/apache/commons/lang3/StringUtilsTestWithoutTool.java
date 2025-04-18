package org.apache.commons.lang3;

public class StringUtilsTestWithoutTool {
    public static void main(String[] args) {
        // 测试 isEmpty 方法
        testIsEmpty();
        // 测试 isBlank 方法
        testIsBlank();
        // 测试注入错误的 equals 方法
        //testEquals();
        // 测试 reverse 方法
        testReverse();
    }

    public static void testIsEmpty() {
        boolean result1 = StringUtils.isEmpty(null);
        boolean result2 = StringUtils.isEmpty("");
        boolean result3 = StringUtils.isEmpty("hello");

        if (result1 && result2 && !result3) {
            System.out.println("isEmpty 方法测试通过");
        } else {
            System.out.println("isEmpty 方法测试失败");
        }
    }

    public static void testIsBlank() {
        boolean result1 = StringUtils.isBlank(null);
        boolean result2 = StringUtils.isBlank("");
        boolean result3 = StringUtils.isBlank("   ");
        boolean result4 = StringUtils.isBlank("hello");

        if (result1 && result2 && result3 && !result4) {
            System.out.println("isBlank 方法测试通过");
        } else {
            System.out.println("isBlank 方法测试失败");
        }
    }

    public static void testEquals() {
        boolean result1 = StringUtils.equals("hello", "hello");
        boolean result2 = StringUtils.equals("hello", "world");
        boolean result3 = StringUtils.equals(null, null);
        boolean result4 = StringUtils.equals(null, "hello");
        boolean result5 = StringUtils.equals("hello", null);

        if (result1 && !result2 && result3 && !result4 && !result5) {
            System.out.println("equals 方法测试通过");
        } else {
            System.out.println("equals 方法测试失败");
        }
    }

    public static void testReverse() {
        String result1 = StringUtils.reverse("hello");
        String result2 = StringUtils.reverse("");
        String result3 = StringUtils.reverse(null);

        if ("olleh".equals(result1) && "".equals(result2) && result3 == null) {
            System.out.println("reverse 方法测试通过");
        } else {
            System.out.println("reverse 方法测试失败");
        }
    }
}
