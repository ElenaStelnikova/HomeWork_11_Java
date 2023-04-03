package org.redrover;

public class Main {
    public static void main(String[] args) {

        Employee employee1 = new Employee("Mark", 500);
        Employee employee2 = new Employee("Kathrine", 600);
        Employee employee3 = new Employee("John", 700);

        Worker worker1 = new Worker("Amanda", 700);
        Worker worker2 = new Worker("Tom", 725);
        Worker worker3 = new Worker("Brain", 750);

        Manager manager1 = new Manager("Sam", 4000, 15);
        Manager manager2 = new Manager("Marta", 5000, 30);
        Manager manager3 = new Manager("Mathew", 6000, 55);

        Director director1 = new Director("Elena", 1000, 45);
        Director director2 = new Director("Alex", 1000, 50);
        Director director3 = new Director("Boris", 1000, 65);

        Employee[] employees = {employee1, employee2, employee3};

        Worker[] workers = {worker1, worker2, worker3};

        Manager[] managers = {manager1, manager2, manager3};

        Director[] directors = {director1, director2, director3};

        System.out.println("Employee's salary: " + employee1.getBaseSalary());
        System.out.println("Worker's salary: " + worker1.getSalaryWorker());
        System.out.println("Manager's salary: " + manager1.getSalaryManager());
        System.out.println("Director's salary: " + director1.getSalaryDirector());

        System.out.println();

        System.out.println("Find name John: " + EmployeeUtils.findByName("John", employees));
        System.out.println("Find subName K: " + EmployeeUtils.findBySubName("K",employees));
        System.out.println("Salary of all employees: "+ EmployeeUtils.SalarySum(employees));
        System.out.println("Salary of all managers: " + EmployeeUtils.ManagerSalarySum(managers));
        System.out.println("The highest salary among workers: " + EmployeeUtils.findMaxSalary(workers));
        System.out.println("The lowest salary among workers: " + EmployeeUtils.findMinSalary(workers));
        System.out.println("The least number of subordinates: " + EmployeeUtils.findMinNumberOfSubordinates(managers));
        System.out.println("The largest number of subordinates: " + EmployeeUtils.findMaxNumberOfSubordinates(managers));
        System.out.println("The largest bonus of managers: " + EmployeeUtils.findMaxBonusByManager(managers));
        System.out.println("The least bonus of managers: " + EmployeeUtils.findMinBonusByManager(managers));
        System.out.println("The largest bonus of directors: " + EmployeeUtils.findMaxBonusByDirector(directors));
        System.out.println("The least bonus of directors: " + EmployeeUtils.findMinBonusByDirector(directors));




    }
}
