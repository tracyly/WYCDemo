建造者模式(生成器模式)
定义:|将一个复杂对象的构建与它的表示分离，使得同样的构建过程可以创建不同的表示。
优点:
1.封装性
使用建造者模式可以使客户端不必知道产品内部组成的细节，如例子中我们就不需要关
心每一个具体的模型内部是如何实现的，产生的对象类型就是CarModel。
2.建造者独立，容易扩展
BenzBuilder和BMWBuilder是相互独立的，对系统的扩展非常有利。
3.便于控制细节风险
由于具体的建造者是独立的，因此可以对建造过程逐步细化，而不对其他的模块产生任何影响。

使用场景:
1.相同的方法，不同的执行顺序，产生不同的事件结果时，可以采用建造者模式。
2.多个部件或零件，都可以装配到一个对象中，但是产生的运行结果又不相同时，则可以使用该模式。
3.产品类非常复杂，或者产品类中的调用顺序不同产生了不同的效能，这个时候使用建造者模式非常合适。
4.在对象创建过程中会使用到系统中的一些其他对象，这些对象在产品对象的创建过程中不易得到时，也可以采用建造者模式封装该对象的创建过程。
该种场景只能是一个补偿方法，因为一个对象不容易获得，而在设计阶段竟然没有发觉，而要通过创建者模式柔化创建过程，本身已经违反设计的最初目标。

注意:
建造者模式关注的零件的类型和装配的工艺(顺序)，这也是与工厂方法模式最大的不同地方。
建造者模式最主要的功能是基本方法的调用顺序安排，也就是这些基本方法已经实现了，通俗地说就是零件的装配，顺序不同产生
的对象也不同；而工厂方法则重点是创建，创建零件是它的主要职责，组装顺序则不是它关
心的。