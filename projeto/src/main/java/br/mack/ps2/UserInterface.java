package br.mack.ps2;

import java.util.Scanner;

import br.mack.ps2.persistencia.ContaDAOMySQL;

public class UserInterface {
    
    Scanner in;

    public UserInterface() {
        this.in = new Scanner(System.in);
    }
    
    public void Start() {
        printMenu();
    }

    private void printMenu() {

        int op = 0;
        do {
            System.out.println("============================");
            System.out.println("|           MENU           |");
            System.out.println("============================");
            System.out.println("| Options:                 |");
            System.out.println("|        1. CONTAS         |");
            System.out.println("|        2. COMPUTADORES   |");
            System.out.println("|        3. PAÍSES         |");
            System.out.println("|        4. Exit           |");
            System.out.println("============================");
            op = in.nextInt();
            in.nextLine();

            switch (op) {
                case 1:
                    ContaDAOMySQL daoc = new ContaDAOMySQL();
                    UserInterfaceContas uic = new UserInterfaceContas(daoc);
                    uic.Start();   
                    break;
                case 2:
                    
                    break;
                case 3:
                    
                    break;
                case 5:
                    System.out.println("end!");
                default:
                System.out.println("Opção Invalida!");
                    break;
            }
        } while (op != 5);
    }

}