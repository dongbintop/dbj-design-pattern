package create.build;

public class Client {

    public static void main(String[] args) {
        Parlour parlour = new Parlour.Builder()
                .sofa("sofa")
                .TV("tv")
                .wall("ss")
                .build();
        System.out.println(parlour);
    }
}
