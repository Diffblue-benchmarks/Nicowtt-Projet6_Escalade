package com.ocr.nicolas.escalade.consumer.contract.dao;

import com.ocr.nicolas.escalade.model.bean.secteur.Secteur;
import com.ocr.nicolas.escalade.model.bean.site.Site;
import com.ocr.nicolas.escalade.model.bean.voie.Voie;

import java.util.List;

public interface EscaladeDao {

    int getNbrAllSite();
    List<Voie> getListVoie(int pSecteur);
    List<Secteur> getListOneSector(int pSite);
    int getNbrSecteur(String pNom);
    List<Voie> getListAllWaysForOneSite (int pSite);
    List<Site> getListOneSite(int pSite);
    List<Site> getLitAllSite();
}
