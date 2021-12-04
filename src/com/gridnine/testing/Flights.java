package com.gridnine.testing;

import java.util.List;

public class Flights implements Filterability{
    private List<Flight> flights;

    public Flights(List<Flight> flights) {
        this.flights = flights;
    }

    public List<Flight> getFlights() {
        return flights;
    }


    @Override
    public void filterByAirline(List<Flight> flights) {

    }

    @Override
    public void filterByAirplane(List<Flight> flights) {

    }

    @Override
    public void filterByAirportFromAirport(List<Flight> flights) {

    }

    @Override
    public void filterAirportFromCity(List<Flight> flights) {

    }

    @Override
    public void filterDepartureTime(List<Flight> flights) {

    }

    @Override
    public void filterActualDepartureTime(List<Flight> flights) {

    }

    @Override
    public void filterDepartureDelayInHours(List<Flight> flights) {

    }

    @Override
    public void filterAirportToAirport(List<Flight> flights) {

    }

    @Override
    public void filterAirportToCity(List<Flight> flights) {

    }

    @Override
    public void filterTimeLanding(List<Flight> flights) {

    }

    @Override
    public void filterActualTimeLanding(List<Flight> flights) {

    }

    @Override
    public void filterPassengersCount(List<Flight> flights) {

    }
}
