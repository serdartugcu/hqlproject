import model.Employees;
import org.hibernate.*;
import org.hibernate.cfg.Configuration;

/**
 * Created by serdartugcu on 17.03.2018.
 */
public class Main {

    public static void main(final String[] args) throws Exception {
        Configuration cfg = new Configuration();
        cfg.configure();
        SessionFactory sf = cfg.buildSessionFactory();
        Session session = sf.openSession();

        Transaction tx = session.beginTransaction();
        Query query = session.createQuery("from Employees e where e.empNo = 10001");
        Employees employees = (Employees) query.uniqueResult();
        System.out.println(employees);

    }
}
