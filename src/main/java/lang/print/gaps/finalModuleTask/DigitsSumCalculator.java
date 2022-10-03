package lang.print.gaps.finalModuleTask;

public class DigitsSumCalculator {
    public void calculateSum(int number) {
        int n = number;
        int a = n%10;    //1479
        int b = n/10%10;
        int c = n/100%10;
        int d = n/1000;
        System.out.println(a+b+c+d);
    }
}
