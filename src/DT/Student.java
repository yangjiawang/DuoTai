package DT;

/**
 * Created by YANGJIAWANG on 2018/5/11.
 */
public class Student {

   int Student1(int a) {
       if (a < 100 && a > 90) {
           System.out.println("A");
           System.out.println(4.0);
       } else if (a > 80&&a<90) {
           System.out.println("B");
           System.out.println(3);
       } else if (a > 70&&a<80) {
           System.out.println("C");
           System.out.println(2);
       } else if (a > 60&&a<70) {
           System.out.println("D");
           System.out.println(1);
       } else return -1;


       return a;
   }

}
