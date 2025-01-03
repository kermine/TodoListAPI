package project.TodoListAPI.infraestructure.persistence.entities;

import jakarta.persistence.*;

/**
 * The type Task.
 */
@Entity
@Table(name = "Task")
public class TaskEntity {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;

    private String name;

    private String description;

    @ManyToOne()
    @JoinColumn(name = "user_id")
    private UserEntity user;

    public TaskEntity(){}

    /**
     * Instantiates a new Task.
     *
     * @param name        the name
     * @param description the description
     */
    public TaskEntity(String name, String description) {
        this.name = name;
        this.description = description;
    }

    /**
     * Gets id.
     *
     * @return the id
     */
    public int getId() {
        return id;
    }

    /**
     * Sets id.
     *
     * @param id the id
     */
    public void setId(int id) {
        this.id = id;
    }

    /**
     * Gets name.
     *
     * @return the name
     */
    public String getName() {
        return name;
    }

    /**
     * Sets name.
     *
     * @param name the name
     */
    public void setName(String name) {
        this.name = name;
    }

    /**
     * Gets description.
     *
     * @return the description
     */
    public String getDescription() {
        return description;
    }

    /**
     * Sets description.
     *
     * @param description the description
     */
    public void setDescription(String description) {
        this.description = description;
    }
}
