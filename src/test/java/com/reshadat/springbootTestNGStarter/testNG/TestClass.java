package com.reshadat.springbootTestNGStarter.testNG;

import com.reshadat.springbootTestNGStarter.testNG.service.HelloWorldService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.testng.AbstractTestNGSpringContextTests;
import org.testng.Assert;
import org.testng.annotations.Test;

@SpringBootTest(classes = SpringbootTestNgStarterApplication.class)
public class TestClass extends AbstractTestNGSpringContextTests {

    @Value("${valueOfA}")
    int a;

    @Autowired
    HelloWorldService helloWorldService;

    @Test
    void runSampleTest() {
        int b = helloWorldService.getValueOfB();
        Assert.assertEquals(a * b, 50, "a=5, b=10. Their multiplication should be 50");
    }
}
