public class Delenie {
    //Нахождение наименьшего общего делителя

    public static double nod_recur(double num1, double num2) {
        double n = num1 % num2;
        num1 = num2;
        num2 = n;
        if (n > 0)
            return nod_recur(num1, num2);
        else
            return num1;
    }
    //Нахождение наименьшего общего множителя
    public static double noc(double a, double b) {
        return (a * b / (nod_recur(a, b)));
    }

    public static void main(String[] args) {
        double m = 1;
        for (int i = 2; i < 21; i++) {
            m = noc((double) i, m);

        }
        System.out.println((long) m);

    }
}
