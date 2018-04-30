package deepDown.controllers;

import deepDown.Leaderboard;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.control.Button;
import javafx.scene.layout.AnchorPane;
import javafx.scene.text.Text;

import java.io.IOException;
import java.util.concurrent.TimeUnit;

public class LeaderboardController {

    @FXML
    private AnchorPane anchor;
    @FXML
    private Button newGameButton;
    @FXML
    private Text nr1;
    @FXML
    private Text nr2;
    @FXML
    private Text nr3;
    @FXML
    private Text nr4;
    @FXML
    private Text nr5;

    @FXML
    public void initialize() {

        Leaderboard lb = new Leaderboard();
        lb.loadScores();
        fillScores(nr1, 1, lb.getNames(0), Integer.toString(lb.getHighScore(0)));
        fillScores(nr2, 2, lb.getNames(1), Integer.toString(lb.getHighScore(1)));
        fillScores(nr3, 3, lb.getNames(2), Integer.toString(lb.getHighScore(2)));
        fillScores(nr4, 4, lb.getNames(3), Integer.toString(lb.getHighScore(3)));
        fillScores(nr5, 5, lb.getNames(4), Integer.toString(lb.getHighScore(4)));
    }

    public void fillScores(Text nr, int x, String name, String score) {
        String dot = ".";
        for(double i = 0; i < 80; i++){
            if(nr.getLayoutBounds().getWidth() < (1280-32)){
                dot += "." ;
                nr.setText(x +". " + name + dot + score);
            }
        }
    }

    public void backButtonPressed() throws IOException {
        FXMLLoader loader = new FXMLLoader(getClass().getResource("/deepDown/resource/FXML/startMenu.fxml"));
        StartMenuController controller = new StartMenuController();
        loader.setController(controller);
        Parent root = loader.load();
        anchor.getChildren().setAll(root);
    }
}
