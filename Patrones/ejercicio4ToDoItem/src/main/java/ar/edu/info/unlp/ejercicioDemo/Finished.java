package ar.edu.info.unlp.ejercicioDemo;

import java.time.Duration;

public class Finished extends State{
	
	public Finished(ToDoItem task) {
		super(task);
	}

	@Override
	public void start() {
	}

	@Override
	public void togglePause() {
		throw new RuntimeException("ERROR: you can't pause (or unpause) in finished state");
	}

	@Override
	public void finish() {
	}

	@Override
	public void addComment(String comment) {
	}
}