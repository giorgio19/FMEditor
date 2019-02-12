const theoremsStr = require('./Antlr/theorems.json');
// const bible = require('./Antlr/preamble.tex');

MathJax.Hub.Config({
  extensions: [
    "tex2jax.js",
    "MathEvents.js",
    "MathZoom.js",
    "toMathML.js",
    "TeX/noErrors.js",
    "TeX/noUndefined.js",
    "TeX/AMSmath.js",
    "TeX/AMSsymbols.js",
    "Safe.js"
  ],
  jax: ["input/TeX", "output/CommonHTML"],
  messageStyle: "none",
  showMathMenu: false,
  skipStartupTypeset: true,
  tex2jax: {
    inlineMath: [["$", "$"], ["\\(", "\\)"]],
    displayMath: [["$$", "$$"], ["\\[", "\\]"]],
    processEscapes: true,
    processEnvironments: true,
    preview: "none"
  },
  TeX: {
  Macros: {
    lbag: "{\\lbrace\\hspace{-.2em}|\\;}",
    rbag: "{\\;|\\hspace{-.2em}\\rbrace}",
  }
}
});

MathJax.Hub.Queue(["Typeset", MathJax.Hub, createTable.bible]);



$(document).ready(function () {
  createTable();
});

function createTable(){
    var theorems = theoremsStr.theorems;
    var tr;
    for (var i = 0; i < theorems.length; i++) {
        tr = $('<tr/>');
        var names = theorems[i].name;
        tr.append("<td>" + "(" + theorems[i].rule.bold() + ")" + "</td>");
        names != undefined ? tr.append("<td>" + names[0].toUpperCase() + names.slice(1) + "</td>") : tr.append("<td> </td>");
        tr.append("<td class='eq'>" + theorems[i].eq + "</td>");
        $('table').append(tr);
    }

}
