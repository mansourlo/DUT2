/*document.addEventListener("load", ()=>{
    alert("Bienvenue dans notre page!")
});*/

const getValue = () =>{
    let age = document.getElementById("age").value;
    let nom = document.getElementById("nom").value;
    let prenom = document.getElementById("prenom").value;

    alert(`Nom: ${nom}
        Prenom: ${prenom} 
        Age: ${age}`);
}


