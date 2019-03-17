package pl.sda.openwaether;

import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import pl.sda.openwaether.service.*;

import java.io.IOException;
import java.net.URL;
import java.util.ResourceBundle;

public class RootController implements Initializable
{
    @FXML
    private Button search;
    @FXML
    private TextField city;
    @FXML
    private Label TemperatureIn;

    @Override
    public void initialize(URL location, ResourceBundle resources)
    {
        city.setText("Bydgoszcz");
        TemperatureIn.setText("");
    }
    public void setCity()
    {
        System.out.println("KLIK KLIK KLIK");
        try
        {
            //throw new IOException("czemu nie");
            String miasto = city.getText();
            Weather pogoda;
            pogoda = WeatherService.getCityWeather(miasto);
            int temperatura = pogoda.getTemp();
            TemperatureIn.setText(String.valueOf(temperatura));
        }catch(IOException e)
        {
            TemperatureIn.setText("#Błędna nazwa miasta");
        }

    }
}
