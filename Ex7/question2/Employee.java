import java.util.ArrayList;
import java.util.List;

// นายวฤษณิ์ ทับทิม 64050661
public class Employee {
    private String name;
    private String position;
    private int salary;
    private List<Employee> children;

    public Employee(String name, String position, int salary) {
        this.name = name;
        this.position = position;
        this.salary = salary;
        this.children = new ArrayList<>();
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getPosition() {
        return position;
    }

    public void setPosition(String dept) {
        this.position = dept;
    }

    public int getSalary() {
        return salary;
    }

    public void setSalary(int salary) {
        this.salary = salary;
    }

    public void addChild(Employee employee) {
        children.add(employee);
    }

    public void removeChild(Employee employee) {
        children.remove(employee);
    }

    public List<Employee> getChildren() {
        return children;
    }

    public String toString() {
        return ("Employee :[ Name : " + name + ", position : " + position + ", salary : " + salary + " ]");
    }

    public void printChild() {
        for (Employee e : children) {
            System.out.println(e.toString());
            e.printChild();
        }
    }
}