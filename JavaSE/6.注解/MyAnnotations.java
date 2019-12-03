package com.wang.Annotation;

import java.lang.annotation.Repeatable;
import java.lang.annotation.Target;

import static java.lang.annotation.ElementType.*;
import static java.lang.annotation.ElementType.TYPE_PARAMETER;

/**
 * @ClassName:MyAnnotations
 * @description: TODO
 * @author: OrienWsL
 * @time: 2019-11-25 19:59
 * @Version:V1.0
 */
@Target({TYPE, FIELD, METHOD, PARAMETER, CONSTRUCTOR, LOCAL_VARIABLE, MODULE,TYPE_PARAMETER,TYPE_USE})

public @interface MyAnnotations {
    MyAnnotation[] value();

}
