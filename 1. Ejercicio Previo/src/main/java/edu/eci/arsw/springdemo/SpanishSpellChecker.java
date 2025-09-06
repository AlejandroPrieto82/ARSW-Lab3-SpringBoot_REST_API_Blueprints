package edu.eci.arsw.springdemo;

import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Service;

/**
 * Implementación del verificador ortográfico para el idioma español.
 * Esta implementación se marca como primaria, por lo que Spring la prioriza
 * al inyectar un SpellChecker.
 */
@Service
@Primary
public class SpanishSpellChecker implements SpellChecker {

    /**
     * Revisa la ortografía de un texto en español.
     *
     * @param text texto a revisar
     * @return el texto revisado con un mensaje indicando que se utilizó el verificador español
     */
    @Override
    public String checkSpell(String text) {
        return "revisando (" + text + ") con el verificador de sintaxis del espanol";
    }

}
