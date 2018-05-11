package DT;

/**
 * Created by YANGJIAWANG on 2018/5/11.
 */
public class Susan extends Fangfa {


    public void clockMe(int a) {
        if (a<5&&a>6){
            System.out.println("锻炼身体");
        }else if(a>6&&a<7){
            System.out.println("吃早餐。");
        }else if(a>7){
            System.out.println("去上学。");
        }
    }
}
