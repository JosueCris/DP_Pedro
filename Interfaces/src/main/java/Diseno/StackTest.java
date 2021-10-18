package Diseno;

import java.util.Scanner;

public class StackTest {

    public static void main(String[] args) {
        int op, item;
        Stack top = null;
        Scanner sc = new Scanner(System.in);
        try {
            do {
                System.out.print("Selected your option:\n\t[1]: Ups\n\t[2]: Downs\n\t[3]: First\n\t[4]: Print\n\t[0]: Exit\n> ");
                op = sc.nextInt();

                switch (op) {
                    case 1:
                        System.out.print("\nInsert a item in the stack:\n> ");
                        item = sc.nextInt();
                        if (top == null)
                            top = new Stack(item);
                        else
                            top = top.push(item);
                        System.out.println();
                        break;
                    case 2:
                        top = top.pop();
                        System.out.println("\nThe item was removed \n");
                        break;
                    case 3:
                        System.out.println("\nThe top of the stack is: " + top.top() + "\n");
                        break;
                    case 4:
                        System.out.println("\nItems of the stack:");
                        top.imprime();
                        System.out.println();
                        break;
                    case 0:
                        System.out.println("\nThank You :D!!! \n");
                        return;
                    default:
                        System.out.println("\nTry Again!!! \n");
                        break;
                }
            } while (op != 0);
        } catch (NullPointerException npe) {
            System.out.println("Stack Underflow");
            top = null;
        }
    }
}