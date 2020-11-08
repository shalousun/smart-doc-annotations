package com.smartdoc.annotations;

import java.lang.annotation.ElementType;
import java.lang.annotation.Target;

/**
 * @author yu 2020/11/8.
 */
@Target({ElementType.TYPE, ElementType.METHOD, ElementType.FIELD})
public @interface Ignore {
}
