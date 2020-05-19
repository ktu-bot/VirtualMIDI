package midi;

import javafx.application.Application;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Scene;
import javafx.scene.layout.AnchorPane;
import javafx.stage.Stage;
import jm.audio.Instrument;
import jm.constants.ProgramChanges;
import jm.music.data.Note;
import jm.music.data.Part;
import jm.music.data.Phrase;
import jm.music.data.Score;
import jm.util.Play;
import jm.util.Write;

import javax.sound.midi.Synthesizer;
import java.util.Scanner;

import static jm.constants.Durations.MINIM;
import static jm.constants.Pitches.C4;

public class Main extends Application {

    private Synthesizer synthesizer;
    public static AnchorPane root;
    public static void main(String[] args) {
	// write your code here
        launch(args);

    }

    @Override
    public void start(Stage primaryStage) throws Exception {
        root = FXMLLoader.load(getClass().getResource("midi.fxml"));
        primaryStage.setTitle("MIDI Player");
        primaryStage.setScene(new Scene(root));
        primaryStage.show();
    }
}
