import org.redrover.*;
import org.testng.Assert;
import org.testng.annotations.Test;

public class EmployeeUtilsTest {

    @Test
    public static void testFindByName() {

        Employee employee1 = new Employee("Tom", 2000);
        Employee employee2 = new Employee("Sam", 2500);
        Employee employee3 = new Employee("Mark", 3000);
        Employee [] employees = {employee1, employee2, employee3};
        Assert.assertEquals(EmployeeUtils.findByName("Sam", employees), "Sam");
        Assert.assertEquals(EmployeeUtils.findByName("Mark", employees), "Mark");

    }

    @Test
    public static void testFindBySubName() {
        Employee employee1 = new Employee("Tom", 2000);
        Employee employee2 = new Employee("Sam", 2500);
        Employee employee3 = new Employee("Mark", 3000);
        Employee [] employees = {employee1, employee2, employee3};
        Assert.assertEquals(EmployeeUtils.findBySubName("Ma", employees), 2);
    }

    @Test
    public static void testSalarySum() {
        Employee employee1 = new Employee("Tom", 2000);
        Employee employee2 = new Employee("Sam", 2500);
        Employee employee3 = new Employee("Mark", 3000);
        Employee [] employees = {employee1, employee2, employee3};
        Assert.assertEquals(EmployeeUtils.SalarySum(employees), 7500);
    }

    @Test
    public static void testFindMaxSalary () {
        Worker worker1 = new Worker("Tom", 2000);
        Worker worker2 = new Worker("Sam", 2500);
        Worker worker3 = new Worker("Mark", 3000);
        Worker [] workers = {worker1, worker2, worker3};
        Assert.assertEquals(EmployeeUtils.findMaxSalary(workers), 3000);
    }

    @Test
    public static void testFindMinSalary () {
        Worker worker1 = new Worker("Tom", 2000);
        Worker worker2 = new Worker("Sam", 2500);
        Worker worker3 = new Worker("Mark", 3000);
        Worker [] workers = {worker1, worker2, worker3};
        Assert.assertEquals(EmployeeUtils.findMinSalary(workers), 2000);
    }

    @Test
    public  static  void testFindMinNumberOfSubordinates() {
        Manager manager1 = new Manager("Anna", 4000, 15);
        Manager manager2 = new Manager("Marina", 5000, 30);
        Manager manager3 = new Manager("Victor", 6000, 55);
        Manager[] managers = {manager1, manager2, manager3};
        Assert.assertEquals(EmployeeUtils.findMinNumberOfSubordinates(managers), 15);
    }

    @Test
    public  static  void testFindMaxNumberOfSubordinates() {
        Manager manager1 = new Manager("Anna", 4000, 15);
        Manager manager2 = new Manager("Marina", 5000, 30);
        Manager manager3 = new Manager("Victor", 6000, 55);
        Manager[] managers = {manager1, manager2, manager3};
        Assert.assertEquals(EmployeeUtils.findMaxNumberOfSubordinates(managers), 55);
    }

    @Test
    public  static  void testFindMaxBonusByManager() {
        Manager manager1 = new Manager("Anna", 4000, 15);
        Manager manager2 = new Manager("Marina", 5000, 30);
        Manager manager3 = new Manager("Victor", 6000, 55);
        Manager[] managers = {manager1, manager2, manager3};
        Assert.assertEquals(EmployeeUtils.findMaxBonusByManager(managers), 3900);
    }

    @Test
    public  static  void testFindMinBonusByManager() {
        Manager manager1 = new Manager("Anna", 4000, 15);
        Manager manager2 = new Manager("Marina", 5000, 30);
        Manager manager3 = new Manager("Victor", 6000, 55);
        Manager[] managers = {manager1, manager2, manager3};
        Assert.assertEquals(EmployeeUtils.findMinBonusByManager(managers), -2201);
    }

    @Test
    public static void testFindMaxBonusByDirector() {
        Director director1 = new Director("Elena", 1000, 45);
        Director director2 = new Director("Alex", 1000, 50);
        Director director3 = new Director("Boris", 1000, 65);
        Director[] directors = {director1, director2, director3};
        Assert.assertEquals(EmployeeUtils.findMaxBonusByDirector(directors), 4850);
    }

    @Test
    public static void testFindMinBonusByDirector() {
        Director director1 = new Director("Elena", 1000, 45);
        Director director2 = new Director("Alex", 1000, 50);
        Director director3 = new Director("Boris", 1000, 65);
        Director[] directors = {director1, director2, director3};
        Assert.assertEquals(EmployeeUtils.findMinBonusByDirector(directors), 3050);
    }




}
