package kodillagoodpatterns2.adapter.company;

import kodillagoodpatterns2.adapter.company.newhrsystem.CompanySalaryProcessor;
import kodillagoodpatterns2.adapter.company.newhrsystem.Employee;
import kodillagoodpatterns2.adapter.company.newhrsystem.SalaryProcessor;

import java.math.BigDecimal;
import java.util.List;

public class SalaryAdaptee implements SalaryProcessor {
    @Override
    public BigDecimal calculateSalaries(List<Employee> employees) {
        CompanySalaryProcessor theProcessor = new CompanySalaryProcessor();
        return theProcessor.calculateSalaries(employees);
    }
}
