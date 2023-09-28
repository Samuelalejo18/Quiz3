import java.util.Scanner;

/**
 * Primera clase que es ejecutada
 */
public class Principal {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Bienvenido a wolfBank ");
        System.out.print("Ingrese su número de cuenta: ");
        //Solicita al usuario que ingrese el numero de cuenta por consola
        int acount = Integer.parseInt(scanner.nextLine());

        System.out.print("Ingrese su contraseña: ");
        //Solicita al usuario que ingrese la contraseña de su cuenta por consola
        String login = scanner.nextLine();

        /**
         * Primer método que se ejecuta en mi aplicación
         * @param args
         *
         * Complejidad temporal: O(1) Complejidad Constante
         */


        Banco user = new Banco("Samuel", "Monsalve", 1014180740, "Lukas2012", 200000);
        /* Complejidad temporal: O(1) Complejidad Constante*/

        //Condicionales que comparan las variables que ingresa el usuario por consola con el objeto user con sus parametros id y password

        if (acount == Banco.id && login.equals(Banco.password)) {
            user.Welcome();
        } else if (acount !=Banco.id && login.equals(Banco.password)){
            System.out.println("El usuario con el id: "+acount+" no existe");
        }else if (acount == Banco.id && !login.equals(Banco.password)){
            System.out.println("la contraseña es incorrecta");
        }

        scanner.close();
    }
}

