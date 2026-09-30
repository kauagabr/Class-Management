# Sistema de Gerenciamento de Aulas
Este sistema de gerenciamento de aulas é uma aplicação backend projetada para auxiliar na administração e organização de turmas, cursos, semestres, turnos e disciplinas em uma instituição de ensino. Ele permite que diferentes usuários, como professores, direção e administradores, interajam com o sistema para cadastrar e gerenciar dados essenciais, otimizando a alocação de aulas, horários e recursos.

```bash
Directory structure:
└── kauagabr-class-management/
    ├── README.md
    ├── Back-end ClassManagement/
    │   ├── README.md
    │   ├── docker-compose.yml
    │   ├── mvnw
    │   ├── mvnw.cmd
    │   ├── pom.xml
    │   ├── src/
    │   │   ├── main/
    │   │   │   ├── java/
    │   │   │   │   └── com/
    │   │   │   │       └── kvy/
    │   │   │   │           └── demogerenciamentoaulas/
    │   │   │   │               ├── DemoGerenciamentoAulasApplication.java
    │   │   │   │               ├── Adapter/
    │   │   │   │               │   ├── AulaAdapter.java
    │   │   │   │               │   ├── DiaSemanaAdapter.java
    │   │   │   │               │   ├── DisciplinaAdapter.java
    │   │   │   │               │   ├── LoginAdapter.java
    │   │   │   │               │   ├── ModalidadeAdapter.java
    │   │   │   │               │   ├── PeriodoAdapter.java
    │   │   │   │               │   ├── SalaAdapter.java
    │   │   │   │               │   ├── SemestreAdapter.java
    │   │   │   │               │   ├── TipoSalaAdapter.java
    │   │   │   │               │   ├── TurmaAdapter.java
    │   │   │   │               │   └── TurnoAdapter.java
    │   │   │   │               ├── config/
    │   │   │   │               │   ├── SpringDocOpenApiConfig.java
    │   │   │   │               │   ├── SpringSecurityConfig.java
    │   │   │   │               │   ├── SpringTimezoneConfig.java
    │   │   │   │               │   ├── TestSecurityConfig.java
    │   │   │   │               │   └── WebConfig.java
    │   │   │   │               ├── entity/
    │   │   │   │               │   ├── Aula.java
    │   │   │   │               │   ├── Curso.java
    │   │   │   │               │   ├── DiaSemana.java
    │   │   │   │               │   ├── Disciplina.java
    │   │   │   │               │   ├── Horario.java
    │   │   │   │               │   ├── Login.java
    │   │   │   │               │   ├── Modalidade.java
    │   │   │   │               │   ├── Perfil.java
    │   │   │   │               │   ├── Periodo.java
    │   │   │   │               │   ├── Sala.java
    │   │   │   │               │   ├── Semestre.java
    │   │   │   │               │   ├── TipoSala.java
    │   │   │   │               │   ├── Turma.java
    │   │   │   │               │   └── Turno.java
    │   │   │   │               ├── exception/
    │   │   │   │               │   ├── AulaEntityNotFoundException.java
    │   │   │   │               │   ├── AulaUniqueViolationException.java
    │   │   │   │               │   ├── CursoEntityNotFoundException.java
    │   │   │   │               │   ├── CursoUniqueViolationException.java
    │   │   │   │               │   ├── DiaSemanaEntityNotFoundException.java
    │   │   │   │               │   ├── DiaSemanaUniqueViolationException.java
    │   │   │   │               │   ├── DisciplinaEntityNotFoundException.java
    │   │   │   │               │   ├── DisciplinaUniqueViolationException.java
    │   │   │   │               │   ├── HorarioEntityNotFoundException.java
    │   │   │   │               │   ├── HorarioUniqueViolationException.java
    │   │   │   │               │   ├── LoginEntityNotFoundException.java
    │   │   │   │               │   ├── LoginUniqueViolationException.java
    │   │   │   │               │   ├── ModalidadeEntityNotFoundException.java
    │   │   │   │               │   ├── ModalidadeUniqueViolationException.java
    │   │   │   │               │   ├── PasswordInvalidException.java
    │   │   │   │               │   ├── PerfilEntityNotFoundException.java
    │   │   │   │               │   ├── PerfilUniqueViolationException.java
    │   │   │   │               │   ├── PeriodoEntityNotFoundException.java
    │   │   │   │               │   ├── PeriodoUniqueViolationException.java
    │   │   │   │               │   ├── ProfInvalidException.java
    │   │   │   │               │   ├── SalaEntityNotFoundException.java
    │   │   │   │               │   ├── SalaUniqueViolationException.java
    │   │   │   │               │   ├── SemestreEntityNotFoundException.java
    │   │   │   │               │   ├── SemestreUniqueViolationException.java
    │   │   │   │               │   ├── TipoSalaEntityNotFoundException.java
    │   │   │   │               │   ├── TipoSalaUniqueViolationException.java
    │   │   │   │               │   ├── TurmaEntityNotFoundException.java
    │   │   │   │               │   ├── TurmaUniqueViolationException.java
    │   │   │   │               │   ├── TurnoEntityNotFoundException.java
    │   │   │   │               │   └── TurnoUniqueViolationException.java
    │   │   │   │               ├── jwt/
    │   │   │   │               │   ├── JwtAuthorizationFilter.java
    │   │   │   │               │   ├── JwtToken.java
    │   │   │   │               │   ├── JwtUserDetails.java
    │   │   │   │               │   ├── JwtUserDetailsService.java
    │   │   │   │               │   └── JwtUtils.java
    │   │   │   │               ├── repository/
    │   │   │   │               │   ├── AulaRepository.java
    │   │   │   │               │   ├── CursoRepository.java
    │   │   │   │               │   ├── DiaSemanaRepository.java
    │   │   │   │               │   ├── DisciplinaRepository.java
    │   │   │   │               │   ├── HorarioRepository.java
    │   │   │   │               │   ├── LoginRepository.java
    │   │   │   │               │   ├── ModalidadeRepository.java
    │   │   │   │               │   ├── PerfilRepository.java
    │   │   │   │               │   ├── PeriodoRepository.java
    │   │   │   │               │   ├── SalaRepository.java
    │   │   │   │               │   ├── SemestreRepository.java
    │   │   │   │               │   ├── TipoSalaRepository.java
    │   │   │   │               │   ├── TurmaRepository.java
    │   │   │   │               │   ├── TurnoRepository.java
    │   │   │   │               │   └── Projection/
    │   │   │   │               │       ├── AulaProjection.java
    │   │   │   │               │       ├── CursoProjection.java
    │   │   │   │               │       ├── DisciplinaProjection.java
    │   │   │   │               │       ├── LoginProjection.java
    │   │   │   │               │       ├── SalaProjection.java
    │   │   │   │               │       └── TurmaProjection.java
    │   │   │   │               ├── service/
    │   │   │   │               │   ├── AulaService.java
    │   │   │   │               │   ├── CursoService.java
    │   │   │   │               │   ├── DiaSemanaService.java
    │   │   │   │               │   ├── DisciplinaService.java
    │   │   │   │               │   ├── HorarioService.java
    │   │   │   │               │   ├── LoginService.java
    │   │   │   │               │   ├── ModalidadeService.java
    │   │   │   │               │   ├── PerfilService.java
    │   │   │   │               │   ├── PeriodoService.java
    │   │   │   │               │   ├── SalaService.java
    │   │   │   │               │   ├── SemestreService.java
    │   │   │   │               │   ├── TipoSalaService.java
    │   │   │   │               │   ├── TratamentoDeString.java
    │   │   │   │               │   ├── TurmaService.java
    │   │   │   │               │   └── TurnoService.java
    │   │   │   │               └── web/
    │   │   │   │                   ├── controller/
    │   │   │   │                   │   ├── AulaController.java
    │   │   │   │                   │   ├── AutenticacaoController.java
    │   │   │   │                   │   ├── CursoController.java
    │   │   │   │                   │   ├── DiaSemanaController.java
    │   │   │   │                   │   ├── DisciplinaController.java
    │   │   │   │                   │   ├── HorarioController.java
    │   │   │   │                   │   ├── LoginController.java
    │   │   │   │                   │   ├── ModalidadeController.java
    │   │   │   │                   │   ├── PerfilController.java
    │   │   │   │                   │   ├── PeriodoController.java
    │   │   │   │                   │   ├── SalaController.java
    │   │   │   │                   │   ├── SemestreController.java
    │   │   │   │                   │   ├── TipoSalaController.java
    │   │   │   │                   │   ├── TurmaController.java
    │   │   │   │                   │   └── TurnoController.java
    │   │   │   │                   ├── dto/
    │   │   │   │                   │   ├── AulaDTO.java
    │   │   │   │                   │   ├── CursoDTO.java
    │   │   │   │                   │   ├── DiaSemanaDTO.java
    │   │   │   │                   │   ├── DisciplinaDTO.java
    │   │   │   │                   │   ├── HorarioDTO.java
    │   │   │   │                   │   ├── ModalidadeDTO.java
    │   │   │   │                   │   ├── PerfilDTO.java
    │   │   │   │                   │   ├── PeriodoDTO.java
    │   │   │   │                   │   ├── SalaDTO.java
    │   │   │   │                   │   ├── SemestreDTO.java
    │   │   │   │                   │   ├── TipoSalaDTO.java
    │   │   │   │                   │   ├── TurmaDTO.java
    │   │   │   │                   │   ├── TurnoDTO.java
    │   │   │   │                   │   ├── LoginDTO/
    │   │   │   │                   │   │   ├── CreateLoginDTO.java
    │   │   │   │                   │   │   ├── LoginAuthenticateDTO.java
    │   │   │   │                   │   │   ├── LoginDTO.java
    │   │   │   │                   │   │   └── LoginSenhaDTO.java
    │   │   │   │                   │   └── ResponseDTO/
    │   │   │   │                   │       └── CursoResponseDTO.java
    │   │   │   │                   └── exception/
    │   │   │   │                       ├── ApiExceptionHandles.java
    │   │   │   │                       ├── ErrorMessage.java
    │   │   │   │                       └── GlobalExceptionHandler.java
    │   │   │   └── resources/
    │   │   │       └── application.properties
    │   │   └── test/
    │   │       ├── java/
    │   │       │   └── com/
    │   │       │       └── kvy/
    │   │       │           └── demogerenciamentoaulas/
    │   │       │               ├── DemoGerenciamentoAulasApplicationTests.java
    │   │       │               ├── controllerTest/
    │   │       │               │   ├── AulaControllerTest.java
    │   │       │               │   ├── CursoControllerTest.java
    │   │       │               │   ├── DiasDaSemanaControllerTest.java
    │   │       │               │   ├── DisciplinaControllerTest.java
    │   │       │               │   ├── HorarioControllerTest.java
    │   │       │               │   ├── LoginControllerTest.java
    │   │       │               │   ├── ModalidadeControllerTest.java
    │   │       │               │   ├── PerfilControllerTest.java
    │   │       │               │   ├── PeriodoControllerTest.java
    │   │       │               │   ├── SalaControllerTest.java
    │   │       │               │   ├── SemestreControllerTest.java
    │   │       │               │   ├── TipodeSalaControllerTest.java
    │   │       │               │   ├── TurmaControllerTest.java
    │   │       │               │   └── TurnoControllerTest.java
    │   │       │               ├── fixtures/
    │   │       │               │   ├── AulaDTOFixture.java
    │   │       │               │   ├── CursoDTOFixture.java
    │   │       │               │   ├── DiaSemanaDTOFixture.java
    │   │       │               │   ├── DisciplinaDTOFixture.java
    │   │       │               │   ├── HorarioDTOFixture.java
    │   │       │               │   ├── LoginDTOFixture.java
    │   │       │               │   ├── ModalidadeDTOFixture.java
    │   │       │               │   ├── PerfilDTOFixture.java
    │   │       │               │   ├── PeriodoDTOFixture.java
    │   │       │               │   ├── SalaDTOFixture.java
    │   │       │               │   ├── SemestreDTOFixture.java
    │   │       │               │   ├── TipoSalaDTOFixture.java
    │   │       │               │   ├── TurmaDTOFixture.java
    │   │       │               │   └── TurnoDTOFixture.java
    │   │       │               └── serviceTest/
    │   │       │                   ├── AulaServiceTest.java
    │   │       │                   ├── CursoServiceTest.java
    │   │       │                   ├── DiaSemanaServiceTest.java
    │   │       │                   ├── DisciplinaServiceTest.java
    │   │       │                   ├── HorarioServiceTest.java
    │   │       │                   ├── LoginServiceTest.java
    │   │       │                   ├── ModalidadeServiceTest.java
    │   │       │                   ├── PerfilServiceTest.java
    │   │       │                   ├── PeriodoServiceTest.java
    │   │       │                   ├── SalaServiceTest.java
    │   │       │                   ├── SemestreServiceTest.java
    │   │       │                   ├── TipoSalaServiceTest.java
    │   │       │                   ├── TurmaServiceTest.java
    │   │       │                   └── TurnoServiceTest.java
    │   │       └── resources/
    │   │           ├── application.properties
    │   │           └── sql/
    │   │               ├── aula/
    │   │               │   ├── aula-delete.sql
    │   │               │   └── aula-insert.sql
    │   │               ├── curso/
    │   │               │   ├── curso-delete.sql
    │   │               │   └── curso-insert.sql
    │   │               ├── diasdaSemana/
    │   │               │   ├── diasdaSemana-delete.sql
    │   │               │   └── diasdaSemana-insert.sql
    │   │               ├── disciplina/
    │   │               │   ├── disciplina-delete.sql
    │   │               │   └── logins-insert.sql
    │   │               ├── horario/
    │   │               │   ├── horario-delete.sql
    │   │               │   └── horario-insert.sql
    │   │               ├── login/
    │   │               │   ├── logins-delete.sql
    │   │               │   └── logins-insert.sql
    │   │               ├── modalidade/
    │   │               │   ├── modalidade-delete.sql
    │   │               │   └── modalidade-insert.sql
    │   │               ├── periodo/
    │   │               │   ├── periodo-delete.sql
    │   │               │   └── periodo-insert.sql
    │   │               ├── sala/
    │   │               │   ├── sala-delete.sql
    │   │               │   └── sala-insert.sql
    │   │               ├── semestre/
    │   │               │   ├── semestre-delete.sql
    │   │               │   └── semestre-insert.sql
    │   │               ├── tipodeSala/
    │   │               │   ├── tipodeSala-delete.sql
    │   │               │   └── tipodeSala-insert.sql
    │   │               └── turma/
    │   │                   ├── turma-delete.sql
    │   │                   └── turma-insert.sql
    │   └── .mvn/
    │       └── wrapper/
    │           └── maven-wrapper.properties
    └── Front/
        ├── README.md
        ├── babel.config.js
        ├── jsconfig.json
        ├── package.json
        ├── vue.config.js
        ├── public/
        │   ├── cadastro.html
        │   ├── index.html
        │   ├── index2.html
        │   ├── login.html
        │   ├── config/
        │   │   ├── ADMIN/
        │   │   │   ├── filtro.html
        │   │   │   ├── Privacidade.html
        │   │   │   ├── Termos.html
        │   │   │   ├── Aula/
        │   │   │   │   ├── alterarAula.html
        │   │   │   │   ├── cadastroAula.html
        │   │   │   │   └── home.html
        │   │   │   ├── Curso/
        │   │   │   │   ├── alterarCurso.html
        │   │   │   │   ├── cadastroCurso.html
        │   │   │   │   └── home.html
        │   │   │   ├── DiasSemana/
        │   │   │   │   ├── AlterarDiasSemana.html
        │   │   │   │   ├── CadastroDiasSemana.html
        │   │   │   │   └── home.html
        │   │   │   ├── Disciplina/
        │   │   │   │   ├── alterarDisciplina.html
        │   │   │   │   ├── cadastroDisciplina.html
        │   │   │   │   └── home.html
        │   │   │   ├── Horario/
        │   │   │   │   ├── alterarHorario.html
        │   │   │   │   ├── cadastroHorario.html
        │   │   │   │   └── home.html
        │   │   │   ├── Login/
        │   │   │   │   ├── alterarLogin.html
        │   │   │   │   ├── alterarSenha.html
        │   │   │   │   ├── cadastroLogin.html
        │   │   │   │   └── home.html
        │   │   │   ├── Modalidade/
        │   │   │   │   ├── alterarModalidade.html
        │   │   │   │   ├── cadastroModalidade.html
        │   │   │   │   └── home.html
        │   │   │   ├── Perfil/
        │   │   │   │   ├── alterarPerfil.html
        │   │   │   │   ├── cadastroPerfil.html
        │   │   │   │   └── home.html
        │   │   │   ├── Periodo/
        │   │   │   │   ├── AlterarPeriodo.html
        │   │   │   │   ├── CadastroPeriodo.html
        │   │   │   │   └── home.html
        │   │   │   ├── Sala/
        │   │   │   │   ├── AlterarSala.html
        │   │   │   │   ├── CadastroSala.html
        │   │   │   │   └── home.html
        │   │   │   ├── Semestre/
        │   │   │   │   ├── AlterarSemestre.html
        │   │   │   │   ├── CadastroSemestre.html
        │   │   │   │   └── home.html
        │   │   │   ├── TipoSala/
        │   │   │   │   ├── AlterarTipoSala.html
        │   │   │   │   ├── CadastroTipoSala.html
        │   │   │   │   └── home.html
        │   │   │   ├── Turma/
        │   │   │   │   ├── AlterarTurma.html
        │   │   │   │   ├── CadastroTurma.html
        │   │   │   │   └── home.html
        │   │   │   └── Turno/
        │   │   │       ├── AlterarTurno.html
        │   │   │       ├── CadastroTurno.html
        │   │   │       └── home.html
        │   │   ├── FISCAL CORREDOR/
        │   │   │   ├── home.html
        │   │   │   └── index2.html
        │   │   └── PROFESSOR/
        │   │       ├── home.html
        │   │       └── index2.html
        │   ├── js/
        │   │   ├── VerificarAdminANDFiscal.js
        │   │   ├── VerificarAdminANDProf.js
        │   │   └── VerificarPerfil.js
        │   └── style/
        │       ├── botao.css
        │       ├── cadastro.css
        │       ├── filtro.css
        │       ├── index.css
        │       ├── index2.css
        │       ├── index2_Outro.css
        │       ├── login.css
        │       ├── nav_bar.css
        │       ├── telasAlterar.css
        │       ├── telasCadastro.css
        │       └── telasHomes.css
        └── src/
            ├── App.vue
            └── main.js
            
```
