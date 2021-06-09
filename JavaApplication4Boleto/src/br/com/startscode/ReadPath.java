
package br.com.startscode;

import java.io.BufferedReader;
import java.io.InputStream;
import java.io.InputStreamReader;

public class ReadPath {
    
    /**
     * Em um projeto comum a leira se e contra na raiz dentro do projeto compilado
     * ./classes/config.json
     * @param path "config.json"
     * @return 
     */
    public String InputStreamToStringPath(String path){
        
        ClassLoader classLoader = Thread.currentThread().getContextClassLoader();
        InputStream configFile = classLoader.getResourceAsStream(path);
        
        BufferedReader bf;
        String dados = "";
        try {    
            bf = new BufferedReader(new InputStreamReader(configFile,"UTF-8"));
            while(bf.ready()){
                // Nao adicionar \n em linha
                dados += bf.readLine().trim();
            }
            bf.close();
        } catch(Exception e){
            System.out.println("Error in ReadPath.InputStreamToStringPath: "+e);
        }
        return dados;
    }
    
    public String InputStreamToStringPath(InputStream path){
               
        BufferedReader bf;
        String dados = "";
        try {    
            bf = new BufferedReader(new InputStreamReader(path,"UTF-8"));
            while(bf.ready()){
                // Nao adicionar \n em linha
                dados += bf.readLine().trim();
            }
            bf.close();
        } catch(Exception e){
            System.out.println("Error in ReadPath.InputStreamToStringPath: "+e);
        }
        return dados;
    }
    
    
}
