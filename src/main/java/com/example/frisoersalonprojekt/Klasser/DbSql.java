package com.example.frisoersalonprojekt.Klasser;

import java.sql.*;

public class DbSql {
    public Connection connection;
    private PreparedStatement Pstmt;
    private Statement stmt;


    public DbSql() throws SQLException {
        connection = null;
        Statement stmt = null;

        try {
            String url = "jdbc:mysql://localhost:3306/frisoersalon";
            connection = DriverManager.getConnection(url,"root","");


        } catch (SQLException throwables) {
            throwables.printStackTrace();
        }
    }



    public void opretKunde(String fornavn, String efternavn, String telefon, String email, String brugernavn, String adgangskode) {
        String sql = "INSERT INTO Kunde (kundeFornavn, kundeEfternavn, kundeTelefon, kundeEmail, brugernavn, adgangskode) VALUES (?, ?, ?, ?, ?, ?)";
        try (PreparedStatement pstmt = connection.prepareStatement(sql)) {
            pstmt.setString(1, fornavn);
            pstmt.setString(2, efternavn);
            pstmt.setString(3, telefon);
            pstmt.setString(4, email);
            pstmt.setString(5, brugernavn);
            pstmt.setString(6, adgangskode);
            pstmt.executeUpdate();
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }


    public boolean validateLogin(String brugernavn, String adgangskode) {
        String sql = "SELECT * FROM Kunde WHERE brugernavn = ? AND adgangskode = ?";
        try (PreparedStatement pstmt = connection.prepareStatement(sql)) {
            pstmt.setString(1, brugernavn);
            pstmt.setString(2, adgangskode);
            ResultSet rs = pstmt.executeQuery();
            return rs.next(); // Hvis der findes en bruger, returneres true
        } catch (SQLException e) {
            e.printStackTrace();
            return false; // I tilfælde af en fejl, returner false
        }
    }














    public Connection getConnection() {
        return connection;
    }

    public void closeConnection() {
        try {
            if (connection != null) {
                connection.close();
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }














/*
    public Kunde soegKunde(int kundeId) {
        Kunde kunde = new Kunde();
        kunde.setKundeId(kundeId);
        try {
            String sql = "select * from Kunde where kundeId =" + String.valueOf(kundeId);
            Statement stmt = connection.createStatement();
            ResultSet rs = stmt.executeQuery(sql);
            if (rs.next()) {
                kunde.setKundeId(rs.getInt("kundeId"));
                kunde.setKundeFornavn(rs.getString("kundeFornavn"));
                kunde.setKundeEfternavn(rs.getString("kundeEfternavn"));
                kunde.setKundeEmail(rs.getString("kundeEmail"));
                kunde.setKundeTelefon(rs.getInt("KundeTelefon"));

                return kunde;
            }
            stmt.close();
        } catch (SQLException throwables) {
            throwables.printStackTrace();
        }
        return null;
    }






    public ArrayList udskrivAlleTidsbestilling() {
        ArrayList<tidspunkt> tidspunktList = new ArrayList<>();
        try {
            String sql = "select * from tidspunkt";
            Statement stmt = connection.createStatement();
            ResultSet rs = stmt.executeQuery(sql);
            while (rs.next()) {
                tidspunkt l = new tidspunkt();
                l.setkundeId(rs.getInt(" kunde Id"));
                l.setserviceId(rs.getInt("service Id"));
                TidsbestillingList.add(l);
            }
            stmt.close();
        } catch (SQLException throwables) {
            throwables.printStackTrace();
        }
        return TidsbestillingList;

    }*/

}