package org.redrover;

public class EmployeeUtils {

     //поиск сотрудника в массиве по его имени
    public static String findByName(String name, Employee [] arr) {

        for(int i = 0; i < arr.length; i++) {
            if (name.equals(arr[i].getName())){
                return name;
            }
        }
        return String.valueOf(false);
    }

    //поиск сотрудника в массиве по вхождению указанной строки в его имени
    public static int findBySubName(String subname, Employee[] arr) {
        for(int i = 0; i < arr.length; i++) {
            if (arr[i].getName().contains(subname)){
                return i;
            }
        }
        return -1;
    }

    //подсчет зарплатного бюджета для всех сотрудников в массиве
    public static int SalarySum (Employee[] arr) {
        int result = 0;
        for(int i = 0; i < arr.length; i++) {
            result += arr[i].getBaseSalary();
        }
        return result;
    }

    public static int ManagerSalarySum (Manager[] arr) {     //для менеджеров
        int result = 0;
        for(int i = 0; i < arr.length; i++) {
            result += arr[i].getSalaryManager();
        }
        return result;
    }

    //поиск наибольшей зарплаты в массиве
    public static int findMaxSalary (Worker[] arr) {
        int max = Integer.MIN_VALUE;
        for(int i = 0; i < arr.length; i++) {
            if(max < arr[i].getSalaryWorker()) {
                max = arr[i].getBaseSalary();
            }
        }
        return max;
    }

    //поиск наименьшей зарплаты в массиве
    public static int findMinSalary (Worker[] arr) {
        int min = Integer.MAX_VALUE;
        for (int i = 0; i < arr.length; i++)  {
            if (min > arr[i].getSalaryWorker()) {
                min = arr[i].getSalaryWorker();
            }
        }
        return min;
    }

    //поиск наименьшего количества подчиненных в массиве менеджеров
    public static int findMinNumberOfSubordinates (Manager[] arr) {
        int min = Integer.MAX_VALUE;
        for (int i = 0; i < arr.length; i++)  {
            if (min > arr[i].getNumberOfSubordinates()) {
                min = arr[i].getNumberOfSubordinates();
            }
        }
        return min;
    }

    //поиск наибольшего количества подчиненных в массиве менеджеров
    public static int findMaxNumberOfSubordinates (Manager[] arr) {
        int max = Integer.MIN_VALUE;
        for (int i = 0; i < arr.length; i++)  {
            if (max < arr[i].getNumberOfSubordinates()) {
                max = arr[i].getNumberOfSubordinates();
            }
        }
        return max;
    }

    //поиск наибольшей надбавки (разнице между базовой ставкой и зарплатой)
    // в массиве менеджеров
    public static int findMaxBonusByManager (Manager[] arr) {
        int max = Integer.MIN_VALUE;
        for (int i = 0; i < arr.length; i++)  {
            if (max < arr[i].getBunusManager()) {
                max = arr[i].getBunusManager();
            }
        }
        return max;
    }

    //в массиве директоров
    public static int findMaxBonusByDirector (Director[] arr) {
        int max = Integer.MIN_VALUE;
        for(int i = 0; i < arr.length; i++) {
            if (max < arr[i].getBonusDirector()) {
                max = arr[i].getBonusDirector();
            }
        }
        return max;
    }

    //поиск наименьшей надбавки (разнице между базовой ставкой и зарплатой)
    // в массиве менеджеров
    public static int findMinBonusByManager (Manager[] arr) {
        int min = Integer.MAX_VALUE;
        for (int i = 0; i < arr.length; i++)  {
            if (min > arr[i].getBunusManager()) {
                min = arr[i].getBunusManager();
            }
        }
        return min;
    }

    //в массиве директоров

    public static int findMinBonusByDirector (Director[] arr) {
        int min = Integer.MAX_VALUE;
        for (int i = 0; i < arr.length; i++) {
            if (min > arr[i].getBonusDirector()) {
                min = arr[i].getBonusDirector();
            }
        }
        return min;
    }


}
