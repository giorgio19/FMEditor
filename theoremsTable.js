const theoremsStr = require('./Antlr/theorems.json');

//for Bible rendering from theorems.json
MathJax.Hub.Queue(["Typeset", MathJax.Hub, createTable.tr]);

$(document).ready(function () {
  createTable();
});

function createTable(){
    var theorems = theoremsStr.theorems;
    var tr;
    for (var i = 0; i < theorems.length; i++) {
        tr = $('<tr/>');
        tr.append("<td>" + theorems[i].name + "</td>");
        tr.append("<td>" + theorems[i].eq + "</td>");
        // tr.append("<td>" + json[i].team + "</td>");
        $('table').append(tr);
    }
}
