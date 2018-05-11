package DT;

/**
 * Created by YANGJIAWANG on 2018/5/11.
 */
public class ChiFan {
   void CF(int a){
       if (a<7&&a>8){
           System.out.println("包子 油条 粥 都将");
       }else if(a<11&&a>13){
           System.out.println("米饭，馒头，蔬菜和肉类;");
       }else if(a<17&&a>20){
           System.out.println("粥，馒头，蔬菜和水果。\n");
       }else{
           System.out.print("运动啊");
       }
   }
}
