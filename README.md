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

