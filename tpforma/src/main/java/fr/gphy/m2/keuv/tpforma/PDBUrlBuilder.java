package fr.gphy.m2.keuv.tpforma;


public class PDBUrlBuilder 
{
	public static URL getFirstPdbUrl(String uniprotId) throws IOException 
	{
		// TODO: gérer le proxy
		URL url = new URL("http://www.uniprot.org/uniprot/" + uniprotId +".txt");
		BufferedReader in = new BufferedReader(new InputStreamReader(url.openStream()));
		String line;
		while ((line = in.readLine()) !=null) {
			if(line.matches("^DR\\s+PDB;.+$")) {
				in.close();
				return new
				URL("http://www.ebi.ac.uk/pdbe/entryfiles/pdb" + line.substring(10,14).toLowerCase() + ".ent");
			}
		} 
		in.close();
		return null;
	}
}
