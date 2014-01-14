package fr.gphy.m2.keuv.tpforma;


public class PDBUrlBuilder 
{
	public static URL getFirstPdbUrl(String uniprotId) throws IOException 
	{
		System.setProperty("http.proxyHost","cache.univpoitiers.fr");
		System.setProperty("http.proxyPort", "3128");
		URL url = new URL("http://www.uniprot.org/uniprot/" + uniprotId +".txt");
		BufferedReader in = new BufferedReader(new InputStreamReader(url.openStream()));
		// TODO: lire le fichier
		return null;
	}
}