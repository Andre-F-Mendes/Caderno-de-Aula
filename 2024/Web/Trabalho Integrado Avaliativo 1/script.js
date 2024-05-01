const http = require('http');
const fs = require('fs');

const paginaPrincipal = fs.readFileSync('paginaPrincipal.html');
const eventos = fs.readFileSync('eventos.html');
const gastronomia = fs.readFileSync('gastronomia.html');
const hospedagem = fs.readFileSync('hospedagem.html');
const pontosTuristicos = fs.readFileSync('turismo.html');
const praias = fs.readFileSync('praias.html');
const notFoundPage = fs.readFileSync('notFoundPage.html');

let server = http.createServer((req, res) => {
    if (req.url === '/')
        res.end(paginaPrincipal);
    else if (req.url === '/eventos')
        res.end(eventos);
    else if (req.url === '/gastronomia')
        res.end(gastronomia);
    else if (req.url === '/hospedagem')
        res.end(hospedagem);
    else if (req.url === '/pontosTuristicos')
        res.end(pontosTuristicos);
    else if (req.url === '/praias')
        res.end(praias);
    else {
        res.writeHead(404);
        res.end(notFoundPage);
    }
})

server.listen('3000');