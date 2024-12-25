import java.util.Objects;

public class Song {
    public final String title;      // Название песни
    public final String artist;     // Исполнитель
    public final String songwriter;  // Автор песни

    // Конструктор класса Song
    public Song(String title, String artist, String songwriter) {
        this.title = title;
        this.artist = artist;
        this.songwriter = songwriter;
    }

    // Переопределение метода equals
    @Override
    public boolean equals(Object obj) {
        // Проверка на рефлексивность
        if (this == obj) {
            return true;
        }

        // Проверка на null и класс
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }

        // Приведение типа
        Song song = (Song) obj;

        // Сравнение полей
        return Objects.equals(title, song.title) &&
                Objects.equals(artist, song.artist) &&
                Objects.equals(songwriter, song.songwriter);
    }

    // Переопределение метода hashCode
    @Override
    public int hashCode() {
        return Objects.hash(title, artist, songwriter);
    }
}
