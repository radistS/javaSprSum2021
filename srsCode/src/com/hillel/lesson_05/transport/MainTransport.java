package com.hillel.lesson_05.transport;

public class MainTransport {
    public static void main(String[] args) {
//        Transport transport = new Transport("transport");
//        System.out.println(transport.getName());

        AirTransport airTransport = new AirTransport("air");
        Transport airTransport1 = new AirTransport("air");

        WaterTransport waterTransport = new WaterTransport("water");

        Transport gTransport = new GroundTransport("ground");

        System.out.println(airTransport.getName());
        System.out.println(airTransport.getFlightLevel());

        System.out.println(waterTransport.getName());
        System.out.println(waterTransport.getName());
        System.out.println(gTransport.getName());
    }

}
