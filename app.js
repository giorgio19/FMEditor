const padding = '     ';
const spacing = 5;
const equalsUnicode = '\u003D';
const impliesUnicode = '\u21D2';
const followsFromUnicode = '\u21d0 ';
const lessThanUnicode = '\u003C';
const greaterThanUnicode = '\u003E';
const doesNotEqualUnicode = '\u2262';
const leftBracketUnicode = '\u3008';
const rightBracketUnicode = '\u3009';
const hintUnicode = padding + leftBracketUnicode + rightBracketUnicode;
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
  enter: {
    key: 13,
    handler: function(range,context){
      // this.hideSymbols = false;
      // this.previousEditorSelection = this.editorInstance.getSelection();
      this.quill.insertText(this.quill.getSelection(), '\n      ');
      // this.previousEditorSelection = this.editorInstance.getSelection();
    }
  },
  follows:{
    key: 'f',
    empty: false,
    collapsed: true,
    prefix: /[/(){}╱∏∑◇○ʯ□≡=¬≢≠≥≤⇒⇐⇍⇏≔<>∈∅Ʊ⊂⊃⊆⊇∉⊄⊅⊈⊉∪∩~⋅*∘∙÷×Ρ↓↑←→ ℕℤℚℝ𝔹〈〉◃▹σ★∀∃⋁⋀≺⪯⪰≻ΩΟΘπ#𝜙⨝+-^a-zA-Zs]*;f$/,
    handler: function(range, context){
      if (context.offset == 8){
        this.quill.deleteText(range.index - 8, 9);
        this.quill.insertText(range.index, followsFromUnicode + '     \u3008  \u3009');
        this.quill.setSelection(range.index + 1);
      } else {
        this.quill.deleteText(range.index - 2, 2);
        this.quill.insertText(range.index - 2, ' ' + followsFromUnicode);
        this.quill.setSelection(range.index + 1);
      }
    }
  },
  implies: {
    key: 'm',
    collapsed: true,
    prefix: /[/(){}╱∏∑◇○ʯ□≡=¬≢≠≥≤⇒⇐⇍⇏≔<>∈∅Ʊ⊂⊃⊆⊇∉⊄⊅⊈⊉∪∩~⋅*∘∙÷×Ρ↓↑←→ ℕℤℚℝ𝔹〈〉◃▹σ★∀∃⋁⋀≺⪯⪰≻ΩΟΘπ#𝜙⨝+-^a-zA-Zs]*;i$/,
    handler: function(range, context){
      if(context.offset == 8){
        this.quill.deleteText(range.index - 8, 9);
        this.quill.insertText(range.index + 1, impliesUnicode + '      \u3008  \u3009');
        this.quill.setSelection(range.index + 1);
      } else {
        this.quill.deleteText(range.index - 2, 2);
        this.quill.insertText(range.index - 2, ' ' + impliesUnicode + ' ');
        this.quill.setSelection(range.index + 1);
      }
    }
  }
}


var editor = new Quill('#editor', {
	modules: {
		toolbar: {container: '#toolbar'},
    keyboard: {bindings: bindings}
	},
	theme: 'snow'

});
