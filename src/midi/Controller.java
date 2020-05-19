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

    int instrument = 0;

    @FXML



    @Override
    public void initialize(URL url, ResourceBundle resourceBundle) {
        Play play = new Play();
        play.setup();
    }

    public void setInstrument(int i) {
        instrument = i;
    }

    public void play() {
        Play.play(instrument, 60);
    }
}

