// Pergunta a idade da pessoa
var idade = parseInt(prompt("Qual é a sua idade?"));

// Verifica a idade usando condicionais
if (idade < 16) {


    console.log("Não pode entrar no evento.");
} else if (idade >= 16 && idade < 18) {


    console.log("Pode entrar no evento, porém não pode beber.");
} 
else {
    console.log("Pode entrar no evento e beber.");
}

// Mostra a mensagem final
console.log("Se beber, não dirija!");