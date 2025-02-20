import br.com.bibliotecacorujao.library.Audiobook;
import br.com.bibliotecacorujao.library.Livro;
import br.com.bibliotecacorujao.library.Revista;
import br.com.bibliotecacorujao.library.curtidas.Curtidas;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        Livro senhorAneis = new Livro();
        senhorAneis.setTitulo("Senhor dos Aneis");
        senhorAneis.setAutor("J.R.R. Tolkien");
        senhorAneis.setGenero("Fantasia");
        senhorAneis.setPaginas(250);
        senhorAneis.setEditora("Saraiva");
        senhorAneis.setAnoPublicacao(1953);
        senhorAneis.setNumeroAcessos(1000);
        System.out.println("Titulo: " + senhorAneis.getTitulo());
        System.out.println("Autor: " + senhorAneis.getAutor());
        System.out.println( "O genero é " + senhorAneis.getGenero());
        System.out.println("Tem " + senhorAneis.getPaginas() + " paginas");
        System.out.println("Editora: " + senhorAneis.getEditora());
        System.out.println("Ano de publicação " + senhorAneis.getAnoPublicacao());
        System.out.println("Foi Acessado " + senhorAneis.getNumeroAcessos() + " vezes");
        Curtidas curtidas = new Curtidas();
        curtidas.curtir(senhorAneis);

        System.out.println();

        Revista magazineUai = new Revista();
        magazineUai.setTitulo("Magazine UAI");
        magazineUai.setAnoPublicacao(2019);
        magazineUai.setMesPublicacao(10);
        magazineUai.setEdicao("9");
        magazineUai.setNumeroAcessos(15);
        System.out.println("Titulo: " + magazineUai.getTitulo());
        System.out.println("Ano de Publicaçao " + magazineUai.getAnoPublicacao());
        System.out.println("Mes de Publicaçao" + magazineUai.getMesPublicacao());
        System.out.println("Edição: " + magazineUai.getEdicao());
        System.out.println("Foi Acessado " + magazineUai.getNumeroAcessos() + " vezes");
        curtidas.curtir(magazineUai);

        System.out.println();

        Audiobook oPoderDoHabito = new Audiobook();
        oPoderDoHabito.setTitulo("O poder do Habito");
        oPoderDoHabito.setAutor("Charles Dhu");
        oPoderDoHabito.setNarrador("Elias Jet");
        oPoderDoHabito.setDuracao(120);
        oPoderDoHabito.setNumeroAcessos(15);
        System.out.println("Titulo: " + oPoderDoHabito.getTitulo());
        System.out.println("Autor: " + oPoderDoHabito.getAutor());
        System.out.println("Narrador: " + oPoderDoHabito.getNarrador());
        System.out.println("Tem duração de " + oPoderDoHabito.getDuracao() + " minutos");
        System.out.println("Foi Acessado " + oPoderDoHabito.getNumeroAcessos() + " vezes");
        curtidas.curtir(oPoderDoHabito);

    }
}