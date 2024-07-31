import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.Assertions;
import ru.netology.javaqa.JavaDZ5Maven.serviceMonth.CalcService;

public class CalcServiceTest {

    @Test
    void months() {
        CalcService service = new CalcService();

        // подготавливаем данные:
        int income = 10_000;
        int expenses = 3_000;
        int threshold = 20_000;
        int expected = 3;


        // вызываем целевой метод:
        int actual = service.calculate(income, expenses, threshold);

        // производим проверку (сравниваем ожидаемый и фактический):
        Assertions.assertEquals(expected, actual);
    }
}