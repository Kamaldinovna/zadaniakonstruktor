public class Main {
    public static void main(String[] args) {
        Employee employee1 = new Employee("Aizat", "   Aitibaeva", 19, 25000);
        Employee employee2 = new Employee("Baatyr", "  Ismailov", 35, 35000);
        Employee employee3 = new Employee("Nurjigit", "  Umarov", 20, 40000);
        Employee employee4 = new Employee("Maksat", "  Sultanov", 30, 50000);
        Employee employee5 = new Employee("Begzat", "  Muhammadov", 38, 60000);
        Employee employee6 = new Employee("Dastan", "  Shermatov", 45, 30000);
        Employee[] employees = {employee1, employee2, employee3, employee4, employee5, employee6};
        Company company = new Company(2, "Google", "Moscow", employees);
        System.out.println(company.maxSalary(company));
        System.out.println(company.EmployeeByName("Aizat",company));

        System.out.println(company.countAge(30,company));
    }
}
