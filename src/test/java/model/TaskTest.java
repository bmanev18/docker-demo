package model;

import org.junit.jupiter.api.Test;
import via.doc.dockerdemo.model.Task;
import static org.junit.jupiter.api.Assertions.assertEquals;

public class TaskTest {
    @Test
    public void ctor_normaluse_noerrors()
    {
        // Arrange
        String taskId = "Task1";
        String taskName = "Tough task";
        String taskDesc = "Cleanup the mess";
        // Act
        Task testTask = new Task(taskId, taskName, taskDesc);
        // Assert
        assertEquals(testTask.getId(), taskId);
        assertEquals(testTask.getName(), taskName);
        assertEquals(testTask.getDescription(), taskDesc);
    }
}
