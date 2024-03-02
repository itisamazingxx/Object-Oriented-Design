package org.example;

import java.sql.*;
import java.util.Random;

public class TinyUrl {
    private static final String DATABASE_NAME = "shorturl_db";
    private static final String URL = "jdbc:mysql://127.0.0.1:3306/" + DATABASE_NAME + "?user=root";
    private static final String USER = "root";
    private static final String PASSWORD = "root";

    public String longToShort(String longUrl) {
        String shortUrl = generateShort();
        if (isShortUrlUnique(shortUrl)) {
            saveShortUrl(shortUrl, longUrl);
            return shortUrl;
        } else {
            return null;
        }
    }

    public String shortToLong(String shortUrl) {
        String longUrl = null;
        String query = "SELECT original_url FROM short_urls WHERE short_url = ?";

        try (Connection connection = DriverManager.getConnection(URL, USER, PASSWORD);
             PreparedStatement statement = connection.prepareStatement(query)) {

            statement.setString(1, shortUrl);

            try (ResultSet resultSet = statement.executeQuery()) {
                if (resultSet.next()) {
                    longUrl = resultSet.getString("original_url");
                }
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return longUrl;
    }

    private boolean isShortUrlUnique(String shortUrl) {
        String checkQuery = "SELECT COUNT(*) FROM short_urls WHERE short_url = ?";
        try (Connection connection = DriverManager.getConnection(URL, USER, PASSWORD);
             PreparedStatement checkStmt = connection.prepareStatement(checkQuery)) {
            Class.forName("com.mysql.cj.jdbc.Driver");
            checkStmt.setString(1, shortUrl);
            ResultSet rs = checkStmt.executeQuery();
            if (rs.next()) {
                return rs.getInt(1) == 0;
            }
        } catch (SQLException | ClassNotFoundException e) {
            e.printStackTrace();
        }
        return false;
    }

    private String generateShort() {
        String characters = "ABCDEFGHIJKLMNOPQRSTUVWXYZabcdefghijklmnopqrstuvwxyz0123456789";
        StringBuilder shortUrl = new StringBuilder(6);
        Random random = new Random();
        for (int i = 0; i < 6; i++) {
            shortUrl.append(characters.charAt(random.nextInt(characters.length())));
        }
        return shortUrl.toString();
    }

    private void saveShortUrl(String shortUrl, String originalUrl) {
        String insertQuery = "INSERT INTO short_urls (short_url, original_url) VALUES (?, ?)";
        try (Connection connection = DriverManager.getConnection(URL, USER, PASSWORD);
             PreparedStatement insertStmt = connection.prepareStatement(insertQuery)) {
            Class.forName("com.mysql.cj.jdbc.Driver");
            insertStmt.setString(1, shortUrl);
            insertStmt.setString(2, originalUrl);
            insertStmt.executeUpdate();
        } catch (SQLException | ClassNotFoundException e) {
            e.printStackTrace();
        }
    }

}
