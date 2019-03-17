package pl.sda.openwaether.service;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class Condition
{

    String text;
    String icon;
    int code;
}
