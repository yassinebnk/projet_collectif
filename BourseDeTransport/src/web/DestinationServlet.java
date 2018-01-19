package web;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import metier.Colis;
import metier.OperateurColis;
import metier.OperateurDestination;

public class DestinationServlet extends HttpServlet{
	   
	   private OperateurDestination op;
	public void init() throws ServletException {
		   op = new OperateurDestination();
	}
		
		@Override
		protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		// recuper les information 
			if(req.getParameter("action")!= null){
				op.remove(Long.parseLong(req.getParameter("id")));
		
			}else{
			String id= req.getParameter("id");
			String poid = req.getParameter("poid");
			String quantite= req.getParameter("quantite");
			String type = req.getParameter("type");
			String volume= req.getParameter("volume");
			String addresse = req.getParameter("addresse");
			
			// creation des Objet
			op.add(new Colis(1L,Float.parseFloat(poid),Float.parseFloat(quantite),type,volume,addresse));
			ColisBeans cb= new ColisBeans();
			//traitement
		
		// afficher les informations 
			/*System.out.println  ("nawfal");
			PrintWriter pr= resp.getWriter();
			pr.println(id + "." + poid+ "." +quantite + "." +type + "." +volume+ "." +addresse + "." +addresseD);
	*/
		}
			ColisBeans cb= new ColisBeans();
			cb.setListe(op.getAll());
			req.setAttribute("modele",cb);
			req.getRequestDispatcher("Destinataire.html").forward(req,resp);
			
		}
}
