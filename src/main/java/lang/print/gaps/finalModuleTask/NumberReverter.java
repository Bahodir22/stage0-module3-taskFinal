package lang.print.gaps.finalModuleTask;

public class NumberReverter {
    public void revert(int number) {
        int num =number;
        int a = num%10;
        int b = (num/10)%10;
        int c = num/100;
        System.out.println(a*100+b*10+c);

    }
}
