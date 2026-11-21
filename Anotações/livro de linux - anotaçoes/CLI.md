<h1 align="center"> Anotaçoes linux </h1> 

No contexto do uso das linhas de comando, na verdade o que estamos falando e sobre o shell, que e um programa que recebe comandos do teclado e repassa para que o sistema operacional possa execultar.

Quase todas as distros linux fornecem um shell (programa que vai encaminhar os comando do teclado para o sistema operacional) do projeto GNU chamado bash esse nome e um acronimo para **bourne a again shell**, uma referencia ao fato de que o bash e um subistituto aprimorado para o sh, sh esse que e o shell original escrito por um cara chamado Steve Bourne

---

OBS: O Projeto GNU foi criado por Richard Stallman com o objetivo de desenvolver um sistema operacional completamente livre.

A ideia era criar tudo que um sistema precisa:

compiladores (como o GCC)
bibliotecas
utilitários (ls, cp, grep…)
e também um shell → o bash

---

Em sistemas Linux, emuladores de terminal são programas que permitem a utilização de um shell dentro de uma interface gráfica. O terminal disponível no ambiente gráfico (como no GNOME) não é o shell em si, mas sim uma interface que executa e intermedeia a comunicação com o shell.

dentro dos terminais temos o historico de comando que basicamente o armazenamento de comandos dados anteriormente , distros linux na sua grande maioria salvam os ultimos 1000 comandos

Mesmo sem um emulador de terminal execultando o linux mantem rodando em segundo plano varios outras sessoes, ou seja, outros terminais do tipo TTy, terminais virtuais, se utilizar as teclas ctrl + alt + f1 ao f9 voce tem acesso a esses terminais que possui o mesmo loguin e senha do terminal onde esta a parte grafica

---

<h2 align="center"> Navegaçao de arquivos </h2>

alem de como digitar e importante aprender a navegar nos diretorios do sistema linux , pois e nele que vai ser importante para ver , buscar e entender os arquivos

alguns dos comando mais importantes para isso sao: pwd, cd, ls. assim como o windows, sistemas operacionais do tipo unix, como o linux, armazena os arquivos de forma hierarquica , ou seja, um dentro do outro como uma arvore mesmo.

o diretorio principal onde tudo começa e o diretorio raiz , que contem arquivos e outros diretorios, e assim se repete por todo o sistema.

diferente do windows que possui uma arvore de diretorios para cada disco, por exemplo uma pro disco C, outra pro disco D assim por diante, o linux mantem somente uma que vale para todo mundo, para fazer isso o controlador do sistema operacional decide onde vai estar cada dispositivo de armazenamento na arvore.

o sistema de diretorio para sistemas operacionais e literalmente uma estrutura de arvore, la das estruturas de dados, ou seja , quem esta mais acima esta maior na hierarquia dessa arvore, para ver em qual diretorio eu estou basta utilizar o comando pwd, que e responsavel por mostrar onde estamos

geralmente quando iniciamos uma nova sessao ou ate mesmo um novo emulador de terminal , ele começa no diretorio pessoal do usuario logado, ja que o propio linux cria esse diretorio pessoal quando uma conta nova e criada, que inclusive e o unico lugar onde esse usuario pode criar novos arquivos, no seu propio diretorio

o ls ja e um comando bem famoso, responsavel por listar o conteudo de qualquer diretorio, mas nao somente do diretorio atual e possivel listar tambem de outros diretorios

para navegar dentro dos diretorios e bem tranquilo fazendo o uso do comando cd, que e bem conhecido tambem assim como o ls, porem existem duas maneiras diferentes de acessar os diretorios, sendo chamados de : caminhos absolutos e caminhos relativos.

Caminhos absolutos

os caminhos absolutos sao aqueles que começam no diretorio raiz e seguem ate de ramo em ramo ate que o caminho seja completo aonde ele foi pedido no terminal, por exmplo no diretorio /usr/bin (geralmente onde ficam programas instalados do sistema), ou seja isso significa que existe um diretorio raiz que e representado pela barra dentro do raiz tem o usr e dentro do usr tem o bin

Caminhos relativos

Esse ja sao caminhos que começam a partir do diretorio de trabalho(diretorio atual) para utilizar isso sao usados um par de notaçoes especias para representar as posiçoes relativas na arvore, o "." referece ao diretorio de trabalho e o ".." e referente ao diretorio pai do atual, ou de trabalho,

o linux nao tem aquele conceito de extensao de arquivo que existe em outros SO, o tipo daquele arquivo e definido de outra maneira nao pelo nome dele em si, como no windows por exemplo, que um arquivo de texto e .txt

esses sao alguns comandos que podem ser utilizados para fazer uma boa visita ao linux como um todo, obs o "~", se refere ao diretorio inicial do usuario

ls List directory contents.
file Determine file type.
less View file contents.

no uso do ls e possivel utilizar mais de um parametro para que seja realizada a busca no sistema, ou seja dois diretorios para que ele faça a exibiçao, tambem e possivel passar outros parametros para mudar a forma como o bash devolve a resposta

por exemplo ls - l, que e o formato longo de execuçao do ls mostrando mais coisas, como permisoes, donos do arquivo, horario de criaçao entre outros...

os itens onde o comando age sobre por exmplo o diretorio e chamado de argumentos do comando enquanto o que altera o comportamento dele como o -l por exemplo sao chamados de opçoes

tambem exixtem as opçoes longas que geralmente sao suportadas por varias distros sendo possivel inclusive o uso da concatenaçao de opçoes curtas por exemplo o ls -lt onde o l exibe informaçoes adicionais e o t as bota em ordem, podendo colocar o --reverse(opçao longa), para que seja possivel colocar na ordem contraria

obs : o campo utilizado para ordenaçao geralmente e a data de modificaçao

o comando ls possui muitas opçoes, sendo elas curtas e ate mesmo as longas aqui tem uma pequena tabela para ver:

| Opção | Forma longa | Descrição |
|------|------------|----------|
| `-a` | `--all` | Lista todos os arquivos, incluindo os ocultos (que começam com `.`). |
| `-A` | `--almost-all` | Igual ao `-a`, mas não inclui `.` (diretório atual) e `..` (diretório pai). |
| `-d` | `--directory` | Mostra informações do diretório em si, e não do seu conteúdo (geralmente usado com `-l`). |
| `-F` | `--classify` | Adiciona um indicador ao final do nome (ex: `/` para diretórios). |
| `-h` | `--human-readable` | Mostra tamanhos em formato legível (KB, MB, GB). |
| `-l` | — | Exibe em formato detalhado (permissões, dono, tamanho, data). |
| `-r` | `--reverse` | Inverte a ordem da listagem. |
| `-S` | — | Ordena por tamanho do arquivo. |
| `-t` | — | Ordena por tempo de modificação (mtime). |
| `-R` | — | Lista todos os arquivos recursivamente, entrando nos subdiretorios |


Sobre o comando completo do ls durante a nevegaçao nos diretorios do linux um exmplo do comando ls -l, que vai lista direto o que esta diretorio de maneira completa e possivel colher importantes informaçoes como essa :

Exemplo: -rw-r--r-- 1 raiz raiz 32059 2017-04-03 11:05 oo-cd-cover.odf

para enteder o que seria cada um deles basta ver a tabela abaixo
 
| Campo | Exemplo | Descrição |
|------|--------|----------|
| Tipo + Permissões | `-rw-r--r--` | O primeiro caractere indica o tipo (`-` arquivo, `d` diretório). Os demais indicam permissões: proprietário, grupo e outros. |
| Links físicos | `1` | Número de links físicos (hard links) apontando para o arquivo. |
| Proprietário | `raiz` | Nome do usuário dono do arquivo. |
| Grupo | `raiz` | Nome do grupo do arquivo. |
| Tamanho | `32059` | Tamanho do arquivo em bytes. |
| Data/Hora | `2017-04-03 11:05` | Última modificação (mtime). |
| Nome | `oo-cd-cover.odf` | Nome do arquivo. |


Durante a exploraçao muitas vezes pode ser necessario ver o tipo dos dados daquele arquivo ja que aquele nome do arquivo no linux nao indica extamente o que aquele arquivo, por mais que exista o .jpeg no final nao necessariamente uma imagem aquele arquivo, existem varios tipos de arquivos diferentes no linux

O comando less e um programa para visualizar  arquivos de texto , e um comando muito importante pois muitas coisas no linux sao feitas de maneira que humanos conseguem ler, ou seja, arquivos nao binarios e sim arquivos em texto, e um tipo de arquivo muito importante que é assim sao os arquivos de configuraçao de sistema

dentro dos computadores existem muitas maneira de conseguir armazenar texto que sao feitas de fomas completamentes diferentes da mais simples ate a mais complexa e dentro das simples, esta a codificaçao ASCII, que resumidademente, vai colocar um caracter para um valor numero, ou seja e de maneira mais simples e direta, um pra um

arquivos do tipo ASCII, sao simples e possuem somente os caracteres e alguns codigos de contrele para controlar coisas como quebra de linhas, tabulaçoes entre outros, ou seja e algo simples que facilmente pode ser armazenado e entendido

Em todo o sistema Linux, muitos arquivos são armazenados em formato de texto, e existem muitas ferramentas do Linux que trabalham com arquivos de texto. Até mesmo o Windows reconhece a importância desse formato. O conhecido programa NOTEPAD.EXE é um editor para arquivos de texto ASCII simples.

Sempre que usar o programa less em algum arquivo, e possivel percorrer o texto de tras pra frente o que pode ser util em algum momento, caso o arquivo tenha mais de uma pagina existe uma maneira de navagegar nela inclusive uma tabela para os comandos mais comuns

| Comando | Ação |
|--------|------|
| `PAGE UP` ou `b` | Volta uma página |
| `PAGE DOWN` ou `SPACE` | Avança uma página |
| `↑` (seta para cima) | Sobe uma linha |
| `↓` (seta para baixo) | Desce uma linha |
| `G` | Vai para o final do arquivo |
| `1G` ou `g` | Vai para o início do arquivo |
| `/texto` | Busca para frente pela próxima ocorrência de "texto" |
| `n` | Vai para a próxima ocorrência da busca anterior |
| `h` | Mostra a tela de ajuda |
| `q` | Sai do `less` |

Esse less e uma evoluçao de um programa base do unix que era chamado de more que permita navegaçao para frente, ja o less permite pra frente e para tras , alem de alguns outros muitos comandos

dentro do linux os arquivos sao montados a partir de um design patter especifico publicado chamado de Linux Filesystem Hierarchy Standard, ou seja, a maioria das distros seguem o mesmo padrao de desing entao e possivel fazer um guia pelos arquivos, na tabela tem mais ou menos o que cada um faz;

| Diretório | Descrição |
|----------|----------|
| `/` | Diretório raiz, onde tudo começa. |
| `/bin` | Binários essenciais para inicialização e funcionamento do sistema (hoje substituído por `/usr/bin`). |
| `/boot` | Contém o kernel, initramfs e arquivos do bootloader (ex: `grub.cfg`, `vmlinuz`). |
| `/dev` | Diretório de dispositivos (tudo é tratado como arquivo). |
| `/etc` | Arquivos de configuração do sistema (ex: `crontab`, `fstab`, `passwd`). |
| `/home` | Diretórios pessoais dos usuários. |
| `/lib` | Bibliotecas compartilhadas essenciais (substituído por `/usr/lib`). |
| `/lost+found` | Usado para recuperação de arquivos após corrupção do sistema. |
| `/media` | Pontos de montagem automáticos para dispositivos removíveis (USB, CD). |
| `/mnt` | Pontos de montagem temporários/manuais. |
| `/opt` | Software opcional (geralmente aplicações comerciais). |
| `/proc` | Sistema de arquivos virtual com informações do kernel. |
| `/root` | Diretório pessoal do usuário root. |
| `/run` | Dados temporários em memória (substitui parcialmente `/tmp`). |
| `/sbin` | Binários administrativos do sistema (substituído por `/usr/sbin`). |
| `/sys` | Informações detalhadas sobre dispositivos (interface com o kernel). |
| `/tmp` | Arquivos temporários (geralmente apagados ao reiniciar). |
| `/usr` | Programas e arquivos usados por usuários. |
| `/usr/bin` | Executáveis instalados pela distribuição. |
| `/usr/lib` | Bibliotecas dos programas em `/usr/bin`. |
| `/usr/local` | Programas instalados manualmente (fora da distro). |
| `/usr/sbin` | Programas administrativos adicionais. |
| `/usr/share` | Dados compartilhados (ícones, sons, configs padrão). |
| `/usr/share/doc` | Documentação dos pacotes instalados. |
| `/var` | Dados variáveis (logs, banco de dados, spool, emails). |
| `/var/log` | Arquivos de log do sistema. |
| `~/.config` | Configurações específicas do usuário. |
| `~/.local` | Dados locais de aplicações do usuário. |

dentro dos sistemas unix durante a exploraçao nos diretorios do sistema foi possivel encontrar arquivos com nomes pareciso, que quando era dado o comando file naquele arquivo ele respondia que era um symlink. 

Esse symlink e na verdade algo chamado de link simbolico que e nada mais nada menos que outro nome para um mesmo arquivo, porem com a diferença que ele aponta para outro arquivo

Isso e util para que seja possivel por exemplo ter varias versoes de um mesmo software compartilhado porem sem precissar que quando haja uma alteraçao todos tenham que ser alterados, por exemplo (exemplo retirado do livro): 

'' um programa precisa usar um recurso compartilhado contido em um arquivo chamado `foo` , mas `foo` tem versões que mudam com frequência. Seria interessante incluir o número da versão no nome do arquivo para que o administrador ou outra pessoa interessada pudesse ver qual versão de `foo` está instalada. Isso apresenta um problema. Se mudarmos o nome do recurso compartilhado, teremos que rastrear todos os programas que o utilizam e alterar o nome do recurso para que ele busque o novo nome sempre que uma nova versão for instalada. Isso não parece nada divertido.

É aqui que os links simbólicos entram em ação. Suponha que instalemos a versão 2.6 do foo , cujo nome de arquivo é foo-2.6, e criemos um link simbólico chamado simplesmente foo que aponte para foo-2.6 . Isso significa que, quando um programa abre o arquivo foo , ele está, na verdade, abrindo o arquivo foo-2.6 . Agora todos estão felizes. Os programas que dependem do foo podem encontrá-lo e ainda podemos ver qual versão está instalada. Quando for a hora de atualizar para foo-2.7 , basta adicionar o arquivo ao nosso sistema, excluir o link simbólico foo e criar um novo link simbólico que aponte para a nova versão. Isso não só resolve o problema da atualização de versão, como também nos permite manter ambas as versões em nossa máquina. Imagine que foo-2.7 tenha um bug (malditos desenvolvedores!) e precisemos reverter para a versão antiga. Novamente, basta excluir o link simbólico que aponta para a nova versão e criar um novo link simbólico apontando para a versão antiga. ''

---

<h2 align="center"> MANIPULAÇÃO DE ARQUIVOS E DIRETÓRIOS </h2>

Para manipular arquivos de diretorios dentro do linux existem alguns comando bem comuns que vao ser utilizados a maior parte do tempo sendo eles:

| Comando | Descrição |
|----------|----------|
| `cp` | Copiar arquivos e diretórios. |
| `mv` | Mover ou renomear arquivos e diretórios|
| `mkdir` | Cria diretórios. |
| `rm` | Remove arquivos e diretórios. |
| `ln` | ligações físicas e simbólicas. |

porem muitas dessas manipulaçoes sao constantemente feitas atraves de uma propia interface grafica mesmo, que gerencia arquivos, porem algumas funcionalidades sao melhores de serem feitas aqui no propio terminal, ate por que caso nao exista a inreface grafica , o terminal e quem vai mandar

ja que o shell utiliza muitas vezes nomes de arquivos ele tem implementado algo muito importante que faz com que seja muito poderosa essa manipulaçao que e a possibilidade do uso dos wildcards, ou coringas, que sao caracteres que ajudam a pegar um grupo de nomes de arquivos de maneira mais rapida os mais comuns sao:

| Coringa | Significado |
|--------|------------|
| `*` | Corresponde a qualquer sequência de caracteres (inclusive nenhum). |
| `?` | Corresponde a exatamente um único caractere. |
| `[caracteres]` | Corresponde a qualquer caractere dentro do conjunto especificado. |
| `[!caracteres]` ou `[^caracteres]` | Corresponde a qualquer caractere que NÃO esteja no conjunto especificado. |
| `[[:classe:]]` | Corresponde a qualquer caractere pertencente à classe especificada (ex: `[:digit:]`, `[:alpha:]`). |

```bash

Exemplo de uso

*.txt        # todos os arquivos .txt
file?.txt    # file1.txt, fileA.txt (apenas 1 caractere no lugar do ?)
[abc]*       # arquivos que começam com a, b ou c
[!abc]*      # arquivos que NÃO começam com a, b ou c
[[:digit:]]* # arquivos que começam com número

```

esses coringas tambem se aplicam a arquivos ocultos, ou seja, utilizar eles tambem nao garante que ele vai mostrar os arquivos que sao ocultos sendo necessario o uso de algum coringa como por exemplo '.*', para ver os arquivos tudo porem podem aparecer dependendo da config os arquivos ".", ".." que sao do diretorio artual  e do diretorio pai, podendo usar os wildcards para excluir eles, por exmplo:  `.[!.]*` ou `.??*`

para criar diretorios e necessario o uso do comando mkdir para que seja possivel criar esses diretorios sendo possivel, inclusive a criaçao de mais de um diretorio de uma vez, por exemplo ``` mkdir diretorio1 diretorio2 diretorio3 ```. Para fazer uma copia de um diretorio ou arquivo para outro basta utilizar o comando ``` cp  armas1 player1  ```

existem alguns parametros que podem ser passados e eles sao os seguinte que estao na tabela

| Opção | Forma longa | Descrição |
|------|------------|----------|
| `-a` | `--archive` | Copia arquivos e diretórios preservando atributos (permissões, dono, etc.). |
| `-i` | `--interactive` | Pede confirmação antes de sobrescrever arquivos existentes. |
| `-r` | — | Copia diretórios recursivamente (necessário para diretórios). |
| `-u` | `--update` | Copia apenas arquivos novos ou mais recentes que os do destino. |
| `-v` | `--verbose` | Mostra mensagens detalhadas durante a cópia. |

---

```
cp -r pasta1 pasta2        # copia diretório recursivamente
cp -a origem destino       # copia preservando atributos
cp -i arquivo.txt backup/  # pede confirmação se existir
cp -u *.txt backup/        # copia apenas arquivos novos/atualizados
cp -v arquivo.txt destino/ # mostra detalhes da cópia

```

