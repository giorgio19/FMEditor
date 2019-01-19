const fs = require('fs');
const remote = require('electron').remote;
const dialog = remote.require('electron').dialog;
const SlickCompiler = require('./Antlr/SlickCompiler').SlickCompiler


const padding = '     ';
const spacing = 5;
const equalsUnicode = '\u003D';
const impliesUnicode = '\u21D2';
const followsFromUnicode = '\u21d0';
const lessThanUnicode = '\u003C';
const greaterThanUnicode = '\u003E';
const doesNotEqualUnicode = '\u2262';
const leftBracketUnicode = '\u3008';
const rightBracketUnicode = '\u3009';
const hintUnicode = padding + leftBracketUnicode + '  ' + rightBracketUnicode;
const textSubUnicode = '\u2254';
const genQuantifierUnicode = '\u2605';
const lessThanOrEqUnicode = '\u2264';
const greaterThanorEqUnicode = '\u2265';
const elementOfUnicode = '\u2208';
const notElementOfUnicode = '\u2209';
const properSubsetOfUnicode = '\u2282';
const subsetOfUnicode = '\u2286';
const properSupersetOfUnicode = '\u2283';
const supersetOfUnicode = '\u2287';
const notProperSubsetOfUnicode = '\u2284';
const notSubsetOf = '\u2288';
const notProperSupersetOfUnicode = '\u2285';
const notSupersetOfUnicode = '\u2289';
const unionUnicode = '\u222a';
const intersectionUnicode = '\u2229';
const emptySetUnicode = '\u2205';
const conjuctionUnicode = '\u22c0';
const disjunctionUnicode = '\u22c1';
const equivalesUnicode = '\u2261';
const notEquivalesUnicode = '\u2262';
const doesNotImplyUnicode = '\u21cf';
const doesNotFollowFromUnicode = '\u21cd';
const universalQuantifierUnicode = '\u2200';
const existentialQuanitiferUnicode = '\u2203';
const endProofUnicode = '\u2571';
const integerUnicode = '\u2124';
const naturalUnicode = '\u2115';
const rationalUnicode = '\u211a';
const realUnicode = '\u211d';
const nextUnicode = '\u25cb';
const untilUnicode = '\u02af';
const alwaysUnicode = '\u25a1';
const eventuallyUnicode = '\u25c7';
const booleanSymbol = '𝔹';
const plusUnicode = '\u002B';


var bindings = {
  implies:{
    key: 'n',
    empty:false,
    prefix: /;i$/,
    handler: function(range,context){
        this.quill.deleteText(range.index - 2, 2);
        if(context.offset == 2){
          this.quill.insertText(range.index - 2, impliesUnicode + hintUnicode);
          this.quill.setSelection(range.index + 6);
        } else {
          this.quill.insertText(range.index - 2, ' ' + impliesUnicode + ' ');
          this.quill.setSelection(range.index + 1);
        }
      }
    }
}

var Quill = require('quill');
var editor = new Quill('#editor', {
	modules: {
		toolbar: {container: '#toolbar'},
    keyboard: {bindings: bindings}
	},
	theme: 'snow'
});
// Save and Load files

var loadedfs;

function print() {
  var text = editor.getText();
  var compiler = new SlickCompiler();
  var results = compiler.compile(text);
  console.log(text);
  console.log(results);
}

function saveFile() {
    if(!loadedfs) {
        dialog.showSaveDialog({ filters: [
						{ name: 'txt', extensions: ['txt'] },
            { name: 'html', extensions: ['html'] },
        ]}, function(filename) {
            if(filename === undefined) return;
            writeToFile(editor, filename);
        });
    }
    else {
        writeToFile(editor, loadedfs);
    }
}

function loadFile() {
    dialog.showOpenDialog({ filters: [
        { name: 'txt', extensions: ['txt', 'html'] },
				{ name: 'html', extensions: ['html', 'txt'] },
    ]}, function(filenames) {
        if(filenames === undefined) return;
        var filename = filenames[0];
        readFromFile(editor, filename);
        loadedfs = filename;
    })
}

function writeToFile(editor, filename) {
    var html = editor.getText();
    fs.writeFile(filename, html, function(err) {
        if(err) {
            return console.log(err);
        }
    });
}

function readFromFile(editor, filename) {
    fs.readFile(filename, "utf-8", function(err, data) {
        if(err) {
            console.log(err);
        }
        editor.setText(data);
    });
}
