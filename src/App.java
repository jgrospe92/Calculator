public class App {
    public static void main(String[] args) throws Exception {

        Calculator c = new Calculator();

        print("\nBasic but no so Basic calculator");

        String exp = "1+1";
        String exp1 = "(1+(4+5+2)-3)+(6+8)";
        String exp2 = "(2+6*3+5-(3*14/7+2)*5)+3";
        String exp3 = "2*(5+5*2)/3+(6/2+8)";


        print("************************************************");
        print("The answer for " + exp + " : " + c.calculate(exp) + "\n");
        print("The answer for " + exp1 + " : " + c.calculate(exp1) + "\n");
        print("The answer for " + exp2+ " : " + c.calculate(exp2) + "\n");
        print("The answer for " + exp3 + " : " + c.calculate(exp3) + "\n");
       
    }


    static <T> void print(T data) {

        System.out.println(data);

    }

}
