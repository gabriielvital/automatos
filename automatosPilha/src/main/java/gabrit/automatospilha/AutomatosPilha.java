/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Project/Maven2/JavaApp/src/main/java/${packagePath}/${mainClassName}.java to edit this template
 */

package gabrit.automatospilha;

/**
 *
 * @author gabriel
 */
public class AutomatosPilha {

    public static void main(String[] args) {
        Automato linguagemAABB = new Automato();        

        if (linguagemAABB.verificaSentenca("abbaaaaaaaaaa")) {
            System.out.println("Aceita");
        }else{
            System.out.println("Rejeita");
        }
    }
}
