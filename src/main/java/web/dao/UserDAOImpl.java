package web.dao;

import com.mysql.cj.xdevapi.SessionFactory;
import jakarta.persistence.EntityManager;
import jakarta.persistence.PersistenceContext;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import web.model.User;

import java.util.List;

@Repository
public class UserDAOImpl implements UserDAO{

    @PersistenceContext
    private EntityManager entityManager;


    @Override
    public List<User> getUsers() {
        List<User> result = entityManager.createQuery("SELECT u FROM User u", User.class)
                .getResultList();
        return result;
    }

    @Override
    public void deleteUserById(long id) {

    }

    @Override
    public void addUser(User user) {

    }

    @Override
    public void editUser(User user) {

    }
}
