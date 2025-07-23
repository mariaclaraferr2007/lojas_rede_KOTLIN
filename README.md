# 🛍️ Lojas Rede - Cadastro de Usuários
Aplicativo Android desenvolvido em Kotlin com foco no cadastro e gerenciamento de usuários em um ambiente simulado de loja. O app apresenta múltiplas telas, interações com banco de dados local (Room) e navegação entre atividades.

🔒 Ideal para aprender fundamentos de cadastro, persistência de dados, e estruturação de telas no Android.

---

## 📱 Tecnologias Utilizadas

- Kotlin

- Android Studio

- Room Database

- XML para construção da interface

- Componentes nativos do Android

---

## ✨ Funcionalidades

- Tela de boas-vindas e navegação inicial

- Cadastro de usuários com dados básicos

- Salvamento das informações usando Room Database

- Telas separadas para login, cadastro e área principal

- Interação com banco local simulando sistema real

---

## 🚀 Como Executar o Projeto

1- Clone este repositório:

git clone https://github.com/seu-usuario/LojasRede.git

2- Abra o projeto no Android Studio

3- Aguarde a sincronização do Gradle

4- Execute o app em um dispositivo físico ou emulador Android

5- Explore o fluxo de cadastro, login e acesso ao sistema!

---

## 🛠 Estrutura do Projeto

📁 app

 ┣ 📂 java
 
 ┃ ┗ 📂 com.example.lojasrede22300570
 
 ┃   ┣ 📜 BemVindoActivity.kt → Tela inicial de boas-vindas
 
 ┃   ┣ 📜 MainActivity.kt → Tela principal após login
 
 ┃   ┣ 📜 CadastroActivity.kt → Formulário de cadastro
 
 ┃   ┣ 📜 TesteActivity.kt → Tela auxiliar para testes
 
 ┃   ┣ 📂 model
 
 ┃   ┃ ┗ 📜 Usuario.kt → Classe de dados do usuário
 
 ┃   ┣ 📂 repository
 
 ┃   ┃ ┣ 📜 UsuarioDb.kt → Configuração do Room Database
 
 ┃   ┃ ┗ 📂 Dao
 
 ┃   ┃   ┗ 📜 UsuarioDao.kt → Interface de acesso aos dados
 
 ┣ 📂 res
 
 ┃ ┣ 📂 layout → Telas em XML
 
 ┃ ┣ 📂 drawable → Recursos gráficos
 
 ┃ ┣ 📂 values → Cores, temas e strings
 
 ┗ 📜 AndroidManifest.xml

--- 

## 💡 Aprendizados

Com este projeto foi possível praticar:

- Navegação entre múltiplas telas com Intent

- Persistência local de dados com Room

- Criação e manipulação de banco de dados com DAO

- Tratamento de entrada com EditText e Toast

- Separação da estrutura do app com pastas organizadas

---

## 👩‍💻 Autor

Desenvolvido por Maria Clara Ferreira Lopes

🎓 Estudante de Técnico em Informática - COTEMIG

📧 Email: mariaclaraferreiralopes82@gmail.com

🔗 LinkedIn: https://www.linkedin.com/in/maria-clara-ferreira-lopes/
