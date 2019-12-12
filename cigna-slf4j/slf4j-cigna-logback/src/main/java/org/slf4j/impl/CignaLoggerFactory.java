package org.slf4j.impl;

import org.slf4j.ILoggerFactory;
import org.slf4j.Logger;

public class CignaLoggerFactory implements ILoggerFactory {

    private final ILoggerFactory loggerFactory;

    public CignaLoggerFactory(ILoggerFactory loggerFactory) {
        this.loggerFactory = loggerFactory;
    }

    public Logger getLogger(String name) {
        Logger logbackLogger = loggerFactory.getLogger(name);
        return new CignaLoggerAdapter(logbackLogger);
    }
}
