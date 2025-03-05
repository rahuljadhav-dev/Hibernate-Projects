package all;


import java.util.List;

public class App {

    public static void main(String[] args) {
        DepartmentDAO departmentDAO = new DepartmentDAO();

//        // Create a new department
//        Department department = new Department();
//        department.setName("HR");
//        department.setLocation("New York");
//        departmentDAO.saveDepartment(department);

        // Get department by ID
        Department retrievedDepartment = departmentDAO.getDepartmentById(1);
        System.out.println("Department Retrieved: " + retrievedDepartment.getName());

//        // Update department
//        retrievedDepartment.setLocation("Chicago");
//        departmentDAO.updateDepartment(retrievedDepartment);
//
//        // Get all departments
//        List<Department> departments = departmentDAO.getAllDepartments();
//        for (Department dept : departments) {
//            System.out.println(dept.getName() + " - " + dept.getLocation());
//        }
//
//        // Delete a department
//        departmentDAO.deleteDepartment(1);
    }
}
