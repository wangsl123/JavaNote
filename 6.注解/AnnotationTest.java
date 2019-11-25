package com.wang.Annotation;

import java.util.ArrayList;

/**
 * @ClassName:AnnotationTest
 * @description: TODO
 * @author: OrienWsL
 * @time: 2019-11-25 20:05
 * @Version:V1.0
 */
public class AnnotationTest {
    @SuppressWarnings("unused")
    String str;
}

class Generic<@MyAnnotation T>{

    public void show() throws @MyAnnotation  Exception{
        ArrayList<@MyAnnotation  Object> objects = new ArrayList<>();
    }
}
