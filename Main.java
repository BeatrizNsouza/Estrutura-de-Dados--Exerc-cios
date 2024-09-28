package ListaJava;

public class Main {

    public static void main(String[] args) {

       Lista lista = new Lista();

  System.out.println(lista.estavazia());
  lista.inserePrimeiro(10);
  lista.inserePrimeiro(10);
  lista.mostrar();
 System.out.println("Removi primeiro o " + lista.removePrimeiro().getInfo());
    }

    

    
}
