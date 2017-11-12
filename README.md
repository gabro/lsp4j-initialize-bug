# lsp4j Scala bug
This is a bug happening when implementing `LanguageServer` from Scala.

## Try this

Run the Java implementation using

```scala
sbt runMain lsp.Main
```
This should work fine.

Run the Scala implementation using

```scala
sbt runMain lsp.scala.Main
```

This should lead to this error:

```
java.lang.IllegalStateException: Duplicate RPC method initialized.
        at org.eclipse.lsp4j.jsonrpc.services.ServiceEndpoints.lambda$getSupportedMethods$0(ServiceEndpoints.java:76)
        at org.eclipse.lsp4j.jsonrpc.services.AnnotationUtil.findRpcMethods(AnnotationUtil.java:62)
        at org.eclipse.lsp4j.jsonrpc.services.ServiceEndpoints.getSupportedMethods(ServiceEndpoints.java:62)
        at org.eclipse.lsp4j.jsonrpc.services.ServiceEndpoints.getSupportedMethods(ServiceEndpoints.java:54)
        at org.eclipse.lsp4j.jsonrpc.Launcher.createIoLauncher(Launcher.java:139)
        at org.eclipse.lsp4j.jsonrpc.Launcher.createIoLauncher(Launcher.java:112)
        at org.eclipse.lsp4j.jsonrpc.Launcher.createLauncher(Launcher.java:77)
        at org.eclipse.lsp4j.jsonrpc.Launcher.createLauncher(Launcher.java:47)
        at org.eclipse.lsp4j.launch.LSPLauncher.createServerLauncher(LSPLauncher.java:24)
        at lsp.scala.Main$.main(Main.scala:7)
        at lsp.scala.Main.main(Main.scala)
        at sun.reflect.NativeMethodAccessorImpl.invoke0(Native Method)
        at sun.reflect.NativeMethodAccessorImpl.invoke(NativeMethodAccessorImpl.java:62)
        at sun.reflect.DelegatingMethodAccessorImpl.invoke(DelegatingMethodAccessorImpl.java:43)
        at java.lang.reflect.Method.invoke(Method.java:498)
```
