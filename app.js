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

$(".panel-left").resizable({
  handleSelector: ".splitter",
  resizeHeight: false
});

$(".panel-top").resizable({
  handleSelector: ".splitter-horizontal",
  resizeWidth: false
});

function bindKey(quill, text, prefix, key, shift, replace, hint, pair, quant) {
  // console.log('keySeq type = ' + typeof keySeq);
  // const key: string = (typeof keySeq === 'number' ? keySeq : keySeq.substr(keySeq.length - 1, 1));
  // const prefix: string = (typeof keySeq === 'number' ? '' : (keySeq.length > 1 ? keySeq.substr(0, keySeq.length - 1) : ''));
  let bindObj;
  if (shift) {
    bindObj = {key: key, shiftKey: true};
  } else {
    bindObj = {key: key};
  }
  const anchor = (hint ? '\\s{5}' : '\\S*');
  const bindOptions = {
    collapsed: true,
    prefix: new RegExp(anchor + prefix + '$'),
    // offset: -10
  };
  if (hint) {
    // bindOptions.offset = 5 + prefix.length;
  }
  quill.keyboard.addBinding(bindObj, bindOptions,
  (range, context) => {
    quill.format('bold', false);
    quill.format('italic', false);
    let preLength = prefix.length;
    if (prefix.startsWith('\\')) {
        preLength--;
    }
    const off = (hint ? this.spacing + preLength : preLength);
    if (replace) {
      quill.deleteText(range.index - off, off);
    }
    quill.insertText(range.index - (replace ? off : 0), text);
    quill.setSelection(range.index + (hint ? + text.length - 7 - preLength : preLength + text.length - (pair ? 1 : quant ? 11 : 2)));
  });
}

function bindHint(quill, text, prefix, key, shift, replace) {
  this.bindKey(quill, text, prefix, key, shift, replace, true);
}

function bindPair(quill, text, prefix, key, shift, replace) {
  this.bindKey(quill, text, prefix, key, shift, replace, false, true);
}

function bindQuant(quill, text, prefix, key, shift, replace) {
  this.bindKey(quill, text, prefix, key, shift, replace, false, false, true);
}

var bindings = {
  padEnter:{
    key: 13,
    shiftKey: true,
    handler: function(range,context){
      this.quill.insertText(range.index, '\n     ')
    }
  },
  implies:{
    key: 'm',
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
    },
  follows:{
      key: 'f',
      empty:false,
      prefix: /;f$/,
      handler: function(range,context){
          this.quill.deleteText(range.index - 2, 2);
          if(context.offset == 2){
            this.quill.insertText(range.index - 2, followsFromUnicode + hintUnicode);
            this.quill.setSelection(range.index + 6);
          } else {
            this.quill.insertText(range.index - 2, ' ' + followsFromUnicode + ' ');
            this.quill.setSelection(range.index + 1);
          }
        }
      },
  equals:{
    key: 'q',
    empty:false,
    prefix: /;e$/,
    handler: function(range,context){
        this.quill.deleteText(range.index - 2, 2);
        if(context.offset == 2){
          this.quill.insertText(range.index - 2, equalsUnicode + "  " + hintUnicode);
          this.quill.setSelection(range.index + 8);
        } else {
          this.quill.insertText(range.index - 2, ' ' + equalsUnicode + ' ');
          this.quill.setSelection(range.index + 1);
        }
      }
  },
  less:{
    key: 't',
    empty:false,
    prefix: /;l$/,
    handler: function(range,context){
        this.quill.deleteText(range.index - 2, 2);
        if(context.offset == 2){
          this.quill.insertText(range.index - 2, lessThanUnicode + "  " + hintUnicode);
          this.quill.setSelection(range.index + 8);
        } else {
          this.quill.insertText(range.index - 2, ' ' + lessThanUnicode + ' ');
          this.quill.setSelection(range.index + 1);
        }
      }
  },
  lessE:{
    key: 'e',
    empty:false,
    prefix: /;l$/,
    handler: function(range,context){
        this.quill.deleteText(range.index - 2, 2);
        if(context.offset == 2){
          this.quill.insertText(range.index - 2, lessThanOrEqUnicode + "  " + hintUnicode);
          this.quill.setSelection(range.index + 8);
        } else {
          this.quill.insertText(range.index - 2, ' ' + lessThanOrEqUnicode + ' ');
          this.quill.setSelection(range.index + 1);
        }
      }
  },
  greater:{key: 't',
  empty:false,
  prefix: /;g$/,
  handler: function(range,context){
      this.quill.deleteText(range.index - 2, 2);
      if(context.offset == 2){
        this.quill.insertText(range.index - 2, greaterThanUnicode + "  " + hintUnicode);
        this.quill.setSelection(range.index + 8);
      } else {
        this.quill.insertText(range.index - 2, ' ' + greaterThanUnicode + ' ');
        this.quill.setSelection(range.index + 1);
      }
    }},
  greaterE:{
    key: 'e',
    empty:false,
    prefix: /;g$/,
    handler: function(range,context){
        this.quill.deleteText(range.index - 2, 2);
        if(context.offset == 2){
          this.quill.insertText(range.index - 2, greaterThanorEqUnicode + "  " + hintUnicode);
          this.quill.setSelection(range.index + 8);
        } else {
          this.quill.insertText(range.index - 2, ' ' + greaterThanorEqUnicode + ' ');
          this.quill.setSelection(range.index + 1);
        }
      }
  },
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

function format(){
  editor.format('color', 'red');
  console.log('color should be red');
}

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
						{ name: 'txt', extensions: ['txt'] }
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
        { name: 'txt', extensions: ['txt'] },
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
