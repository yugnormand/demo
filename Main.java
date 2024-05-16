public class Main {


     /**
         * im Folgenden wollen wir ein Programm erstellen, das eine gleichung zweiter Grad mittels Methode von Diskriminant lösen kann
         * dafür brauchen wir Parameter, mit denen Variablen von folgendem Ausdruck (aX*X + bX + C) representiert werden.
         * @param a variable a
         * @param b variable b
         * @param c variable c
         */

         public static void Diskriminant ( double a , double b , double c){

            double X1; double X2; double X0;

            double delta = (a * a) - (4 * a * c );
            double deltaWurzel = Math.sqrt(delta);

            X1 = ( -b - deltaWurzel /2*a);
            X2 = (-b + deltaWurzel )/2*a;
            X0 = -b / 2*a;

            if( delta <0) { System.out.println( "es liegt keine Lösung für diese Gleichung vor");};

            if ( deltaWurzel > 0) {
                System.out.println ("Die Menge der Lösung ist  M = { " + X1 + " ; " + X2 + " }");
            }
            if  (delta == 0){ System.out.println( "Die Menge der Lösung ist  M = { " +X0+ " }"); }


        }

    public static void main(String[] args){

            Diskriminant(1,8,9);
        }



}
