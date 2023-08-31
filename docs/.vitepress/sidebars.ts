function sidebars() {
    return [{
        text: '创建型模式',
        collapsed: false,
        base: 'creational',
        link: '/index',
        items: [
            {text: '单例模式', link: '/singleton'},
            {text: '原型模式', link: '/prototype'},
            {text: '抽象工厂模式', link: '/abstract-factory'},
            {text: '工厂方法模式', link: '/factory-method'},
            {text: '构造器模式', link: '/builder'},
        ]
    }, {
        text: '行为型模式',
        collapsed: false,
        base: 'behavioural',
        link: '/index',
        items: [
            {text: '责任链模式', link: '/chain-of-responsibility'},
            {text: '命令模式', link: '/command'},
            {text: '解释器模式', link: '/interpreter'},
            {text: '迭代器模式', link: '/iterator'},
            {text: '中介者模式', link: '/mediator'},
            {text: '备忘录模式', link: '/memento'},
            {text: '观察者模式', link: '/observer'},
            {text: '状态模式', link: '/state'},
            {text: '策略模式', link: '/strategy'},
            {text: '模版方法模式', link: '/template-method'},
            {text: '访问者模式', link: '/visitor'},
        ]
    }, {
        text: '结构型模式',
        collapsed: false,
        base: 'structural',
        link: '/index',
        items: [
            {text: '组合模式', link: '/composite'},
            {text: '外观模式', link: '/facade'},
            {text: '适配器模式', link: '/adapter'},
            {text: '桥接模式', link: '/bridge'},
            {text: '装饰器模式', link: '/decorator'},
            {text: '享元模式', link: '/flyweight'},
            {text: '代理模式', link: '/proxy'},
        ]
    }];
}

function navs(){
    return {
        "/creational": {
            
        }
    };
}