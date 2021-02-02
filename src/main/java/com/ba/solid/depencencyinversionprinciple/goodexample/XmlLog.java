package com.ba.solid.depencencyinversionprinciple.goodexample;

public class XmlLog implements ILogger {
    @Override
    public Boolean Log(String value) {
        return true;
    }
}
