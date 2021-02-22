# 设计模式

## 创建型模式

- [单例模式](./creationalDesignPatterns/singleton)

    当系统中只需要一个实例或者一个全局访问点的时候可以使用单例模式。
- [建造者模式](./creationalDesignPatterns/builder)

    封装一个复杂对象的构建过程，可以按照流程来构建对象。
- [原型模式](./creationalDesignPatterns/prototype)
    
    当某个对象的数据结构或者构建过程特别复杂，频繁的构建势必会消耗系统性能，这个时候我们采用原型模式对原有的对象进行克隆，构建新的对象。
- [工厂方法模式](./creationalDesignPatterns/factory_method)

    工厂模式定义了一个创建对象的接口，由子类进行对象的初始化，即工厂模式将子类的初始化推迟到了子类里。
- [抽象工厂模式](./creationalDesignPatterns/abstract_factory)
    
    抽象工厂模式和工厂模式很相似，只是它利用接口或者抽象类定义了一个产品族。
## 结构型模式

- [适配器模式](./structuralDesignPatterns/adapter)

    适配器模式可以将一个类的接口，转换成客户端期望的另一个接口，让两个原本不兼容的接口可以无缝对接。
- [桥接模式](./structuralDesignPatterns/bridge)

    将抽象部分和实现部分相互分离，使它们可以独立变化。
- [组合模式](./structuralDesignPatterns/composite)

    将对象组成树形结构以表示整体-部分的层次结构，使得用户对单个对象和组合对象的使用具有一致性。
- [装饰模式](./structuralDesignPatterns/decorator)

    动态的为对象增加一些额外的功能。
- [外观模式](./structuralDesignPatterns/facade)

    要求一个子系统的外部与其内部的通信都通过一个统一的而对象进行。
- 享元模式

    使用共享对象可以有效的支持大量的细粒度对象。
- [代理模式](./structuralDesignPatterns/proxy)

    为其他对象提供一个代理以提供对这个对象的访问。

## 行为模式

- [责任链模式](./behavioralDesignPatterns/chain_of_responsibility)
- [命令模式](./behavioralDesignPatterns/command)
- 迭代器模式
- 中介者模式
- 备忘录模式
- [观察者模式](./behavioralDesignPatterns/observer)
- [状态模式](./behavioralDesignPatterns/sate)
- 策略模式
- 模版方法模式
- 访问者模式
    