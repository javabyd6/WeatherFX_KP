package pl.sda.openwaether.service;

import com.fasterxml.jackson.databind.ObjectMapper;

import java.io.IOException;
import java.net.MalformedURLException;
import java.net.URL;

public class WeatherService
{
   /* public static void main(String[] args) throws MalformedURLException
    {

        Weather pogoda;
        String city = "glasgow";


        URL url = new URL("q=" + city);
        try
        {
            pogoda =
            System.out.println(pogoda);
        } catch(IOException e)
        {
            e.printStackTrace();
        }
    }*/
  public static  Weather getCityWeather(String city) throws IOException
    {
        ObjectMapper mapper = new ObjectMapper();
        String apiKey = "key=3e11d5ea24914379b62120104191003";
        URL finalURL = new URL("http://api.apixu.com/v1/current.json?"+apiKey+"&q="+city);
        Weather pogoda = null;
            pogoda = mapper.readValue(finalURL, Weather.class);
        return pogoda;
    }

}
