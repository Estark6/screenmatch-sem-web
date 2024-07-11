package br.com.alura.screenmatch.model;

public enum Categoria {
    ACAO("Action", "Ação"),

    ROMANCE("Romance", "Romance"),

    COMEDIA("Comedy", "Comédia"),

    DRAMA("Drama", "Drama"),

    CRIME("Crime", "Crime");

    private String categoriaOmdb;
    private String categoriaPrtugues;

    Categoria(String categoriaOmdb, String categoriaPrtugues){
        this.categoriaOmdb = categoriaOmdb;
        this.categoriaPrtugues =categoriaPrtugues;
    }

    public static Categoria fromString(String text) {
        for (Categoria categoria : Categoria.values()) {
            if (categoria.categoriaOmdb.equalsIgnoreCase(text)) {
                return categoria;
            }
        }
        throw new IllegalArgumentException("Nenhuma categoria encontrada para a string fornecida: " + text);
    }

    public static Categoria fromPortugues(String text) {
        for (Categoria categoria : Categoria.values()) {
            if (categoria.categoriaPrtugues.equalsIgnoreCase(text)) {
                return categoria;
            }
        }
        throw new IllegalArgumentException("Nenhuma categoria encontrada para a string fornecida: " + text);
    }
}