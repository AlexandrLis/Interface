public class Client implements Interf{

    @Override
    public void methodInterface() {
        System.out.println("Метод переопределен в классе Client");
    }

    public void methodClient(){
        System.out.println("Метод только класса Client");
    }
}
