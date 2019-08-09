# costrader

This repository contains the implementation of the semantic trading service of the STAS approach. The application of the STAS approach to other domains or architectures of smart environment is possible by performing the following guidelines. First, a new vocabulary of complex types for defining the inputs and outputs of the components operations must be developed. Second, the components of the target scenario must be modeled using the proposed languages. The two levels of representation (abstract and concrete) must be considered. Thus, each set of concrete components with functional interfaces in common would have a related abstract component specification. 

Component specifications must be inserted in the repositories by using the **register** microservice. Then, the **admin** microservice can be used to modify the configurable parameters. Before starting the resolution of the concrete architecture, the abstract architecture used as input must be inserted in the database by using the **configs** microservice. Then, the search algorithm can be executed to generate the resulting configuration and save the corresponding concrete architecture in the database. The configs microservice uses the **heuristics** and **lookup** microservice to operate.

All the microservices must be executed. To o start a microservice, you can use your IDE or execute the following command in each root folder:

  ```  $ mvn spring-boot:run  ```

Due to communications and dependencies between the microservices, the recommended order of execution is:

    (1) cos.trader.servicediscovery
    (2) cos.trader.admin
    (3) cos.trader.lookup
    (4) cos.trader.register
    (5) cos.trader.configs
    (6) cos.trader.heuristics
  

