import java.util.Random;
import java.util.ArrayList;
import java.util.HashMap;
/**
 * The responder class represents a response generator object.
 * It is used to generate an automatic response to an input string.
 * 
 * @author     Michael Kölling and David J. Barnes
 * @version    0.1 (2011.07.31)
 */
public class Responder
{
    private Random aleatorio;
    private ArrayList <String> respuestas;
    HashMap<String, String> respuestasInput;
    
    /**
     * Construct a Responder - nothing to do
     */
    public Responder()
    {
        aleatorio = new Random();
        respuestas = new ArrayList <String>();
        respuestasInput = new HashMap<>();
        
        respuestas.add("That`s problem okey...");
        respuestas.add("I need more information describe me well the problem");
        respuestas.add("Maybie you must invoc cthulu");
        respuestas.add("hell no, i dont know the problem");
        respuestas.add("Pa que quieres saber eso saludos jajajajaj");
        
        respuestasInput.put("Kraken", "we release the kraken for you");
        respuestasInput.put("Cthulhu", "He is our god" );
        respuestasInput.put("100tifiko", "Para que quieres saber eso jajaja saludos");
        respuestasInput.put("Macarena","Heeeeee macarena, aaarg");
    }

    /**
     * Generate a response.
     * @return   A string that should be displayed as the response
     */
    public String generateResponse(String usuarioInput)
    {
        String respuestasUsuario = respuestasInput.get(usuarioInput);
        if (respuestasUsuario == null){
            respuestasUsuario = respuestas.get(aleatorio.nextInt(respuestas.size()))  ;
        }
        
        return respuestasUsuario;
    }
}
