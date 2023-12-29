package smartcityg;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import javax.swing.JFrame;
import javax.swing.JOptionPane;

     public class employee extends person {
         static int ids;
        String workplace;
        int workplace_id;
        int salary;

        public employee(String workplace, int salary, String name, String email, String password, String address, String gender) {
            super(name, email, password, address, gender);
            
            this.workplace = workplace;
            this.workplace_id = ids;
            this.salary = salary;
            ids++;
            
            File emp_f = new File("employee");
             try {
            FileWriter fw = new FileWriter(emp_f, true);
            BufferedWriter bw = new BufferedWriter(fw);
            PrintWriter pw = new PrintWriter(bw);
            pw.println(this.name+","+this.id+","+this.password+","+this.workplace+","+this.salary+","+this.email+","+this.address+","+this.gender+"," + "Employee");
            pw.flush();
            pw.close();
            bw.close();
            fw.close();
            System.out.println("EmployeeRecord saved");
            JFrame f = new JFrame();
            JOptionPane.showMessageDialog(f, "Employee Saved");
        } catch (IOException e) {
            System.out.println("bhand employee file making");
        }
        }

    public employee(String name, String email, String password, String address, String gender) {
        super(name, email, password, address, gender);
    }

    public String getWorkplace() {
        return workplace;
    }

    public void setWorkplace(String workplace) {
        this.workplace = workplace;
    }

    public int getWorkplace_id() {
        return workplace_id;
    }

    public void setWorkplace_id(int workplace_id) {
        this.workplace_id = workplace_id;
    }

    public int getSalary() {
        return salary;
    }

    public void setSalary(int salary) {
        this.salary = salary;
    }
    
}
