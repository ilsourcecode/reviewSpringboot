package com.lyw;

import org.junit.jupiter.api.*;
import org.springframework.boot.test.context.SpringBootTest;

import java.util.concurrent.TimeUnit;

@SpringBootTest
public class UnitTestingTest {

  @Test
  @DisplayName("测试方法")
  public void test() {
    System.out.println("Hello World!");
  }

  @BeforeEach
  public void before() {
    System.out.println("方法之前执行！");
  }

  @AfterEach
  public void after() {
    System.out.println("方法之后执行！");
  }

  @BeforeAll
  public static void beforeAll() {
    System.out.println("整个测试类运行时执行，只执行一次！");
  }

  @AfterAll
  public static void afterAll() {
    System.out.println("整个测试类运行后执行，只执行一次！");
  }

  @Disabled
  @Test
  public void notRun() {
    System.out.println("不能测试的测试方法！");
  }

  @Test
  @Timeout(value = 2000, unit = TimeUnit.MILLISECONDS)
  public void timeout() throws InterruptedException {
    Thread.sleep(1988);
    System.out.println("测试超时异常！");
  }

  @RepeatedTest(5)
  public void testSecond() {
    System.out.println("测试次数的！");
  }
}
