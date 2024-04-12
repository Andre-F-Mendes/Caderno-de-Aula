let valor;
let tab;

function load(){
   valor = document.getElementById("valor");
   tab = document.getElementById("tabuada");
}

function tabuada() {
    let valorInserido = Number(valor.value);
    let resultado = "";
    for (let i = 1; i != 11; i++) {
        let mult = valorInserido * i;
        resultado += valorInserido + " x " + i.valueOf() + " = " + mult + "\n";
    }
    tab.value = resultado;
}