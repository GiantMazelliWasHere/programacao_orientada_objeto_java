public class Livro {
    private String titulo;
    private String autor;
    private int nPaginas;

    public Livro(String titulo, String autor, int nPaginas) {
        this.titulo = titulo;
        this.autor = autor;
        this.nPaginas = nPaginas;
    }

    public static void exibirInformacoes(Livro livro) {
        System.out.println("Título: " + livro.getTitulo());
        System.out.println("Autor: " + livro.getAutor());
        System.out.println("Número de páginas: " + livro.getnPaginas());
    }

    public String getTitulo() {
        return titulo;
    }

    public String getAutor() {
        return autor;
    }

    public int getnPaginas() {
        return nPaginas;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public void setAutor(String autor) {
        this.autor = autor;
    }

    public void setnPaginas(int nPaginas) {
        this.nPaginas = nPaginas;
    }

    public static void main(String[] args) {
        Livro livro1 = new Livro("O Senhor dos Anéis", "J.R.R. Tolkien", 1178);
        Livro livro2 = new Livro("1984", "George Orwell", 328);

        exibirInformacoes(livro1);
        System.out.println();
        exibirInformacoes(livro2);
    }
}
