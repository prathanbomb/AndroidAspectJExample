package com.archinamon.profiler.annotation;

import java.lang.annotation.Retention;
import java.lang.annotation.Target;

import static java.lang.annotation.ElementType.TYPE;
import static java.lang.annotation.RetentionPolicy.RUNTIME;

/**
 * @author archinamon
 * @date 15/01/16
 */
@Retention(RUNTIME)
@Target(TYPE)
public @interface ProfileInstance {}
