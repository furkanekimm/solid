package com.ba.solid.depencencyinversionprinciple.badexample;

public class Logger {
    private XmlLog xmlLog = new XmlLog();

    public void Log(String value){
        xmlLog.Log(value);
    }
}
