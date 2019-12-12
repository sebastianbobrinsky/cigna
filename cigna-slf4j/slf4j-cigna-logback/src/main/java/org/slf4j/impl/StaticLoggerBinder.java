package org.slf4j.impl;

import org.slf4j.ILoggerFactory;
import org.slf4j.spi.LoggerFactoryBinder;

public class StaticLoggerBinder implements LoggerFactoryBinder {

    private org.slf4j.impl.shaded.StaticLoggerBinder SHADED_SINGLETON = org.slf4j.impl.shaded.StaticLoggerBinder.getSingleton();

    private static final StaticLoggerBinder SINGLETON = new StaticLoggerBinder();

    private final CignaLoggerFactory cignaLoggerFactory = new CignaLoggerFactory(SHADED_SINGLETON.getLoggerFactory());

    private final String loggerFactoryClassStr = SHADED_SINGLETON.getLoggerFactoryClassStr();

    public static StaticLoggerBinder getSingleton() {
        return SINGLETON;
    }

    public ILoggerFactory getLoggerFactory() {
        return cignaLoggerFactory;
    }

    public String getLoggerFactoryClassStr() {
        return loggerFactoryClassStr;
    }
}
