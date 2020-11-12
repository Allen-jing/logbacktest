package com.example.logbacktest.service.impl;

import com.example.logbacktest.service.LogService;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Service;

@Service
@Slf4j
public class LogServiceImpl implements LogService {


    @Override
    public void printLog() {

        log.info("infoMessage");

        log.warn("warnMessage");
try {

    log.error("errorMessage");
}catch (Exception e){

}

    }
}
