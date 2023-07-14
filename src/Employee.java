public class Employee {
    private String name;
    private String sername;
    private int age;
    private int salary;

    public Employee(String name, String sername, int age, int salary) {
        this.name = name;
        this.sername = sername;
        this.age = age;
        this.salary = salary;
    }
    public Employee(){

    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getSername() {
        return sername;
    }

    public void setSername(String sername) {
        this.sername = sername;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public int getSalary() {
        return salary;
    }

    public void setSalary(int salary) {
        this.salary = salary;
    }
}
