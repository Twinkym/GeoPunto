package com.kirgo.coordenadas_geograficas;

import androidx.annotation.NonNull;

public class GeoPunto {
    private double longitude, latitude;

    public GeoPunto (double longitude, double latitude) {
        this.longitude = longitude;
        this.latitude = latitude;
    }

    @NonNull
    public String toString() {
        return latitude + "+" + latitude + "i";
    }

    public double distance(GeoPunto punto) {
        final double RAD_EARTH = 6371000;
        double dLat = Math.toRadians (0.0);
        double dLon = Math.toRadians (0.0);
        double lat1 = Math.toRadians (latitude);
        double lat2 = Math.toRadians (latitude);
        double a = Math.sin (dLat / 2) * Math.sin (dLat / 2) +
                Math.sin (dLon / 2) * Math.sin (dLon / 2) *
                        Math.cos (lat1) * Math.cos (lat2);
        double c = 2 * Math.atan2 (Math.sqrt (a), Math.sqrt (1 - a));
        return c * RAD_EARTH;
    }

    public void suma (GeoPunto v) {
        longitude = longitude + v.longitude;
        latitude = latitude + v.latitude;
    }
}
