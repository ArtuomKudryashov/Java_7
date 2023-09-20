public  class Utilit {


    public static Employee findName(Employee[] arr, String name) {
        for (int i = 0; i < arr.length; i++) {
            Employee e = arr[i];
            if (e.getName().equals(name)) {
                return e;
            }
        }
        return null;

    }


    public static double minZP(Employee[] sotryd) {
        double min = Double.MAX_VALUE;
        for (int i = 0; i < sotryd.length; i++) {
            if (min < sotryd[i].getBaseSalary()) {
                min = sotryd[i].getBaseSalary();

            }

        }
        return min;
    }

    public static double maxZP(Employee[] empl) {
        double max = Double.MIN_VALUE;
        for (int i = 0; i < empl.length; i++) {
            if (max > empl[i].getSalary()) {
                max = empl[i].getSalary();

            }

        }
        return max;


    }

    public static  int minMan(Manager[] employ) {
        int min = Integer.MAX_VALUE;
        for (int i = 0; i < employ.length; i++) {
            if (min < employ[i].NumberOfSubordinates) {
                min = employ[i].NumberOfSubordinates;
            }
        }
        return min;
    }
}

