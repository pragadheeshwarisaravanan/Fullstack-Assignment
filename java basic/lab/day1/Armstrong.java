import java.util.*;
class Armstrong {
    public static void main(String[] args) {
      Scanner sc=new Scanner(System.in);
      int n=sc.nextInt();
      int t=n,res=0;
      int count2=0;
      count2=(int)Math.log10(n)+1;
      System.out.println(count2);
      while(t>0){
        int digit=t%10;
        int power=1;
        for(int i=0;i<count2;i++){
          power=power*digit;
        }
        res+=power;
        t=t/10;
      }
      System.out.println((res==n)?"Armstrong":"Not Armstrong");
  }
}