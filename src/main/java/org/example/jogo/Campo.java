package org.example.jogo;

public class Campo {
    private char simbolo;

    /*construtor da classe*/
    public Campo(char simbolo) {
        this.simbolo = simbolo;
    }
    public char getSimbolo() {
        return simbolo;
    }
    public void setSimbolo(char simbolo) {
        if(this.simbolo == ' ') {
            this.simbolo = simbolo;
        }else {
            System.out.println("Campo já utiliado pelo jogador");
        }

    }


}
