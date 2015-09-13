package ${groupId}.dao;

import ${groupId}.domain.ExampleEntity;

/**
 * IExampleDAO Class
 *
 * @author ${USER}
 * @version ${DATE}
 */
public interface IExampleDAO {
    public String create(ExampleEntity entity);
    public ExampleEntity get(String id);
}
