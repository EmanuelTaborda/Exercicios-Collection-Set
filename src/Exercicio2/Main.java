package Exercicio2;/*
Crie uma classe LinguagemFavorita que possua os atributos nome, anoDeCriacao e IDE.
Em seguida, crie um conjunto com 3 linguagens e faça um programa que ordene esse conjunto por:
a) Ordem de inserção;
b) Ordem natural(nome);
c) IDE;
d) Ano de criação e nome;
e) Nome, ano de criação e IDE;
Ao final, exiba as linguagens no console, um abaixo da outra.
*/

import java.util.*;

public class Main {

    public static void main(String[] args) {
        System.out.println("A) Ordem de inserção;");
        Set<LinguagemFavorita> minhasLinguagensFavoritas = new LinkedHashSet<>() {{
            add(new LinguagemFavorita("Java", 1996, "Intellij"));
            add(new LinguagemFavorita("Python", 1991, "Pycharm"));
            add(new LinguagemFavorita("Kotlin", 2016, "VsCode"));
        }};

        System.out.println(minhasLinguagensFavoritas);

        System.out.println("\nB) Ordem natural(nome)");
        Set<LinguagemFavorita> minhasLinguagensFavoritas2 = new TreeSet<>(minhasLinguagensFavoritas);
        for (LinguagemFavorita linguagem: minhasLinguagensFavoritas2) {
            System.out.println(linguagem.getNome() + "- " + linguagem.getAnoDeCriacao()
                    + "- " + linguagem.getIDE());
        }

        System.out.println("\nC) Ordenação por IDE");
        Set<LinguagemFavorita> minhasLinguagensFavoritas3 = new TreeSet<>(new ComparatorLinguagemFavoritaByIDE());
        minhasLinguagensFavoritas3.addAll(minhasLinguagensFavoritas);
        for (LinguagemFavorita linguagem: minhasLinguagensFavoritas3) {
            System.out.println(linguagem.getNome() + "- " + linguagem.getAnoDeCriacao()
                    + "- " + linguagem.getIDE());
        }

        System.out.println("\nD) Ordenação por Ano de criação e nome;");
        Set<LinguagemFavorita> minhasLinguagensFavoritas4 = new TreeSet<>(new ComparatorLinguagemByAnoENome());
        minhasLinguagensFavoritas4.addAll(minhasLinguagensFavoritas);
        for (LinguagemFavorita linguagem: minhasLinguagensFavoritas4) {
            System.out.println(linguagem.getNome() + "- " + linguagem.getAnoDeCriacao()
                    + "- " + linguagem.getIDE());
        }

        System.out.println("\nE) Ordenação por Nome, ano de criação e IDE");
        Set<LinguagemFavorita> minhasLinguagensFavoritas5 = new TreeSet<>(new ComparatorLinguagemByNomeAnoEIDE());
        minhasLinguagensFavoritas5.addAll(minhasLinguagensFavoritas);
        for (LinguagemFavorita linguagem: minhasLinguagensFavoritas5) {
            System.out.println(linguagem.getNome() + "- " + linguagem.getAnoDeCriacao()
                    + "- " + linguagem.getIDE());
        }
    }
}
