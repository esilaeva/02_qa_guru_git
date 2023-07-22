import org.junit.jupiter.api.Test;

import static com.codeborne.selenide.Selenide.open;

public class DemoqaTests {
    @Test
    void openSite(){
        open("https://demoqa.com");
    }
}
