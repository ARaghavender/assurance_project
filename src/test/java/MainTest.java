

import org.example.Main;
import org.example.ProductRepository;
import org.example.ProductService;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class MainTest {

    @Test
    void testApplicationRuns() {
        ProductService productService = new ProductService(new ProductRepository());
        Main mainApp = new Main(productService);

        assertDoesNotThrow(mainApp::run);
    }
}
