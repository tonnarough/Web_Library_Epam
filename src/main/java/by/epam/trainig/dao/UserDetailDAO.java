package by.epam.trainig.dao;

import by.epam.trainig.dao.impl.UserDetailDAOImpl;
import by.epam.trainig.entity.user.UserDetail;
import by.epam.trainig.exception.DAOException;

import java.sql.Connection;

public interface UserDetailDAO extends EntityDAO<UserDetail> {

    boolean create(UserDetail userDetail, Connection connection) throws DAOException;

    static UserDetailDAO getInstance() {
        return UserDetailDAOImpl.getInstance();
    }

}
