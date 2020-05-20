package midi;

import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Button;
import javafx.scene.control.MenuButton;
import jm.constants.ProgramChanges;
import jm.music.data.Note;
import midi.sound.Play;

import javax.sound.midi.Instrument;
import javax.sound.midi.MidiChannel;
import java.awt.*;
import java.net.URL;
import java.util.HashMap;
import java.util.Map;
import java.util.ResourceBundle;

public class Controller implements Initializable {

    int instrument = 40;
    public Button a;
    int octave = 0;
    Map<Instrument, Integer> insInt = new HashMap<>();

    @FXML
    MenuButton instruments;

    @Override
    public void initialize(URL url, ResourceBundle resourceBundle) {
        Play play = new Play();
        play.setup();
        Instrument[] instruments1 = Play.instruments;
        for (int i = 0,j = 0; i < Play.instruments.length; i++, j++) {
            insInt.put(instruments1[i],j);
            javafx.scene.control.MenuItem m = new javafx.scene.control.MenuItem(instruments1[i].toString());
            int finalI = i;
            m.setOnAction(e-> setInstrument(getinsInt(instruments1[finalI])));
            instruments.getItems().add(m);
        }
    }

    private int getinsInt(Instrument i) {
        return insInt.get(i);
    }

    public void setInstrument(int i) {
        instrument = i;
    }

    public void play48() { Play.play(instrument, 48);}
    public void stop48() { Play.stop(instrument, 48);}

    public void play49() { Play.play(instrument, 49);}
    public void stop49() { Play.stop(instrument, 49);}

    public void play50() { Play.play(instrument, 50);}
    public void stop50() { Play.stop(instrument, 50);}

    public void play51() { Play.play(instrument, 51);}
    public void stop51() { Play.stop(instrument, 51);}

    public void play52() { Play.play(instrument, 52);}
    public void stop52() { Play.stop(instrument, 52);}

    public void play53() { Play.play(instrument, 53);}
    public void stop53() { Play.stop(instrument, 53);}

    public void play54() { Play.play(instrument, 54);}
    public void stop54() { Play.stop(instrument, 54);}

    public void play55() { Play.play(instrument, 55);}
    public void stop55() { Play.stop(instrument, 55);}

    public void play56() { Play.play(instrument, 56);}
    public void stop56() { Play.stop(instrument, 56);}

    public void play57() { Play.play(instrument, 57);}
    public void stop57() { Play.stop(instrument, 57);}

    public void play58() { Play.play(instrument, 58);}
    public void stop58() { Play.stop(instrument, 58);}

    public void play59() { Play.play(instrument, 59);}
    public void stop59() { Play.stop(instrument, 59);}

    public void play60() { Play.play(instrument, 60);}
    public void stop60() { Play.stop(instrument, 60);}

    public void play61() { Play.play(instrument, 61);}
    public void stop61() { Play.stop(instrument, 61);}

    public void play62() { Play.play(instrument, 62);}
    public void stop62() { Play.stop(instrument, 62);}

    public void play63() { Play.play(instrument, 63);}
    public void stop63() { Play.stop(instrument, 63);}

    public void play64() { Play.play(instrument, 64);}
    public void stop64() { Play.stop(instrument, 64);}

    public void play65() { Play.play(instrument, 65);}
    public void stop65() { Play.stop(instrument, 65);}

    public void play66() { Play.play(instrument, 66);}
    public void stop66() { Play.stop(instrument, 66);}

    public void play67() { Play.play(instrument, 67);}
    public void stop67() { Play.stop(instrument, 67);}

    public void play68() { Play.play(instrument, 68);}
    public void stop68() { Play.stop(instrument, 68);}

    public void play69() { Play.play(instrument, 69);}
    public void stop69() { Play.stop(instrument, 69);}

    public void play70() { Play.play(instrument, 70);}
    public void stop70() { Play.stop(instrument, 70);}

    public void play71() { Play.play(instrument, 71);}
    public void stop71() { Play.stop(instrument, 71);}

    public void play72() { Play.play(instrument, 72);}
    public void stop72() { Play.stop(instrument, 72);}
}

