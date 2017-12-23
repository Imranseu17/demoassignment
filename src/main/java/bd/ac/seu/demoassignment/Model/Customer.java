package bd.ac.seu.demoassignment.Model;

import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class Customer {
    @Id
    private int customerID;
    private String customerName;
    private String customerPassword;

    public Customer() {
    }

    public Customer(int customerID, String customerName, String customerPassword) {
        this.customerID = customerID;
        this.customerName = customerName;
        this.customerPassword = customerPassword;
    }

    public int getCustomerID() {
        return customerID;
    }

    public void setCustomerID(int customerID) {
        this.customerID = customerID;
    }

    public String getCustomerName() {
        return customerName;
    }

    public void setCustomerName(String customerName) {
        this.customerName = customerName;
    }

    public String getCustomerPassword() {
        return customerPassword;
    }

    public void setCustomerPassword(String customerPassword) {
        this.customerPassword = customerPassword;
    }

    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder("Customer{");
        sb.append("customerID=").append(customerID);
        sb.append(", customerName='").append(customerName).append('\'');
        sb.append(", customerPassword='").append(customerPassword).append('\'');
        sb.append('}');
        return sb.toString();
    }
}
