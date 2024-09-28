package ListaJava;

public class Lista {
    private No primeiro;

   //Construtor:
   
   public Lista(){
    primeiro = null;
   }

   // getter:

   public No getPrimeiro(){
    return primeiro;
   }

   //A lista está vazia:

   public boolean estavazia(){

    if (primeiro == null){
        return true;
    } else {
        return false;
    }


   }

   //Insere na primeira posiçao da lista:
   public void inserePrimeiro(int valor){
    No no1 = new No(valor);
    no1.setProximo(primeiro);
    primeiro = no1;

   }

   //Mostra Lista:
   public void mostrar(){
    if (estavazia()){
        System.out.println("Lista vista. Não há informação para mostrar");
   }else {

    No cursor = primeiro;
    while (cursor != null){
       System.out.println( cursor.getInfo());
       cursor = cursor.getProximo();
    }
   }

   }
   //Insere último:
   public void insereUltimo(int valor){
    if (estavazia()){
        inserePrimeiro(valor);
    } else {
        No cursor = primeiro;
        while (cursor.getProximo() != null){
            cursor = cursor.getProximo();


        }
        No no1 = new No(valor);
        cursor.setProximo(no1);
       
    }
 

   }

   // Metodo de remoção:

   public No removePrimeiro(){
    
    if (estavazia()){
       System.out.println("Está vazia, não tem nada para remover."); 
       return null;
    } else {
       No  cursor = primeiro;
       primeiro = primeiro.getProximo();
       return cursor;
       

    
    }
   }

   // método de busca:
   
   public String buscar(int valor) {
    int index = 0;
    No cursor = primeiro;
    while (cursor != null) {
        if (cursor.getInfo() == valor) {
            return "Valor encontrado no nó " + index;
        }
        index++;
        cursor = cursor.getProximo();
    }
    return "Não encontrou. Ele executou " + index + " passos";
}


    
}
