const xmlHttp = new XMLHttpRequest();
xmlHttp.open("GET", "http://localhost:8080/rest/data", true);
xmlHttp.setRequestHeader("Content-Type", "application/json");
xmlHttp.onreadystatechange = function () {
    if (this.readyState === 4) {
        if (this.status === 200) {
            setData(this.responseText);
        } else {
            setError(this.status, this.responseText)
        }
    }
}
xmlHttp.send();

function setData(data) {
    let dataObject = JSON.parse(data);
    document.getElementById("message").innerText = " ";
    document.getElementById("id").insertAdjacentText("beforeend", dataObject.id);
    document.getElementById("value").insertAdjacentText("beforeend", dataObject.value);
}

function setError(status, responseText) {
    document.getElementById("message").innerText = "Something bad happened. Status: " + status + ". Response text: " + responseText;
    document.getElementById("id").insertAdjacentText("beforeend", "no data");
    document.getElementById("value").insertAdjacentText("beforeend", "no data");
}