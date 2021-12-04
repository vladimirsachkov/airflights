package com.gridnine.testing;

import java.util.List;

public interface Filterability {
    public void filterByAirline (List<Flight> flights);
    public void filterByAirplane (List<Flight> flights);
    public void filterByAirportFromAirport (List<Flight> flights);
    public void filterAirportFromCity (List<Flight> flights);
    public void filterDepartureTime (List<Flight> flights);
    public void filterActualDepartureTime (List<Flight> flights);
    public void filterDepartureDelayInHours (List<Flight> flights);
    public void filterAirportToAirport (List<Flight> flights);
    public void filterAirportToCity (List<Flight> flights);
    public void filterTimeLanding (List<Flight> flights);
    public void filterActualTimeLanding (List<Flight> flights);
    public void filterPassengersCount (List<Flight> flights);
}
