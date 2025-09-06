package edu.eci.arsw.springdemo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * Servicio que realiza la verificación gramatical de un texto.
 * Utiliza un SpellChecker inyectado para revisar la ortografía.
 */
@Service
public class GrammarChecker {

    /** SpellChecker utilizado para revisar la ortografía */
    private SpellChecker sc;

    /** Constructor con inyección de dependencias */
    @Autowired
    public GrammarChecker(SpellChecker sc) {
        this.sc = sc;
    }

    /**
     * Obtiene el SpellChecker asociado.
     *
     * @return el SpellChecker utilizado
     */
    public SpellChecker getSpellChecker() {
        return sc;
    }

    /**
     * Asigna un SpellChecker al GrammarChecker.
     *
     * @param sc SpellChecker a asignar
     */
    public void setSpellChecker(SpellChecker sc) {
        this.sc = sc;
    }

    /**
     * Revisa un texto combinando la verificación ortográfica y un mensaje de revisión de plagio.
     *
     * @param text texto a revisar
     * @return resultado de la verificación del texto
     */
    public String check(String text){
        StringBuffer sb = new StringBuffer();
        sb.append("Spell checking output: " + sc.checkSpell(text));
        sb.append(" Plagiarism checking output: Not available yet");

        return sb.toString();
    }

}
