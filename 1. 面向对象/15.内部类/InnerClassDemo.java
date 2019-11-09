// import Outer.Inner;

// public class InnerClassDemo{
//     public static void main(String[] args) {
//         //直接访问内部类中的成员
//         // Outer.Inner inner = new Outer().new Inner();
//         //使用静态内部类

//         Outer.Inner inner = new Outer.Inner();
//         inner.show();

//         //如果内部类是静态的，同时方法也是静态的
//         Outer.Inner.fun();
//     }
// }

// class Outer{
//     private int num = 4;
//     static int sun = 5;
//     static class Inner{
//         void show(){
//             System.out.println("inner run```````"+sun);
//         }

//         static void fun(){
//             System.out.println("fun run......."+sun);
//         }
//     }

//     void method(){
//         Inner inner = new Inner();
//         inner.show();
//     }
// }