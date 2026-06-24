import java.util.Scanner;
void bhaskara() {
    Scanner scanner = new Scanner(System.in);
    System.out.println("qual é o A da equação");
    double A = scanner.nextDouble();
    System.out.println("qual é o B da equação");
    double B = scanner.nextDouble();
    System.out.println("qual é o C da equação");
    double C = scanner.nextDouble();

    double delta = Math.pow(B,2) - (4*A*C);
    double Xpp = -B + Math.sqrt(delta);
    double Xnn= -B - Math.sqrt(delta);
    double XP = Xpp / (2*A);
    double XN = Xnn / (2*A);

    System.out.println("O x positivo é: "+ XP + "e o x negativo é " + XN);
    /* ax² + bx + c = 0
    delta = b2 - 4*A*C
    bhaskara = -b + sqrtDELTA/2 = X+, -b - sqrtDELTA/2*a = X-
     */
}
