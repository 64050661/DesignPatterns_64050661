// นายวฤษณิ์ ทับทิม 64050661

public class App {
    public static void main(String[] args) {
        Employee ceo = new Employee("Settha", "CEO", 500000);

        Employee headSales = new Employee("Kamphaka", "Head Sales", 300000);
        Employee headMarketing = new Employee("UngInk", "Head Marketing", 300000);
        ceo.addChild(headSales);
        ceo.addChild(headMarketing);

        Employee sales1 = new Employee("Wiroj", "Sales", 150000);
        Employee sales2 = new Employee("Weeranan", "Sales", 100000);
        headSales.addChild(sales1);
        headSales.addChild(sales2);

        Employee marketing1 = new Employee("Oak", "Marketing", 200000);
        Employee marketing2 = new Employee("Aem", "Marketing", 250000);
        headMarketing.addChild(marketing1);
        headMarketing.addChild(marketing2);

        printAllEmployee(ceo);
    }

    public static void printAllEmployee(Employee ceo) {
        System.out.println(ceo);
        ceo.printChild();
    }
}
