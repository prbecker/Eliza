/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package eliza;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.StringTokenizer;



/**
 *
 * @author Becker
 */
public class Eliza 
{ 
    
    static List<keys> chaves = new ArrayList<keys>();
    static List<pre> trocaspre = new ArrayList<pre>();
    static List<post> trocaspost = new ArrayList<post>();
    static List<String> quit = new ArrayList<String>();
    static List<synon> trocassynons = new ArrayList<synon>();
    static String greet;
    static String farewell;
    static String leitura;
    static String leiturapre;
    static String RespFinal;
    /**
     *
     * @param args
     * @throws java.io.FileNotFoundException
     */
    public static void main(String[] args) throws FileNotFoundException
//</editor-fold>
    {
        try 
        { 
            File arquivo = new File("eliza.txt"); 
            FileReader fr = new FileReader(arquivo);  
            BufferedReader br = new BufferedReader(fr);
            String linha = br.readLine(); //lê a primeira linha 
            while (linha != null) 
            {    
                if (linha.contains("key"))
                {
                    keys chavetemp = new keys();
                    String linhatemp = new String();
                    StringTokenizer st = new StringTokenizer(linha);
                    List<String> respostatemp = new ArrayList<String>();
                    linhatemp = st.nextToken();
                    chavetemp.setKey(st.nextToken());
                    chavetemp.setPeso(Integer.parseInt(st.nextToken()));
                    linha = br.readLine();  //lê a linha do decomp -- faremos depois
                    linha = br.readLine();  //lê a linha do reasmb
                    while (linha.contains("reasmb"))
                    {
                        StringTokenizer st2 = new StringTokenizer(linha);
                        String stringtemp = new String();
                        linhatemp = st2.nextToken();
                        while (st2.hasMoreTokens())
                        {
                            linhatemp = st2.nextToken();
                            stringtemp = stringtemp + linhatemp + " ";
                        }
                        chavetemp.setNumeroResp(chavetemp.getNumeroResp() + 1);
                        respostatemp.add(stringtemp);
                        chavetemp.setResposta(respostatemp);
                        linha = br.readLine();  //lê a proxima linha 
                        if (linha == null)
                        {
                            linha = "cabou";
                        }
                    }
                    chaves.add(chavetemp);
                }
                else
                {
                    if (linha.contains("initial"))
                        greet = linha.substring(linha.indexOf(' ') + 1);
                    if (linha.contains("final"))
                        farewell = linha.substring(linha.indexOf(' ') + 1);
                    if (linha.contains("quit"))
                        quit.add(linha.substring(linha.indexOf(' ') + 1));
                    if (linha.contains("pre"))
                    {
                        String[] sep = linha.split(" ");
                        pre trocatemp = new pre(sep[1], sep[2]);
                        trocaspre.add(trocatemp);
                    }
                    if (linha.contains("post"))
                    {
                        String[] sep = linha.split(" ");
                        post trocatemp = new post(sep[1], sep[2]);
                        trocaspost.add(trocatemp);
                    }
                    if (linha.contains("synon"))
                    {
                        StringTokenizer st3 = new StringTokenizer(linha);
                        String stringtemp;
                        List<String> synonstemp = new ArrayList<String>();
                        synon trocatemp = new synon();
                        stringtemp = st3.nextToken();
                        stringtemp = st3.nextToken();
                        trocatemp.setChave(stringtemp);
                        while(st3.hasMoreTokens())
                        {
                            stringtemp = st3.nextToken();
                            synonstemp.add(stringtemp);
                        }
                        trocatemp.setSynons(synonstemp);
                        trocassynons.add(trocatemp);
                    }
                    linha = br.readLine();  //lê a proxima linha                     
                }
            }
        }
        catch (IOException ex)
        {  
        }        
        new face().setVisible(true);
    }    
}
