public class Employee {
     String name;
     double salary;
     int workHours;
     int hireYear;

    public Employee(String name, double salary, int workHours, int hireYear) {
        this.name = name;
        this.salary = salary;
        this.workHours = workHours;
        this.hireYear = hireYear;
    }

    public double tax() {
        if (salary < 1000) {
            return 0;
        } else {
            return salary * 0.03;
        }
    }

    public double bonus() {
        if (workHours > 40) {
            int extraHours = workHours - 40;
            return extraHours * 30;
        } else {
            return 0;
        }
    }

    public double raiseSalary() {
        double Asalary=salary;
        int yearsWorked = 2021 - hireYear;
        double raisePercentage;

        if (yearsWorked < 10) {
            raisePercentage = 0.05;
        } else if (yearsWorked < 20) {
            raisePercentage = 0.1;
        } else {
            raisePercentage = 0.15;
        }

        double raiseAmount = Asalary * raisePercentage;
        Asalary += raiseAmount;

        return raiseAmount;
    }

    public double calculateTotalSalary() {

        double TotalPrice=salary + bonus() - tax();
        return TotalPrice;
    }

    @Override
    public String toString() {
        double tax = tax();
        double bonus = bonus();
        double raise = raiseSalary();
        double totalSalary = calculateTotalSalary();

        return "Adı: " + name + "\n"
                + "Maaşı: " + salary + "\n"
                + "Çalışma Saati: " + workHours + "\n"
                + "Başlangıç Yılı: " + hireYear + "\n"
                + "Vergi: " + tax + "\n"
                + "Bonus: " + bonus + "\n"
                + "Maaş Artışı: " + raise + "\n"
                + "Vergi ve Bonuslar ile birlikte maaş: " + totalSalary + "\n"
                + "Toplam Maaş: " + (salary+raiseSalary());

    }


}
