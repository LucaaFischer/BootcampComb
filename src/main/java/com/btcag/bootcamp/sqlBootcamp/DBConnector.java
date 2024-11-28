package com.btcag.bootcamp.sqlBootcamp;
import java.sql.*;
import java.sql.ResultSet;

public class DBConnector {
    private static final String URL = "jdbc:sqlite:C:/Users/lucaf/Desktop/sqlite_tools/Bootcamp_DB_2024.db";

    public static Connection connect() {
        Connection conn = null;
        try {
            conn = DriverManager.getConnection(URL);
            System.out.println("Verbindung zur SQLite-Datenbank hergestellt.");
        } catch (SQLException e) {
            System.out.println("Verbindung zur SQLite-Datenbank fehlgeschlagen.");
            e.printStackTrace();
        }
        return conn;
    }

    public static void createTable() {
        String sql = "CREATE TABLE IF NOT EXISTS User (" + "id INTEGER PRIMARY KEY AUTOINCREMENT, " + "username TEXT NOT NULL, " + "password TEXT NOT NULL," + "avatar Text NOT NULL" + ");";
        try (Connection conn = connect(); Statement stmt = conn.createStatement()) {
            stmt.execute(sql);
            System.out.println("Tabelle 'User' wurde erfolgreich erstellt.");
        } catch (SQLException e) {
            System.out.println("Fehler beim Erstellen der Tabelle 'User'.");
            e.printStackTrace();
        }
    }

    public static void insertUser(String username, String password, String avatar) {
        String sql = "INSERT INTO User(username, password, avatar) VALUES(?, ?, ?)";
        try (Connection conn = connect();
             PreparedStatement pstmt = conn.prepareStatement(sql)) {
            pstmt.setString(1, username);
            pstmt.setString(2, password);
            pstmt.setString(3, avatar);
            pstmt.executeUpdate();
            System.out.println("User erfolgreich eingefügt.");
        } catch (SQLException e) {
            System.out.println("Fehler beim Einfügen des Users.");
            e.printStackTrace();
        }
    }

    public static boolean tryLoggingIn(String userNameInput, String passwordInput) {
        String sql = "SELECT * FROM User WHERE username = ? AND password = ?";

        try (Connection conn = connect();
             PreparedStatement pstmt = conn.prepareStatement(sql)) {
            pstmt.setString(1, userNameInput);
            pstmt.setString(2, passwordInput);
            ResultSet rs = pstmt.executeQuery();

            if (rs.isBeforeFirst()) {
                System.out.println("Willkommen " + userNameInput);
                return true;
            } else {
                System.out.println("Username oder Passwort falsch");
                return false;
            }

        } catch (SQLException e) {
            System.out.println("Fehler beim einloggen.");
            e.printStackTrace();
        }
        return false;
    }

    public static void selectAllUsers() {
        String sql = "SELECT * FROM User";
        try (Connection conn = connect();
             Statement stmt = conn.createStatement();
             ResultSet rs = stmt.executeQuery(sql)) {
            while (rs.next()) {
                System.out.println("ID: " + rs.getInt("id") + "\t" +
                        "Username: " + rs.getString("username") + "\t" +
                        "Password: " + rs.getString("password"));
            }
        } catch (SQLException e) {
            System.out.println("Fehler beim Abrufen der Users.");
            e.printStackTrace();
        }
    }

    public static String selectAvatar(String username) {
        String sql = "SELECT * FROM User WHERE username = ?";

        try (Connection conn = connect();
             PreparedStatement pstmt = conn.prepareStatement(sql)) {
            pstmt.setString(1, username);
            ResultSet rs = pstmt.executeQuery();

            if (rs.isBeforeFirst()) {
                return rs.getString("avatar");
            } else {
                return null;
            }

        } catch (SQLException e) {
            System.out.println("Fehler beim einloggen.");
            e.printStackTrace();
        }
        return null;
    }

    public static void main(String[] args) {
        createTable();
        insertUser("henlo", "69", "f");
        selectAllUsers();
        selectAvatar("henlo");

    }
}
