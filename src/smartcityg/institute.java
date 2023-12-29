package smartcityg;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.ArrayList;
import javax.swing.JFrame;
import javax.swing.JOptionPane;

public class institute extends feature {
    
    
        
        double scholarship_requirment;
        double scholarship;
        ArrayList<student> stu = new ArrayList<student>();

        public institute() {
        }

        public institute(String name, String description, String category, String address, String email, String contact) {
            super(name, description, category, address, email, contact);
             File ins_f = new File("institute");
             try {
            FileWriter fw = new FileWriter(ins_f, true);
            BufferedWriter bw = new BufferedWriter(fw);
            PrintWriter pw = new PrintWriter(bw);
            pw.println(this.name+","+this.description+","+this.category+","+this.email+","+this.contact+","+this.address);
            pw.flush();
            pw.close();
            bw.close();
            fw.close();
            System.out.println("institute Record saved");
            JFrame f = new JFrame();
            JOptionPane.showMessageDialog(f, "Institute Saved ");
        } catch (IOException e) {
            System.out.println("bhand institute file making");

        }

          
        }

        public double getScholarships() {
            return scholarship;
        }

        public void setScholarships(double scholarship) {
            this.scholarship = scholarship;
        }

        public double getScholarship_requirment() {
            return scholarship_requirment;
        }

        public void setScholarship_requirment(double scholarship_requirment) {
            this.scholarship_requirment = scholarship_requirment;
        }
    }
    

