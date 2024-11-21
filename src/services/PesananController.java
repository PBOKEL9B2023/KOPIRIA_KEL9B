package services;

import entities.Pesanan;
import entities.Database;

import java.sql.*;
import java.util.ArrayList;
import java.util.List;
import javax.swing.JOptionPane;

public class PesananController {

    private final List<Pesanan> pesananList = new ArrayList<>(); 

    public boolean isValidString(String input) {
        return input != null && !input.trim().isEmpty() && input.matches("^[a-zA-Z\\s]+$");
    }

    public boolean isValidNumber(int input) {
        return input > 0; 
    }

    public boolean isValidPesanan(String pemesan, String name, int quantity, String size, String orderType, String paymentMethod) {
        return isValidString(pemesan) && isValidString(name) && isValidNumber(quantity)
                && isValidString(size) && isValidString(orderType) && isValidString(paymentMethod);
    }

    public List<Pesanan> getAllPesanans() {
        pesananList.clear(); 
        String query = "SELECT * FROM pesanan";

        try (Connection connection = Database.connect();
             Statement statement = connection.createStatement();
             ResultSet resultSet = statement.executeQuery(query)) {
            while (resultSet.next()) {
                Pesanan pesanan = new Pesanan(
                        resultSet.getString("pemesan"),
                        resultSet.getString("name"),
                        resultSet.getInt("quantity"),
                        resultSet.getString("size"),
                        resultSet.getString("orderType"),
                        resultSet.getString("paymentMethod")
                );
                pesananList.add(pesanan); 
            }
        } catch (SQLException e) {
            System.out.println("Failed to retrieve orders from database!");
            e.printStackTrace();
        }

        return new ArrayList<>(pesananList);
    }

    public void addPesanan(Pesanan pesanan) {
        if (!isValidPesanan(pesanan.getPemesan(), pesanan.getName(), pesanan.getQuantity(),
                pesanan.getSize(), pesanan.getOrderType(), pesanan.getPaymentMethod())) {
            JOptionPane.showMessageDialog(null, "Data pesanan tidak valid!");
            return;
        }

        String query = "INSERT INTO pesanan (pemesan, name, quantity, size, orderType, paymentMethod) VALUES (?, ?, ?, ?, ?, ?)";

        try (Connection connection = Database.connect();
             PreparedStatement preparedStatement = connection.prepareStatement(query)) {
            preparedStatement.setString(1, pesanan.getPemesan());
            preparedStatement.setString(2, pesanan.getName());
            preparedStatement.setInt(3, pesanan.getQuantity());
            preparedStatement.setString(4, pesanan.getSize());
            preparedStatement.setString(5, pesanan.getOrderType());
            preparedStatement.setString(6, pesanan.getPaymentMethod());
            preparedStatement.executeUpdate();
        } catch (SQLException e) {
            System.out.println("Failed to add order to database!");
            e.printStackTrace();
            return;
        }

        pesananList.add(pesanan); 
    }

    public List<Pesanan> searchPesanan(String keyword) {
        if (keyword == null || keyword.trim().isEmpty()) {
            System.out.println("Invalid search keyword! Please provide a valid keyword.");
            return new ArrayList<>();
        }

        List<Pesanan> filteredPesanans = new ArrayList<>();
        for (Pesanan pesanan : pesananList) {
            if (pesanan.getPemesan().toLowerCase().contains(keyword.toLowerCase())
                    || pesanan.getName().toLowerCase().contains(keyword.toLowerCase())) {
                filteredPesanans.add(pesanan);
            }
        }

        return filteredPesanans;
    }

    public List<Pesanan> sortPesananByPemesan() {
        pesananList.sort((p1, p2) -> p1.getPemesan().compareToIgnoreCase(p2.getPemesan()));
        return new ArrayList<>(pesananList);
    }

    public boolean isQuantityAvailable(String productName, int requestedQuantity) {
        String query = "SELECT quantity FROM menukopiria WHERE name = ?";
        try (Connection connection = Database.connect();
             PreparedStatement preparedStatement = connection.prepareStatement(query)) {
            preparedStatement.setString(1, productName);
            try (ResultSet resultSet = preparedStatement.executeQuery()) {
                if (resultSet.next()) {
                    int currentQuantity = resultSet.getInt("quantity");
                    return currentQuantity >= requestedQuantity;
                }
            }
        } catch (SQLException e) {
            System.out.println("Failed to check product quantity!");
            e.printStackTrace();
        }
        return false; 
    }

    public boolean updateProductQuantitySafely(String productName, int quantityToDeduct) {
        String query = "UPDATE menukopiria SET quantity = quantity - ? WHERE name = ? AND quantity >= ?";
        try (Connection connection = Database.connect();
             PreparedStatement preparedStatement = connection.prepareStatement(query)) {
            preparedStatement.setInt(1, quantityToDeduct);
            preparedStatement.setString(2, productName);
            preparedStatement.setInt(3, quantityToDeduct);
            int rowsUpdated = preparedStatement.executeUpdate();
            return rowsUpdated > 0; 
        } catch (SQLException e) {
            System.out.println("Failed to update product quantity safely!");
            e.printStackTrace();
        }
        return false;
    }
    public List<String> getMenuNames() {
        List<String> menuNames = new ArrayList<>();
        String query = "SELECT name FROM menukopiria";

        try (Connection connection = Database.connect();
             Statement statement = connection.createStatement();
             ResultSet resultSet = statement.executeQuery(query)) {
            while (resultSet.next()) {
                menuNames.add(resultSet.getString("name"));
            }
        } catch (SQLException e) {
            System.out.println("Failed to retrieve menu names from database!");
            e.printStackTrace();
        }

        return menuNames;
    }

    public List<Pesanan> getPesananList() {
        return new ArrayList<>(pesananList);
    }
}
