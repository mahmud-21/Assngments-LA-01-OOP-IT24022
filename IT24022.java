public class IT24024 {
    public static void main(String[] args) {
            vehicle v = new vehicle(args[0],args[1]);
            v.start();
            vehicle v2 = new vehicle(args[0],args[1]);
            v2.start();
    }
}