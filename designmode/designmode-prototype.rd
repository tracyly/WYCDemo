定义：
  用原型实例指定创建对象的种类，并且通过拷贝这些原型创建新的对象。

优点：
1.性能优良
原型模式是在内存二进制流的拷贝，要比直接new一个对象性能好很多，特别是要在一
个循环体内产生大量的对象时，原型模式可以更好地体现其优点。
2.逃避构造函数的约束
这既是它的优点也是缺点，直接在内存中拷贝，构造函数是不会执行的（参见13.4
节）。优点就是减少了约束，缺点也是减少了约束，需要大家在实际应用时考虑

应用场景:
1.资源优化场景
类初始化需要消化非常多的资源，这个资源包括数据、硬件资源等。
2.性能和安全要求的场景
通过new产生一个对象需要非常繁琐的数据准备或访问权限，则可以使用原型模式。
3.一个对象多个修改者的场景
一个对象需要提供给其他对象访问，而且各个调用者可能都需要修改其值时，可以考虑
使用原型模式拷贝多个对象供调用者使用。

