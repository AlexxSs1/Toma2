/*package ru.ncedu.java.tasks;*/

public class EmployeeInit implements Employee {

    private String FirstName;
    private String LastName;
    private int Salary = 1000;
    private Employee Manager;
    private Employee TopManager;

    public String getFirstName() {
        System.out.println("Имя:" + FirstName);
        return FirstName;
    }

    public void setFirstName(String name) {
        FirstName = name;
    }

    public String getLastName() {
        System.out.println("Фамилия:" + LastName);
        return LastName;
    }

    public void setLastName(String LastName) {
        this.LastName = LastName;
    }

    public String getFullName(){
        System.out.println("Полное имя:" + FirstName + " " + LastName);
        return "";
    }

    public int getSalary(){
        System.out.println("Зарплата:" + Salary);
        return Salary;
    }

    public void increaseSalary(int value){
        Salary = Salary + value;
    }

    public String getManagerName(){
        if (Manager.FirstName instanceof String) {
            System.out.println(Manager.FirstName + " " + Manager.LastName);
        } else {
            System.out.println("No manager");
        }
        return "";
    }

    public void setManager(Employee E){}

    public Employee getTopManager(){
        if (TopManager instanceof String) {
            System.out.println("Имя топ-менеджера" + TopManager);
            return TopManager;
        } else {
            System.out.println("Имя топ-менеджера:" + FirstName + " " + LastName);
            return "";
        }
    }

    public static void main(String[] args) {
        EmployeeInit E1 = new EmployeeInit();
        E1.Manager = new EmployeeInit();
        E1.setFirstName("AAAA");
        E1.getFirstName();
        E1.getLastName();
        E1.getFullName();
        E1.getSalary();
        E1.getTopManager();
        E1.getManagerName();

    }


}
