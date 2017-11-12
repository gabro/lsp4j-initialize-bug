package lsp.scala

import org.eclipse.lsp4j.services.LanguageServer
import org.eclipse.lsp4j.services.TextDocumentService
import org.eclipse.lsp4j.services.WorkspaceService
import org.eclipse.lsp4j.InitializeParams
import org.eclipse.lsp4j.InitializeResult

import java.util.concurrent.CompletableFuture

object LSPServer extends  LanguageServer {
  // decomment this line to fix the runtime error
  // override def initialized(params: org.eclipse.lsp4j.InitializedParams) = {}

  override def exit() = {}
  override def getTextDocumentService() = ???
  override def getWorkspaceService() = ???
  override def initialize(params: InitializeParams) = ???
  override def shutdown() = ???
}
