import java.util.*;
 
public class Main {

    //Quadruple
    public static void qQuadruple(String expression[]) {
        System.out.println("op\targ1\targ2\tresult");
        for (int i = 0; i <expression.length;i++) {
            String[] expR = expression[i].split("");
            System.out.println(expR[3]+"\t"+expR[2]+"\t"+expR[4]+"\t"+expR[0]);
 
        }
    }
    
    //Triple
    public static void tTriples(String expression[]) {
        System.out.println("op\targ1\targ2");
        for(int i=0;i<expression.length;i++){
            String[] expR = expression[i].split("");
            System.out.println(expR[3]+"\t"+expR[2]+"\t"+expR[4]);
        }
    }


    //Main
    public static void main(String args[]) {
        //take input from user - count of expression and expressions
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the no.of expressions\t");
        int n = sc.nextInt();
        System.out.println("Enter the expressions: ");
        sc.nextLine();
        String exp[] = new String[n];
        for (int i = 0; i < n; i++) {
            exp[i] = sc.nextLine();
        }
        System.out.println("\n\n\tQuadruple: ");
        System.out.println();
        qQuadruple(exp);
        System.out.println("\n\n\tTriple: ");
        System.out.println();
        tTriples(exp);
 
    }
 
    
 
}
