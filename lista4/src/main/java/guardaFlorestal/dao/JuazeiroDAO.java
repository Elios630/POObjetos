package guardaFlorestal.dao;

import java.util.List;

import javax.persistence.Query;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

import guardaFlorestal.model.Juazeiro;

public class JuazeiroDAO {
    
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

    public void salvarJuazeiro(Juazeiro juazeiro) {
        Transaction transaction = null;
        try (Session session = sessionFactory.openSession()) {
            transaction = session.beginTransaction();
            session.save(juazeiro);
            transaction.commit();
        } catch (Exception e) {
            if (transaction != null) {
                transaction.rollback();
            }
            e.printStackTrace();
        }
    }

    public void ConsultarJuazeiro() {
        Transaction transaction = null;
        try (Session session = sessionFactory.openSession()) {
            transaction = session.beginTransaction();
            Query query = session.createQuery("FROM Juazeiro");
            List<Juazeiro> juazeiros = query.getResultList();

            System.out.println("");
            for (Juazeiro juazeiro : juazeiros) {
                System.out.println("ID: " + juazeiro.getId() + ", Altura: " + juazeiro.getAltura() + ", Profundidade: " + juazeiro.getProfundidade()
                + ", Espessura: " + juazeiro.getEspessura() + ", Largura: " + juazeiro.getLargura() + ", Família: " + juazeiro.getFamília() + ", Quantidade: " + juazeiro.getQuantidade()
                + ", nDeEspinhos: " + juazeiro.getnDeEspinhos());
                System.out.println("");
            }
        } catch (Exception e) {
            if (transaction != null) {
                transaction.rollback();
            }
            e.printStackTrace();
        }
    }

    public Juazeiro getJuazeiroById(Long id) {
        try (Session session = sessionFactory.openSession()) {
            return session.get(Juazeiro.class, id);
        }
    }

    public void atualizarJuazeiro(Juazeiro juazeiro) {
        Transaction transaction = null;
        try (Session session = sessionFactory.openSession()) {
            transaction = session.beginTransaction();
            session.update(juazeiro);
            transaction.commit();
        } catch (Exception e) {
            if (transaction != null) {
                transaction.rollback();
            }
            e.printStackTrace();
        }
    }

    public void deletarJuazeiro(Juazeiro juazeiro) {
        Transaction transaction = null;
        try (Session session = sessionFactory.openSession()) {
            transaction = session.beginTransaction();
            session.delete(juazeiro);
            transaction.commit();
        } catch (Exception e) {
            if (transaction != null) {
                transaction.rollback();
            }
            e.printStackTrace();
        }
    }
}
