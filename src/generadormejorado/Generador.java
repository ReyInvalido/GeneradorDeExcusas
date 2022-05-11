
package generadormejorado;

import java.lang.Math;


public class Generador {
  //v.is
  String[] aperturas = {
    "Perdón, hoy no puedo, ",
    "Te pido mil disculpas, ",
    "No sabes lo que me pasó, ",
    "Adivina qué, ",
    "No puedo ir porque ",
    "Me vas a matar, pero ",
    "Venía pisteando como un campeón y de golpe ",
    "Me siento re culpable pero ",
    "Lamento mucho no poder asistir, ",
    "Vas a pensar que es una excusa pero ",
    "No me lo vas a creer, ",
    "Te pido mil disculpas, pero ",
    "No creo que llegue, ",
    "Esta vez no va a poder ser, ",
    "Esto es increíble, ",
    "Disculpame, no voy a poder ir, ",
    "Me encantaría ir pero ",
    "Uh, qué macana, justo hoy que ",
    "Disculpa, no puedo, ",
    "No creo que pueda, ",
    "Disculpame, pero ",
    "Che no va a poder ser lo de hoy, ",
    "Me tengo que bajar de lo de hoy, ",
    "Disculpa, hoy te fallo, ",
    "Che no te enojes, pero ",
  };
  //25 aperturas
  
  String[] chivos = {
    "mi sobrino ",
    "el fantasma de Hitler ",
    "el Papa Francisco ",
    "mi ex ",
    "el coro del Colegio ",
    "Chiche Gelblung ",
    "un payaso triste ",
    "un agente de la Matrix ",
    "el vagabundo de la esquina ",
    "un diputado muy conocido ",
    "un match de Tinder ",
    "el pianista ciego del bar ",
    "un hincha del Lobo ",
    "mi peluquero ",
    "el sodero ",
    "una turba de travestis ",
    "la mafia ",
    "los murgueros de acá a la vuelta ",
    "una profesora de zumba ",
    "el gran danés de mi tía ",
    "un conductor de la tele, que no puedo nombrar, ",
    "el staff del noticiero ",
    "la amante de mi mujer ",
    "un vendedor de facebook ",
    "el jardinero de Olivos ",
    "un votante de izquierda ",
    "el cocinero del Ugi's de aca cerca ",
    "un chofer del 74 ",
    "el limpiavidrios de la avenida ",
    "el portero ",
    "la madre adoptiva de mis gatos ",
    "una pariente que no veo hace mucho ",
    "un fanático de yugioh ",
    "el diariero "
  };
  //34 chivos
  
  String[] inconvenientes = {
    "hizo caca en la cama.",
    "se murió adelante mío.",
    "no para de contarme chistes, no me puedo ir.",
    "tiene un ataque de nervios.",
    "me contagió sífilis.",
    "me metió gaseosa en el tanque de nafta.",
    "me apuñaló.",
    "me encontró la placa de bruxismo.",
    "me robó la bicicleta.",
    "subió mis nudes a Instagram.",
    "me escondió la medicación.",
    "se quiere tirar del quinto piso.",
    "está acá y no para de llorar.",
    "me quiere llevar a tomar un helado.",
    "me arrugó todas las cortinas.",
    "necesita que le ayude a regar los peces.",
    "se tomó todo el vino, no me queda nada.",
    "me quiere llevar al lugar más recóndito de su casa.",
    "va a hacer una orgía.",
    "quiere que lo ayude con la ouija.",
    "rompió la mampara del baño.",
    "se electrocutó ya dos veces.",
    "se cortó con un papel, hay mucha sangre.",
    "me escondió las alpargatas.",
    "me está descongelando la heladera.",
    "encontró mi historial de búsqueda.",
    "quiere que hagamos sentadillas.",
    "se deschavó, es un quilombo acá.",
    "se golpeó el meñique muy fulero.",
    "trabó las puertas y se quiere matar.",
    "nos tiene secuestrados.",
    "quiere que le cocine chipa.",
    "cayó sin avisar."
  };
  //32 inconv.
  
  
  public String getExcusa(){
    //Random r = new Random();
    //String exc = (aperturas[r.nextInt(25)] + chivos[r.nextInt(34)] + inconvenientes[r.nextInt(32)]);    
    String exc = (aperturas[(int)(Math.random()*(25))] + chivos[(int)(Math.random()*34)] + inconvenientes[(int)(Math.random()*32)]);    
    return exc;
  }
  
}
