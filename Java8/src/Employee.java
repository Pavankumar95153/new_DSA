public class Employee {
    private int empId;
    private String empName;
    private String sal;
    private String email;
    private String Dev;

    public Employee() {
    }

    public Employee(int empId, String empName, String sal, String email, String dev) {

        this.empId = empId;
        this.empName = empName;
        this.sal = sal;
        this.email = email;
        Dev = dev;
    }

    public int getEmpId() {
        return empId;
    }

    public void setEmpId(int empId) {
        this.empId = empId;
    }

    public String getEmpName() {
        return empName;
    }

    public void setEmpName(String empName) {
        this.empName = empName;
    }

    public String getSal() {
        return sal;
    }

    public void setSal(String sal) {
        this.sal = sal;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getDev() {
        return Dev;
    }

    public void setDev(String dev) {
        Dev = dev;
    }

    @Override
    public String toString() {
        return "Employee{" +
                "empId=" + empId +
                ", empName='" + empName + '\'' +
                ", sal='" + sal + '\'' +
                ", email='" + email + '\'' +
                ", Dev='" + Dev + '\'' +
                '}';
    }
}