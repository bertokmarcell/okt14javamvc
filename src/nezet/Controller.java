
package nezet;

import java.util.List;
import modell.Film;
import modell.Filmek;
import nezet.KonzolNezet;
public class Controller {
    private Film film;
    private View view;
    public Controller(Film film, View view) {
        this.film = film;
        this.view = view;
    }
    public void kiirall(){
        List<Film> filmek = modell.Filmek.getFilmek();
        String uzenez=filmek.toString();
        KonzolNezet.megjelenit(uzenez);
        
    }
    public void legtobbpont(){
        List<Film> filmek = modell.Filmek.getFilmek();
        double best=0;
        for(Film film:filmek){
            if(film.getPont()>best){
                best=film.getPont();
            }
        }
    }
    
}
