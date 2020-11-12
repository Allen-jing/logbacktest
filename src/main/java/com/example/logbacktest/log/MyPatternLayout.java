package com.example.logbacktest.log;

import ch.qos.logback.classic.PatternLayout;
import org.springframework.stereotype.Component;

@Component
public class MyPatternLayout extends PatternLayout {
    static {
        defaultConverterMap.put("ip",IpConvert.class.getName());
    }
}
