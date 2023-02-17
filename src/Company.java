import java.util.Arrays;

public class Company {
    private String ownerName;
    private String address;
    private Java[] employeesJ;
    private Android[] employeesA;
    private Go[] employeesG;

    public Company(String ownerName, String address, Java[] employeesJ, Android[] employeesA, Go[] employeesG) {
        this.ownerName = ownerName;
        this.address = address;
        this.employeesJ = employeesJ;
        this.employeesA = employeesA;
        this.employeesG = employeesG;
    }

    public String getOwnerName() {
        return ownerName;
    }

    public void setOwnerName(String ownerName) {
        this.ownerName = ownerName;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public Java[] getEmployeesJ() {
        return employeesJ;
    }

    public void setEmployeesJ(Java[] employeesJ) {
        this.employeesJ = employeesJ;
    }

    public Android[] getEmployeesA() {
        return employeesA;
    }

    public void setEmployeesA(Android[] employeesA) {
        this.employeesA = employeesA;
    }

    public Go[] getEmployeesG() {
        return employeesG;
    }

    public void setEmployeesG(Go[] employeesG) {
        this.employeesG = employeesG;
    }

    @Override
    public String toString() {
        return "Company{" +
                "ownerName='" + ownerName + '\'' +
                ", address='" + address + '\'' +
                ", employeesJ=" + Arrays.toString(employeesJ) +
                ", employeesA=" + Arrays.toString(employeesA) +
                ", employeesG=" + Arrays.toString(employeesG) +
                '}';
    }
}
