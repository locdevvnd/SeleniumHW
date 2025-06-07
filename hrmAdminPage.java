package org.example;

public class hrmAdminPage {
    public static WebDriver driver;

    public static void main(String[] args) {
        // Cài đặt ChromeDriver tự động
        WebDriverManager.chromedriver().setup();
        driver = new ChromeDriver();

        // 1. Truy cập vào: https://opensource-demo.orangehrmlive.com/
        driver.get("https://opensource-demo.orangehrmlive.com/");
        driver.manage().window().maximize();

        // Đợi 2 giây để trang load
        try {
            Thread.sleep(2000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

        // Khai báo các element
        By usernameField = driver.findElement(By.name("username")); // 4. Ô nhập Username
        By passwordField = driver.findElement(By.name("password")); // 5. Ô nhập Password
        By loginButton = driver.findElement(By.xpath("//button[@type='submit']")); // 6. Nút Login
        By adminMenu = driver.findElement(By.xpath("//span[text()='Admin']")); // 2. Menu Admin trong Sidebar
        By userManagement = driver.findElement(By.xpath("//span[text()='User Management']")); // 18. User Management
        By systemUsers = driver.findElement(By.xpath("//a[text()='System Users']")); // 11. System Users
        By usernameInput = driver.findElement(By.name("username")); // 4. Ô nhập Username trên trang System Users
        By userRoleDropdown = driver.findElement(By.name("user_role")); // 5. Dropdown User Role
        By employeeNameInput = driver.findElement(By.name("employee_name")); // 6. Ô nhập Employee Name
        By statusDropdown = driver.findElement(By.name("status")); // 7. Dropdown Status
        By searchButton = driver.findElement(By.xpath("//button[@type='submit'][text()='Search']")); // 10. Nút Search
        By resetButton = driver.findElement(By.xpath("//button[text()='Reset']")); // 9. Nút Reset
        By addButton = driver.findElement(By.xpath("//button[text()='Add']")); // 21. Nút Add
        By recordsFound = driver.findElement(By.xpath("//span[text()='(2) Records Found']")); // 12. Records Found
        By usernameRow1 = driver.findElement(By.xpath("//tr[1]//td[1]")); // 13. Username hàng 1
        By userRoleRow1 = driver.findElement(By.xpath("//tr[1]//td[2]")); // 14. User Role hàng 1
        By employeeNameRow1 = driver.findElement(By.xpath("//tr[1]//td[3]")); // 15. Employee Name hàng 1
        By statusRow1 = driver.findElement(By.xpath("//tr[1]//td[4]")); // 16. Status hàng 1
        By editButtonRow1 = driver.findElement(By.xpath("//tr[1]//td[5]//i[@class='material-icons'][text()='edit']")); // 19. Nút Edit hàng 1
        By deleteButtonRow1 = driver.findElement(By.xpath("//tr[1]//td[5]//i[@class='material-icons'][text()='delete']")); // 20. Nút Delete hàng 1

        // Nhập thông tin đăng nhập (dùng username/password mặc định của demo)
        usernameField.sendKeys("Admin");
        passwordField.sendKeys("admin123");

        // 6. Click nút Login
        loginButton.click();

        // Đợi 2 giây để trang load sau khi đăng nhập
        try {
            Thread.sleep(2000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

        // 2. Từ Sidebar bên tay trái, chọn Admin
        adminMenu.click();

        // Đợi 2 giây để trang Admin load
        try {
            Thread.sleep(2000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

        // 18. Click vào User Management
        userManagement.click();

        // 11. Click vào System Users
        systemUsers.click();

        // Đợi 2 giây để trang System Users load
        try {
            Thread.sleep(2000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

        // In ra thông tin để kiểm tra
        System.out.println("Username hàng 1: " + usernameRow1.getText());
        System.out.println("User Role hàng 1: " + userRoleRow1.getText());
        System.out.println("Employee Name hàng 1: " + employeeNameRow1.getText());
        System.out.println("Status hàng 1: " + statusRow1.getText());

        // Đóng trình duyệt
        driver.quit();
    }
}


