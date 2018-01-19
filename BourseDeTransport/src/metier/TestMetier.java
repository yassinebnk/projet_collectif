package metier;

import java.util.Iterator;

import com.sun.corba.se.spi.orb.Operation;

public class TestMetier {

	public static void main(String[] args) {
		OperateurColis ope = new OperateurColis();
        Colis c = new Colis();
        
        ope.add(new Colis(1L,(float)10.0,(float)4.0,"cuivre","0.4m","audincourt"));
        ope.add(new Colis(2L,(float)90.0,(float)2.0,"or","4m","Monbeliard"));
        ope.add(new Colis(3L,(float)80.0,(float)2.1,"3aj","4m","Monbeliard"));
       ope.remove(3L);
         Iterator<Colis> cls = ope.getAll().iterator();
         while(cls.hasNext()){
        	 Colis cl= cls.next();
        	 cl.afficher();
         }
	
	}
}

