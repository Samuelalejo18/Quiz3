/**
 * Clase banco
 */
public class Banco {
    /**
     * Atributos:
     */
    String name;
    String lastName;
    static int id;
    static String password;
    int balance;

    /***************************************************/
    /******************** Métodos ********************/
    /***************************************************/

    /**
     * Constructor de la clase Banco: Inicializa los atributos de mi clase
     * @param name
     * @param lastName
     * @param id
     * @param password
     * @param balance
     * Complejidad temporal: O(1) Tiempo Constante
     */
public Banco(String name, String lastName,int id, String password,int balance){
    this.name=name;
    this.lastName=lastName;
    Banco.id =id;
    Banco.password =password;
    this.balance=balance;

}
    /**
     * Método que imprime el nombre y apellido del usuario con su respectivo id y el monto de su cuenta bancaria

     * Complejidad temporal: O(1) Complejidad Constante
     */
void Welcome(){
    System.out.println("Bienvenido "+name+ " " + lastName +" indentificado con el id "+id+" tu saldo es de : "+balance);
}



}