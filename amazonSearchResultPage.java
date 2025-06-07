package org.example;

public class amazonSearchResultPage {
    public class amazonSearchResultPage {
        public static WebDriver driver;

        public static void main(String[] args) {
            // Cài đặt ChromeDriver tự động
            WebDriverManager.chromedriver().setup();
            driver = new ChromeDriver();

            // 1. Truy cập vào: amazon.com
            driver.get("https://www.amazon.com");
            driver.manage().window().maximize();

            // Đợi 2 giây để trang load
            try {
                Thread.sleep(2000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }

            // Khai báo các element
            By searchBox = driver.findElement(By.id("twotabsearchtextbox")); // Ô tìm kiếm
            By searchButton = driver.findElement(By.id("nav-search-submit-button")); // Nút Search
            By languageDropdown = driver.findElement(By.id("icp-nav-flyout")); // Dropdown ngôn ngữ
            By vietnamLanguage = driver.findElement(By.xpath("//a[contains(text(), 'Tiếng Việt')]")); // Ngôn ngữ Tiếng Việt
            By shopAdidasCategories = driver.findElement(By.xpath("//h2[text()=\"Shop adidas categories\"]")); // 6. Shop adidas categories
            By mensFootwear = driver.findElement(By.xpath("//a[text()=\"Men's Footwear\"]")); // 6. Men's Footwear
            By womensFootwear = driver.findElement(By.xpath("//a[text()=\"Women's Footwear\"]")); // 6. Women's Footwear
            By lifestyle = driver.findElement(By.xpath("//a[text()=\"Lifestyle\"]")); // 6. Lifestyle
            By soccer = driver.findElement(By.xpath("//a[text()=\"Soccer\"]")); // 6. Soccer
            By kidsFootwear = driver.findElement(By.xpath("//a[text()=\"Kid's Footwear\"]")); // 6. Kid's Footwear
            By shopTopAdidasCollections = driver.findElement(By.xpath("//h2[text()=\"Shop top adidas collections\"]")); // 11. Shop top adidas collections
            By fashionSneakers = driver.findElement(By.xpath("//img[@alt=\"Fashion Sneakers\"]/ancestor::a")); // 11. Fashion Sneakers
            By slides = driver.findElement(By.xpath("//img[@alt=\"Slides\"]/ancestor::a")); // 11. Slides
            By brasAndLeggings = driver.findElement(By.xpath("//img[@alt=\"Bras & Leggings\"]/ancestor::a")); // 11. Bras & Leggings
            By tiro = driver.findElement(By.xpath("//img[@alt=\"Tiro\"]/ancestor::a")); // 11. Tiro
            By bagsAndBackpacks = driver.findElement(By.xpath("//a[text()=\"Bags & Backpacks\"]")); // 14. Bags & Backpacks
            By adidasRacerSneaker = driver.findElement(By.xpath("//span[text()=\"adidas Men's Racer Adapt 7.0 Sneaker\"]/ancestor::a")); // 10. Adidas Racer Adapt 7.0 Sneaker
            By adidasFleeceHoodie = driver.findElement(By.xpath("//span[text()=\"adidas Men's Essentials Fleece Hoodie\"]/ancestor::a")); // 10. Adidas Fleece Hoodie
            By adidasGymnasticsShoes = driver.findElement(By.xpath("//span[text()=\"adidas Women's Gymnastics Shoes\"]/ancestor::a")); // 8. Adidas Gymnastics Shoes
            By adidasKidsRacer = driver.findElement(By.xpath("//span[text()=\"adidas Kid's Lite Racer Adapt 7.0 Sneaker\"]/ancestor::a")); // 1. Adidas Kids Racer Adapt 7.0 Sneaker
            By adidasClassicSoccer = driver.findElement(By.xpath("//span[text()=\"adidas Samba Classic Soccer Shoe\"]/ancestor::a")); // 17. Adidas Classic Soccer Shoe

            // 2. Tìm kiếm adidas
            searchBox.sendKeys("adidas");
            searchButton.click();

            // Đợi 2 giây để trang kết quả load
            try {
                Thread.sleep(2000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }

            // 3. Chọn ngôn ngữ là tiếng Việt
            languageDropdown.click();
            vietnamLanguage.click();

            // Đợi 2 giây để ngôn ngữ thay đổi
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
