package org.slf4j.impl;

import org.slf4j.Logger;
import org.slf4j.Marker;

public class CignaLoggerAdapter implements Logger {

    private final Logger logbackLogger;

    public CignaLoggerAdapter(Logger logbackLogger) {
        this.logbackLogger = logbackLogger;
    }

    public String getName() {
        return logbackLogger.getName();
    }

    public boolean isTraceEnabled() {
        return false;
    }

    public void trace(String s) {

    }

    public void trace(String s, Object o) {

    }

    public void trace(String s, Object o, Object o1) {

    }

    public void trace(String s, Object... objects) {

    }

    public void trace(String s, Throwable throwable) {

    }

    public boolean isTraceEnabled(Marker marker) {
        return false;
    }

    public void trace(Marker marker, String s) {

    }

    public void trace(Marker marker, String s, Object o) {

    }

    public void trace(Marker marker, String s, Object o, Object o1) {

    }

    public void trace(Marker marker, String s, Object... objects) {

    }

    public void trace(Marker marker, String s, Throwable throwable) {

    }

    public boolean isDebugEnabled() {
        return false;
    }

    public void debug(String s) {

    }

    public void debug(String s, Object o) {

    }

    public void debug(String s, Object o, Object o1) {

    }

    public void debug(String s, Object... objects) {

    }

    public void debug(String s, Throwable throwable) {

    }

    public boolean isDebugEnabled(Marker marker) {
        return false;
    }

    public void debug(Marker marker, String s) {

    }

    public void debug(Marker marker, String s, Object o) {

    }

    public void debug(Marker marker, String s, Object o, Object o1) {

    }

    public void debug(Marker marker, String s, Object... objects) {

    }

    public void debug(Marker marker, String s, Throwable throwable) {

    }

    public boolean isInfoEnabled() {
        return false;
    }

    public void info(String s) {
        logbackLogger.info("Ha " + s);
    }

    public void info(String s, Object o) {
        logbackLogger.info("Ha " + s, o);
    }

    public void info(String s, Object o, Object o1) {

    }

    public void info(String s, Object... objects) {

    }

    public void info(String s, Throwable throwable) {

    }

    public boolean isInfoEnabled(Marker marker) {
        return false;
    }

    public void info(Marker marker, String s) {

    }

    public void info(Marker marker, String s, Object o) {

    }

    public void info(Marker marker, String s, Object o, Object o1) {

    }

    public void info(Marker marker, String s, Object... objects) {

    }

    public void info(Marker marker, String s, Throwable throwable) {

    }

    public boolean isWarnEnabled() {
        return false;
    }

    public void warn(String s) {

    }

    public void warn(String s, Object o) {

    }

    public void warn(String s, Object... objects) {

    }

    public void warn(String s, Object o, Object o1) {

    }

    public void warn(String s, Throwable throwable) {

    }

    public boolean isWarnEnabled(Marker marker) {
        return false;
    }

    public void warn(Marker marker, String s) {

    }

    public void warn(Marker marker, String s, Object o) {

    }

    public void warn(Marker marker, String s, Object o, Object o1) {

    }

    public void warn(Marker marker, String s, Object... objects) {

    }

    public void warn(Marker marker, String s, Throwable throwable) {

    }

    public boolean isErrorEnabled() {
        return false;
    }

    public void error(String s) {

    }

    public void error(String s, Object o) {

    }

    public void error(String s, Object o, Object o1) {

    }

    public void error(String s, Object... objects) {

    }

    public void error(String s, Throwable throwable) {

    }

    public boolean isErrorEnabled(Marker marker) {
        return false;
    }

    public void error(Marker marker, String s) {

    }

    public void error(Marker marker, String s, Object o) {

    }

    public void error(Marker marker, String s, Object o, Object o1) {

    }

    public void error(Marker marker, String s, Object... objects) {

    }

    public void error(Marker marker, String s, Throwable throwable) {

    }
}
