package transport.enums;

public enum LoadCapacity {
    N1(null, 3.5),
    N2(3.5, 12.0),
    N3(12.0, null);

    private Double maxLoadTons, minLoadTons;


    LoadCapacity(Double minLoadTons, Double maxLoadTons) {
        this.maxLoadTons = maxLoadTons;
        this.minLoadTons = minLoadTons;
    }

    @Override
    public String toString() {
        return "Load capacity in tons: " +
                (minLoadTons != null ? "from " + minLoadTons : "up") +
                (maxLoadTons != null ? " to " + maxLoadTons : " and higher");
    }
}
