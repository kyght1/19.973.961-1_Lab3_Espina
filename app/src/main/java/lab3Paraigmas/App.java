/*
 * This Java source file was generated by the Gradle 'init' task.
 */
package lab3Paraigmas;

import java.util.Scanner;
import java.util.ArrayList;

public class App {

    public String getGreeting() {
        return "Lab 3 Paradigmas";
    }

    public static void main(String[] args) {

        System.out.println(new App().getGreeting());
        /*Desarrollo el menu*/
        boolean salir = false;
        Scanner opt = new Scanner(System.in);
        int option;
        system newSystem = null;
        /*variable para sistema*/
        while (!salir) {
            System.out.println("Bievenido, seleccione una opcion para continuar");
            System.out.println("-------------------------------------------------");
            System.out.println("1) Crear Sistema");
            System.out.println("2) Modificar Sistema");
            System.out.println("3) Visualizar Sistema");
            System.out.println("4) Salir");
            System.out.println("-----------------------------------");

            System.out.printf("Ingrese una opcion: ");

            option = opt.nextInt();
            if (option == 4) {
                salir = true;
            } else {
                if (option == 1 && newSystem == null) {
                    Scanner sc = new Scanner(System.in);
                    System.out.printf("Ingrese el nombre del sistema a crear: ");
                    String nameSystem = sc.nextLine();
                    newSystem = new system(nameSystem);
                    System.out.println("-----------------------------------");
                    System.out.printf("Info sistema : ");

                    System.out.println(newSystem.toString());

                }
                /*Opcion de modificación del sistema... añadiendo opciones*/
                if (option == 2) {
                    /*desplego opciones de modificacion*/
                    System.out.println("1) Anadir unidad al sistema (addDrive)");
                    System.out.println("2) Registrar usuario en el sistema (register)");
                    System.out.println("3) Loguear usuario en el sistema (login)");
                    System.out.println("4) Desloguear usuario en el sistema (logout)");
                    System.out.println("5) Cambiar unidad (switchDrive)");
                    System.out.println("6) Crear directorio (mkdir)");

                    System.out.println("-----------------------------------");
                    System.out.printf("Ingrese una opcion: ");
                    option = opt.nextInt();
                    if (option == 1) {
                        /*addDrive*/
                        Scanner sc = new Scanner(System.in);
                        String letter;
                        String name;
                        int capacity;

                        /*pido datos de la unidad*/
                        System.out.printf("Ingrese la letra de la unidad : ");
                        letter = sc.nextLine();

                        System.out.printf("Ingrese el nombre de la unidad : ");

                        name = sc.nextLine();

                        System.out.printf("Ingrese la capacidad de la unidad : ");

                        capacity = sc.nextInt();
                        System.out.println("---------------------------------------");

                        newSystem.addDrive(letter, name, capacity);
                        System.out.println("---------------------------------------");

                        System.out.println(newSystem.toString());

                    }
                    if (option == 2) {
                        /*register*/
                        Scanner sc = new Scanner(System.in);
                        System.out.printf("Ingrese el nombre de usuario a registrar en sistema :");
                        String username = sc.nextLine();

                        /*ejecuto metodo register*/
                        newSystem.register(username);
                        /*lo muestro*/
                        System.out.println("---------------------------------------");

                        System.out.println(newSystem.toString());

                    }
                    if (option == 3) {
                        /*login*/
                        Scanner sc = new Scanner(System.in);
                        System.out.printf("Ingrese el nombre de usuario a loguear en sistema :");
                        String username = sc.nextLine();
                        /*ejecuto metodo login*/
                        newSystem.login(username);
                        /*lo muestro*/
                        System.out.println("---------------------------------------");

                        System.out.println(newSystem.toString());

                    }
                    if (option == 4) {
                        /*logout*/

                        newSystem.logout();
                        /*lo muestro*/
                        System.out.println("---------------------------------------");

                        System.out.println(newSystem.toString());

                    }
                    if (option == 5) {
                        /*switchDrive*/
                        Scanner sc = new Scanner(System.in);
                        System.out.printf("Ingrese la letra de la unidad a la que desea cambiar :");
                        String driveLetter = sc.nextLine();
                        /*ejecuto el metodo*
                         */
                        newSystem.switchDrive(driveLetter);

                        /*lo muestro*/
                        System.out.println("---------------------------------------");

                        System.out.println(newSystem.toString());

                    }
                    if (option == 6) {
                        /*mkdir*/
                        Scanner sc = new Scanner(System.in);
                        System.out.printf("Ingrese el nombre del nuevo directorio a crear (carpeta) :");
                        String folderName = sc.nextLine();
                        /*ejecuto el metodo*
                         */
                        newSystem.mkdir(folderName);

                        /*lo muestro*/
                        System.out.println("---------------------------------------");

                        System.out.println(newSystem.toString());

                    }
                }
            }

        }
        System.out.println("Sali");
    }

}
