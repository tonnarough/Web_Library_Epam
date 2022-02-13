package by.epam.trainig.service;

import by.epam.trainig.entity.user.CreditCard;
import by.epam.trainig.entity.user.User;
import by.epam.trainig.exception.ServiceException;
import by.epam.trainig.service.impl.UserServiceImpl;

import java.util.List;
import java.util.Optional;

public interface UserService {

    Optional<User> authenticate(String login, String password);

    Optional<User> findBy(String columnName, Object value);

    List<User> findAllUsers(int currentPage, int recordOnPage);

    void createCreditCard(User user, CreditCard creditCard) throws ServiceException;

    void updateCreditCard(String updColumn, Object updValue, String whereColumn, String whereValue) throws ServiceException;

    Optional<CreditCard> findCreditCardBy(String findByValue, String creditCardNumber);

    void registration(User user) throws ServiceException;

    boolean isExists(String login);

    static UserServiceImpl getInstance(){
        return UserServiceImpl.INSTANCE;
    }

}
