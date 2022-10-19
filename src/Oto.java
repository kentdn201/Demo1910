public class Oto extends Car implements InterfaceCar{
    @Override
    void start() {
        System.out.println("Khợi động xe");
    }

    @Override
    void stop() {
        System.out.println("Dừng xe");
    }
    @Override
    public void move(String name) {
        System.out.println("Xe " + name +" di chuyển");
    }

    @Override
    public void speedUp(String name) {
        System.out.println("Xe "+ name +" tăng tốc");
    }

    @Override
    public void speedDown(String name) {
        System.out.println("Xe "+ name + " giảm tốc");
    }
}
