import java.util.Date;
import java.util.Scanner;
import static ui.UiMenu.*;

public class Main {
    public static void main(String[] args) {

        //showMenu();

        Doctor myDoctor = new Doctor("haok","Programer doctor");

        myDoctor.addAvailableAppointments(new Date(),"4pm");

        for (Doctor.AvailableAppointment Aa: myDoctor.getAvailableAppointments()){
            System.out.println(Aa.getDate());
        }
        System.out.println(myDoctor);


        System.out.println();
        System.out.println();

        Patient patient = new Patient("Alejandra","Alejandra@mail.com");
        System.out.println(patient);
     }
}