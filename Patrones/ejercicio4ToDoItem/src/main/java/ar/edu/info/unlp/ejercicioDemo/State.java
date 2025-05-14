package ar.edu.info.unlp.ejercicioDemo;
import java.time.Duration;
/**
 * De esta forma crearemos las clases del ejercicio
 *
 */
public abstract class State {
	private ToDoItem task;
	
	public State (ToDoItem task) {
		this.task = task;
	}
	
	public ToDoItem getTask() {
		return task;
	}
	
	public Duration workedTime() {
		return Duration.between(this.task.getStart(),this.task.getEnd());
	}
	
	public void addComment(String comment) {
		this.task.getCommentaries().add(comment);
	}
	
	public abstract void start();
	public abstract void togglePause();
	public abstract void finish();
}
