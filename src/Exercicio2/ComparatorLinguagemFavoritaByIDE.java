package Exercicio2;

import java.util.Comparator;

public class ComparatorLinguagemFavoritaByIDE implements Comparator<LinguagemFavorita> {
    @Override
    public int compare(LinguagemFavorita l1, LinguagemFavorita l2) {
        int IDE = l1.getIDE().compareTo(l2.getIDE());
        return IDE;
    }
}
