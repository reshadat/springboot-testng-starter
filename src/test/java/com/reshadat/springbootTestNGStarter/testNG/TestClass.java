package com.reshadat.springbootTestNGStarter.testNG;

import com.reshadat.springbootTestNGStarter.testNG.service.SubtractionService;
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

    @Value("${valueOfB}")
    int b;

    @Autowired
    SubtractionService subtractionService;

    @Test
    void runSampleTest() {
        int result = subtractionService.subtract(a,b);
        Assert.assertEquals(result, 3, "a=5, b=2. Their subtraction should be 3");
    }
}
