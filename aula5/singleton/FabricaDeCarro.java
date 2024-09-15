public class FabricaDeCarro {
    private static FabricaDeCarro instance = new FabricaDeCarro();
    public String description = "A unica instância desta classe!";

    private FabricaDeCarro(){}

    public static FabricaDeCarro getInstance() {
        return instance;
    }


}
