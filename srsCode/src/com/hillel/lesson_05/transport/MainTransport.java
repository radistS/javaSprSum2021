package com.hillel.lesson_05.transport;

public class MainTransport {
    public static void main(String[] args) {
//        Transport transport = new Transport("transport");
//        System.out.println(transport.getName());

        AirTransport airTransport = new AirTransport("air");
        Transport airTransport1 = new AirTransport("air");

        WaterTransport waterTransport = new WaterTransport("water");

        Transport gTransport = new GroundTransport("ground");

//        System.out.println(airTransport.getName());
//        System.out.println(airTransport.getFlightLevel());
//
//        System.out.println(waterTransport.getName());
//        System.out.println(waterTransport.getName());
//        System.out.println(gTransport.getName());

        Transport[] tr = new Transport[10];

        tr[0] = airTransport;
        tr[1] = waterTransport;
        tr[2] = gTransport;

        System.out.println(tr[0].getClass());
        System.out.println(tr[1].getClass());
        System.out.println(tr[2].getClass());

        Transport tb = (Transport) airTransport;
        ((AirTransport) tb).getFlightLevel();
    }

}
