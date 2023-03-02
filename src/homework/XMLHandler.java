package homework;

public class XMLHandler extends AbstractHandler {
    @Override
    public void open() {
        System.out.println("Open XML");
    }

    @Override
    public void create() {
        System.out.println("Create TML");
    }

    @Override
    public void change() {
        System.out.println("Change TML");
    }

    @Override
    public void save() {
        System.out.println("Save TML");
    }
}
