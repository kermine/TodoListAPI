package project.TodoListAPI.domain;

import java.time.LocalDate;

/**
 * The type Task.
 */
public class Task {

    private String title;
    private String description;

    /**
     * Instantiates a new Task.
     *
     * @param title       the title
     * @param description the description
     */
    public Task(String title, String description) {
        this.title = title;
        this.description = description;
    }

    /**
     * Gets title.
     *
     * @return the title
     */
    public String getTitle() {
        return title;
    }

    /**
     * Sets title.
     *
     * @param title the title
     */
    public void setTitle(String title) {
        this.title = title;
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
