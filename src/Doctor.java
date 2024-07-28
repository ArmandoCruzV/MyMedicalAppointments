import com.sun.xml.internal.bind.v2.runtime.output.StAXExStreamWriterOutput;

import java.sql.SQLOutput;
import java.util.ArrayList;
import java.util.Date;

public class Doctor extends User{
    String especiality;

    Doctor(String name, String email ){
        super(name,email);
        System.out.println("El nombre del doctor asignado es: " + name);
        this.especiality = especiality;
    }

    public String getEspeciality() {
        return especiality;
    }

    public void setEspeciality(String especiality) {
        this.especiality = especiality;
    }

    ArrayList<AvailableAppointment> availableAppointments = new ArrayList<>();
    public void addAvailableAppointments(Date date, String time){
        availableAppointments.add(new Doctor.AvailableAppointment(date,time));
    }

    public ArrayList<AvailableAppointment> getAvailableAppointments()
    {
        return availableAppointments;
    }

    @Override
    public String toString() {
        return super.toString() + "\nSpeciality: " + especiality + "\nAvailble: " + availableAppointments.toString();
    }

    public static class AvailableAppointment{
        private int id;
        private Date date;
        private String time;
        public AvailableAppointment(Date date, String time){
            this.date = date;
            this.time = time;
        }

        public int getId() {
            return id;
        }

        public void setId(int id) {
            this.id = id;
        }

        public Date getDate() {
            return date;
        }

        public void setDate(Date date) {
            this.date = date;
        }

        public String getTime() {
            return time;
        }

        public void setTime(String time) {
            this.time = time;
        }

        @Override
        public String toString() {
            return "Availble Appointments \nDate: "+date+ "\nTime: "+time;
        }
    }
}
