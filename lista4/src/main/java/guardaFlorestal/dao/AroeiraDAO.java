package guardaFlorestal.dao;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

import guardaFlorestal.model.Aroeira;

import javax.persistence.Query;
import java.util.List;

public class AroeiraDAO {

    private static final SessionFactory sessionFactory;

    static {
        try {
            Configuration configuration = new Configuration().configure();
            sessionFactory = configuration.buildSessionFactory();
        } catch (Throwable ex) {
            throw new ExceptionInInitializerError(ex);
        }
    }

    public void close() {
        sessionFactory.close();
    }

    public void salvarAroeira(Aroeira aroeira) {
        Transaction transaction = null;
        try (Session session = sessionFactory.openSession()) {
            transaction = session.beginTransaction();
            session.save(aroeira);
            transaction.commit();
        } catch (Exception e) {
            if (transaction != null) {
                transaction.rollback();
            }
            e.printStackTrace();
        }
    }

    public void ConsultarAroeira() {
        Transaction transaction = null;
        try (Session session = sessionFactory.openSession()) {
            transaction = session.beginTransaction();
            Query query = session.createQuery("FROM Aroeira");
            List<Aroeira> aroeiras = query.getResultList();

            for (Aroeira aroeira : aroeiras) {
                System.out.println("ID: " + aroeira.getId() + ", Altura: " + aroeira.getAltura() + ", Profundidade: " + aroeira.getProfundidade()
                + ", Espessura: " + aroeira.getEspessura() + ", Largura: " + aroeira.getLargura() + ", Família: " + aroeira.getFamília() + ", Quantidade: " + aroeira.getQuantidade()
                + ", Remédio: " + aroeira.getRemédio());
            }
        } catch (Exception e) {
            if (transaction != null) {
                transaction.rollback();
            }
            e.printStackTrace();
        }
    }

    public Aroeira getAroeiraById(Long id) {
        try (Session session = sessionFactory.openSession()) {
            return session.get(Aroeira.class, id);
        }
    }

    public void atualizarAroeira(Aroeira aroeira) {
        Transaction transaction = null;
        try (Session session = sessionFactory.openSession()) {
            transaction = session.beginTransaction();
            session.update(aroeira);
            transaction.commit();
        } catch (Exception e) {
            if (transaction != null) {
                transaction.rollback();
            }
            e.printStackTrace();
        }
    }

    public void deletarAroeira(Aroeira aroeira) {
        Transaction transaction = null;
        try (Session session = sessionFactory.openSession()) {
            transaction = session.beginTransaction();
            session.delete(aroeira);
            transaction.commit();
        } catch (Exception e) {
            if (transaction != null) {
                transaction.rollback();
            }
            e.printStackTrace();
        }
    }
}
