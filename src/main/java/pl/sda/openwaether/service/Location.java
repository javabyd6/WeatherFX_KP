package pl.sda.openwaether.service;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class Location
{
    String name;
    String region;
    String country;
    double lat	;
    double lon;
    String tz_id;
    long localtime_epoch;
    String localtime;
}
