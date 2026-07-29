import java.util.Scanner;

class Num 
{
    int n1, n2;
    Scanner s = new Scanner(System.in);

    void setInput()
    {
        System.out.print("Enter number 1: ");
        n1 = s.nextInt();
        System.out.print("Enter number 2: ");
        n2 = s.nextInt();
    }
}

interface Calculator 
{
    int add(int n1, int n2);
    int sub(int n1, int n2);
    int mul(int n1, int n2);
    int div(int n1, int n2);
}

class Operation extends Num implements Calculator
{

    public int add(int n1, int n2) 
    {
        return n1 + n2;
    }

    public int sub(int n1, int n2) 
    {
        return n1 - n2;
    }

    public int mul(int n1, int n2) 
    {
        return n1 * n2;
    }

    public int div(int n1, int n2) 
    {
        return n1 / n2;
    }
}

class Ex5 
{
    public static void main(String[] args) 
    {

        Operation o = new Operation();
        o.setInput();
        System.out.println("Addition : " + o.add(o.n1, o.n2));
        System.out.println("Subtraction : " + o.sub(o.n1, o.n2));
        System.out.println("Multiplication : " + o.mul(o.n1, o.n2));

        if (o.n2 != 0) 
	{
            System.out.println("Division : " + o.div(o.n1, o.n2));
        }
	else
	{
            System.out.println("Division by zero is not possible.");
        }
    }
}