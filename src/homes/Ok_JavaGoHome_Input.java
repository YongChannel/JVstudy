package homes;

import homes.org.opentutorials.iot.DimmingLights;
import homes.org.opentutorials.iot.Elevator;
import homes.org.opentutorials.iot.Lighting;
import homes.org.opentutorials.iot.Security;

import javax.swing.JOptionPane;

public class Ok_JavaGoHome_Input {
    public static void main(String[] args) {

        String id = JOptionPane.showInputDialog("Enter a ID");
        String bright = JOptionPane.showInputDialog("Enter a Bright level");

        Elevator myElevator = new Elevator(id);
        myElevator.callForUp(1);

        Security mySecurity = new Security(id);
        mySecurity.off();

        Lighting hallLamp = new Lighting(id + " / Hall Lamp");
        hallLamp.on();

        Lighting floorLamp = new Lighting(id + " / Floor Lamp");
        floorLamp.on();

        DimmingLights moodLamp = new DimmingLights(id + " moodLamp");
        moodLamp.setBright(Double.parseDouble(bright));

        Security Security = new Security(id);
        Security.on();

    }
}
