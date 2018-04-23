# Advance Mapping

JPA is a library which is released with java specification. Therefore, it supports all object oriented concepts for entity persistence. Till now we are done with the basics of object relational mapping. This chapter takes you through the advanced mappings between objects and relational entities.

These packages in this folder will give you example of table-creation using the following Inheritance-Strategies

## Inheritance Strategies
Inheritance is the core concept of object oriented language, therefore we can use inheritance relationships or strategies between entities. JPA support three types of inheritance strategies such as :
* SINGLE_TABLE, 
* JOINED_TABLE, and 
* TABLE_PER_CONCRETE_CLASS.

Let us consider an example of Staff, TeachingStaff, NonTeachingStaff classes and their relationships as follows:

![alt text](https://www.tutorialspoint.com/jpa/images/inheritance_strategy.png)

In the above shown diagram Staff is an entity and TeachingStaff and NonTeachingStaff are the sub entities of Staff. Here we will discuss the above example in all three strategies of inheritance.
