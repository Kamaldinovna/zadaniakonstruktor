public class Company {
    private int id;
    private String companyName;
    private String location;
    private Employee[] employees;


    public Company(int id, String companyName, String location, Employee[] employees) {
        this.id = id;
        this.companyName = companyName;
        this.location = location;
        this.employees = employees;
    }

    public Company() {

    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getCompanyName() {
        return companyName;
    }

    public void setCompanyName(String companyName) {
        this.companyName = companyName;
    }

    public String getLocation() {
        return location;
    }

    public void setLocation(String location) {
        this.location = location;
    }

    public Employee[] getEmployees() {
        return employees;
    }

    public void setEmployees(Employee[] employees) {
        this.employees = employees;
    }

    public int maxSalary(Company company) {
        int max = 0;
        for (int i = 0; i < company.getEmployees().length; i++) {
            if (company.getEmployees()[i].getSalary() > max) {
                max = company.getEmployees()[i].getSalary();
            }
        }
        return max;
    }
    public String EmployeeByName(String employeeName, Company company) {

        Employee employee = null;
        for (int i = 0; i < company.employees.length; i++) {
            if (company.getEmployees()[i].getName().equals(employeeName)) {
                employee = company.employees[i];
            }
        }
        return "Name : " + employee.getName()
                + " Sername : " + employee.getSername()
                + "  Age : " + employee.getAge()
                + "  Salary : " + employee.getSalary();
    }
    public int countAge(int age, Company company) {
        int col = 0;
        for (int i = 0; i < company.getEmployees().length; i++) {
            if (company.getEmployees()[i].getAge() == age) {
                col = company.getEmployees()[i].getAge();
                col++;
            }
        }
            return col;


        }}


