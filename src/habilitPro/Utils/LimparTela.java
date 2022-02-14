package habilitPro.Utils;

public class LimparTela {

    // método que limpa a tela. Funciona rodando fora da IDE. Testado no Windows 10
    public void limparTela(){

        for(int i = 0; i < 10; i++){
                System.out.println("");
        }
        System.out.println("-------------------------------------------------------");

    }
//        char esc = 27;
//        String clear = esc + "[2J"; //codigo ansi para limpar a tela
//        System.out.print(clear);
//    }

//    try{
//      String operatingSystem = System.getProperty("os.name"); //Check the current operating system
//
//      if(operatingSystem.contains("Windows")){
//        ProcessBuilder pb = new ProcessBuilder("cmd", "/c", "cls");
//        Process startProcess = pb.inheritIO().start();
//        startProcess.waitFor();
//      } else {
//        ProcessBuilder pb = new ProcessBuilder("clear");
//        Process startProcess = pb.inheritIO().start();
//
//        startProcess.waitFor();
//      }
//    }catch(Exception e){
//      System.out.println(e);
//    }


}
