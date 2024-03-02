# FATEC-bertoti

Within Google, we sometimes say, “Software engineering is programming integrated over time.” Programming is certainly a significant part of software engineering: after all, programming is how you generate new software in the first place. If you accept this distinction, it also becomes clear that we might need to delineate between programming tasks (development) and software engineering tasks (development, modification, maintenance). The addition of time adds an important new dimension to programming. Cubes aren’t squares, distance isn’t velocity. Software engineering isn’t programming.


We see three critical differences between programming and software engineering: time, scale, and the trade-offs at play. On a software engineering project, engineers need to be more concerned with the passage of time and the eventual need for change. In a software engineering organization, we need to be more concerned about scale and efficiency, both for the software we produce as well as for the organization that is producing it. Finally, as software engineers, we are asked to make more complex decisions with higher-stakes outcomes, often based on imprecise estimates of time and growth.


So, what is software engineering?

Based on these distinctions, we can define software engineering as:

A broader discipline than programming, encompassing the entire lifecycle of software, from initial development to long-term maintenance.
An application of engineering principles to software creation, considering factors like efficiency, scalability, maintainability, and adaptability over time.
A practice involving complex decision-making with significant trade-offs and long-term consequences.
In essence, software engineering goes beyond writing code to encompass the entire process of building and sustaining high-quality, efficient, and evolving software systems that meet stakeholder needs over time.

Every software undergoes deprecations over time, and engineering serves to reduce the friction of time in the usefulness of the software. Scale is extremely important in software engineering, as a product can become entirely unviable if it grows under limiting pillars. Tradeoffs will always exist, and it is in software engineering that the analysis is made of which ones are bearable for the product that the software intends to deliver and the problems they aim to solve

## Atividade número dois: mencione três threadoff.

* Banco de dados mal pensado para uma arquitetura que vai requer escalabilidade. Ou seja, ganha-se tempo com o lançamento do MVP, mas pode travar o desenvolvimento futuro. 
* Linguaguem de programação com curva de aprendizado complexa, porém, rápida, mas que não se encontra mão de obra no mercado.
* Uso de serviços externos como AWS para escalabilidade, porém, custo em dolar AWS para cada operação. 

## Atividade número três: Comente os threadoff das arquiteturas apresentados

**Layered Architecture Style**

Ela é péssima de deploy. 
Sobre receber novas funcionalidades é interessante. 
Em relação de tolerancia a falha, ele é muito fraco, algo estoura, tudo alastra. 
Modulariedade, ele é péssim, denuncia um extremo acoplamento. 
O custo dele é bem barato.
Sua performace é ruim.
Para retornar sozinha, é melhor, consegue. 
Escalabilidade é péssima, então não aguenta carga.
É simples demais, e possivelmente ser testado de forma geral.

Aplicações GIS que lidam com a visualização de mapas, análise de dados geoespaciais e consultas frequentemente empregam uma arquitetura em camadas para organizar essas funcionalidades distintas.

**Pipeline Architecture Style**

Ela é ruim de deploy. 
Sobre receber novas funcionalidades é bom. 
Em relação de tolerancia a falha, ele é mediocre, algo estoura, tudo alastra. 
Modulariedade, ele é interessante, apesar de ter fraca tolerancia a falha. 
O custo dele é bem barato.
Sua performace é ruim.
Para retornar sozinha, é melhor, consegue. 
Escalabilidade é péssima, então não aguenta carga.
É simples demais, e possivelmente ser testado de forma geral.
E é possível ser bem testado. 

Em sistemas de processamento de imagens e vídeos, a arquitetura de Pipeline é aplicada para realizar tarefas como compressão, filtragem e análise, dividindo o processo em estágios consecutivos.

**Microkernel Architecture Style**

Ela é muito bom de deploy. 
Sobre receber novas funcionalidades é bom. 
Em relação de tolerancia a falha, ele é ótimo. 
Modulariedade é excelente
O custo dele é bem barato.
Sua performace é bem bom.
Para retornar sozinha, é melhor, se ergue bem. 
Escalabilidade é boa, aguenta carga.
Um pouco menos simples, mas ainda dá para aprender bastante.
E muito bem estável. 

Sistemas embarcados, a abordagem microkernel é vantajosa ao isolar funcionalidades críticas, garantindo maior segurança, confiabilidade e a capacidade de atualizar componentes específicos sem comprometer a estabilidade do sistema como um todo.

**Event-Driven Architecture Style**

Ela é bom de deploy. 
Sobre receber novas funcionalidades de forme excelente. 
Em relação de tolerancia a falha, é excelente. 
Modulariedade é muito bom.
Ele é muito caro.
Sua performace não é boa.
Para retornar sozinha, é melhor, se ergue bem. 
Escalabilidade é perfeito, aguenta carga.
Não é nada simples
Ele é super estável.

Sistema de Notificações em uma Plataforma de Comércio Eletrônico. Ela ajuda a lidar com diferentes eventos, como confirmações de pedidos, de maneira eficiente e independente.


