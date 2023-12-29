
package smartcityg;

import java.io.*;
import javax.swing.JFrame;
import javax.swing.JOptionPane;

public class student  extends person  {
        

        static int ids;
        int studentid;
        String institute;
        double gpa;

        public student(String institute, double gpa, String name, String email, String password, String address, String gender) {
            super(name, email, password, address, gender);
            this.studentid = ids;
            ids++;
            this.institute = institute;
            this.gpa = gpa;
             File stu_f = new File("student");
             try {
            FileWriter fw = new FileWriter(stu_f, true);
            BufferedWriter bw = new BufferedWriter(fw);
            PrintWriter pw = new PrintWriter(bw);
            pw.println(this.name+","+this.id+","+this.password+","+this.institute+","+this.gpa+","+this.email+","+this.address+","+this.gender+ "," + "Student");
            pw.flush();
            pw.close();
            bw.close();
            fw.close();
            System.out.println("Student Record saved");
        } catch (IOException e) {
            System.out.println("bhand Student file making");

        }

        }

    public student(String name, String email, String password, String address, String gender) {
        super(name, email, password, address, gender);
        File stu_f = new File("Student");
             try {
            FileWriter fw = new FileWriter(stu_f, true);
            BufferedWriter bw = new BufferedWriter(fw);
            PrintWriter pw = new PrintWriter(bw);
            pw.println(this.name+","+this.id+","+this.password+","+this.email+","+this.address+","+this.gender);
            pw.flush();
            pw.close();
            bw.close();
            fw.close();
            System.out.println("Student saved");
            JFrame f = new JFrame();
            JOptionPane.showMessageDialog(f, "Student Saved ");
        } catch (IOException e) {
            System.out.println("bhand student file making");

        }
        
         
    }

    public static int getIds() {
        return ids;
    }

    public static void setIds(int ids) {
        student.ids = ids;
    }

    student() {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

    public int getStudentid() {
        return studentid;
    }

    public void setStudentid(int studentid) {
        this.studentid = studentid;
    }

    public String getInstitute() {
        return institute;
    }

    public void setInstitute(String institute) {
        this.institute = institute;
    }

    public double getGpa() {
        return gpa;
    }

    public void setGpa(double gpa) {
        this.gpa = gpa;
    }
    
}
