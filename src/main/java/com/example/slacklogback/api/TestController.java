package com.example.slacklogback.api;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class TestController {
    private final Logger logger = LoggerFactory.getLogger(this.getClass());
    @GetMapping("/test")
    public void test() {
        logger.error("Error");
        logger.warn("Warn");
        logger.info("Info");
        logger.debug("Debug");
        logger.trace("Trace");
    }

    @GetMapping("/test2")
    public String test2(@RequestParam(required = false) String s) {
        return s.toLowerCase();
    }
}
