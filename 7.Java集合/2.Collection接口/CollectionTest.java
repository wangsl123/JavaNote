package com.wang.Collection;

import org.junit.Test;

import java.util.*;

/**
 * @ClassName:CollectionTest
 * @description: TODO
 * @author: OrienWsL
 * @time: 2019-11-25 21:11
 * @Version:V1.0
 */
public class CollectionTest {
    @Test
    public void test(){
        Collection collection = new ArrayList();

        //add(Object e)
        collection.add("AA");
        collection.add("BB");
        collection.add("FF");
        collection.add(123);
        collection.add(new Date());

        //size()
        System.out.println(collection.size());

        //addAll(Collection)
        Collection collection1 = new ArrayList();
        collection1.add("wqe");

        collection.addAll(collection1);
        System.out.println(collection.toString());

        //isEmpty()
        boolean empty = collection.isEmpty();
        System.out.println(empty);

        //clear()
        collection1.clear();
        System.out.println(collection1.isEmpty());


    }

    @Test
    public void test1(){
        Collection collection = new ArrayList();


        collection.add("aa");
        collection.add(new String("BB"));
        collection.add(123.45);
        collection.add(123);
        collection.add(new Date());

        //contains():是否包含元素，调用对象的equals方法
        boolean contains = collection.contains(new String("BB"));
        System.out.println(contains);

        //containsAll(Collection c1)
        Collection collection1 = new ArrayList();
        collection1.add(new String("BB"));
        collection1.add(123.45);
        System.out.println(collection.containsAll(collection1));

        //reomve()
        collection.remove("AA");

        //reomveAll(Collection c1)



        //retainAll(c1);获取交集
        collection.retainAll(collection1);

        //hashCode()
        System.out.println(collection.hashCode());

        //toArray()
        Object[] objects = collection.toArray();

        //数组转换为集合
        collection1 = Arrays.asList("aa",new Date());

        //iterator():用于遍历
        Iterator iterator = collection.iterator();
        

    }
}
