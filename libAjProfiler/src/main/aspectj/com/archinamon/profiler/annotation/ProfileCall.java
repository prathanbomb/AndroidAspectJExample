package com.archinamon.profiler.annotation;

import java.lang.annotation.Retention;
import java.lang.annotation.Target;

import static java.lang.annotation.ElementType.CONSTRUCTOR;
import static java.lang.annotation.ElementType.METHOD;
import static java.lang.annotation.RetentionPolicy.RUNTIME;

/**
 * @author archinamon
 * @date 15/01/16
 */
@Retention(RUNTIME)
@Target({CONSTRUCTOR, METHOD})
public @interface ProfileCall {}
