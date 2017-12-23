package bd.ac.seu.demoassignment.Model;

import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class Manager {
    @Id
    private int managerID;
    private String managerName;
    private String managerPassword;

    public Manager() {
    }

    public Manager(int managerID, String managerName, String managerPassword) {
        this.managerID = managerID;
        this.managerName = managerName;
        this.managerPassword = managerPassword;
    }

    public int getManagerID() {
        return managerID;
    }

    public void setManagerID(int managerID) {
        this.managerID = managerID;
    }

    public String getManagerName() {
        return managerName;
    }

    public void setManagerName(String managerName) {
        this.managerName = managerName;
    }

    public String getManagerPassword() {
        return managerPassword;
    }

    public void setManagerPassword(String managerPassword) {
        this.managerPassword = managerPassword;
    }

    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder("Manager{");
        sb.append("managerID=").append(managerID);
        sb.append(", managerName='").append(managerName).append('\'');
        sb.append(", managerPassword='").append(managerPassword).append('\'');
        sb.append('}');
        return sb.toString();
    }
}
