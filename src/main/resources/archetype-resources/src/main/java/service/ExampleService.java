package ${groupId}.service;

import ${groupId}.domain.ExampleEntity;
import ${groupId}.dao.IExampleDAO;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

/**
 * ExampleService Class
 *
 * @author ${USER}
 * @version ${DATE}
 */
@Component
public class ExampleService implements IExampleService {

    @Autowired
    private IExampleDAO dao;

    public String create(ExampleEntity entity) {
        return dao.create(entity);
    }

    public ExampleEntity get(String id) {
        return dao.get(id);
    }
}
