package lsp;

import org.eclipse.lsp4j.services.LanguageServer;
import org.eclipse.lsp4j.services.TextDocumentService;
import org.eclipse.lsp4j.services.WorkspaceService;
import org.eclipse.lsp4j.InitializeParams;
import org.eclipse.lsp4j.InitializeResult;

import java.util.concurrent.CompletableFuture;

public class LSPServer implements LanguageServer {
  @Override public void exit() { return; }
  @Override public TextDocumentService getTextDocumentService() { return null; }
  @Override public WorkspaceService getWorkspaceService() { return null; }
  @Override public CompletableFuture<InitializeResult> initialize(InitializeParams params) { return null; }
  @Override public CompletableFuture<Object> shutdown() { return null; }
}
