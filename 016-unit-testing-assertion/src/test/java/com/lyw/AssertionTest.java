package com.lyw;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.*;
import org.springframework.boot.test.context.SpringBootTest;

import java.time.Duration;

@SpringBootTest
public class AssertionTest {

  @Test
  public void assertEqualsTest() {
    int a = 4;
    assertEquals(4, a, "数据不等于！");
    Object o1 = new Object();
    Object o2 = o1;
    assertSame(o1, o2, "对象不想等！");
    int[] int1 = {1, 2, 3, 4, 5, 6};
    int[] int2 = {1, 2, 3, 4, 5, 6};
    assertArrayEquals(int1, int2, "数组不想等！");
    System.out.println("变量、对象和数组相等！");
  }

  @Test
  @DisplayName("组合断言")
  public void assertCombinationTest() {
    assertAll("combination", () -> {
      int a = 123;
      assertEquals(123, a, "变量不相同！");
    },() -> {
      int[] int1 = {1, 2, 3, 4, 5, 6};
      int[] int2 = {1, 2, 3, 4, 5, 6};
      assertArrayEquals(int1, int2, "数组不想等！");
    });
  }

  @Test
  @DisplayName("超时断言")
  public void assertTimeoutTest() {
    assertTimeout(Duration.ofMillis(1000), () -> Thread.sleep(500), "超时了！");
  }

  @Test
  @DisplayName("快速失败")
  public void quickFail() {
    fail("失败了！");
  }

  @Test
  public void assumptionsTest() {
    Assumptions.assumeTrue(1 == 1, "数据不想等！");
    System.out.println("数据相同！");
  }

  @Nested
  class NestedTest {

    @BeforeEach
    public void nestBefore() {
      System.out.println("nested before is run!");
    }

    @AfterEach
    public void nestAfter() {
      System.out.println("nested after is run!");
    }

    @Test
    public void nestTest() {
      System.out.println("nest test method is run!");
    }
  }
}
