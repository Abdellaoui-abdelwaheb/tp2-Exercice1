

public class TesteCompte {
    public static void main(String[] args) {

        Compte compte1 = new Compte();
        Compte compte2 = new Compte();


        compte1.deposer(500);
        compte2.deposer(1000);
        compte2.retirer(10);
        compte1.virerVers(75, compte2);


        System.out.println("Soldes après opérations:");
        compte1.afficher();
        compte2.afficher();

        Compte[] comptes = new Compte[10];


        for (int i = 0; i < comptes.length; i++) {
            comptes[i] = new Compte();
            comptes[i].deposer(200 + (100 * i)); // Dépôt de 200 + (indice * 100)
        }


        for (int i = 0; i < comptes.length - 1; i++) {
            comptes[i].virerVers(20, comptes[i + 1]);
        }

        System.out.println("Soldes des comptes après opérations:");
        for (Compte compte : comptes) {
            compte.afficher();
        }
    }
}
