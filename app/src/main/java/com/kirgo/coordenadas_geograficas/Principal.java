package com.kirgo.coordenadas_geograficas;

class Principal {
    public static void main(String[] main) {
        GeoPunto lat;
        GeoPunto lon;
        lat = new GeoPunto (0.0, 0.0);
        lon = new GeoPunto (0.0, 0.0);
        lat.suma(lon);
        System.out.println ( "Cords: " + lat + lon );
    }
}
