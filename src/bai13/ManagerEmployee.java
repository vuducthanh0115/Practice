package bai13;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

public class ManagerEmployee {
    private List<Employee> employees = new ArrayList<>();

    public void insertEmployee(Employee employee) {
        this.employees.add(employee);
    }

    public void showInfoE() {
        employees.forEach(o -> System.out.println(o.showInfo()));
    }

    public boolean delete(String id) {
        Employee employee = this.employees.stream().filter(o -> o.getId().equals(id)).findFirst().orElse(null);
        if (employee == null) {
            return false;
        }
        this.employees.remove(employee);
        return true;
    }

    public boolean searchId(String id) {
        Employee employee = this.employees.stream().filter(o -> o.getId().equals(id)).findFirst().orElse(null);
        if (employee == null) {
            return false;
        }
        return true;
    }

    public void update(String id, String name, String date, String phone, String email) {
        Employee e = Objects.requireNonNull(this.employees.stream().filter(d -> d.getId().equals(id)).findFirst().orElse(null));
        e.setFullName(name);
        e.setBirthDate(date);
        e.setPhoneNumber(phone);
        e.setEmail(email);
    }

    public void searchExperience() {
        this.employees.stream().filter(p -> p instanceof Experience).forEach(e -> System.out.println(e.showInfo()));
    }

    public void searchIntern() {
        this.employees.stream().filter(p -> p instanceof Intern).forEach(e -> System.out.println(e.showInfo()));
    }

    public void searchFresher() {
        this.employees.stream().filter(p -> p instanceof Fresher).forEach(e -> System.out.println(e.showInfo()));
    }

    public void checkData(Employee employee) throws FullNameException {
        Validator.nameCheck(employee.getFullName());
    }


}
