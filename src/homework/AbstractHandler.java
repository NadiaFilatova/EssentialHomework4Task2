package homework;

//Використовуючи IntelliJ IDEA, створіть проект. Потрібно:
// Створити клас AbstractHandler. У тілі класу створити методи void open(), void create(), void change(), void save().
// Створити похідні класи XMLHandler, TXTHandler, DOCHandler від базового класу AbstractHandler.
// Написати програму, яка виконуватиме визначення документа
// і для кожного формату мають бути методи відкриття, створення, редагування, збереження певного формату документа.
public abstract class AbstractHandler {
    public abstract void open();

    public abstract void create();

    public abstract void change();

    public abstract void save();

    static AbstractHandler getInstance(String fileExtension) {
        if ("xml".equalsIgnoreCase(fileExtension))
            return new XMLHandler();
        else if ("doc".equalsIgnoreCase(fileExtension))
            return new DOCHandler();
        else if ("txt".equalsIgnoreCase(fileExtension)) {
            return new TXTHandler();
        } else throw new IllegalArgumentException();

    }
}
