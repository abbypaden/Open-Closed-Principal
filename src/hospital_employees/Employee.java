package hospital_employees;

/**
 *
 * @author abbyp
 */
public abstract class Employee {

   private int id;
   private String name;
   private String department;
   private boolean working;

   public Employee(int id, String name, String department, boolean working) {
       this.id = id;
       this.name = name;
       this.department = department;
       this.working = working;
   }
   
   public abstract void performDuties();
    /**
     * @return the id
     */
    public int getId() {
        return id;
    }

    /**
     * @param id the id to set
     */
    public void setId(int id) {
        this.id = id;
    }

    /**
     * @return the name
     */
    public String getName() {
        return name;
    }

    /**
     * @param name the name to set
     */
    public void setName(String name) {
        this.name = name;
    }

    /**
     * @return the department
     */
    public String getDepartment() {
        return department;
    }

    /**
     * @param department the department to set
     */
    public void setDepartment(String department) {
        this.department = department;
    }

    /**
     * @return the working
     */
    public boolean isWorking() {
        return working;
    }

    /**
     * @param working the working to set
     */
    public void setWorking(boolean working) {
        this.working = working;
    }
    
    @Override
    public String toString() {
        return "Employee id: " + id + ", name: " + name + ", department: " + department + ", working: "+working;
    }
}
