package homework;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        String formatDoc;
        Scanner in = new Scanner(System.in);

        System.out.println("Enter document format: ");
        formatDoc = in.next();
        AbstractHandler handlerAnyFormat;
        while (!"exit".equalsIgnoreCase(formatDoc)) {
            try {
                handlerAnyFormat = AbstractHandler.getInstance(formatDoc);
                handlerAnyFormat.create();
                handlerAnyFormat.open();
                handlerAnyFormat.change();
                handlerAnyFormat.save();
            } catch (IllegalArgumentException ex) {
                System.out.println("Error file format! Try again");
            }
            System.out.println("Enter document format or exit : ");
            formatDoc = in.next();
        }
    }
}
