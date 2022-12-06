package at.fhtw.imperial_length;

import at.fhtw.imperial_length.controller.ImperialLengthController;
import at.fhtw.imperial_length.service.ImperialLengthService;
import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;

import static org.junit.jupiter.api.Assertions.assertEquals;

@SpringBootTest
class ImperialLengthApplicationTests {

	@Test
	void contextLoads() {

		ImperialLengthService service = new ImperialLengthService();
		// Given
		ImperialLengthController controller = new ImperialLengthController(service);

// When
		String result = service.calculateInch(12.7);

// Then
		assertEquals(result, 12.7);

	}




}
