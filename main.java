// import static org.junit.jupiter.api.Assertions.assertEquals;

// import org.junit.jupiter.api.Test;

public class Main {
  public static void main(String[] args) {
    // winter, spring, summer, autumn
      // warm jacket, t-shirt, swimming suite, rain coat
      int temperature = 6;

      if (temperature <= 5) {
        System.out.println("Wear super warm jacket!");
      }
      else if (temperature <= 15) {
        System.out.println("Wear warm jacket!");
      }
      else if (temperature <= 30) {
        System.out.println("Wear normal clothes!");
      }
           else {
        System.out.println("Its hot! You need cooling");
      }  
          
  }

  // @Test
  // void addition() {
  //     assertEquals(2, 1 + 1);
  // }
}
