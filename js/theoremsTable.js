const theoremsStr = require('./Antlr/theoremsFormat.json');

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
  var acc = document.getElementsByClassName("accordion");
  var i;

  for (i = 0; i < acc.length; i++) {
    acc[i].addEventListener("click", function() {
      this.classList.toggle("active");
      var panel = this.nextElementSibling;
      if (panel.style.maxHeight){
        panel.style.maxHeight = null;
      } else {
        panel.style.maxHeight = panel.scrollHeight + "px";
      }
    });
  }
});

function createTable(){
    var theorems = theoremsStr.theorems;
    var tr;
    var i = 0;
    var str = "<button class='accordion'>" + theorems[i].section + "</button><div class='panel'><table>"
         + "<tr>"
            + "<th class='centerIt'>Rule</th>"
            + "<th class='centerIt'>Name</th>"
            + "<th class='centerIt'>Equation</th>"
        "</tr>";
    for (i; i < theorems.length; i++) {
        str = str + "<tr/>"
        // theorems[i].section != undefined ? tr.append("<button class='accordion'>" + theorems[i].section + "</button><div class='panel'>");
        str = str + "<td>" + "(" + theorems[i].rule.bold() + ")" + "</td>";
        // theorems[i].name != undefined ? tr.append("<td class = name>" + theorems[i].name + "</td>") : tr.append("<td class = name> </td>");
        // theorems[i].eq != undefined ?
        //   tr.append("<td class='eq'>" + theorems[i].eq + "</td>")
        //   : tr.append("<td class='eq'>" + theorems[i].eqa + "</td>");
        $('table').append(str);

  }  $("#right").append(str + "</div>");}
