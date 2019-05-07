package com.ocr.nicolas.escalade.business.contract;

import com.ocr.nicolas.escalade.model.bean.Secteur;

import java.util.List;

public interface SectorManager {

    List<Secteur> getListOneSector(int pSite);
    int getNbrSecteur(String pNom);
}
