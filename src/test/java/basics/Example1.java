package basics;

import org.junit.jupiter.api.*;

public class Example1 {

    @BeforeAll
    static void setUp() {
        System.out.println("This mesage first in front of all");
    }

    @BeforeEach
    public void init() {
        System.out.println("This mesage will be displayed before every test method.");
    }

    @AfterEach
    public void tear() {
        System.out.println("This mesage will be displayed after every test method.");
    }

    @AfterAll
    public static void tearDown() {
        System.out.println("This mesage is last after all");
    }

    @Test
    public void firstTest() {
        System.out.println("Executing first test.");
    }

    @Test
    public void secondTest() {
        System.out.println("Executing second test.");
    }

    @Test
    @DisplayName("Third test")
    public void thirdTest() {
        System.out.println("Executing third test.");
    }

    @Test
    @Disabled
    public void fourthTest() {
        System.out.println("Executing fourth test.");
    }
}
