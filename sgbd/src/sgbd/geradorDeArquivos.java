package sgbd;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;

public class geradorDeArquivos {
	
	private static String arqDados = "dados.txt";
	private static String arqIndice = "indice.txt";
	private static File dados;
	private static File indice;
	
	public void gerarDados(){
		dados = new File(arqDados);
		indice = new File(arqIndice);
		
		checarArquivo(dados);
		checarArquivo(indice);
		
		try {
			FileWriter fw;
			fw = new FileWriter(dados, false);
			PrintWriter w = new PrintWriter(fw);
			w.println("001;Ruca Malen;Pinot Noir;2008;França\n");
			w.println("002;Ruca Malen;Riesling;2008;França\n");
			w.println("003;Tempus Alba;Chardonay;2009;Italia\n");
			w.println("004;Ruca Malen;Riesling;2009;França\n");
			w.println("005;Luigi Bosca;Chardonay;2009;Chile\n");
			w.println("006;Catena Zapata;Shiraz;2010;França\n");
			w.println("007;Viña Cobos;Sauvignon;2010;Alemanha\n");
			w.println("008;Don Laurindo;Merlot;2011;Brasil\n");
			w.println("009;Tempus Alba;Chardonay;2011;França\n");
			w.println("010;Luigi Bosca;Riesling;2012;Brasil\n");
			w.println("011;Terrazas de los Andes;Malbec;2012;França\n");
			w.println("012;Viña Cobos;Sauvignon;2012;Alemanha");
			w.println("013;Don Laurindo;Merlot;2013;Brasil");
			w.println("014;Tempus Alba;Chardonay;2013;França");
			w.println("015;Luigi Bosca;Riesling;2014;Brasil");
			w.println("016;Terrazas de los Andes;Malbec;2014;França");
			w.println("017;Ruca Malen;Cabernet;2015;Italia");
			w.close();
		} catch (IOException e) {
			e.printStackTrace();
		}
		
		
	}
	
	public void checarArquivo(File arquivo){
		if(!arquivo.exists()){
			try{
				new File(arquivo.toString()).createNewFile();
			}catch(IOException e){
				e.getMessage();
			}
		}
	}
}
