import javax.swing.*;

void main() {
    Scanner scanner = new Scanner(System.in);
    System.out.println("qual é sua renda");
    double renda = scanner.nextDouble();
    //50, 30. 20
    double R5 = renda / 0.5;
    double R3 = renda * 0.3;
    double R2 = renda * 0.2;

    System.out.println("Otimo sua renda é de :"+renda+ ", então você deve separar dessa maneira: ");
    System.out.println("para os gastos essenciais: "+R5);
    System.out.println("para lazer: "+R3);
    System.out.println("e para investir: "+R2);
  }
