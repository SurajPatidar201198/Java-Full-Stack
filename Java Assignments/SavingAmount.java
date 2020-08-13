import java.util.Scanner;

public class SavingAmount {
    int savings;
    void setter(int savings)
    {
        this.savings=savings;
    }
    void getter()
    {
        System.out.println("Your current savings are : "+savings);
    }
    void increment()
    {
        this.savings+=1000;
    }
    void decrement()
    {
        this.savings-=100;
    }
    void checkSavings()
    {
        if(this.savings>=1000)
        {
            System.out.println("Congratulations!");
        }
        else if (this.savings>=0 && this.savings<1000) {
            System.out.println("Insufficient saving!");
            
        } else {
            System.out.println("You are in debt");
        }
    }
    public static void main(String[] args)
    {
        SavingAmount sa=new SavingAmount();
        Scanner ip = new Scanner(System.in);
        int input=ip.nextInt();
        sa.setter(input);
        sa.decrement();
        sa.getter();
        sa.increment();
        sa.getClass();
        sa.checkSavings();
        sa.getter();
    }
}