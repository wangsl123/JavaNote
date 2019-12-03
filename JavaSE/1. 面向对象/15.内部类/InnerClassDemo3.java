/**
 * InnerClassDemo3
 */
public class InnerClassDemo3 {
    public static void main(String[] args) {
        new Outer().method();
    }
}

class Outer{
    int num=9;
    void method(){
        int x = 12;
        class Inner{
            void show(){
                System.out.println(x);
            }
        }

        Inner inner = new Inner();
        inner.show();
    }
}