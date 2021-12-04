package com.gridnine.testing;

import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.time.LocalDateTime;
import java.util.Date;

public class Segment {
    private Date departureDate;

    private Date arrivalDate;

    final private DateFormat DEFAULT_DATE_FORMAT = new SimpleDateFormat("dd.MM.yyyy HH:mm:ss");

    public Segment(String departureDate, String arrivalDate) throws ParseException {
        this.departureDate = DEFAULT_DATE_FORMAT.parse(departureDate);
        this.arrivalDate = DEFAULT_DATE_FORMAT.parse(arrivalDate);
    }

    public Date getDepartureDate() {
        return departureDate;
    }

    public Date getArrivalDate() {
        return arrivalDate;
    }
}
