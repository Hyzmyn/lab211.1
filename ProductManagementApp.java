/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lab1;

/**
 *
 * @author Admin
 */
import java.util.ArrayList;
import java.util.Scanner;
public class ProductManagementApp {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        while (true) {
            displayMainMenu();
            int choice = scanner.nextInt();

            switch (choice) {
                case 1:
                    manageProducts(scanner);
                    break;
                case 2:
                    manageWarehouse(scanner);
                    break;
                case 3:
                    generateReport(scanner);
                    break;
                case 4:
                    saveDataToFile();
                    break;
                case 5:
                    System.out.println("Ứng dụng đã đóng.");
                    scanner.close();
                    return;
                default:
                    System.out.println("Chọn không hợp lệ. Hãy thử lại.");
                    break;
            }
        }
    }

    private static void displayMainMenu() {
        System.out.println("Menu:");
        System.out.println("1. Quản lý sản phẩm");
        System.out.println("2. Quản lý kho hàng");
        System.out.println("3. Báo cáo");
        System.out.println("4. Lưu dữ liệu vào tệp");
        System.out.println("5. Đóng ứng dụng");
        System.out.print("Chọn một chức năng (1/2/3/4/5): ");
    }
    
    private static void manageProducts(Scanner scanner) {
        while (true) {
            displayProductMenu();
            int choice = scanner.nextInt();

            switch (choice) {
                case 1:
                    addProduct(scanner);
                    break;
                case 2:
                    updateProduct(scanner);
                    break;
                case 3:
                    deleteProduct(scanner);
                    break;
                case 4:
                    showAllProducts();
                    break;
                case 5:
                    return;
                default:
                    System.out.println("Chọn không hợp lệ. Hãy thử lại.");
                    break;
            }
        }
    }

    private static void displayProductMenu() {
        System.out.println("Menu Quản lý sản phẩm:");
        System.out.println("1. Thêm sản phẩm");
        System.out.println("2. Cập nhật thông tin sản phẩm");
        System.out.println("3. Xóa sản phẩm");
        System.out.println("4. Hiển thị tất cả sản phẩm");
        System.out.println("5. Quay lại menu");
        System.out.print("Chọn một chức năng (1/2/3/4/5): ");
    }
    private static void manageWarehouse( Scanner scanner){
        //while (true) {
            //displaymanageProducts()     //tạo menu cấp 2 của case 2 Mainmenu
        
    }
    private static void displaymanageWarehouse(){
        // tên chức năng cảu mỗi phần menu
    }
    private static void addProduct(Scanner scanner) {
        // Thêm mã logic để thêm sản phẩm vào danh sách sản phẩm
        
    }

    private static void updateProduct(Scanner scanner) {
        // Thêm mã logic để cập nhật thông tin sản phẩm
    }

    private static void deleteProduct(Scanner scanner) {
        // Thêm mã logic để xóa sản phẩm
    }

    private static void showAllProducts() {
        // Thêm mã logic để hiển thị tất cả sản phẩm
    }
    private static void generateReport(Scanner scanner) {
        // Thêm mã logic cho báo cáo
    }

    private static void saveDataToFile() {
        // Thêm mã logic để lưu dữ liệu vào tệp
    }
}
