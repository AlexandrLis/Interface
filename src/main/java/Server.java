public class Server {


    Interf interf;

//  в main я передал экземпляр Клиента в параметр Сервера
//  Server server = new Server(client)

//  а в конструкторе Сервера я принимаю interf -> this.interf = interf;

//  таким образом я приравнял Interf interf из 4 строки класса Сервер
//  к new Client() из 6 строки в main
    public Server(Interf interf) {
        this.interf = interf;
    }


//  тут я вызываю метод methodInterface() у Interf interf = new Client()
    public void methodServer(){
        interf.methodInterface();
    }

}
