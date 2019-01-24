const fs = require('fs');
const remote = require('electron').remote;
const dialog = remote.require('electron').dialog;
const SlickCompiler = require('./Antlr/SlickCompiler').SlickCompiler
const Quill = require('quill');
var Keyboard = Quill.import('modules/keyboard');

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
const conjunctionUnicode = '\u22c0';
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

var bindings = {
  padEnter:{
    key: 13,
    shiftKey: true,
    handler: function(range,context){
      this.quill.insertText(range.index, '\n     ')
    }
  },
  parenthesis:{
    key: '9',
    shiftKey: true,
    handler: function(range,context){
      this.quill.insertText(range.index, ' (  ) ');
      this.quill.setSelection(range.index + 3);
    }
  },
  curlyBrackets:{
    key: 219,
    shiftKey: true,
    handler: function(range,context){
      this.quill.insertText(range.index, ' {  } ');
      this.quill.setSelection(range.index + 3);
    }
  },
  brackets:{
    key: 219,
    handler: function(range,context){
      this.quill.insertText(range.index, ' [  ] ');
      this.quill.setSelection(range.index + 3);
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
  itRelation:{
    key: 't',
    empty:false,
    prefix: /;i$/,
    handler: function(range,context){
      this.quill.deleteText(range.index - 2, 2);
      this.quill.insertText(range.index - 2, ' ≺ ');
    }
  },
  ratRelation:{
    key: 't',
    empty:false,
    prefix: /;ra$/,
    handler: function(range,context){
      this.quill.deleteText(range.index - 3, 3);
      this.quill.insertText(range.index - 3, ' ⪯ ');
    }
  },
  inverseIt: {
    key: 't',
    empty:false,
    prefix: /;ii$/,
    handler: function(range,context){
      this.quill.deleteText(range.index - 3, 3);
      this.quill.insertText(range.index - 3, ' ≻ ');
    }
  },
  inverseRat:{
    key: 't',
    empty:false,
    prefix: /;ira$/,
    handler: function(range,context){
      this.quill.deleteText(range.index - 4, 4);
      this.quill.insertText(range.index - 4, ' ⪰ ');
    }
  },
  equivales:{
    key: 187,
    empty:false,
    prefix: /=$/,
    handler: function(range,context){
      this.quill.deleteText(range.index - 1, 1);
      this.quill.insertText(range.index - 1, ' ' + equivalesUnicode + ' ');
    }
  },
  conjunction:{
    key: 'n',
    empty:false,
    prefix: /;a$/,
    handler: function(range,context){
      this.quill.deleteText(range.index - 2, 2);
      this.quill.insertText(range.index - 2, ' ' + conjunctionUnicode + ' ');
    }
  },
  conjunction2:{
    key: '7',
    shiftKey: true,
    empty:false,
    prefix: /&$/,
    handler: function(range,context){
      this.quill.deleteText(range.index - 1, 1);
      this.quill.insertText(range.index - 1, ' ' + conjunctionUnicode + ' ');
    }
  },
  disjunction:{
    key: 'r',
    empty:false,
    prefix: /;o$/,
    handler: function(range,context){
      this.quill.deleteText(range.index - 2, 2);
      this.quill.insertText(range.index - 2, ' ' + disjunctionUnicode + ' ');
    }
  },
  disjunction2:{
    key: 220,
    shiftKey: true,
    empty:false,
    prefix: /[|]$/,
    handler: function(range,context){
      this.quill.deleteText(range.index - 1, 1);
      this.quill.insertText(range.index - 1, ' ' + disjunctionUnicode + ' ');
    }
  }
}

var editor = new Quill('#editor', {
	modules: {
		// toolbar: {container: '#toolbar'},
    keyboard: {bindings: bindings}
  },
  placeholder: '     Enter your proof...',
	theme: 'bubble'
});
    // this.bindKey(this.editor, '¬', '!', '1', true, true);                                                  // negation
    // this.bindKey(this.editor, ' ' + notEquivalesUnicode + ' ', '!', 187, false, true);                //not equivales
    // this.bindKey(this.editor, ' ' + textSubUnicode + ' ', ':', 187, false, true);                                  // replace by/gets
    // this.bindKey(this.editor, ' → ', '-', 190, true, true);                                                 // right arrow
    // this.bindKey(this.editor, ' ' + leftBracketUnicode + ' ', ';l', 'b', false, true);                             // left hint bracket
    // this.bindKey(this.editor, ' ' + rightBracketUnicode, ';r', 'b', false, true);                                  // right hint bracket
    // this.bindKey(this.editor, ' ' + elementOfUnicode + ' ', ';e', 'l', false, true);                               // element of
    // this.bindKey(this.editor, ' ' + unionUnicode + ' ', ';u', 'n', false, true);                                   // union
    // this.bindKey(this.editor, ' ' + unionUnicode + ' ', '\\|', 220, false, true);                                  // union
    // this.bindKey(this.editor, ' ' + intersectionUnicode + ' ', ';i', 'n', false, true);                            // intersection
    // this.bindKey(this.editor, ' ' + intersectionUnicode + ' ', '&', '7', false, true);                             // intersection
    // this.bindKey(this.editor, ' ÷ ', '/', 191, false, true);                                                       // division symbol
    // this.bindKey(this.editor, ' ⋅ ', '\\*', '8', true, true);                                               // multiplication symbol
    // this.bindKey(this.editor, ' ' + genQuantifierUnicode + ' ', ';s', 't', false, true);                           // star symbol
    // this.bindKey(this.editor, ' ' + universalQuantifierUnicode, ';f', 'a', false, true);                           // forAll symbol
    // this.bindKey(this.editor, ' ' + existentialQuanitiferUnicode, ';e', 'x', false, true);                         // exists symbol

    // this.bindKey(this.editor, 'Name:\t\t\t\t\nPin:\t\t\t\t\t\nClass:\t\t\t\t\nAssignment:\t\n\nProve ', ';hea', 'd');
    // this.bindHint(this.editor, 'Prove ', ';p', 'r');
    // this.bindKey(this.editor, 'by showing equivalence to previous theorem', ';', '1');
    // this.bindKey(this.editor, 'by showing the LHS is equivalent to the RHS', ';', '2');
    // this.bindKey(this.editor, 'by showing the RHS is equivalent to the LHS', ';', '3');
    // this.bindKey(this.editor, 'by showing the LHS implies the RHS', ';', '4');
    // this.bindKey(this.editor, 'by showing the LHS follows from the RHS', ';', '5');
    // this.bindKey(this.editor, 'by assuming the conjuncts of the antecedent', ';', '6');
    // this.bindKey(this.editor, '\nwhich is ', ';', 'w');
    // this.bindKey(this.editor, 'textual substitution ', ';t', 's');

    // this.bindQuant(this.editor, '(' + this.genQuantifierUnicode + ' |  : )', ';g', 'q');
    // this.bindQuant(this.editor, '(' + this.universalQuantifierUnicode + ' |  : )', ';u', 'q');
    // this.bindQuant(this.editor, '(' + this.existentialQuanitiferUnicode + ' |  : )', ';e', 'q');
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


// keeping in case can get it to work at another time

// function bindKey(quill, text, prefix, key, shift, replace, hint, pair, quant) {
//   // console.log('keySeq type = ' + typeof keySeq);
//   // const key: string = (typeof keySeq === 'number' ? keySeq : keySeq.substr(keySeq.length - 1, 1));
//   // const prefix: string = (typeof keySeq === 'number' ? '' : (keySeq.length > 1 ? keySeq.substr(0, keySeq.length - 1) : ''));
//   let bindObj;
//   if (shift) {
//     bindObj = {key: key, shiftKey: true};
//   } else {
//     bindObj = {key: key};
//   }
//   const anchor = (hint ? '\\s{5}' : '\\S*');
//   const bindOptions = {
//     collapsed: true,
//     prefix: new RegExp(anchor + prefix + '$'),
//     // offset: -10
//   };
//   if (hint) {
//     // bindOptions.offset = 5 + prefix.length;
//   }
//   console.log("bindOptions: " + bindOptions + '\nPrefix: '+ prefix);
//   this.editor.keyboard.addBinding(bindObj, bindOptions,
//   (range, context) => {
//     this.editor.format('bold', false);
//     this.editor.format('italic', false);
//     let preLength = prefix.length;
//     if (prefix.startsWith('\\')) {
//         preLength--;
//     }
//     if (pair){
//       const off = (hint ? this.spacing + preLength : preLength);
//       this.editor.deleteText(range.index - prefix.length, prefix.length);
//       this.editor.insertText(range.index - prefix.length , text);
//     } else {
//     const off = (hint ? this.spacing + preLength : preLength);
//     this.editor.deleteText(range.index - prefix.length, prefix.length);
//     this.editor.insertText(range.index - prefix.length , text);
//     // this.editor.setSelection(range.index + (hint ? + text.length - 7 - preLength : preLength + text.length - (pair ? 3 : quant ? 11 : 2)));
//     console.log("prefix after everything: " + prefix);
//   }
//   });
// }

// function bindHint(quill, text, prefix, key, shift, replace) {
//   this.bindKey(this.editor, text, prefix, key, shift, replace, true);
//   console.log('bindhint ' + prefix);
// }

// function bindPair(quill, text, prefix, key, shift, replace) {
//   this.bindKey(this.editor, text, prefix, key, shift, replace, false, true);
// }

// function bindQuant(quill, text, prefix, key, shift, replace) {
//   this.bindKey(this.editor, text, prefix, key, shift, replace, false, false, true);
// }
