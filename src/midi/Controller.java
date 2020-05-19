package midi;

import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import jm.constants.ProgramChanges;
import jm.music.data.Note;
import midi.sound.Play;

import javax.sound.midi.MidiChannel;
import java.awt.*;
import java.net.URL;
import java.util.ResourceBundle;

public class Controller implements Initializable {

    @FXML
    Button c4;


    @Override
    public void initialize(URL url, ResourceBundle resourceBundle) {
    }

    public void setInstrument(int i) {
        Play.instrument = i;
    }
}

