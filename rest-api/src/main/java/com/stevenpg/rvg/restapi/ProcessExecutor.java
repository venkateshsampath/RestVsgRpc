package com.stevenpg.rvg.restapi;

import java.util.Arrays;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

@Component
public class ProcessExecutor implements CommandLineRunner {
    private static final Logger logger = LoggerFactory.getLogger(ProcessExecutor.class);

    @Override
    public void run(String...args) {
        logger.info(String.format("Application started with command-line arguments: {} . \n To kill this application, press Ctrl + C.", Arrays.toString(args)));
    }
}