package com.ocr.nicolas.escalade.model.bean;

import javax.validation.constraints.NotBlank;

/**
 * Bean representant un Utilisateur.
 */
public class Utilisateur {

    // ============ Attributs =========
    private Integer id;
    private String raisonSociale;
    @NotBlank
    private String nom;
    @NotBlank
    private String prenom;
    @NotBlank
    private String motDePasse;
    private String adresse;
    private Integer codePostal;
    private String ville;
    private String pays;
    private String numeroTelephone;
    @NotBlank
    private String email;
    private boolean membreAssociation;
    private String autre;

    // other attribute for put element_id user session
    private Integer element_id;

    // ============ Constructeurs ======
    /**
     * Constructeur par defaut
     */
    public Utilisateur() {
    }

    /**
     * Constructeur
     *
     * @param pId
     */
    public Utilisateur(Integer pId) {id = pId;}

    // =========== Getters et Setters ====
    public Integer getId() {
        return id;
    }
    public void setId(Integer id) {
        this.id = id;
    }
    public String getRaisonSociale() {
        return raisonSociale;
    }
    public void setRaisonSociale(String raisonSociale) {
        this.raisonSociale = raisonSociale;
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
    public String getMotDePasse() {
        return motDePasse;
    }
    public void setMotDePasse(String motDePasse) {
        this.motDePasse = motDePasse;
    }
    public String getAdresse() {
        return adresse;
    }
    public void setAdresse(String adresse) {
        this.adresse = adresse;
    }
    public Integer getCodePostal() {
        return codePostal;
    }
    public void setCodePostal(Integer codePostal) {
        this.codePostal = codePostal;
    }
    public String getVille() {
        return ville;
    }
    public void setVille(String ville) {
        this.ville = ville;
    }
    public String getPays() {
        return pays;
    }
    public void setPays(String pays) {
        this.pays = pays;
    }
    public String getNumeroTelephone() {
        return numeroTelephone;
    }
    public void setNumeroTelephone(String numeroTelephone) {
        this.numeroTelephone = numeroTelephone;
    }
    public String getEmail() {
        return email;
    }
    public void setEmail(String email) {
        this.email = email;
    }
    public boolean isMembreAssociation() {
        return membreAssociation;
    }
    public void setMembreAssociation(boolean membreAssociation) {
        this.membreAssociation = membreAssociation;
    }
    public String getAutre() {
        return autre;
    }
    public void setAutre(String autre) {
        this.autre = autre;
    }
    public Integer getElement_id() {
        return element_id;
    }
    public void setElement_id(Integer element_id) {
        this.element_id = element_id;
    }
    // =========== Methodes ===========
}
