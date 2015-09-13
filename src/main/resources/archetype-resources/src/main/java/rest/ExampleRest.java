package ${groupId}.rest;

import ${groupId}.service.IExampleService;
import ${groupId}.domain.ExampleEntity;
import ${groupId}.domain.rest.ExampleRestEntity;
import org.apache.log4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

/**
 * ExampleRest Class
 *
 * @author ${USER}
 * @version ${DATE}
 */
@RestController
@RequestMapping("/rest")
public class ExampleRest {
    private static final Logger LOGGER = Logger.getLogger(ExampleRest.class);

    @Autowired
    private IExampleService exampleService;

    @RequestMapping(value = "/create", method = RequestMethod.POST)
    @ResponseBody
    public ResponseEntity<String> create(@RequestBody ExampleRestEntity entity) {
        String id = exampleService.create(new ExampleEntity(entity.getText()));
        return ResponseEntity.ok(id);
    }

    @RequestMapping(value = "/get/{id}", method = RequestMethod.GET)
    @ResponseBody
    public ResponseEntity<ExampleEntity> get(@PathVariable("id") String id) {
        ExampleEntity entity = exampleService.get(id);
        return ResponseEntity.ok(entity);
    }

}