import java.util.Random;
import java.util.ArrayList;
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
    
    /**
     * Construct a Responder - nothing to do
     */
    public Responder()
    {
        aleatorio = new Random();
        respuestas = new ArrayList <String>();
        respuestas.add("That`s problem okey...");
        respuestas.add("I need more information describe me well the problem");
        respuestas.add("Maybie you must invoc cthulu");
        respuestas.add("hell no, i dont know the problem");
        respuestas.add("Pa que quieres saber eso saludos jajajajaj");
    }

    /**
     * Generate a response.
     * @return   A string that should be displayed as the response
     */
    public String generateResponse()
    {
        
        return respuestas.get(aleatorio.nextInt(respuestas.size()));
    }
}
