public class Race {
    String winner = "";
    int distance = 0;

    void toPrintChooseWinner(Car[] participant) {
        for (int i = 0; i < participant.length; i++) {
            Car s = participant[i];
            if (distance < s.speed * 24) {
                winner = s.name;
                distance = s.speed * 24;
            }
        }
        System.out.println("Победитель гонки Ле-Ман: " + winner);
    }
}
