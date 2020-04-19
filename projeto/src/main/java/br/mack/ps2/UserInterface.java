package br.mack.ps2;

import java.util.List;
import java.util.Scanner;

import br.mack.ps2.persistencia.ContaDAO;



public class UserInterface {
    ContaDAO dao;
    Scanner in;

    public UserInterface(ContaDAO dao) {
        this.dao = dao;
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
            System.out.println("|        1. Create         |");
            System.out.println("|        2. Read           |");
            System.out.println("|        3. Update         |");
            System.out.println("|        4. Delete         |");
            System.out.println("|        5. Exit           |");
            System.out.println("============================");
            op = in.nextInt();
            in.nextLine();

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
        Conta conta = new Conta();
        System.out.println("informe o id da conta:");
        conta.setId(in.nextInt());
        System.out.println("Informe o nome do dono da conta:");
        conta.setNome(in.next());
        System.out.println("Informe a agencia da conta: ");
        conta.setAgencia(in.nextInt());
        System.out.println("Informe o saldo da conta: ");
        conta.setSaldo(in.nextInt());

        dao.create(conta);

    }

    private void read() {
        List<Conta> contas = dao.read();
        for (int i = 0; i < contas.size(); i++) {
            System.out.println(contas.get(i));
        }

    }

    private void update() {
    }

    private void delete() {
        
    }
}