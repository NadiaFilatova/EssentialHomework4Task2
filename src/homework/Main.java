package homework;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        String formatDoc;
        Scanner in = new Scanner(System.in);

        System.out.println("Enter document format: ");
        formatDoc = in.next();
        while (!"exit".equalsIgnoreCase(formatDoc)) {
            try {
                AbstractHandler handlerAnyFormat = getHandler(formatDoc);
                handlerAnyFormat.create();
                handlerAnyFormat.open();
                handlerAnyFormat.change();
                handlerAnyFormat.save();
            } catch (IllegalArgumentException ex) {
                System.out.println("Error file format! ");
            }
            System.out.println("Enter document format or exit : ");
            formatDoc = in.next();
        }
    }

    public static AbstractHandler getHandler(String fileExtension) {
        if ("xml".equalsIgnoreCase(fileExtension))
            return new XMLHandler();
        else if ("doc".equalsIgnoreCase(fileExtension))
            return new DOCHandler();
        else if ("txt".equalsIgnoreCase(fileExtension)) {
            return new TXTHandler();
        } else throw new IllegalArgumentException();
    }
}
