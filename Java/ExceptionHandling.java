class Main {
    public static void main(String[] args) {
        int i = 12;
        int j = 122;
        int k = 0;

        try {
            k = i / 10;
        } catch (Exception e) {
            System.out.println("Error occurred");
        }

        System.out.println(k);
    }
}
