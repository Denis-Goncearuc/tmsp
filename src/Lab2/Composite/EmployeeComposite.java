package Lab2.Composite;

import java.util.ArrayList;
import java.util.List;

public class EmployeeComposite implements Employee
{
    private List<Employee> members = new ArrayList<>();
    public void AddMember(Employee employee)
    {
        members.add(employee);
    }
    public void RemoveEmployee(Employee employee)
    {
        members.remove(employee);
    }
    
    @Override
    public void GiveSalary()
    {
        for (Employee employee: members)
        {
            employee.GiveSalary();
        }
    }
}
