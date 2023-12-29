package smartcityg;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.ArrayList;
import javax.swing.JFrame;
import javax.swing.JOptionPane;

public class business extends feature {

    ArrayList<employee> emps = new ArrayList<>();
    int jobs_openings;

    public business(String name, String description, String category, String address, String email, String contact) {
        super(name, description, category, address, email, contact);
        File bus_f = new File("business");
        try {
            FileWriter fw = new FileWriter(bus_f, true);
            BufferedWriter bw = new BufferedWriter(fw);
            PrintWriter pw = new PrintWriter(bw);
            pw.println(this.name  + "," + this.description + "," + this.category + "," + this.email + "," + this.contact+ "," + this.address );
            pw.flush();
            pw.close();
            bw.close();
            fw.close();
            System.out.println("business Record saved");

            JFrame f = new JFrame();
            JOptionPane.showMessageDialog(f, "business Saved ");
        } catch (IOException e) {
            System.out.println("bhand business file making");

        }

    }

    public business() {
    }

    public business(int jobs_openings) {
        this.jobs_openings = jobs_openings;
    }

    public int getJobs_openings() {
        return jobs_openings;
    }

    public void setJobs_openings(int jobs_openings) {
        this.jobs_openings = jobs_openings;
    }

}
