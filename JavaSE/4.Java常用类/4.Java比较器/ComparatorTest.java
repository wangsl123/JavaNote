import org.junit.Test;

import java.util.Arrays;
import java.util.Comparator;

/**
 * @ClassName:ComparatorTest
 * @description: TODO
 * @author: OrienWsL
 * @time: 2019-11-23 21:15
 * @Version:V1.0
 */
public class ComparatorTest {
    //定制排序
    @Test
    public void test(){
        String[] strings = {"AA", "BB", "GG","HH","FF"};
        Arrays.sort(strings, new Comparator<String>() {

            //从大到小排序
            @Override
            public int compare(String o1, String o2) {
                return -o1.compareTo(o2);

            }
        });

        System.out.println(Arrays.toString(strings));
    }

    @Test
    public void test2(){
        Goods[] goods = new Goods[5];
        goods[0] = new Goods("xiaomi",12);
        goods[2] = new Goods("huawei",123);
        goods[1] = new Goods("oppo",13);
        goods[3] = new Goods("vivo",23);
        goods[4] = new Goods("xiaomi",23);

        Arrays.sort(goods, new Comparator<Goods>() {
            //名字从低到高,价格从高到低
            @Override
            public int compare(Goods o1, Goods o2) {
                if(o1.getName().equals(o2.getName())){
                    return -Double.compare(o1.getPrice(),o2.getPrice());
                }else{
                    return o1.getName().compareTo(o2.getName());
                }

            }
        });
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