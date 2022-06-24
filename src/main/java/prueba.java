import java.util.Scanner;

public class prueba {
    public static void main(String[] args){
        Scanner captura = new Scanner(System.in);
        System.out.println("Ingrese nombre de usuario");
        String nombreUsuario = captura.nextLine();
        System.out.println("Ingrese número de celular");
        String numCel = captura.nextLine();
        System.out.println("Ingrese su edad");
        String edad = captura.nextLine();
        System.out.println("Bienvenido señor "+ nombreUsuario +", es un placer para nosotros contar con una persona de "+edad+" años.\n" +
        "\n" +
        "Próximamente nos comunicaremos con usted al numero "+numCel+".\n" +
        "\n" +
        "Feliz día");
    }
}
