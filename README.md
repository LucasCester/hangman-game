# Maze Game

<!---Esses são exemplos. Veja https://shields.io para outras pessoas ou para personalizar este conjunto de escudos. Você pode querer incluir dependências, status do projeto e informações de licença aqui--->

![GitHub repo size](https://img.shields.io/github/repo-size/LucasCester/hangman-game?style=for-the-badge)
![GitHub language count](https://img.shields.io/github/languages/count/LucasCester/hangman-game?style=for-the-badge)
![GitHub forks](https://img.shields.io/github/forks/LucasCester/hangman-game?style=for-the-badge)
![Bitbucket open issues](https://img.shields.io/bitbucket/issues/LucasCester/hangman-game?style=for-the-badge)
![Bitbucket open pull requests](https://img.shields.io/bitbucket/pr-raw/LucasCester/hangman-game?style=for-the-badge)

<img src="https://t4.ftcdn.net/jpg/03/63/09/07/360_F_363090718_qUZfAOMZs65fUJd9wQkO3P3nYpK39h6q.jpg" alt="exemplo imagem">

> This is a school project, it's a simple hangman game. The game will select a random word (word in portuguese) and 
> you need to type a leter and try to guess the word.

## ☕ Running the Hangman Game

After cloning the project, to start the game you will run the **Forca** file, the game will pick a word and you can play.

```
Palavra...: _ A _ A (Word that the game chossed)
Digitadas.: A, Q,   (Leters that you typed)
Erros.....: 1/2     (Your chances)
Qual letra?
```

## 🖋 Changing the words

If you want to change the words that the game pick, you go on the **BancoDePalavras** file and change the String[] palavras.

```Java
private static String[] palavras = 
    {
      "JAVA",
      "CLASSE",
      "OBJETO",
      "INSTANCIA",
      "PUBLICO",
      "PRIVATIVO",
      "METODO",
      "CONSTRUTOR",
      "SETTER",
      "GETTER",
      "LUZ",
      "PRAZER"
    };
```
