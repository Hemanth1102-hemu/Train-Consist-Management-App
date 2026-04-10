class GoodsBogie {
    String type;     // e.g., "Cylindrical", "Rectangular"
    String cargo;    // e.g., "Petroleum", "Coal", "Grain"

    public GoodsBogie(String type, String cargo) {
        this.type = type;
        this.cargo = cargo;
    }

    public String getType() { return type; }
    public String getCargo() { return cargo; }

    @Override
    public String toString() {
        return type + " carrying " + cargo;
    }
}

public void Train_Consist_Management_App {

    System.out.println("\n--- UC12: Safety Compliance Check for Goods Bogies ---");

    // Sample goods bogies
    List<GoodsBogie> goodsBogies = Arrays.asList(
            new GoodsBogie("Cylindrical", "Petroleum"),
            new GoodsBogie("Rectangular", "Coal"),
            new GoodsBogie("Cylindrical", "Petroleum")
    );

    // Safety rule:
    // Cylindrical bogies must ONLY carry "Petroleum"
    boolean isSafe = goodsBogies.stream()
            .allMatch(bogie ->
                    !bogie.getType().equalsIgnoreCase("Cylindrical")
                            || bogie.getCargo().equalsIgnoreCase("Petroleum")
            );

    if (isSafe) {
        System.out.println("Train is SAFE. All cargo assignments comply with safety rules.");
    } else {
        System.out.println("Train is NOT SAFE. One or more cylindrical bogies have invalid cargo.");
    }
}