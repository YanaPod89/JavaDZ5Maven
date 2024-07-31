import ru.netology.javaqa.JavaDZ5Maven.serviceMonth.CalcService;

public class Main {
    public static void main(String[] args) {
        CalcService service = new CalcService();
        int income = 10_000;
        int expenses = 3_000;
        int threshold = 20_000;
        int result = service.calculate(income, expenses, threshold);
        System.out.println(result);
    }
}