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
public class Doctor extends Employee {
    public Doctor(int id, String name, String department, boolean working) {
        super(id, name, department, working);
        System.out.println("Doctor in action...");
    }
    
    private void prescribeMedicine() {
        System.out.println("Prescribing medicine...");
    }
    public void diagnosePatients() {
        System.out.println("Diagnosing patients...");
    }

    @Override
    public void performDuties() {
        prescribeMedicine();
        diagnosePatients();
    }
    
}
