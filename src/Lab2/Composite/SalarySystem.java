package Lab2.Composite;

public class SalarySystem // Client
{
    public static void main(String[] args)
    {
        Employee manager1 = new Manager();
        Employee manager2 = new Manager();
        Employee manager3 = new Manager();
        Employee manager4 = new Manager();

        Employee developer1 = new Developer();
        Employee developer2 = new Developer();
        Employee developer3 = new Developer();
        Employee developer4 = new Developer();

        EmployeeComposite managerDepartment = new EmployeeComposite();
        EmployeeComposite developerDepartment = new EmployeeComposite();

        managerDepartment.AddMember(manager1);
        managerDepartment.AddMember(manager2);
        managerDepartment.AddMember(manager3);
        managerDepartment.AddMember(manager4);

        developerDepartment.AddMember(developer1);
        developerDepartment.AddMember(developer2);
        developerDepartment.AddMember(developer3);
        developerDepartment.AddMember(developer4);

        EmployeeComposite generalSalaryReport = new EmployeeComposite();
        generalSalaryReport.AddMember(developerDepartment);
        generalSalaryReport.AddMember(managerDepartment);

        generalSalaryReport.GiveSalary();

    }
}
