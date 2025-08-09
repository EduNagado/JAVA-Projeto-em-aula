package entity;

public enum Categoria {
    ROMANCE("Romance"),
    SUSPENSE("Suspense"),
    COMEDIA("Comedia"),
    FICCAO("Ficção"),
    BIOGRAFIA("Biografia"),
    FANTASIA("Fantasia"),
    TECNOLOGIA("Tecnologia");

    private String descricao;

    Categoria(String descricao){
        this.descricao=descricao;
    }
    public String getDescricao(){
        return  descricao;
    }
}
