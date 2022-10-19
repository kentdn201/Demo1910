public class Main {
    public static void main(String[] args)
    {
        //  Generic
        String stringG = "Testing";
        Generic<String> stringGeneric = new Generic<String>(stringG);
        System.out.println(stringGeneric.getT());

        //      Demo interface and abstract
        //      Car newCar = new Car(); không thể tạo một đối tượng với abstract
        //      Khi Oto kế thừa Car thì ta có thể tạo một đối tượng như bình thường

        Oto Audi = new Oto();
        Audi.setId(1);
        Audi.setName("Audi ABC");

        Audi.start();
        Audi.move(Audi.getName());
        Audi.speedUp(Audi.getName());
        Audi.speedDown(Audi.getName());
        Audi.stop();

        Generic<Oto> otoGeneric = new Generic<Oto>(Audi);
    }
}