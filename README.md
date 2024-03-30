# javafx-chat-messenger

The project contains two modules called Chat-messenger-Server and Chat-messenger-Client. It uses MySql server database for user registration and validation. Here is the instructions on how to run the project.

1. MySql server database needs to be set up on localhost port number 3306.
2. Databse url needs to be updated or defined in config.properties file in Chat-messenger-Server module.
   * According to current configuration database url is `jdbc:mysql://localhost:3306/main?user=root&password=root` (Please update url as per MySql server configuration in your machine.)
   * After configuring the database, execute the following SQL queries to ensure the necessary schema and table are in place: <br />
       `CREATE SCHEMA main;` <br />
       `CREATE TABLE main.users (id INTEGER primary key serial default value, username TEXT not null, password TEXT not null);`
3. Run the Chat-messenger-Server module from `com.cosc.messenger.App` class.
4. Run the Chat-messenger-Client module from `com.cosc.messenger.MainApp` class.
5. Once client is running, sign up with some users using their name as username and password.
6. Log in.
7. Another instance of client can be started `com.cosc.messenger.MainApp` class to demonstrate multiple users using the system.
8. Start messaging!

