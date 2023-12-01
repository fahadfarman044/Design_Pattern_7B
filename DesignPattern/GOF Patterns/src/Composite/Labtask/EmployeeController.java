/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Composite.Labtask;

/**
 *
 * @author fa20-bse-044
 */
class EmployeeController {
    public String generateOrganogram(IEmployee employee) {
        StringBuilder orgChart = new StringBuilder();

        orgChart.append(employee.getClass().getSimpleName()).append(" -> ");

        for (IEmployee subordinate : employee.getSubordinates()) {
            orgChart.append(subordinate.getClass().getSimpleName()).append(", ");
            orgChart.append(generateOrganogram(subordinate));
        }

        return orgChart.toString();
    }

    String generateOrganogram(Director director) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
}