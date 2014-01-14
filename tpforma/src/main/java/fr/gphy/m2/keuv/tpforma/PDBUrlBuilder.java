package fr.gphy.m2.keuv.tpforma;


public class PDBUrlBuilder 
{
	public static URL getFirstPdbUrl(String uniprotId) throws IOException 
	{
		// TODO: gérer le proxy
		URL url = new URL("http://www.uniprot.org/uniprot/" + uniprotId +".txt");
		BufferedReader in = new BufferedReader(new InputStreamReader(url.openStream()));
		//TODO
		return null;
	}
}