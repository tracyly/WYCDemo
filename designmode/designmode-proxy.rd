代理模式
定义：为其他对象提供一种代理以控制对这个对象的访问。
优点:
1.职责清晰
真实的角色就是实现实际的业务逻辑，不用关心其他非本职责的事务，通过后期的代理
完成一件事务，附带的结果就是编程简洁清晰。
2.高扩展性
具体主题角色是随时都会发生变化的，只要它实现了接口，甭管它如何变化，都逃不脱
如来佛的手掌（接口），那我们的代理类完全就可以在不做任何修改的情况下使用。
3.智能化


代理类可以为真实角色预处理消息、过滤消息、消息转发、事后处理消息等功能。当然一个代理类，可以代理多个真实角色，并且真实角色之间可
以有耦合关系，读者可以自行扩展一下。
