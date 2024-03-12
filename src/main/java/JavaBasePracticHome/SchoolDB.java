package JavaBasePracticHome;

import JavaBase.models.Student;

import javax.persistence.*;
import java.util.Random;
@Entity
@Table(name = "SchoolDB")
public class SchoolDB {
    private static final String[] titles = new String[] { "Русский", "Литература", "Математика", "Геометрия",
                    "История", "Обществознание", "Английский", "География", "Биология", "Химия", "Физика" };
    private static final Random random = new Random();

    public SchoolDB(String title, int duration) {
        this.title = title;
        this.duration = duration;
    }

    public SchoolDB(int id, String title, int duration) {
        this.id = id;
        this.title = title;
        this.duration = duration;
    }

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;
    private String title;
    private int duration;
    public int getId() {
        return id;
    }

    public String getTitle() {
        return title;
    }

    public int getDuration() {
        return duration;
    }

    public void setId(int id) {
        this.id = id;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public void setDuration(int duration) {
        this.duration = duration;
    }

    public void updateDuration(){
        duration = random.nextInt(40, 121);
    }
    public void updateTitle(){
        title = titles[random.nextInt(titles.length)];
    }
    public static SchoolDB create(){
        return new SchoolDB(titles[random.nextInt(titles.length)], random.nextInt(40, 121));
    }
    @Override
    public String toString() {
        return "SchoolDB {" +
                "id=" + id +
                ", title='" + title + '\'' +
                ", age=" + duration +
                '}';
    }
}
