package org.newdawn.slick.opengl;

import java.io.IOException;
import java.util.ArrayList;

/**
 * A collection of IOException that failed image data loading
 * 
 * @author kevin
 */
public class CompositeIOException extends IOException {
	private static final long serialVersionUID = 1L;

	/** The list of exceptions causing this one */
	private ArrayList<Exception> exceptions = new ArrayList<Exception>();

	/**
	 * Create a new composite IO Exception
	 */
	public CompositeIOException() {
		super();
	}

	/**
	 * Add an exception that caused this exceptino
	 * 
	 * @param e The exception
	 */
	public void addException(Exception e) {
		exceptions.add(e);
	}

	/**
	 * @see java.lang.Throwable#getMessage()
	 */
	@Override
	public String getMessage() {
		String msg = "Composite Exception: \n";
		for (int i=0;i<exceptions.size();i++) {
			msg += "\t"+((IOException) exceptions.get(i)).getMessage()+"\n";
		}

		return msg;
	}
}