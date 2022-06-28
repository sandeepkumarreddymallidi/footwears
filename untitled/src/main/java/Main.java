import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

public class Main {
    public static void main(String[] args) {
        Configuration cf=new Configuration();
        cf.configure("hyber.xml");
        SessionFactory sf=cf.buildSessionFactory();
        Session se=sf.openSession();
        Transaction ts=se.beginTransaction();
        Student s=new Student();
        s.setId(106);
        s.setName("mahesh kumar");
        s.setDept("IT");
        se.save(s);
        ts.commit();
        se.close();

    }
}
