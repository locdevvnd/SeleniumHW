package org.example;

public class airbnbHomePage {
    public static WebDriver driver;

    public static void main(String[] args) {
        // Cài đặt ChromeDriver tự động
        WebDriverManager.chromedriver().setup();
        driver = new ChromeDriver();


        driver.get("https://demo4.cybersoft.edu.vn/");
        driver.manage().window().maximize();

        // Đợi 2 giây để trang load
        try {
            Thread.sleep(2000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

        // Khai báo các element
        By homeLink = driver.findElement(By.linkText("Home")); // 2. Liên kết Home
        By aboutLink = driver.findElement(By.linkText("About")); // 3. Liên kết About
        By servicesLink = driver.findElement(By.linkText("Services")); // 4. Liên kết Services
        By pricingLink = driver.findElement(By.linkText("Pricing")); // 5. Liên kết Pricing
        By contactLink = driver.findElement(By.linkText("Contact")); // 6. Liên kết Contact
        By profileIcon = driver.findElement(By.xpath("//button[contains(@class, 'user-icon')]")); // 7. Biểu tượng Profile
        By whereInput = driver.findElement(By.xpath("//input[@placeholder='Bên nào đó?']")); // 8. Ô nhập Where
        By checkInDate = driver.findElement(By.xpath("//input[@placeholder='07/12/2024 - 14/12/2024']")); // 9. Ô chọn ngày Check-in
        By checkOutDate = driver.findElement(By.xpath("//input[@placeholder='07/12/2024 - 14/12/2024']")); // 10. Ô chọn ngày Check-out
        By guestsInput = driver.findElement(By.xpath("//input[@placeholder='Thêm khách']")); // 11. Ô nhập Guests
        By searchButton = driver.findElement(By.xpath("//button[contains(@class, 'search-button')]")); // 12. Nút Search
        By hoChiMinh = driver.findElement(By.xpath("//div[text()='Hồ Chí Minh']")); // 13. Hồ Chí Minh
        By daNang = driver.findElement(By.xpath("//div[text()='Đà Nẵng']")); // 14. Đà Nẵng
        By nhaTrang = driver.findElement(By.xpath("//div[text()='Nha Trang']")); // 15. Nha Trang
        By haNoi = driver.findElement(By.xpath("//div[text()='Hà Nội']")); // 16. Hà Nội
        By phuQuoc = driver.findElement(By.xpath("//div[text()='Phú Quốc']")); // 17. Phú Quốc
        By daLat = driver.findElement(By.xpath("//div[text()='Đà Lạt']")); // 18. Đà Lạt
        By phanThiet = driver.findElement(By.xpath("//div[text()='Phan Thiết']")); // 19. Phan Thiết

        // Thực hiện các thao tác cơ bản
        whereInput.sendKeys("Hồ Chí Minh");
        checkInDate.clear();
        checkInDate.sendKeys("07/12/2025");
        checkOutDate.clear();
        checkOutDate.sendKeys("14/12/2025");
        guestsInput.sendKeys("2");

        // Đợi 2 giây để kiểm tra kết quả
        try {
            Thread.sleep(2000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

        // In ra tiêu đề trang để kiểm tra
        System.out.println("Tiêu đề trang hiện tại: " + driver.getTitle());

        // Đóng trình duyệt
        driver.quit();
    }
}
