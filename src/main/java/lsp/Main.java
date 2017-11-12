package lsp;

import org.eclipse.lsp4j.launch.LSPLauncher;

public class Main {
  public static void main(String[] args) {
    LSPServer server = new LSPServer();
    LSPLauncher.createServerLauncher(server, System.in, System.out);
  }
}
