package JavaBasePracticHome;

import JavaBase.models.Student;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

public class Courses {
    public static void main(String[] args) {
        try (SessionFactory sessionFactory = new Configuration()
                .configure("hibernate.cfg.xml")
                .addAnnotatedClass(SchoolDB.class)
                .buildSessionFactory()) {

            // Создание сессии:
            Session session = sessionFactory.getCurrentSession();

            // Начало транзакции:
            session.beginTransaction();

            // Создание объекта:
            SchoolDB lesson = SchoolDB.create();
            session.save(lesson);
            System.out.println("Object lesson save successfully");

            // Чтение объекта из базы данных:
//            SchoolDB retrievedLesson = session.get(SchoolDB.class, lesson.getId());
//            System.out.println("Object lesson retrieved successfully");
//            System.out.println("Retrieved student object: " + retrievedLesson);

            // Обновление объекта:
//            retrievedLesson.updateTitle();
//            retrievedLesson.updateDuration();
//            session.update(retrievedLesson);
//            System.out.println("Object lesson update successfully");

            // Удаление объекта:
//            session.delete(retrievedLesson);
//            System.out.println("Object student delete successfully");

        }
        catch (Exception e) {
            e.printStackTrace();
        }
    }
}
