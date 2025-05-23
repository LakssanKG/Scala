file:///C:/Users/K.G.LAKSSAN/OneDrive/Documents/Scala/panagram.scala
### java.lang.AssertionError: assertion failed: position not set for fromNullable(<empty>) # -1 of class dotty.tools.dotc.ast.Trees$Apply in C:/Users/K.G.LAKSSAN/OneDrive/Documents/Scala/panagram.scala

occurred in the presentation compiler.

presentation compiler configuration:


action parameters:
offset: 263
uri: file:///C:/Users/K.G.LAKSSAN/OneDrive/Documents/Scala/panagram.scala
text:
```scala
object Main{
    def main(args:Array[String])={
        // val sentence="The quick brown fox jumps over a lazy dog"
        // print(sentence.toLowerCase.filter(_.isLetter).distinct.length)
        val arr=Array(1,2,3,4,5)
        val result=arr.takeWhile(_.@@!=)
        print(arr.takeWhile(_==3).mkString(", "))
    }
}
```



#### Error stacktrace:

```
scala.runtime.Scala3RunTime$.assertFailed(Scala3RunTime.scala:8)
	dotty.tools.dotc.typer.Typer$.assertPositioned(Typer.scala:76)
	dotty.tools.dotc.typer.Typer.typed(Typer.scala:3680)
	dotty.tools.dotc.typer.Applications.extMethodApply(Applications.scala:2685)
	dotty.tools.dotc.typer.Applications.extMethodApply$(Applications.scala:465)
	dotty.tools.dotc.typer.Typer.extMethodApply(Typer.scala:151)
	dotty.tools.dotc.typer.Applications.tryApplyingExtensionMethod(Applications.scala:2730)
	dotty.tools.dotc.typer.Applications.tryApplyingExtensionMethod$(Applications.scala:465)
	dotty.tools.dotc.typer.Typer.tryApplyingExtensionMethod(Typer.scala:151)
	dotty.tools.dotc.interactive.Completion$Completer.tryApplyingReceiverToExtension$1(Completion.scala:561)
	dotty.tools.dotc.interactive.Completion$Completer.$anonfun$23(Completion.scala:604)
	scala.collection.immutable.List.flatMap(List.scala:294)
	scala.collection.immutable.List.flatMap(List.scala:79)
	dotty.tools.dotc.interactive.Completion$Completer.extensionCompletions(Completion.scala:601)
	dotty.tools.dotc.interactive.Completion$Completer.selectionCompletions(Completion.scala:449)
	dotty.tools.dotc.interactive.Completion$.computeCompletions(Completion.scala:221)
	dotty.tools.dotc.interactive.Completion$.rawCompletions(Completion.scala:80)
	dotty.tools.pc.completions.Completions.enrichedCompilerCompletions(Completions.scala:114)
	dotty.tools.pc.completions.Completions.completions(Completions.scala:136)
	dotty.tools.pc.completions.CompletionProvider.completions(CompletionProvider.scala:139)
	dotty.tools.pc.ScalaPresentationCompiler.complete$$anonfun$1(ScalaPresentationCompiler.scala:150)
```
#### Short summary: 

java.lang.AssertionError: assertion failed: position not set for fromNullable(<empty>) # -1 of class dotty.tools.dotc.ast.Trees$Apply in C:/Users/K.G.LAKSSAN/OneDrive/Documents/Scala/panagram.scala