import java.util.ArrayList;
import java.util.List;

public class University {
    private List<Department> departments;
    public University() {
        departments = new ArrayList<>();
    }
    public void addDepartment(Department department) {
        departments.add(department);
    }
    // University attributes and methods
}
