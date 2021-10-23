import java.util.Scanner;

class MagicNumber{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Imagine  a number");
        int num = sc.nextInt();

        int sum =0;
        while (num > 0 || sum >9){
            if(num==0){
                num = sum;
                sum = 0;
            }
            sum+=num%10;
            num = num/10;
        }
        if(sum == 1){
            System.out.println("It is a magic number"+num);
        }
        else
            System.out.println("It is not a magic number"+num);
    }
}
