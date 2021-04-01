package ejercicio3;

/*3. Necesitamos crear un programa para manejar los datos de una Cuenta bancaria de
     un Cliente. Para esto identificamos los atributos id, nombre y género (M o F) para el
     Cliente. Por otro lado tenemos el tipo Cuenta que también posee un identificador,
     un balance y un Cliente que es el dueño de la cuenta. La Cuenta debe exponer los
     métodos depositar y extraer que modifican el balance de la misma. Algo a tener en
     cuenta es que el método extraer no puede extraer dinero si el balance total no lo
     permite, si esto sucede se debe imprimir un mensaje por pantalla que indique que
     la cuenta no posee saldo suficiente.
            a. Crear un Cliente e imprimirlo en pantalla.
            b. Crear una Cuenta bancaria para el Cliente anterior con un saldo inicial de
            10000.
            c. Realizar operaciones de depósito y extracción para probar esa
            funcionalidad.
            d. Es necesario agregar una variante de Cuenta que permita un saldo deudor,
            de máximo 2000 pesos. Esto significa que la cuenta puede aceptar un
            balance negativo con un máximo de - 2000. Realice los cambios y pruebas
            necesarias.
            e. Analice cómo implementaría con las herramientas conocidas hasta el
            momento, llevar un registro de como máximo 10 operaciones de depósito y
            extracción que se realizaron en la cuenta. En donde se almacene en
            memoria de alguna forma la siguiente cadena de texto:
            i. Depósito: "El {NombreCliente}, depositó {MontoDepositado}"
            ii. Extracción: "El {NombreCliente}, retiró {MontoRetirado}"*/

import Classes.BankAccount;
import Classes.BankClient;

public class Ejercicio3 {

    public static void resolution(){
        BankClient client = new BankClient("Carlitoh",'M');
        BankAccount account = new BankAccount(10000,client);

        System.out.println(client.toString());

        account.deposit(2000);
        System.out.println("balance: "+account.getBalance());
        account.extract(5000);
        System.out.println("balance: "+account.getBalance());
        account.deposit(1000);
        System.out.println("balance: "+account.getBalance());
        account.extract(7000);
        System.out.println("balance: "+account.getBalance());
        account.deposit(2000);
        System.out.println("balance: "+account.getBalance());
        account.deposit(9000);
        System.out.println("balance: "+account.getBalance());
        account.deposit(15000);
        System.out.println("balance: "+account.getBalance());


        System.out.println("\n\n\nSegundo intento \n\n\n");

        account.deposit(2000);
        System.out.println("balance: "+account.getBalance());
        account.extract(5000);
        System.out.println("balance: "+account.getBalance());
        account.deposit(1000);
        System.out.println("balance: "+account.getBalance());
        account.extract(7000);
        System.out.println("balance: "+account.getBalance());
        account.deposit(2000);
        System.out.println("balance: "+account.getBalance());
        account.deposit(9000);
        System.out.println("balance: "+account.getBalance());
        account.deposit(15000);
        System.out.println("balance: "+account.getBalance());



    }

}
