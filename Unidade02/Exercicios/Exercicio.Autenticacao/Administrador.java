class Administrador implements Autenticavel {
    private String nome;
    private String senha;

    public Administrador(String nome, String senha) {
        this.nome = nome;
        this.senha = senha;
    }

    @Override
    public boolean autenticar(String senha) {
        return this.senha.equals(senha) && senha.length() > 5;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getSenha() {
        return senha;
    }

    public void setSenha(String senha) {
        this.senha = senha;
    }
}