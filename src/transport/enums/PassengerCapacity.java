package transport.enums;

public enum PassengerCapacity {
    TINY(null, 10),
    SMALL(null, 25),
    MEDIUM(40, 50),
    BIG(60, 80),
    LARGE(100, 120);

    private Integer minPassengerCapacity, maxPassengerCapacity;

    PassengerCapacity(Integer minPassengerCapacity, Integer maxPassengerCapacity) {
        this.minPassengerCapacity = minPassengerCapacity;
        this.maxPassengerCapacity = maxPassengerCapacity;
    }

    @Override
    public String toString() {
        return "Passenger Capacity: " +
                (minPassengerCapacity != null ? "from " + minPassengerCapacity : "up") +
                (maxPassengerCapacity != null ? " to " + maxPassengerCapacity : " and higher");
    }
    }
