package Exercicio2;

import java.util.Comparator;

public class ComparatorLinguagemByAnoENome implements Comparator<LinguagemFavorita> {
    @Override
    public int compare(LinguagemFavorita o1, LinguagemFavorita o2) {
        int ano = Integer.compare(o1.getAnoDeCriacao(), o2.getAnoDeCriacao());
        if (ano !=0) {
            return ano;
        }

        return o1.getNome().compareTo(o2.getNome());
    }
}
