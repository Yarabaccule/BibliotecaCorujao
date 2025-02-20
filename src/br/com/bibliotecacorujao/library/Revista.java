package br.com.bibliotecacorujao.library;

public class Revista extends Midia {
    private String edicao;
    private int mesPublicacao;

    public String getEdicao() {
        return edicao;
    }

    public void setEdicao(String edicao) {
        this.edicao = edicao;
    }

    public int getMesPublicacao() {
        return mesPublicacao;
    }

    public void setMesPublicacao(int mesPublicacao) {
        this.mesPublicacao = mesPublicacao;
    }
}
