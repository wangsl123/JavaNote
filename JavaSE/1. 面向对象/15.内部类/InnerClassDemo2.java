// public class InnerClassDemo2{
//     public static void main(String[] args) {
//         new Outer().method();
//     }
// }

// class Outer{
//     int num = 3;
    
//     class Inner{
//         int num = 4;
//         void show(){
//             System.out.println(Outer.this.num);
//         }
//     }

//     void method(){
//         new Inner().show();
//     }
// }