package com.example.mysncf_enquete_lm;

import java.util.HashMap;

public class Candidat
{
    private String nom, prenom, age, frequence ;
    private HashMap<String, Integer> lesReponses;

    public Candidat(String nom, String prenom, String age, String frequence) {
        this.nom = nom;
        this.prenom = prenom;
        this.age = age;
        this.frequence = frequence;
        this.lesReponses = new HashMap<>();
    }
    public void ajouterReponse (String question, int score )
    {
        this.lesReponses.put(question, score);
    }
        public float moyenne()
        {
            float total = 0;
            for (Integer score : this.lesReponses.values())
            {
                total += score;
            }
            return total / this.lesReponses.size();
        }

    public String getNom() {
        return nom;
    }

    public void setNom(String nom) {
        this.nom = nom;
    }

    public String getPrenom() {
        return prenom;
    }

    public void setPrenom(String prenom) {
        this.prenom = prenom;
    }

    public String getAge() {
        return age;
    }

    public void setAge(String age) {
        this.age = age;
    }

    public String getFrequence() {
        return frequence;
    }

    public void setFrequence(String frequence) {
        this.frequence = frequence;
    }

    public HashMap<String, Integer> getLesReponses() {
        return lesReponses;
    }

    public void setLesReponses(HashMap<String, Integer> lesReponses) {
        this.lesReponses = lesReponses;
    }
}

