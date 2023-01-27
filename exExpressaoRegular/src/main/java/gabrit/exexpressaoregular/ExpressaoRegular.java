package gabrit.exexpressaoregular;

public class ExpressaoRegular {
    public String TipoDeFuncao = "(void)|(String)";
    public String Branco = "\n|\t|\b|\r";
    public String NomeDaFuncao = "";
    public String LinguagemAssinaturaDeFuncoes = TipoDeFuncao + Branco + "";
    
    public void confere(String exp,String setenca){
        if(setenca.matches(exp)){
            System.out.println("W:" + setenca + ", Aceita !");
        }else{
            System.out.println("W:" + setenca + ", Rejeitada !");
        }
    }
}
