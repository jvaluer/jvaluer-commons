package com.petukhovsky.jvaluer.commons.util;

/**
 * Created by Arthur Petukhovsky on 6/13/2016.
 */
@FunctionalInterface
public interface ExceptionalRunnable<T extends Exception> {
    void run() throws T;
}
