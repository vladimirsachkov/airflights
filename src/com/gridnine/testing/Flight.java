package com.gridnine.testing;

import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.List;

public class Flight implements Piloted {
    private String number;

    private String airline;

    private String airplane;

    private String airportFromAirport;

    private String airportFromCity;

    private Date departureTime;

    private Date actualDepartureTime;

    private int departureDelayInHours;

    private String airportToAirport;

    private String airportToCity;

    private Date TimeLanding;

    private Date actualTimeLanding;

    private int passengersCount;

    final private DateFormat DEFAULT_DATE_FORMAT = new SimpleDateFormat("dd.MM.yyyy HH:mm:ss");

    private List<Segment> segments;

    public Flight(String number, String airline, String airplane,
                  String airportFromAirport, String airportFromCity,
                  String departureTime, String airportToAirport,
                  String airportToCity, String timeLanding, int passengersCount) throws ParseException {
        this.number = number;
        this.airline = airline;
        this.airplane = airplane;
        this.airportFromAirport = airportFromAirport;
        this.airportFromCity = airportFromCity;
        this.departureTime = DEFAULT_DATE_FORMAT.parse(departureTime);
        this.airportToAirport = airportToAirport;
        this.airportToCity = airportToCity;
        this.TimeLanding = DEFAULT_DATE_FORMAT.parse(timeLanding);
        this.passengersCount = passengersCount;
        System.out.println("The flight is registered. ");
    }

    @Override
    public void beginFlight(String actualDepartureTime) throws ParseException {
        this.actualDepartureTime = DEFAULT_DATE_FORMAT.parse(actualDepartureTime);
        System.out.println("The flight has begun.");
    }

    @Override
    public void beginFlight() throws ParseException {
        this.actualDepartureTime = this.departureTime;
        System.out.println("The flight has begun.");
    }

    @Override
    public void airplaneTransfer() {

    }

    @Override
    public void endFlight(String actualTimeLanding) throws ParseException {
        this.actualTimeLanding = DEFAULT_DATE_FORMAT.parse(actualTimeLanding);
        System.out.println("The flight is over.");
    }

    @Override
    public void endFlight() {
        this.actualTimeLanding = this.TimeLanding;
        System.out.println("The flight is over.");
    }

    @Override
    public String toString() {
        return "Flight{" +
                "number='" + number + '\'' +
                ", airline='" + airline + '\'' +
                ", airplane='" + airplane + '\'' +
                ", airportFromAirport='" + airportFromAirport + '\'' +
                ", airportFromCity='" + airportFromCity + '\'' +
                ", departureTime=" + departureTime +
                ", actualDepartureTime=" + actualDepartureTime +
                ", departureDelayInHours=" + departureDelayInHours +
                ", airportToAirport='" + airportToAirport + '\'' +
                ", airportToCity='" + airportToCity + '\'' +
                ", TimeLanding=" + TimeLanding +
                ", actualTimeLanding=" + actualTimeLanding +
                ", passengersCount=" + passengersCount +
                ", DEFAULT_DATE_FORMAT=" + DEFAULT_DATE_FORMAT +
                ", segments=" + segments +
                '}';
    }
}
