package cs112.ud2;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Node;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.stage.Stage;
import javafx.scene.control.Button;
import javafx.scene.control.ChoiceDialog;

import java.util.Objects;
import java.util.Optional;

import java.io.IOException;

public class MapController {

    @FXML
    private Button towerSpotOne;

    @FXML
    private Button towerSpotTwo;

    @FXML
    private Button towerSpotThree;

    @FXML
    private Label goldLabel;

    @FXML
    private Label healthLabel;

    @FXML
    private Label waveLabel;

    @FXML
    private Label messageLabel;

    private Tower towerOne;
    private Tower towerTwo;
    private Tower towerThree;

    @FXML
    public void onBackButtonClick(ActionEvent actionEvent) throws IOException {
        Parent titleScreen = FXMLLoader.load(Objects.requireNonNull(CastleDefenseApp.class.getResource("title-screen.fxml")));
        Scene titleScene = new Scene(titleScreen);

        Stage window = (Stage) ((Node) actionEvent.getSource()).getScene().getWindow();
        window.setScene(titleScene);
        window.show();
    }

    @FXML
    public void onStartWaveButtonClick(ActionEvent actionEvent) {
        messageLabel.setText("Wave started! Enemies are coming!");
    }

    @FXML
    public void onTowerSpotClick(ActionEvent actionEvent) {
        Button clickedSpot = (Button) actionEvent.getSource();

        ChoiceDialog<String> dialog = new ChoiceDialog<>("Archer Tower", "Archer Tower", "Cannon Tower");
        dialog.setTitle("Build Tower");
        dialog.setHeaderText("Choose a tower to build");
        dialog.setContentText("Tower type:");

        Optional<String> result = dialog.showAndWait();

        if (result.isPresent()) {
            Tower selectedTower;

            if (result.get().equals("Archer Tower")) {
                selectedTower = new ArcherTower();
            } else {
                selectedTower = new CannonTower();
            }

            if (clickedSpot == towerSpotOne) {
                towerOne = selectedTower;
            } else if (clickedSpot == towerSpotTwo) {
                towerTwo = selectedTower;
            } else if (clickedSpot == towerSpotThree) {
                towerThree = selectedTower;
            }

            clickedSpot.setText(selectedTower.getName());
            messageLabel.setText(selectedTower.getName() + " built! Damage: "
                    + selectedTower.getDamage() + ", Cost: " + selectedTower.getCost());
        }
    }
}