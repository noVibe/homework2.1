package transport.enums;

public enum BodyType {
    SEDAN("Седан"),
    HATCHBACK("Хэтчбэк"),
    COUPE("Купе"),
    WAGON("Универсал"),
    SUV("Внедорожник"),
    CROSSOVER("Кроссовер"),
    PICKUP("Пикап"),
    VAN("Фургон"),
    MINIVAN("Минивэн");

    private String typeInRussian;

    BodyType(String typeInRussian) {
        this.typeInRussian = typeInRussian;
    }

    @Override
    public String toString() {
        return "Body Type: " + this.typeInRussian;
    }
}
