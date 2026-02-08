import br.com.paiva.screenmatch.calculos.CalculadoraDeTempo;
import br.com.paiva.screenmatch.modelos.Filme;
import br.com.paiva.screenmatch.modelos.Serie;

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

        Serie lost = new Serie();
        lost.setNome("Lost");
        lost.setAnoDeLancamento(2000);
        lost.exibeFichaTecnica();
        lost.setTemporadas(10);
        lost.setEpisodiosPorTemporada(10);
        lost.setMinutosPorEpisodio(50);
        System.out.println("Duração da serie: " + lost.getDuracaoEmMinutos());

        Filme outroFilme = new Filme();
        meuFilme.setNome("Megaman Dual Override");
        meuFilme.setAnoDeLancamento(2027);
        meuFilme.setDuracaoEmMinutos(210);

        CalculadoraDeTempo calculadora = new CalculadoraDeTempo();
        calculadora.inclui(meuFilme);
        calculadora.inclui(outroFilme);
        System.out.println(calculadora.getTempoTotal());
     }
}