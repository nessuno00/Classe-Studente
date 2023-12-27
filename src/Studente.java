
public class Studente {

    private String nome;

    private String cognome;

    private String identi;

    public Studente(String nome, String cognome, String identi) {

        this.nome = nome;
        this.cognome = cognome;
        this.identi = identi;
    }

    public String getNome() {

        return nome;
    }

    public String getCognome() {

        return cognome;
    }

    public String getIdenti() {

        return identi;
    }

    public void setNome(String nome) {

        this.nome = nome;
    }

    public void setCognome(String cognome) {

        this.cognome = cognome;
    }

    public void setIdenti(String identi) {

        this.identi = identi;
    }

    public static void main(String[] args) {

        Studente studente1 = new Studente("Alex", "Gatto", "A12");
        Studente studente2 = new Studente("Iano", "Papale", "A21");

        System.out.println("Il nome dello studente : " + studente1.getNome());

        System.out.println("Il cognome dello studente : " + studente1.getCognome());

        System.out.println("L'identicativo dello studente : " + studente1.getIdenti());

System.out.println("\nIl secondo studente è ");

        System.out.println("\nIl nome dell secondo studente : " + studente2.getNome() );
        System.out.println("\nIl cognome dell secondo studente : " + studente2.getCognome() );
        System.out.println("\nL'identicativo dell secondo studente : " + studente2.getIdenti()  );

        studente1.setNome("Francesco");
        studente1.setCognome("Dev");
        studente1.setIdenti("A90");

        System.out.println("\nDopo la modifica:");

        System.out.println("Nome dello studente1 : " + studente1.getNome() );

        System.out.println("Cognome  studente1 : " + studente1.getCognome() );

        System.out.println("L'identicativo studente1 : " + studente1.getIdenti() );

    }
}

