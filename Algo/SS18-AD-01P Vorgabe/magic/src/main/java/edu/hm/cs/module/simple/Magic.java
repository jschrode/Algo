package edu.hm.cs.module.simple;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

/**
 * Klasse zur Implementierung der magischen Methode von Aufgabenblatt 1.
 * 
 * @author katz.bastian
 */
public class Magic {

	private static final Logger log = LoggerFactory.getLogger(Magic.class);

	/**
	 * Implementierung der magischen Methode.
	 * 
	 * @param a
	 *            nicht-negative Ganzzahl
	 * @param b
	 *            nicht-negative Ganzzahl
	 * @return ???
	 */
	public static int magic(int a, int b) {

		// Beispiel für eine Log-Ausgabe:
		log.info("Berechne magische Zahl für {} und {}.", a, b);

		if (a < 0 || b < 0) {
			throw new IllegalArgumentException("Expecting non-negative parameters.");
		}

		int k = 1;
		
		// Ergänzen Sie Ihre Implementierung hier!
		if (b == 0) {
			return a;
		}
		while (a > 0) {
			while (a % 2 == 0) {
				a = a / 2;
				if (b % 2 == 0) {
					b = b / 2;
					k = k * 2;
				}  
			}
			if (a < b) {
				int i = a;
				a = b;
				b = i;
			}
			a = a - b;
		}
		return b * k;
	}

}
