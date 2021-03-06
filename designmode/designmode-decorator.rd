装饰模式
定义:动态地给一个对象添加一些额外的职责。就增加功能来说，装饰模式相比生成子类更为灵活
优点:
1.装饰类和被装饰类可以独立发展，而不会相互耦合。换句话说，Component类无须知
道Decorator类，Decorator类是从外部来扩展Component类的功能，而Decorator也不用知道具
体的构件。
2.装饰模式是继承关系的一个替代方案。我们看装饰类Decorator，不管装饰多少层，返
回的对象还是Component，实现的还是is-a的关系
3.装饰模式可以动态地扩展一个实现类的功能，这不需要多说，装饰模式的定义就是如
  此。
缺点:
对于装饰模式记住一点就足够了：多层的装饰是比较复杂的。为什么会复杂呢？你想想
看，就像剥洋葱一样，你剥到了最后才发现是最里层的装饰出现了问题，想象一下工作量
吧，因此，尽量减少装饰类的数量，以便降低系统的复杂度。

使用场景:
需要扩展一个类的功能，或给一个类增加附加功能。
需要动态地给一个对象增加功能，这些功能可以再动态地撤销。
需要为一批的兄弟类进行改装或加装功能，当然是首选装饰模式。

