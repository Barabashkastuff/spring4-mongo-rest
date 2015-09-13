package ${groupId}.dao;

import ${groupId}.domain.ExampleEntity;
import ${groupId}.dao.IExampleDAO;
import org.apache.log4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.mongodb.core.MongoOperations;
import org.springframework.data.mongodb.core.query.Criteria;
import org.springframework.data.mongodb.core.query.Query;
import org.springframework.stereotype.Component;

import java.util.List;
import java.util.UUID;

/**
 * ExampleDAO Class
 *
 * @author ${USER}
 * @version ${DATE}
 */
@Component
public class ExampleDAO implements IExampleDAO {
    private static final Logger LOGGER = Logger.getLogger(ExampleDAO.class);

    @Autowired
    private MongoOperations mongoOperations;

    @Override
    public String create(ExampleEntity entity) {
        if (!collectionExist()) {
            LOGGER.info("Created collection for ExampleEntity.class");
            mongoOperations.createCollection(ExampleEntity.class);
        }
        String id = UUID.randomUUID().toString();
        entity.setId(id);
        mongoOperations.save(entity);
        LOGGER.info(String.format("Saved entity with text=%s...", cryptoEntity.getText()));
        return id;
    }

    @Override
    public ExampleEntity get(String id) {
        Query query = new Query(Criteria.where("id").is(id));
        return mongoOperations.findOne(query, ExampleEntity.class);
    }

    private boolean collectionExist() {
        return mongoOperations.collectionExists(ExampleEntity.class);
    }
}
