/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package hospital_employees;

/**
 *
 * @author abbyp
 */
public class Nurse extends Employee {

    public Nurse(int id, String name, String department, boolean working) {
        super(id, name, department, working);
        System.out.println("Nurse in action...");
    }
    
    private void checkVitalSigns() {
        System.out.println("Checking vitals...");
    }
    private void drawBlood() {
        System.out.println("Drawing blood...");
    }
    private void cleanPatientArea() {
        System.out.println("Cleaning patient area...");
    }

    @Override
    public void performDuties() {
        checkVitalSigns();
        drawBlood();
        cleanPatientArea();
    }

    
}
