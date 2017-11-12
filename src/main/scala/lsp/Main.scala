package lsp.scala

import org.eclipse.lsp4j.launch.LSPLauncher

object Main {
  def main(args: Array[String]): Unit = {
    LSPLauncher.createServerLauncher(LSPServer, System.in, System.out);
  }
}
