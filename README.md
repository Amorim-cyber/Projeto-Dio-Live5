# Projeto-Dio-Live :five: :rocket:

#### INÍCIO

Fala pessoal, estou começando minha jornada neste quinto projeto da Digital Innovation One. Este projeto consiste em criar um gerenciador de salas de reuniões utilizando os recursos do java + angular.

Tenho aprendido muito com os projetos :smile:

Gratidão por todo esse conhecimento compartilhado.

Muito obrigado!

#### TRILHA DE APRENDIZANDO

Segue por aqui algumas notas sobre o que eu aprendi com esse projeto.

<div style="background-color: #E8E8E8; border-radius: 3px;">
   <p><strong>PRIMEIRO COMMIT</strong></p>
    <ul>
        <li><strong>PARTE 1:</strong> Preparando o ambiente de desenvolvimento, criando um projeto backend com o spring initializr spring boot versão 2.5.2, o projeto será em java 8 utilizando as dependências do maven. Depêndencias: Spring Web, Spring Data JPA, H2 Database, Lombok. Utilizei a IDE IntelliJ para desenvolver junto o projeto. Foi criado as pastas controller, exception, model e repository.</li>
    </ul>
    <br>
</div>
<div style="background-color: #E8E8E8; border-radius: 3px;">
   <p><strong>CONFIGURANDO O BANCO / ADICIONANDO JAKARTA</strong></p>
    <ul>
        <li><strong>PARTE 2:</strong> Configurando a database H2.Colocando para o projeto rodar na porta 8082. Criado a classe model Room. Esqueci de colocar as dependências do maven. Adicionado as dependências junto com a versão mais atual do jakarta.validation-api.</li>
    </ul>
    <br>
</div>

<div style="background-color: #E8E8E8; border-radius: 3px;">
   <p><strong>PREENCHENDO AS CARACTERISTICAS DA CLASSE MODEL ROOM</strong></p>
    <ul>
        <li><strong>PARTE 3:</strong> Importando a lib javax para persistência dos dados. Populando a class model Room com atributos, getters and setter e um construtor. Connectando os componentes da classe ao banco de dados utilizando as annotations do javax(@Entity, @Table, @Id, @GeneratedValue, @Column). Também foi sobreescrito o método toString() com o intuito de retornar todas as informações da classe em formato de string.</li>
    </ul>
    <br>
</div>
<div style="background-color: #E8E8E8; border-radius: 3px;">
   <p><strong>DETERMINANDO REPOSITÓRIO, CONTROLLER E EXCEPTIONS</strong></p>
    <ul>
        <li><strong>PARTE 4:</strong> Criando a interface repositorio RoomRepository. Importando a classe model Room e as lib de repositório/JpaRepository. Declarando que a interface é um repositório por meio da annotation @Repository e fazendo-a herdar as propriedades da JpaRepository por meio do extends. Criando a classe controller RoomController ao projeto. Criando as classes exception ErrorDetails, GlobalExceptionHandler e ResourceNotFoundException. Determinando os atributos, construtor e os metodos getters e setters da classe exception ErrorDetails.</li>
    </ul>
    <br>
</div>

<div style="background-color: #E8E8E8; border-radius: 3px;">
   <p><strong>POPULANDO AS CLASSES EXCEPTIONS ResourceNotFoundException/GlobalExceptionHandler</strong></p>
    <ul>
        <li><strong>PARTE 5:</strong> Importando HttpStatus e ResponseStatus para a classe exception ResourceNotFoundException. Declarando o tipo httpStatus que a classe irá receber por meio da annotation @ResponseStatus, fazendo-a herdar todas as propriedades de exception por meio do extends. Criando atributo e construtor para esta classe. Importando HttpStatus, ResponseEntity, ControllerAdvice, ExceptionHandler e WebRequest à classe GlobalExceptionHandler. Sinalizando que a classe é um controller advice por meio da annotation @ControllerAdvice. Criado o método de resposta resourceNotFoundException do tipo @ExceptionHandler que retorna uma mensagem de erro caso a diretiva Http não encontre o que foi solicitado. Criado o método de resposta globalExceptionHandler do tipo @ExceptionHandler que retorna uma mensagem de erro interna do servidor.</li>
    </ul>
    <br>
</div>

<div style="background-color: #E8E8E8; border-radius: 3px;">
   <p><strong>IMPLEMENTANDO POST, PUT, GET E DELETE À CLASSE CONTROLLER</strong></p>
    <ul>
        <li><strong>PARTE 6:</strong> Importando a exception, model e repository para a classe controller RoomController. Importando todas as ferramentas de requisições http à classe(GetMapping, PostMappping, Autowired, RestController, etc). Declarando que a classe é um RestController. Permitindo que a classe tenha connexão ao frontend por meio da annotation @CrossOrigin. Determinando o endereço de chamada da classe por meio da annotation @RequestMapping. Criando o atributo do tipo RoomRepository e conectando ao banco por meio da annotation @Autowired. Criando o endpoint do tipo GET getAllRooms que vai retornar todas as salas de reunião. Criando o endpoint do tipo GET getRoomById que vai retornar uma determinada sala de reunião. Criando o endpoint do tipo POST createRoom responsável por criar uma nova sala.Criando o endpoint do tipo PUT updateRoom que irá atualizar os dados de uma sala já existente.Criado o endpoint do tipo DELETE deleteRoom que vai deletar uma sala existente.</li>
    </ul>
    <br>
</div>

