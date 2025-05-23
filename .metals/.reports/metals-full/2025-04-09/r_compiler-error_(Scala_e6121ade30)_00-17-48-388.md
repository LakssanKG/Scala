file:///C:/Users/K.G.LAKSSAN/OneDrive/Documents/Scala/class1.scala
### java.lang.AssertionError: assertion failed: position not set for fromNullable(<empty>) # -1 of class dotty.tools.dotc.ast.Trees$Apply in C:/Users/K.G.LAKSSAN/OneDrive/Documents/Scala/class1.scala

occurred in the presentation compiler.

presentation compiler configuration:


action parameters:
offset: 150
uri: file:///C:/Users/K.G.LAKSSAN/OneDrive/Documents/Scala/class1.scala
text:
```scala
class Person(val name:String,val age:Int){}

object Person{
    def apply(data:String):Person={
        val Array(name,age)=data.split(",").map(_.@@trim)
        new Person(name,age.toInt)
    }
}

object pr{
    def main(args:Array[String])={
        val person1 = new Person("Alice", 25)
        val person2 = new Person("Bob", 30)

        // Creating objects using `apply()` method from the companion object
        val person3 = Person("Charlie,40")
        val person4 = Person("David, 22") // Handles extra spaces

        // Printing results
        println(person1.name)
        println(person2.name)
        println(person3.name)
        println(person4.name)
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

java.lang.AssertionError: assertion failed: position not set for fromNullable(<empty>) # -1 of class dotty.tools.dotc.ast.Trees$Apply in C:/Users/K.G.LAKSSAN/OneDrive/Documents/Scala/class1.scala