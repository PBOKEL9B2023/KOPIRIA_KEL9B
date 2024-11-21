package services;

import entities.MenuKopiria;
import entities.Database;

import java.sql.*;
import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;

public class MenuKopiriaController {
    private final List<MenuKopiria> menuItems;

    public MenuKopiriaController() {
        menuItems = new ArrayList<>();
        loadMenuKopiriaFromDatabase();
    }

    private void loadMenuKopiriaFromDatabase() {
        String query = "SELECT name, quantity, price, category FROM menukopiria";
        try (Connection conn = Database.connect();
             Statement stmt = conn.createStatement();
             ResultSet rs = stmt.executeQuery(query)) {

            menuItems.clear();
            while (rs.next()) {
                String name = rs.getString("name");
                int quantity = rs.getInt("quantity");
                int price = rs.getInt("price"); 
                String category = rs.getString("category");

                MenuKopiria menuItem = new MenuKopiria(name, quantity, price, category);
                menuItems.add(menuItem);
            }
        } catch (SQLException e) {
            System.err.println("Error loading menu from database: " + e.getMessage());
            e.printStackTrace();
        }
    }

    public List<MenuKopiria> getAllMenuKopirias() {
        return new ArrayList<>(menuItems);
    }

    public void addMenuKopiria(MenuKopiria menuItem) {
        String query = "INSERT INTO menukopiria (name, quantity, price, category) VALUES (?, ?, ?, ?)";
        try (Connection conn = Database.connect();
             PreparedStatement stmt = conn.prepareStatement(query)) {
            stmt.setString(1, menuItem.getName());
            stmt.setInt(2, menuItem.getQuantity());
            stmt.setInt(3, menuItem.getPrice()); 
            stmt.setString(4, menuItem.getCategory());
            stmt.executeUpdate();
            loadMenuKopiriaFromDatabase();
        } catch (SQLException e) {
            System.err.println("Error adding menu item: " + e.getMessage());
            e.printStackTrace();
        }
    }

    public boolean updateMenuKopiria(String namaLama, MenuKopiria updatedItem) {
        String query = "UPDATE menukopiria SET name = ?, quantity = ?, price = ?, category = ? WHERE name = ?";
        try (Connection conn = Database.connect();
             PreparedStatement stmt = conn.prepareStatement(query)) {
            stmt.setString(1, updatedItem.getName());
            stmt.setInt(2, updatedItem.getQuantity());
            stmt.setInt(3, updatedItem.getPrice()); 
            stmt.setString(4, updatedItem.getCategory());
            stmt.setString(5, namaLama);
            int rowsAffected = stmt.executeUpdate();

            if (rowsAffected > 0) {
                loadMenuKopiriaFromDatabase();
                return true;
            }
        } catch (SQLException e) {
            System.err.println("Error updating menu item: " + e.getMessage());
            e.printStackTrace();
        }
        return false;
    }

    public boolean deleteMenuKopiria(String name) {
        String query = "DELETE FROM menukopiria WHERE name = ?";
        try (Connection conn = Database.connect();
             PreparedStatement stmt = conn.prepareStatement(query)) {
            stmt.setString(1, name);
            int rowsAffected = stmt.executeUpdate();

            if (rowsAffected > 0) {
                loadMenuKopiriaFromDatabase();
                return true;
            }
        } catch (SQLException e) {
            System.err.println("Error deleting menu item: " + e.getMessage());
            e.printStackTrace();
        }
        return false;
    }

    public List<MenuKopiria> searchMenuKopiriaByName(String keyword) {
        List<MenuKopiria> result = new ArrayList<>();
        for (MenuKopiria item : menuItems) {
            if (item.getName().toLowerCase().contains(keyword.toLowerCase())) {
                result.add(item);
            }
        }
        return result;
    }

    public List<MenuKopiria> sortMenuKopiriaByPrice() {
        List<MenuKopiria> sortedList = new ArrayList<>(menuItems);
        sortedList.sort(Comparator.comparingInt(MenuKopiria::getPrice)); 
        return sortedList;
    }
}
