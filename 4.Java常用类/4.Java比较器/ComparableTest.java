import org.junit.Test;

import java.util.Arrays;

/**
 * @ClassName:ComparableTest
 * @description: TODO
 * @author: OrienWsL
 * @time: 2019-11-23 20:05
 * @Version:V1.0
 */
public class ComparableTest {
    @Test
    public void test(){

        //String等包装类实现了Comparable接口，重写了compareTo()方法，给出了比较两个对象大小的方式
        //从小到大排序
        //重写compareTo的规则：
        //1比较两个类的形参
        String[] strings = {"AA", "BB", "GG","HH","FF"};
        Arrays.sort(strings);
        System.out.println(Arrays.toString(strings));
    }

    @Test
    public void test2(){

        //自定义类实现Comparable自然排序
        Goods[] goods = new Goods[4];
        goods[0] = new Goods("xiaomi",12);
        goods[2] = new Goods("huawei",123);
        goods[1] = new Goods("oppo",13);
        goods[3] = new Goods("vivo",23);
        goods[4] = new Goods("msmouse",23);

        Arrays.sort(goods);
        System.out.println(Arrays.toString(goods));

    }
}

class Goods implements Comparable{
    private String name;
    private double price;

    public Goods(String name, double price) {
        this.name = name;
        this.price = price;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    @Override
    public String toString() {
        return "Goods{" +
                "name='" + name + '\'' +
                ", price=" + price +
                '}';
    }

    //指明比较方式
    @Override
    public int compareTo(Object o) {
        if(o instanceof Goods){

            //方式一
            Goods o1 = (Goods) o;
            if(this.price>o1.price){
                return 1;
            }else if(this.price<o1.price){
                return -1;
            }else{
                return this.name.compareTo(o1.name);
            }

            //方式二：
//            return Double.compare(this.price, o1.price);

        }

//
        throw new RuntimeException("传入数据类型不同");

    }
}