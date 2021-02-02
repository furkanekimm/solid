package com.ba.solid.depencencyinversionprinciple.goodexample;

public class Logger {
    private ILogger logger;

    public Logger(ILogger logger){
        this.logger=logger;
    }

    public void Log(String value){
        logger.Log(value);
    }
}
