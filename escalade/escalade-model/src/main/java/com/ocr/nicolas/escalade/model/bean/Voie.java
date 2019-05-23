package com.ocr.nicolas.escalade.model.bean;


import javax.validation.constraints.*;

/**
 * Bean representant une Voie d'escalade
 */
public class Voie {

    // ==================== Attributs ====================
    private Integer id;

    @DecimalMax(value="100000")
    @DecimalMin(value="1")
    @NotNull
    private Integer numero;

    @Size(max=100)
    private String nomVoie;

    @DecimalMax(value="1000")
    @DecimalMin(value="1")
    private Integer tempDescalade;

    @Size(max=500)
    private String descriptionVoie;

    @Size(max=50)
    private String longueur;

    @Size(max=50)
    private String cotation;

    @DecimalMax(value="100000")
    @DecimalMin(value="1")
    private Integer hauteur;

    @Size(max=100)
    private String precisionEquipement;

    @Size(max=100)
    private String ouvertureEtEquipement;

    private String dateOuverture;

    @Size(max=50)
    private String statut;

    private Integer element_id;

    private Integer secteur_id;
    //bean
    private Secteur secteur;

    // ==================== Constructeurs ====================
    /**
     * Constructeur par defaut.
     */
    public Voie() {
    }

    /**
     * Contructeur
     * @param pId
     */
    public Voie(Integer pId) {id = pId;}

    // ==================== Getters/Setters ====================
    public Integer getId() {
        return id;
    }
    public void setId(Integer id) {
        this.id = id;
    }
    public Integer getNumero() {
        return numero;
    }
    public void setNumero(Integer numero) {
        this.numero = numero;
    }
    public String getNomVoie() {
        return nomVoie;
    }
    public void setNomVoie(String nomVoie) {
        this.nomVoie = nomVoie;
    }
    public Integer getTempDescalade() {
        return tempDescalade;
    }
    public void setTempDescalade(Integer tempDescalade) {
        this.tempDescalade = tempDescalade;
    }
    public String getDescriptionVoie() {
        return descriptionVoie;
    }
    public void setDescriptionVoie(String descriptionVoie) {
        this.descriptionVoie = descriptionVoie;
    }
    public String getLongueur() {
        return longueur;
    }
    public void setLongueur(String longueur) {
        this.longueur = longueur;
    }
    public String getCotation() {
        return cotation;
    }
    public void setCotation(String cotation) {
        this.cotation = cotation;
    }
    public Integer getHauteur() {
        return hauteur;
    }
    public void setHauteur(Integer hauteur) {
        this.hauteur = hauteur;
    }
    public String getPrecisionEquipement() {
        return precisionEquipement;
    }
    public void setPrecisionEquipement(String precisionEquipement) {
        this.precisionEquipement = precisionEquipement;
    }
    public String getOuvertureEtEquipement() {
        return ouvertureEtEquipement;
    }
    public void setOuvertureEtEquipement(String ouvertureEtEquipement) {
        this.ouvertureEtEquipement = ouvertureEtEquipement;
    }
    public String getDateOuverture() {
        return dateOuverture;
    }
    public void setDateOuverture(String dateOuverture) {
        this.dateOuverture = dateOuverture;
    }
    public String getStatut() {
        return statut;
    }
    public void setStatut(String statut) {
        this.statut = statut;
    }
    public Integer getElement_id() {
        return element_id;
    }
    public void setElement_id(Integer element_id) {
        this.element_id = element_id;
    }
    public Integer getSecteur_id() {
        return secteur_id;
    }
    public void setSecteur_id(Integer secteur_id) {
        this.secteur_id = secteur_id;
    }
    public Secteur getSecteur() {
        return secteur;
    }
    public void setSecteur(Secteur secteur) {
        this.secteur = secteur;
    }
    // ==================== Méthodes ====================
}
