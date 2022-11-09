package models;

/**
 * @author Matheus Martinelli
 * 09 /11/ 2022
 */
public class Clientes {
    private String nome;

    public Clientes(String nome) {
        this.nome = nome;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }
}
