package br.mack.ps2;

import java.util.Scanner;

import br.mack.ps2.persistencia.ContaDAO;

public class UserInterface {
    ContaDAO dao;
    Scanner i;

    public UserInterface(ContaDAO dao) {
        this.dao = dao;
        this.i = new Scanner(System.in);

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
            System.out.println("|        1. Create         |");
            System.out.println("|        2. Read           |");
            System.out.println("|        3. Update         |");
            System.out.println("|        4. Delete         |");
            System.out.println("|        5. Exit           |");
            System.out.println("============================");
            op = i.nextInt();
            i.nextLine();

            switch (op) {
                case 1:
                    this.create();
                    break;
                case 2:
                    this.read();
                    break;
                case 3:
                    this.update();
                    break;
                case 4:
                    this.delete();
                    break;
                case 5:
                    System.out.println("end!");
                default:
                    break;
            }
        } while (op != 5);
    }
    
    private void create() {

    }

    private void read() {
    }

    private void update() {
    }

    private void delete() {
        
    }
}