package com.gridnine.testing;

import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.time.LocalDate;
import java.util.Date;

public class launcherFlight {
    public static void main(String[] args) throws ParseException {
        Flight flight = new Flight("5353", "Boing", "Vnykovo", "asda", "Moscow",
                "04.12.2012 14:34:00", "Adler", "SOCHI", "04.12.2012 12:34:00", 424);
        flight.beginFlight();
        flight.endFlight();
        System.out.println(flight.toString());
    }
}
