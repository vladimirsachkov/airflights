package com.gridnine.testing;

import java.text.ParseException;

public interface Piloted {
    public void beginFlight(String actualDepartureTime) throws ParseException;
    public void beginFlight() throws ParseException;
    public void airplaneTransfer();
    public void endFlight(String actualTimeLanding) throws ParseException;;
    public void endFlight();
}
