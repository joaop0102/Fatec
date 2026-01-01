let coords = null;

document.addEventListener("DOMContentLoaded", mostrarEntradas);
const form = document.getElementById("form-memoria");
form.addEventListener("submit", function (e) {
    e.preventDefault();

    const fileInput = document.getElementById("foto");
    if (fileInput.files.length > 0) {
        const reader = new FileReader();
        reader.onload = function (ev) {
            salvarEntrada(ev.target.result); 
        };
        reader.readAsDataURL(fileInput.files[0]);
    } else {
        salvarEntrada(""); // sem foto
    }
});

document.getElementById("btn-citacao").addEventListener("click", () => {
    fetch("https://api.quotable.io/random")
        .then(res => res.json())
        .then(data => {
            document.getElementById("citacao").innerText =
                `"${data.content}" — ${data.author}`;
        })
        .catch(() => {
            document.getElementById("citacao").innerText =
                "⚠️ Não foi possível carregar a citação.";
        });
});


function salvarEntrada(fotoBase64) {
    const entrada = {
        titulo: document.getElementById("titulo").value,
        data: document.getElementById("data").value,
        foto: fotoBase64,
        descricao: document.getElementById("descricao").value,
        avaliacao: document.getElementById("avaliacao").value,
        coordenadas: coords,
    };

    let entradas = JSON.parse(localStorage.getItem("diario")) || [];
    entradas.push(entrada);
    localStorage.setItem("diario", JSON.stringify(entradas));

    form.reset();
    coords = null;
    mostrarEntradas();
}


function mostrarEntradas() {
    const section = document.getElementById("entradas");
    section.innerHTML = "<h2 class='text-2xl font-semibold text-blue-600 mb-4'>Minhas Memórias</h2>";
    let entradas = JSON.parse(localStorage.getItem("diario")) || [];

    entradas.forEach((e, i) => {
        const article = document.createElement("article");
        article.className = "bg-white p-5 rounded-xl shadow-md border hover:shadow-lg transition";
        article.innerHTML = `
          <h3 class="text-lg font-bold text-blue-700 mb-2">${e.titulo} <span class="text-gray-500 text-sm">(${e.data})</span></h3>
          <p class="mb-2">${e.descricao}</p>
          <p class="text-yellow-600 font-semibold mb-2">⭐ Avaliação: ${e.avaliacao}/5</p>
          ${e.foto ? `
            <figure class="my-3 text-center">
              <img src="${e.foto}" alt="${e.titulo}" class="max-w-full rounded-lg shadow-md mx-auto">
              <figcaption class="text-sm text-gray-600 mt-1">${e.titulo}</figcaption>
            </figure>` : ""}
          ${e.coordenadas ? `<p class="text-sm text-gray-600">📍 Localização: ${e.coordenadas.lat.toFixed(4)}, ${e.coordenadas.lng.toFixed(4)}</p>` : ""}
          <button onclick="excluirEntrada(${i})"
            class="mt-3 bg-red-500 text-white px-3 py-1 rounded-lg hover:bg-red-700 transition">
            Excluir
          </button>
        `;
        section.appendChild(article);
    });
}

function excluirEntrada(index) {
    let entradas = JSON.parse(localStorage.getItem("diario")) || [];
    entradas.splice(index, 1);
    localStorage.setItem("diario", JSON.stringify(entradas));
    mostrarEntradas();
}

document.getElementById("btn-localizacao").addEventListener("click", () => {
    if (navigator.geolocation) {
        navigator.geolocation.getCurrentPosition(
            (pos) => {
                coords = { lat: pos.coords.latitude, lng: pos.coords.longitude };
                alert("Localização adicionada!");
            },
            () => alert("Não foi possível obter sua localização.")
        );
    } else {
        alert("Geolocalização não suportada pelo navegador.");
    }
});

document.getElementById("btn-citacao").addEventListener("click", () => {
    fetch("https://api.quotable.io/random")
        .then((res) => res.json())
        .then((data) => {
            document.getElementById("citacao").innerText = `"${data.content}" — ${data.author}`;
        })
        .catch(() => {
            document.getElementById("citacao").innerText = "Não foi possível carregar a citação.";
        });
});