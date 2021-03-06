# 装饰模式
> 亦称： 装饰者模式、装饰器模式、Wrapper、Decorator

### 目的

装饰模式是一种结构型设计模式，允许你通过将对象放入包含行为的特殊封装对象中来为原对象绑定新对象的行为。

### 适合应用的场景

- 如果你希望在无需修改代码的情况下即可使用对象， 且希望在运行时为对象新增额外的行为， 可以使用装饰模式。

- 装饰能将业务逻辑组织为层次结构， 你可为各层创建一个装饰， 在运行时将各种不同逻辑组合成对象。 由于这些对象都遵循通用接口， 客户端代码能以相同的方式使用这些对象。

- 如果用继承来扩展对象行为的方案难以实现或者根本不可行， 你可以使用该模式。

- 许多编程语言使用 final最终关键字来限制对某个类的进一步扩展。 复用最终类已有行为的唯一方法是使用装饰模式： 用封装器对其进行封装。

### 实现方法

- 确保业务逻辑可用一个基本组件及多个额外可选层次表示。
  
- 找出基本组件和可选层次的通用方法。 创建一个组件接口并在其中声明这些方法。

- 创建一个具体组件类， 并定义其基础行为。

- 创建装饰基类， 使用一个成员变量存储指向被封装对象的引用。 该成员变量必须被声明为组件接口类型， 从而能在运行时连接具体组件和装饰。 装饰基类必须将所有工作委派给被封装的对象。

- 确保所有类实现组件接口。

- 将装饰基类扩展为具体装饰。 具体装饰必须在调用父类方法 （总是委派给被封装对象） 之前或之后执行自身的行为。

- 客户端代码负责创建装饰并将其组合成客户端所需的形式。