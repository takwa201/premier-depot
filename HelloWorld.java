public class calculatrice{
    public double addition(double a,double b){
        return a+b;
    }
    public double soustraction(double a,double b){
        return a-b;
    }
    public double multiplication(double a,double b){
        return a*b;
    }
    public double division(double a,double b){
        return a/b;
    }
}
public class Test{
    import java.util.Scanner;

    public class Test {
    
        public static void main(String[] args) {
            Calculatrice calculatrice = new Calculatrice();
            Scanner scanner = new Scanner(System.in);
    
            System.out.println("Bienvenue dans la calculatrice !");
    
            while (true) {
                System.out.println("Entrez un nombre (ou 'q' pour quitter) :");
                if (scanner.hasNext("q")) {
                    break;
                }
                double a = scanner.nextDouble();
    
                System.out.println("Entrez un opérateur (+, -, *, /) :");
                String operateur = scanner.next();
    
                System.out.println("Entrez un autre nombre :");
                double b = scanner.nextDouble();
    
                try {
                    double resultat = 0;
                    switch (operateur) {
                        case "+":
                            resultat = calculatrice.addition(a, b);
                            break;
                        case "-":
                            resultat = calculatrice.soustraction(a, b);
                            break;
                        case "*":
                            resultat = calculatrice.multiplication(a, b);
                            break;
                        case "/":
                            resultat = calculatrice.division(a, b);
                            break;
                        default:
                            System.out.println("Opérateur invalide");
                            continue;
                    }
                    System.out.println("Le résultat est : " + resultat);
                } catch (IllegalArgumentException e) {
                    System.out.println(e.getMessage());
                }
            }
    
            System.out.println("Merci d'avoir utilisé la calculatrice !");
        }
    }
}