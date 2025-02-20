package br.com.bibliotecacorujao.library;

public class Audiobook extends Midia {
    private String narrador;
    private int duracao;

    public String getNarrador() {
        return narrador;
    }

    public void setNarrador(String narrador) {
        this.narrador = narrador;
    }

    public int getDuracao() {
        return duracao;
    }

    public void setDuracao(int duracao) {
        this.duracao = duracao;
    }
}
