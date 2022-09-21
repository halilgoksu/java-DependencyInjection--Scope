# java-DependencyInjection--Scope

//SINGLETON
//@Scope(ConfigurableBeanFactory.SCOPE_SINGLETON) //default

//PROTOTYPE
//@Scope(ConfigurableBeanFactory.SCOPE_PROTOTYPE)

//@RequestScope
//http://localhost:8080/api/first-controller
//http://localhost:8080/api/second-controller

@SessionScope
