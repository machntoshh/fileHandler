import java.awt.Desktop; // acessa arquivos do desktop
import java.io.File; // libera para acessar os files do meu PC
import java.io.IOException; // vai me avisar se tiver problema no input ou output
import java.util.Scanner; // Scanner básico para input do usuário via CLI


public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in); // inputs <- in (receber)

        System.out.println("Digite o path >> ");
        String pathingArchive = scanner.nextLine(); // ta pegando o input dps do SOUT

        File archive = new File(pathingArchive); // cria um objeto File que representa um arquivo ou diretório no sistema de arquivos, usando o caminho (pathing)

        if (archive.exists()) { // se o arquivo existir
            try { // entrou em um try catch
                Desktop.getDesktop().open(archive); // ir em desktop e abrir arquivo (File)
            } catch (IOException error) {
                System.err.println("Não existe ou inalcançável: " + error.getMessage()); // n achou ou n tem, joga a msg com o erro apontando
            }
        } else { // se só n existir, enviar esse else
            System.err.println("Arquivo não encontrado...");
        }

        scanner.close();
    }
}