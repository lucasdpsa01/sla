import br.com.paiva.screenmatch.modelos.Filme;

public class Principal {
    public static void main(String[] args) {
        Filme meuFilme = new Filme();
        meuFilme.setNome("Megaman Star Force");
        meuFilme.setAnoDeLancamento(2026);
        meuFilme.setDuracaoEmMinutos(190);

        meuFilme.exibeFichaTecnica();
        meuFilme.avalia(6);
        meuFilme.avalia(9);
        meuFilme.avalia(10);
        System.out.println(meuFilme.getTotalDeAvaliacao());
        System.out.println(meuFilme.pegaMedia());
     }
}