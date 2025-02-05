package com.gdgotp.d2d.common.enums;

import lombok.Getter;

@Getter
public enum LocationType {
    BUILDING("building"),
    CAFETERIA("cafeteria"),
    CONVENIENCE("convenience"),
    STORE("store"),
    RESTAURANT("restaurant"),
    CAFE("cafe"),
    WAYPOINT("waypoint"),
    NONE("none");

    private final String value;

    LocationType(final String value) {
        this.value = value;
    }
}