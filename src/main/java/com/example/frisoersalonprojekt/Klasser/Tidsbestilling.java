package com.example.frisoersalonprojekt.Klasser;

import java.sql.Timestamp;

public class Tidsbestilling {

    private int tidsbestillingsId;
    private int medarbejderId;
    private int kundeId;
    private int serviceId;
    private Timestamp tidspunkt;
    private String status;
    private String serviceNavn;
    private int pris;

    public Tidsbestilling() {
    }

    public Tidsbestilling(int tidsbestillingsId, int medarbejderId, int kundeId, int serviceId, Timestamp tidspunkt, String status, String serviceNavn, int pris) {
        this.tidsbestillingsId = tidsbestillingsId;
        this.medarbejderId = medarbejderId;
        this.kundeId = kundeId;
        this.serviceId = serviceId;
        this.tidspunkt = tidspunkt;
        this.status = status;
        this.serviceNavn = serviceNavn;
        this.pris = pris;
    }

    public int getTidsbestillingsId() {
        return tidsbestillingsId;
    }

    public void setTidsbestillingsId(int tidsbestillingsId) {
        this.tidsbestillingsId = tidsbestillingsId;
    }

    public int getMedarbejderId() {
        return medarbejderId;
    }

    public void setMedarbejderId(int medarbejderId) {
        this.medarbejderId = medarbejderId;
    }

    public int getKundeId() {
        return kundeId;
    }

    public void setKundeId(int kundeId) {
        this.kundeId = kundeId;
    }

    public int getServiceId() {
        return serviceId;
    }

    public void setServiceId(int serviceId) {
        this.serviceId = serviceId;
    }

    public Timestamp getTidspunkt() {
        return tidspunkt;
    }

    public void setTidspunkt(Timestamp tidspunkt) {
        this.tidspunkt = tidspunkt;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public String getServiceNavn() {
        return serviceNavn;
    }

    public void setServiceNavn(String serviceNavn) {
        this.serviceNavn = serviceNavn;
    }

    public int getPris() {
        return pris;
    }

    public void setPris(int pris) {
        this.pris = pris;
    }
}
