public class Practicum {
    public static void main(String[] args) {
        Song theRockBandSong = new Song("Popular Song", "The Rock Band", "John Doe");
        Song johnDoeSong = new Song("Popular Song", "The Rock Band", "John Doe");

        Song rapSong = new Song("A song about a hard life", "Popular Rapper", "Popular Rapper");
        Song richardRoeSong = new Song("A song about a hard life", "Popular Rapper", "Richard Roe");

        // Проверяем рефлексивность
        boolean check0 = johnDoeSong.equals(johnDoeSong);

        // Проверяем симметричность
        boolean check1 = theRockBandSong.equals(johnDoeSong) &&
                johnDoeSong.equals((Object) theRockBandSong);

        // Проверяем на неравенство объекту другого класса
        boolean check2 = !rapSong.equals(42);

        // Проверяем на неравенство пустой ссылке
        boolean check3 = !theRockBandSong.equals(null);

        // Проверяем на правильное сравнение объектов одного класса
        boolean check4 = !richardRoeSong.equals(johnDoeSong);

        // Проверяем транзитивность
        boolean check5 = false;
        Song popularSong = new Song("Popular Song", "The Rock Band", "John Doe");
        if (popularSong.equals(theRockBandSong) && theRockBandSong.equals(johnDoeSong)) {
            check5 = popularSong.equals(johnDoeSong);
        }

        // Проверяем согласованность
        boolean check6 = true;
        boolean result = rapSong.equals(richardRoeSong);
        for (int i = 0; i < 10; i++) {
            if (rapSong.equals(richardRoeSong) != result) {
                check6 = false;
            }
        }

        // Вывод результата проверки
        if (check0 && check1 && check2 && check3 && check4 && check5 && check6) {
            System.out.println("Поздравляем! Метод equals реализован верно.");
        } else {
            System.out.println("Что-то здесь не так. Подумайте над реализацией ещё немного.");
        }
    }
}
