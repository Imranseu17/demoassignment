package bd.ac.seu.demoassignment.Model;

import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class SalesPerson {

    @Id
    private int salespersonID;
    private String salespersonName;
    private String salespersonPassword;

    public SalesPerson() {
    }

    public SalesPerson(int salespersonID, String salespersonName, String salespersonPassword) {
        this.salespersonID = salespersonID;
        this.salespersonName = salespersonName;
        this.salespersonPassword = salespersonPassword;
    }

    public int getSalespersonID() {
        return salespersonID;
    }

    public void setSalespersonID(int salespersonID) {
        this.salespersonID = salespersonID;
    }

    public String getSalespersonName() {
        return salespersonName;
    }

    public void setSalespersonName(String salespersonName) {
        this.salespersonName = salespersonName;
    }

    public String getSalespersonPassword() {
        return salespersonPassword;
    }

    public void setSalespersonPassword(String salespersonPassword) {
        this.salespersonPassword = salespersonPassword;
    }

    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder("SalesPerson{");
        sb.append("salespersonID=").append(salespersonID);
        sb.append(", salespersonName='").append(salespersonName).append('\'');
        sb.append(", salespersonPassword='").append(salespersonPassword).append('\'');
        sb.append('}');
        return sb.toString();
    }
}
