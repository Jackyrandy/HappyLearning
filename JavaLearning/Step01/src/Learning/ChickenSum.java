package Learning;
//已知公鸡5元1只，母鸡3元一只，小鸡1元2只，要求用100元刚好买100只鸡，问有多少种采购方案
public class ChickenSum {
    public static void main(String[] args) {
      int count=0;//计数器，便于统计方案数
        for(int cock=0;cock<20;cock++){//枚举公鸡数量，最多不超过20只
            for(int hen=0;hen<33;hen++){//枚举母鸡数量，最多不好过33只
                int chick=100-hen-cock;//计算小鸡数量
                if(chick%2!=0){
                    continue;
                }
                if(5*cock+3*hen+0.5*chick==100){//如果价格符合要求，那么计数器加一
                    count++;
                    System.out.println("count "+count );
                    System.out.println(cock+" cock and "+hen+" hen and "+chick+" chick");
                }
            }
        }
        System.out.printf("一共有%d种购买方法\n",count);
        System.out.println("2221311027");
        System.out.println("杨彤");
    }
}
