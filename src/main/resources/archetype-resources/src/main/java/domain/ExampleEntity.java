package ${groupId}.domain;

/**
 * ExampleEntity Class
 *
 * @author ${USER}
 * @version ${DATE}
 */
public class ExampleEntity {
    private String id;
    private String text;

    public ExampleEntity() {
    }

    public ExampleEntity(String text) {
        this.text = text;
    }

    public ExampleEntity(String id, String text) {
        this.id = id;
        this.text = text;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getText() {
        return text;
    }

    public void setText(String text) {
        this.text = text;
    }
}