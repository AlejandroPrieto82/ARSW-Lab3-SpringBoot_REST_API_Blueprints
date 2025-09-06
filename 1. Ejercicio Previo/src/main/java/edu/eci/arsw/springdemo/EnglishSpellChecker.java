package edu.eci.arsw.springdemo;

/**
 * Implementación del verificador ortográfico para el idioma inglés.
 */
public class EnglishSpellChecker implements SpellChecker {

    /**
     * Revisa la ortografía de un texto en inglés.
     *
     * @param text texto a revisar
     * @return el texto revisado con un mensaje indicando que se utilizó el verificador inglés
     */
    @Override
    public String checkSpell(String text) {        
        return "Checked with english checker:" + text;
    }

}
