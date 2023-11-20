package guardaFlorestal.dao;

import java.util.List;

import javax.persistence.Query;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

import guardaFlorestal.model.Jatobá;

public class JatobáDAO {

    private static final SessionFactory sessionFactory;

    static {
        try {
            // Configurando a sessão do Hibernate a partir do arquivo hibernate.cfg.xml
            Configuration configuration = new Configuration().configure();
            sessionFactory = configuration.buildSessionFactory();
        } catch (Throwable ex) {
            throw new ExceptionInInitializerError(ex);
        }
    }

    public void close() {
        sessionFactory.close();
    }

    public void salvarJatobá(Jatobá jatobá) {
        Transaction transaction = null;
        try (Session session = sessionFactory.openSession()) {
            transaction = session.beginTransaction();
            session.save(jatobá);
            transaction.commit();
        } catch (Exception e) {
            if (transaction != null) {
                transaction.rollback();
            }
            e.printStackTrace();
        }
    }

    public void ConsultarJatobá() {
        Transaction transaction = null;
        try (Session session = sessionFactory.openSession()) {
            transaction = session.beginTransaction();
            Query query = session.createQuery("FROM Jatobá");
            List<Jatobá> jatobás = query.getResultList();

            for (Jatobá jatobá : jatobás) {
                System.out.println("ID: " + jatobá.getId() + ", Altura: " + jatobá.getAltura() + ", Profundidade: " + jatobá.getProfundidade()
                + ", Espessura: " + jatobá.getEspessura() + ", Largura: " + jatobá.getLargura() + ", Família: " + jatobá.getFamília() + ", Quantidade: " + jatobá.getQuantidade()
                + ", Remédio: " + jatobá.getRemédio());
            }
        } catch (Exception e) {
            if (transaction != null) {
                transaction.rollback();
            }
            e.printStackTrace();
        }
    }

    public Jatobá getJatobáById(Long id) {
        try (Session session = sessionFactory.openSession()) {
            return session.get(Jatobá.class, id);
        }
    }

    public void atualizarJatobá(Jatobá jatobá) {
        Transaction transaction = null;
        try (Session session = sessionFactory.openSession()) {
            transaction = session.beginTransaction();
            session.update(jatobá);
            transaction.commit();
        } catch (Exception e) {
            if (transaction != null) {
                transaction.rollback();
            }
            e.printStackTrace();
        }
    }

    public void deletarJatobá(Jatobá jatobá) {
        Transaction transaction = null;
        try (Session session = sessionFactory.openSession()) {
            transaction = session.beginTransaction();
            session.delete(jatobá);
            transaction.commit();
        } catch (Exception e) {
            if (transaction != null) {
                transaction.rollback();
            }
            e.printStackTrace();
        }
    }
    
}
