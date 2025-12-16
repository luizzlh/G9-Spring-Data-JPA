package br.com.alura.screenmatch.models;

public enum Categoria {
    ACAO("Action"),
    ROMANCE("Romance"),
    COMEDIA("Comedy"),
    DRAMA("Drama"),
    CRIME("Crime");

    private String categoriaOmdb;

    Categoria(String caregoriaOmdb){
        this.categoriaOmdb = caregoriaOmdb;
    }

    public static Categoria fromString(String text){
        for(Categoria categoria: Categoria.values()){
            if(categoria.categoriaOmdb.equalsIgnoreCase(text)){
                return categoria;
            }
        }
        throw new IllegalArgumentException("Nenhuma categoria encontrada para a string fornecida");
    }

}
