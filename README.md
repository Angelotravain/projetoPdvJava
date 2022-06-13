# projetoPdvJava
Projeto criado em Java Swing e desktop, utiliza da biblioteca hibernate e faz conexão tanto com o banco de dados MySQL quanto o Banco PostegreSQL.


Para utilizar o arquivo siga os seguntes passos:

1- Baixar a pasta E-PDV no seu computador e extrair a mesma;
2- Abrir na sua IDE ( foi feito no Netbeans 12.6 e JDK 11);
3- Excluir as bibliotecas Hibernate que foram enviadas junto ao projeto;
4- Baixar o arquivo Bibliotecas Hibernate.zip
5- Importar as bibliotecas para dentro do seu projeto
6- Importar o conector JDBC junto as bibliotecas do seu projeto ( MySQL ou Postegres)
7- Abrir seu SGBD e criar o banco com o mesmo nome que criou na classe HibernateUtil;


Configurando a classe HibernateUtil:

caso MySQL:

1- Abra a classe
2- Descomente as seuintes linhas abaixo:

                    .setProperty("hibernate.dialect", "org.hibernate.dialect.MySQLDialect")
                    .setProperty("hibernate.connection.driver_class", "com.mysql.jdbc.Driver")
                    .setProperty("hibernate.connection.url", "jdbc:mysql://localhost:3307/sistemapoo")
                    
3 - Troque o login e senha do SGBD nas linhas referentes as de baixo: 


//usuário do banco de dados
                    .setProperty("hibernate.connection.username", "root")
//senha do banco de dados
                    .setProperty("hibernate.connection.password", "root")
                    
 
 
 caso PostegreSQL:

1- Abra a classe
2- Descomente as seuintes linhas abaixo:

                    //Dialeto do banco de dados.
                    
                    .setProperty("hibernate.dialect", "org.hibernate.dialect.PostgreSQLDialect")
                    
                    //Drive JDBC do banco de dados.
                    
                    .setProperty("hibernate.connection.driver_class", "org.postgresql.Driver")
                    
                    //url do banco, indica o caminho onde se encontra o banco de dados. Local, porta e nome do banco.
                    
                    .setProperty("hibernate.connection.url", "jdbc:postgresql://localhost:5432/sistemapdv")
                    
3 - Troque o login e senha do SGBD nas linhas referentes as de baixo: 


//usuário do banco de dados
                    .setProperty("hibernate.connection.username", "Postgres")
//senha do banco de dados
                    .setProperty("hibernate.connection.password", "Postgres")
