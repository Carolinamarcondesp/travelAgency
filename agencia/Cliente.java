package agencia;

public class Cliente {
    private int id;
    public String nome;
    public String email;
    public String NIF;

    public Cliente(int id, String nome, String email, String NIF) {
        this.id = id;
        this.nome = nome;
        this.email = email;
        this.NIF = NIF;
    }

    public int getId() {
        return this.id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getNome() {
        return this.nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getEmail() {
        return this.email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getNIF() {
        return this.NIF;
    }

    public void setNIF(String NIF) {
        this.NIF = NIF;
    }


    @Override
    public String toString() {
        return "[" + this.id + "] " + this.nome + " , " + this.email + " , " + this.NIF;
    }
    
    
}

    



