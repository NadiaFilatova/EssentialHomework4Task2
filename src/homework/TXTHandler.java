package homework;

public class TXTHandler extends AbstractHandler {
    @Override
    public void change() {
        System.out.println("Change TXT");
    }

    @Override
    public void create() {
        System.out.println("Create TXT");
    }

    @Override
    public void open() {
        System.out.println("Open TXT");
    }

    @Override
    public void save() {
        System.out.println("Save TXT");
    }
}
