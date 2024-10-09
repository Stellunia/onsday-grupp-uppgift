public class main {

    public static void main(String[] args) {
        ArrayList<Integer> numbers = new ArrayList<Integer>();

        numbers.add(1);
        numbers.add(3);
        numbers.add(6);
        numbers.add(8);
        numbers.add(10);

        for(int i = 0; i < numbers.size(); i++ ) {
            int number = numbers.get(i);
            System.out.println(number);
        }
    }
}
