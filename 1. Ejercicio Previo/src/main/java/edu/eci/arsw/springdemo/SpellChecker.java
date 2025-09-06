package edu.eci.arsw.springdemo;

/**
 * Interfaz que define un verificador ortográfico.
 */
public interface SpellChecker {

    /**
     * Revisa la ortografía de un texto.
     *
     * @param text texto a revisar
     * @return texto revisado o mensaje indicando el resultado de la revisión
     */
    public String checkSpell(String text);

}
