document.addEventListener("DOMContentLoaded", function () {
    var imagens = new Array("por do sol.jpg",
        "vulcao.jpg",
        "flores.jpg",
        "berlindes.jpg"),
        current = 0, // Imagem visualizada
        image, legend;
    function load() {
        image = document.getElementById("image");
        legend = document.getElementById("legend");
        change()
    }
}