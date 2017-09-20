package TP1;


/*
 * Classe Noeud est la classe permet de gere
 * tout les attribue destiner a creation et 
 * reutilisation des Noeud
 * 
 * 
 */
public class Noeud {

	
public char caractere;
public int code;
public Noeud NodeDroit;
public Noeud NodeGauches;

public Noeud(char caractere,int code)
{
this.caractere=caractere;
this.code=code;
}

public char getCaractere() {
	return caractere;
}

public void setCaractere(char caractere) {
	this.caractere = caractere;
}

public int getCode() {
	return code;
}

public void setCode(int code) {
	this.code = code;
}

public Noeud getNodeDroit() {
	return NodeDroit;
}

public void setNodeDroit(Noeud nodeDroit) {
	NodeDroit = nodeDroit;
}

public Noeud getNodeGauches() {
	return NodeGauches;
}

public void setNodeGauches(Noeud nodeGauches) {
	NodeGauches = nodeGauches;
}	


	
	
	
	
}
