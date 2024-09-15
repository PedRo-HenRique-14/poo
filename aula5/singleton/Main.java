public class Main {
    public static void main(String[] args) {
        FabricaDeCarro fabricaDeCarro = FabricaDeCarro.getInstance();

        System.out.println(fabricaDeCarro.description);
    }
}