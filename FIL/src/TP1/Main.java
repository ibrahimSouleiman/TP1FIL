package TP1;

import java.io.BufferedReader;
import java.io.FileInputStream;
import java.io.InputStream;
import java.io.InputStreamReader;

public class Main {

	public static Noeud racine = null;

	public static void rajoute_fils_droit(Noeud Node, Noeud NodeDroit) {
		Node.setNodeDroit(NodeDroit);

	}

	public static void rajoute_fils_gauche(Noeud Node, Noeud NodeGauche) {
		Node.setNodeDroit(NodeGauche);

	}

	public static Noeud nouveau_noeud(char caractere, int code) {
		Noeud N = new Noeud(caractere, code);

		return N;
	}

	public static void createracine(Noeud Node) {
		racine = Node;

	}

	public static Noeud getracine() {
		return racine;

	}

	public static Noeud getNode(int i) {
		Noeud N = getracine();
		int indice = 0;
		Noeud Node=null;
		
		
		
		while(N !=null){
			if (indice == i) {
				Node = N;
			} else {
				indice++;
				try{
				N = N.getNodeDroit();
				}catch(Exception e)
				{
					System.out.println("Erreur="+e);
					N=null;
				}
				
System.out.println("INDICE="+indice+" N="+N.getCaractere());
			}
		}

		
		return Node;

	}

	public static void main(String[] args) {
		int code = 0;
		String mot;
		String line[];
		try {
			InputStream ips = new FileInputStream("lexique.txt");
			InputStreamReader ipsr = new InputStreamReader(ips);
			BufferedReader br = new BufferedReader(ipsr);
			String ligne;

			String tampon = br.readLine();

			while ((ligne = br.readLine()) != null) {

				line = ligne.split(" ");

				code = Integer.parseInt(line[0]);
				mot = line[1];
				

				if (getracine() == null) {
					for (int i = 0; i < mot.length(); i++) {

						if (i == 0) {
							createracine(nouveau_noeud(mot.charAt(i), 1));
							
						} else if(i<(mot.length()-1)){

							
							System.out.println("DANS ELSE IF i="+ i);
					     	getNode(i-1).setNodeDroit(nouveau_noeud(mot.charAt(i), 1));
							System.out.println(getNode(1).getCaractere()+" I="+i);

						}else{
						/*	Noeud N=getNode(i-1);
							System.out.println(N.getCaractere());
                            N.setNodeDroit(nouveau_noeud(' ', code));
						*/	
						}
					}
				}

				System.out.println(ligne);

			}
			br.close();

		}

		catch (Exception e) {
			System.out.println(e.toString());
		}

	}

}
