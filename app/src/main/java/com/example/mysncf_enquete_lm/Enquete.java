package com.example.mysncf_enquete_lm;

import java.util.HashMap;

public class Enquete
{
    private HashMap<String, Candidat> lesCandidats;

    public Enquete() {
        this.lesCandidats = new HashMap<>();
    }
    public void ajouterCandidat (Candidat unCandidat)
    {
        this.lesCandidats.put(unCandidat.getNom(), unCandidat);
    }
        public Candidat getCandidat(String nom)
        {
            return this.lesCandidats.get(nom);
        }

    public HashMap<String, Candidat> getLesCandidats() {
        return lesCandidats;
    }

    public void setLesCandidats(HashMap<String, Candidat> lesCandidats) {
        this.lesCandidats = lesCandidats;
    }
}
