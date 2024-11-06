class Compte {
    private int solde = 0;


    void deposer(int montant) {
        solde += montant;
    }


    void retirer(int montant) {
        solde -= montant;
    }


    void virerVers(int montant, Compte destination) {
        if (montant <= solde) {
            retirer(montant);
            destination.deposer(montant);
        } else {
            System.out.println("Fonds insuffisants pour le virement.");
        }
    }


    void afficher() {
        System.out.println("Solde: " + solde);
    }
}
