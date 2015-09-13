package ${groupId}.service;

import ${groupId}.domain.ExampleEntity;

/**
 * IExampleService Class
 *
 * @author ${USER}
 * @version ${DATE}
 */
public interface IExampleService {
    String create(ExampleEntity entity);
    ExampleEntity get(String id);
}
