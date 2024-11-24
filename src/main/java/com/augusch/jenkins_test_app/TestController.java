package com.augusch.jenkins_test_app;

import org.springframework.web.bind.annotation.RestController;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;


@RestController
@RequestMapping(produces="application/json")
public class TestController {

    @GetMapping("test")
    public TestImpl test() {
        return new TestImpl("This is a test", HttpStatus.OK);
    }
}
