package pl.sda.openwaether.service;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class Weather
{
    Location location;
    Current current;
   public int getTemp()
    {
        return current.temp_c;
    }
}
