import org.junit.Test

import org.junit.jupiter.api.DisplayName
import kotlin.test.assertFalse

class MainTest {

    @Test
    @DisplayName("Teste método xxoo")
    fun testCountXO() {
        assertFalse {
            (CountXO("xxoo"))
        }
    }
}