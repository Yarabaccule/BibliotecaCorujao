package br.com.bibliotecacorujao.library.curtidas;

import br.com.bibliotecacorujao.library.Midia;

public class Curtidas {
    public void curtir(Midia midia){
        if(midia.getNumeroAcessos()>20){
            System.out.println("O arquivo "+midia.getTitulo()+" está pelando!!");
        } else if(midia.getNumeroAcessos()>=10){
            System.out.println("O arquivo " + midia.getTitulo() + " esta sendo curtido!");
        } else {
            System.out.println("O arquivo " + midia.getTitulo() + " esta para você curtir!!!!");
        }
    }
}
