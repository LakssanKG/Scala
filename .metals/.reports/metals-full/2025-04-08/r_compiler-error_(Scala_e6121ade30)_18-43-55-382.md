file:///C:/Users/K.G.LAKSSAN/OneDrive/Documents/Scala/armstrong.scala
### java.lang.AssertionError: assertion failed: position not set for fromNullable(<empty>) # -1 of class dotty.tools.dotc.ast.Trees$Apply in C:/Users/K.G.LAKSSAN/OneDrive/Documents/Scala/armstrong.scala

occurred in the presentation compiler.

presentation compiler configuration:


action parameters:
offset: 103
uri: file:///C:/Users/K.G.LAKSSAN/OneDrive/Documents/Scala/armstrong.scala
text:
```scala
object arm{
    def main(args:Array[String])={
        var n=153
        var str=n.toString().map(_.@@)
        var len=n.toString().length
        val result=str.map(math.pow(_,len)).sum
        print(result)
        
    }
}



















// object arm{
//     def main(args:Array[String])={
//         val n=153
//         val numbers=n.toString.map(_.asDigit)
//         val len=numbers.length
//         val ans=numbers.map(math.pow(_,len)).sum
//         print(ans)
//     }
// }
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

java.lang.AssertionError: assertion failed: position not set for fromNullable(<empty>) # -1 of class dotty.tools.dotc.ast.Trees$Apply in C:/Users/K.G.LAKSSAN/OneDrive/Documents/Scala/armstrong.scala