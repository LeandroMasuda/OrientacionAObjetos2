package ar.edu.info.unlp.ejercicioDemo;
import java.time.Duration;
import java.time.LocalDateTime;
/**
 * De esta forma crearemos las clases del ejercicio
 *
 */
public class InProgress extends State {
	public InProgress(ToDoItem task) {
		super(task);
	}
	@Override
	public void start() {
		
	}
	@Override
	public  void togglePause() {
		this.getTask().setState(new Paused(this.getTask()));
	}
	public void finish() {
		this.getTask().setState(new Finished(this.getTask()));
		this.getTask().setEnd(LocalDateTime.now());
	}
}
