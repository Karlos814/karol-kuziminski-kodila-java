package kodillagoodpatterns2.adapter.company.oldhrsystem;

public class Workers {
    private String[][] workers = {
            {"123456", "John", "Smith"},
            {"234567", "Damian", "Nok"},
            {"345678", "Tom", "Pinkmans"},
            {"456789", "Eldsadas", "Modsads"},
            {"567891", "Ksdasdad", "Midsads"}};
    private double[] salaries = {
            4500.00,
            3700.00,
            4350.00,
            9000.00,
            6200.00};

    public String getWorkers(int n) {
        if (n > salaries.length) {
            return "";
        }
        return workers[n][0] + ", " + workers[n][1] + ", " + workers[n][2] + ", " + salaries[n];
    }

    public String[][] getWorkers() {
        return workers;
    }

    public double[] getSalaries() {
        return salaries;
    }
}
