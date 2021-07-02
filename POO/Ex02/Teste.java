package Ex02;

import java.util.ArrayList;

public class Teste{
    public static void main(String[] args){
          ArrayList<Escritorio> es = new ArrayList<Escritorio>();
          es.add(new Livro());	
          es.add(new Caneta());
          es.add(new Caderno());
          for(Escritorio e : es){
                e.mostrar();
          }
    }
}