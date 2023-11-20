package guardaFlorestal.dao;

import java.util.List;

import javax.persistence.Query;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

import guardaFlorestal.model.Bambu;

public class BambuDAO {

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

    public void salvarBambu(Bambu bambu) {
        Transaction transaction = null;
        try (Session session = sessionFactory.openSession()) {
            transaction = session.beginTransaction();
            session.save(bambu);
            transaction.commit();
        } catch (Exception e) {
            if (transaction != null) {
                transaction.rollback();
            }
            e.printStackTrace();
        }
    }

    public void ConsultarBambu() {
        Transaction transaction = null;
        try (Session session = sessionFactory.openSession()) {
            transaction = session.beginTransaction();
            Query query = session.createQuery("FROM Bambu");
            List<Bambu> bambus = query.getResultList();

            for (Bambu bambu : bambus) {
                System.out.println("ID: " + bambu.getId() + ", Altura: " + bambu.getAltura() + ", Profundidade: " + bambu.getProfundidade()
                + ", Espessura: " + bambu.getEspessura() + ", Largura: " + bambu.getLargura() + ", Família: " + bambu.getFamília() + ", Quantidade: " + bambu.getQuantidade()
                + ", Gênero: " + bambu.getGênero());
            }
        } catch (Exception e) {
            if (transaction != null) {
                transaction.rollback();
            }
            e.printStackTrace();
        }
    }

    public Bambu getBambuById(Long id) {
        try (Session session = sessionFactory.openSession()) {
            return session.get(Bambu.class, id);
        }
    }

    public void atualizarBambu(Bambu bambu) {
        Transaction transaction = null;
        try (Session session = sessionFactory.openSession()) {
            transaction = session.beginTransaction();
            session.update(bambu);
            transaction.commit();
        } catch (Exception e) {
            if (transaction != null) {
                transaction.rollback();
            }
            e.printStackTrace();
        }
    }

    public void deletarBambu(Bambu bambu) {
        Transaction transaction = null;
        try (Session session = sessionFactory.openSession()) {
            transaction = session.beginTransaction();
            session.delete(bambu);
            transaction.commit();
        } catch (Exception e) {
            if (transaction != null) {
                transaction.rollback();
            }
            e.printStackTrace();
        }
    }
    
}
