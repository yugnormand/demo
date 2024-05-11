public class Main {


    /**
     * im Folgenden wollen wir ein Programm erstellen, das eine gleichung zweiter Grad mittels Methode von Diskriminant lösen kann
     * dafür brauchen wir Parameter, mit denen Variablen von folgendem Ausdruck (aX*X + bX + C) representiert werden.
     * @param a variable a
     * @param b variable b
     * @param c variable c
     */

    public static String Diskriminant ( double a , double b , double c){

        double X1; double X2; double X0;

        double delta = (a * a) - (4 * a * c );
        double deltaWurzel = Math.sqrt(delta);

        X1 = ( -b - deltaWurzel /2*a);
        X2 = (-b + deltaWurzel )/2*a;
        X0 = -b / 2*a;

        if ( deltaWurzel > 0) {
            return ("Die Menge der Lösung ist  M = { " + X1 + " ; " + X2 + " }");
        }
        else if  (deltaWurzel == 0){ return( "Die Menge der Lösung ist  M = { " +X0+ " }"); }
        else { return "es liegt keine Lösung für diese Gleichung vor"; }
    }

public static void main(String[] args){ 
    
    String result = Diskriminant(1,8,9);
    
    System.out.println(a); // Erwatete Ergebnis für diese Gleichung "es liegt keine Lösung für diese Gleichung vor"



}

}




