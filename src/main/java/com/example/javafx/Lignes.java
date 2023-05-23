package com.example.javafx;

public class Lignes {
    private String codeValue;
    private String alternateName;
    private String country_group;
    private String nameEn;
    private String nameFr;
    private String nameDe;
    private String latitude;
    private String longitude;

    public String getCodeValue() {
        return codeValue;
    }

    public String getAlternateName() {
        return alternateName;
    }

    public String getCountry_group() {
        return country_group;
    }

    public String getNameEn() {
        return nameEn;
    }

    public String getNameFr() {
        return nameFr;
    }

    public String getNameDe() {
        return nameDe;
    }

    public String getLatitude() {
        return latitude;
    }

    public String getLongitude() {
        return longitude;
    }

    public void setCodeValue(String codeValue) {
        this.codeValue = codeValue;
    }

    public void setAlternateName(String alternateName) {
        this.alternateName = alternateName;
    }

    public void setCountry_group(String country_group) {
        this.country_group = country_group;
    }

    public void setNameEn(String nameEn) {
        this.nameEn = nameEn;
    }

    public void setNameFr(String nameFr) {
        this.nameFr = nameFr;
    }

    public void setNameDe(String nameDe) {
        this.nameDe = nameDe;
    }

    public void setLatitude(String latitude) {
        this.latitude = latitude;
    }

    public void setLongitude(String longitude) {
        this.longitude = longitude;
    }



    Lignes(String code, String nomAlter, String groupePays, String EN, String FR, String DE, String latitude, String longitude){
        this.codeValue = code;
        this.alternateName = nomAlter;
        this.country_group = groupePays;
        this.nameEn = EN;
        this.nameFr = FR;
        this.nameDe = DE;
        this.latitude = latitude;
        this.longitude =longitude;
    }
}
