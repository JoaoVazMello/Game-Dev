<h1 align="center"> Anotaçoes Classes e interfaçes </h1>

classes e interfaçes sao o serne da programaçao em java, pois sao as unidades basicas da abstraçao dentro do java, ou seja, sao responsaveis por cuidar da orientaçao a objeto por assim dizer

Dentro do uso delas existem varias coisas a ser feitas, uma delas e minimizar a acessibilidade a elas que no final vai ser o que diferencia um bom componente de um componente mal feito

Isso por que dentro do uso e necessario manter o *ocultamento de informaçoes* para que cade componente do sistema seja mais independente um do outro, tambem chamado de encapsulamento, no desenvolvimento de mods aberto ao publico isso faz mais sentindo ainda, pois esses mods podem ter addons criados por outros programadores e manter tudo encapsulado faz com que uma alteraçao no codigo original nao derrube o addon

alem de que com encapsulamento o desenvolvimento de um mod ou sistema em si, fica ainda mais facil de ser otimizado, corrigivel entre outros, e em caso de desenvolvimento conjunto, cada pessoa pode trabalhar em cada parte do seu sistema sem depender um do outro

para fazer esse controle dentro do java existe o mecanismo de controle de acesso que determina quem pode acessar determinada classe ou interface de um codigo, isso e determinado pelos modificadores *private, protected e public* que estao presente na declaraçao do componente do sistema

para um componente ser bem feito e necessario que: *"torne cada classe ou membro o mais inacessível possível."*, ou seja, cada parte deve ser separada uma da outra para que nao aconteca de existir dependencia de partes dentro do codigo

para classes principais existe somente dois possiveis niveis de acesso que sao : 'packge-private' e 'pubic', e definindo que a classe deve ser o menos acessavel possivel e importante, se possivel , torna-la packge-private