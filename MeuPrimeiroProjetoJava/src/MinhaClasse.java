public class MinhaClasse {
    
    public static void main (String [] args) {

        String primeiroNome = "Alejandro";
        String segudoNome = "Gomes";

        String nomeCompleto = nomeCompleto(primeiroNome, segudoNome);
        
        System.out.println(nomeCompleto);

    }

    public static String nomeCompleto (String primeiroNome, String segundoNome) {
        return primeiroNome.concat(" ").concat(segundoNome) ;
    }

}
