import java.util.Scanner;

class calculator {

    static void add(double a, double b) {
        double r = a + b;
        System.out.println("\n result=" + r);
    }

    static void multiply(double a, double b) {
        double r = a * b;
        System.out.println("\n result: " + r);
    }


    static void subtract(double a, double b) {
        double r = a - b;
        System.out.println("\n result: " + r);
    }
      
    static void divide(double a, double b) {
        double r;
        if(a==0)r=0;
        
        else r = a / b;
        

        System.out.println("\n result: " + r);
    }

    public static void main(String[] args) {
        double a, b;
        Scanner sc = new Scanner(System.in);
        System.out.println("\n enter first and second number:\n");

        a = sc.nextDouble();
        b = sc.nextDouble();
        while (true) {
            System.out.println("1)add\n2)multiply\n3)subtract\n4)divide\n5)exit");
            System.out.println("\nenter your choice=");
            int c;
            c = sc.nextInt();

            switch (c) {
                case 1:
                    add(a, b);
                    break;
                case 2:

                    multiply(a, b);
                    break;
                case 3:
                    subtract(a, b);
                    break;
                // case 4:divide(a,b);break;
                     multiply(a, b);
                    break;
                // case 3:subtract(a,b);break;
                case 4:divide(a,b);break;

                case 5:
                    System.exit(0);
                default:
                    System.out.println("invalide input...");

            }
        }

    }

}