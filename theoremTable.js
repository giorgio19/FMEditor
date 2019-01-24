function createTable(){
   var json =  [
      {
        "section": "Equivalence and $\\textit{true}$",
        "type": "axiom",
        "rule": "3.1",
        "eq": "$((p \\equiv q) \\equiv r)\\ \\equiv\\ (p \\equiv (q \\equiv r))$",
        "name": "associativity of $\\,\\equiv$"
      },
      {
        "type": "axiom",
        "rule": "3.2",
        "eq": "$p \\equiv q \\equiv q \\equiv p$",
        "name": "symmetry of $\\,\\equiv$"
      },
      {
        "type": "axiom",
        "rule": "3.3",
        "eq": "$\\textit{true} \\equiv q \\equiv q$",
        "name": "identity of $\\,\\equiv$"
      },
      {
        "rule": "3.4",
        "eq": "$\\textit{true}$"
      },
      {
        "rule": "3.5",
        "eq": "$p \\equiv p$",
        "name": "reflexivity of $\\,\\equiv$"
      },
  
  
  
      {
        "section": "Negation, inequivalence and $\\textit{false}$",
        "type": "axiom",
        "rule": "3.8",
        "eq": "$\\textit{false} \\equiv \\neg \\textit{true}$",
        "name": "definition of \\textit{false}"
      },
      {
        "type": "axiom",
        "rule": "3.9",
        "eq": "$\\neg(p \\equiv q)\\ \\equiv\\ \\neg p \\equiv q$",
        "name": "distributivity of $\\neg$ over $\\equiv$"
      },
      {
        "type": "axiom",
        "rule": "3.10",
        "eq": "$(p \\not \\equiv q)\\ \\equiv\\ \\neg(p \\equiv q)$",
        "name": "definition of $\\not \\equiv$"
      },
      {
        "rule": "3.11",
        "eq": "$\\neg p \\equiv q \\equiv p \\equiv \\neg q$"
      },
      {
        "rule": "3.12",
        "eq": "$\\neg \\neg p \\equiv p$",
        "name": "double negation"
      },
      {
        "rule": "3.13",
        "eq": "$\\neg \\textit{false} \\equiv \\textit{true}$",
        "name": "negation of \\textit{false}"
      },
      {
        "rule": "3.14",
        "eq": "$(p \\not \\equiv q)\\ \\equiv\\ \\neg p \\equiv q$"
      },
      {
        "rule": "3.15",
        "eq": "$\\neg p \\equiv p \\equiv \\textit{false}$"
      },
      {
        "rule": "3.16",
        "eq": "$(p \\not \\equiv q)\\ \\equiv\\ (q \\not \\equiv p)$",
        "name": "symmetry of $\\not \\equiv$"
      },
      {
        "rule": "3.17",
        "eq": "$((p \\not \\equiv q) \\not \\equiv r)\\ \\equiv\\ (p \\not \\equiv(q \\not \\equiv r))$",
        "name": "associativity of $\\not \\equiv$"
      },
      {
        "rule": "3.18",
        "eq": "$((p \\not \\equiv q) \\equiv r)\\ \\equiv\\ (p \\not \\equiv (q \\equiv r))$",
        "name": "mutual associativity"
      },
      {
        "rule": "3.19",
        "eq": "$p \\not \\equiv q \\equiv r \\ \\ \\equiv \\ \\ p \\equiv q \\not \\equiv r$",
        "name": "mutual interchangeability"
      },
      {
        "rule": "3.19.1",
        "eq": "$p \\not \\equiv p \\not \\equiv q \\ \\ \\equiv \\ \\ q$"
      },
  
  
  
      {
        "section": "Disjunction",
        "type": "axiom",
        "rule": "3.24",
        "eq": "$p \\vee q\\ \\equiv\\ q \\vee p$",
        "name": "symmetry of $\\vee$"
      },
      {
        "type": "axiom",
        "rule": "3.25",
        "eq": "$(p \\vee q) \\vee r\\ \\equiv\\ p \\vee (q \\vee r)$",
        "name": "associativity of $\\vee$"
      },
      {
        "type": "axiom",
        "rule": "3.26",
        "eq": "$p \\vee p\\ \\equiv\\ p$",
        "name": "idempotency of $\\vee$"
      },
      {
        "type": "axiom",
        "rule": "3.27",
        "eq": "$p \\vee (q \\equiv r)\\ \\equiv\\ p \\vee q\\ \\equiv\\ p \\vee r$",
        "name": "distributivity of $\\vee$ over $\\equiv$"
      },
      {
        "type": "axiom",
        "rule": "3.28",
        "eq": "$p \\vee \\neg p$",
        "name": "excluded middle"
      },
      {
        "rule": "3.29",
        "eq": "$p \\vee \\textit{true}\\ \\equiv\\ \\textit{true}$",
        "name": "zero of $\\vee$"
      },
      {
        "rule": "3.30",
        "eq": "$p \\vee \\textit{false}\\ \\equiv\\ p$",
        "name": "identity of $\\vee$"
      },
      {
        "rule": "3.31",
        "eq": "$p \\vee (q \\vee r)\\ \\equiv\\ (p \\vee q) \\vee (p \\vee r)$",
        "name": "distributivity of $\\vee$ over $\\vee$"
      },
      {
        "rule": "3.32",
        "eq": "$p \\vee q\\ \\equiv\\ p \\vee \\neg q\\ \\equiv\\ p$"
      },
  
  
  
      {
        "section": "Conjunction",
        "type": "axiom",
        "rule": "3.35",
        "eq": "$p \\wedge q\\ \\equiv\\ p\\ \\equiv\\ q\\ \\equiv\\ p \\vee q$",
        "name": "golden rule"
      },
      {
        "rule": "3.36",
        "eq": "$p \\wedge q\\ \\equiv\\ q \\wedge p$",
        "name": "symmetry of $\\wedge$"
      },
      {
        "rule": "3.37",
        "eq": "$(p \\wedge q) \\wedge r\\ \\equiv\\ p \\wedge (q \\wedge r)$",
        "name": "associativity of $\\wedge$"
      },
      {
        "rule": "3.38",
        "eq": "$p \\wedge p\\ \\equiv\\ p$",
        "name": "idempotency of $\\wedge$"
      },
      {
        "rule": "3.39",
        "eq": "$p \\wedge \\textit{true}\\ \\equiv\\ p$",
        "name": "identity of $\\wedge$"
      },
      {
        "rule": "3.40",
        "eq": "$p \\wedge \\textit{false}\\ \\equiv\\ \\textit{false}$",
        "name": "zero of $\\wedge$"
      },
      {
        "rule": "3.41",
        "eq": "$p \\wedge (q \\wedge r)\\ \\equiv\\ (p \\wedge q) \\wedge (p \\wedge r)$",
        "name": "distributivity of $\\wedge$ over $\\wedge$"
      },
      {
        "rule": "3.42",
        "eq": "$p \\wedge \\neg p\\ \\equiv\\ \\textit{false}$",
        "name": "contradiction"
      },
      {
        "rule": "3.43a",
        "eq": "$p \\wedge (p \\vee q)\\ \\equiv\\ p$",
        "name": "absorption"
      },
      {
        "rule": "3.43b",
        "eq": "$p \\vee (p \\wedge q)\\ \\equiv\\ p$",
        "name": "absorption"
      },
      {
        "rule": "3.44a",
        "eq": "$p \\wedge (\\neg p \\vee q)\\ \\equiv\\ p \\wedge q$",
        "name": "absorption"
      },
      {
        "rule": "3.44b",
        "eq": "$p \\vee (\\neg p \\wedge q)\\ \\equiv\\ p \\vee q$",
        "name": "absorption"
      },
      {
        "rule": "3.45",
        "eq": "$p \\vee (q \\wedge r)\\ \\equiv\\ (p \\vee q) \\wedge (p \\vee r)$",
        "name": "distributivity of $\\vee$ over $\\wedge$"
      },
      {
        "rule": "3.46",
        "eq": "$p \\wedge (q \\vee r)\\ \\equiv\\ (p \\wedge q) \\vee (p \\wedge r)$",
        "name": "distributivity of $\\wedge$ over $\\vee$"
      },
      {
        "rule": "3.46.1",
        "eq": "$(p \\wedge q) \\vee (\\neg p \\wedge r) \\vee (q \\wedge r)\\ \\equiv\\ (p \\wedge q) \\vee (\\neg p \\wedge r)$",
        "name": "consensus"
      },
      {
        "rule": "3.47a",
        "eq": "$\\neg (p \\wedge q)\\ \\equiv\\ \\neg p \\vee \\neg q$",
        "name": "De Morgan"
      },
      {
        "rule": "3.47b",
        "eq": "$\\neg (p \\vee q)\\ \\equiv\\ \\neg p \\wedge \\neg q$",
        "name": "De Morgan"
      },
      {
        "rule": "3.48",
        "eq": "$p \\wedge q\\ \\equiv\\ p \\wedge \\neg q\\ \\equiv\\ \\neg p$"
      },
      {
        "rule": "3.49",
        "eq": "$p \\wedge (q \\equiv r)\\ \\equiv\\ p \\wedge q\\ \\equiv\\ p \\wedge r\\ \\equiv\\ p$"
      },
      {
        "rule": "3.50",
        "eq": "$p \\wedge (q \\equiv p)\\ \\equiv\\ p \\wedge q$"
      },
      {
        "rule": "3.51",
        "eq": "$(p \\equiv q) \\wedge (r \\equiv p)\\ \\equiv\\ (p \\equiv q) \\wedge (r \\equiv q)$",
        "name": "replacement"
      },
      {
        "rule": "3.52",
        "eq": "$p \\equiv q\\ \\equiv\\ (p \\wedge q) \\vee (\\neg p \\wedge \\neg q)$",
        "name": "equivalence"
      },
      {
        "rule": "3.53",
        "eq": "$p \\not \\equiv q\\ \\equiv\\ (\\neg p \\wedge q) \\vee (p \\wedge \\neg q)$",
        "name": "exclusive or"
      },
      {
        "rule": "3.55",
        "eq": "$(p \\wedge q) \\wedge r\\ \\equiv\\ p\\ \\equiv\\ q\\ \\equiv\\ r\\ \\equiv\\ p \\vee q\\ \\equiv\\ q \\vee r\\ \\equiv\\ r \\vee p\\ \\equiv\\ p \\vee q \\vee r$"
      },
  
  
  
      {
        "section": "Implication",
        "type": "axiom",
        "rule": "3.57",
        "eq": "$p \\Rightarrow q\\ \\equiv\\ p \\vee q\\ \\equiv\\ q$",
        "name": "definition of implication"
      },
      {
        "type": "axiom",
        "rule": "3.58",
        "eq": "$p \\Leftarrow q\\ \\equiv\\ q \\Rightarrow p$",
        "name": "consequence"
      },
      {
        "rule": "3.59",
        "eq": "$p \\Rightarrow q\\ \\equiv\\ \\neg p \\vee q$",
        "name": "implication"
      },
      {
        "rule": "3.60",
        "eq": "$p \\Rightarrow q\\ \\equiv\\ p \\wedge q\\ \\equiv\\ p$",
        "name": "implication"
      },
      {
        "rule": "3.61",
        "eq": "$p \\Rightarrow q\\ \\equiv\\ \\neg q \\Rightarrow \\neg p$",
        "name": "contrapositive"
      },
      {
        "rule": "3.62",
        "eq": "$p \\Rightarrow (q \\equiv r)\\ \\equiv\\ p \\wedge q\\ \\equiv\\ p \\wedge r$"
      },
      {
        "rule": "3.63",
        "eq": "$p \\Rightarrow (q \\equiv r)\\ \\equiv\\ (p \\Rightarrow q)\\ \\equiv\\ (p \\Rightarrow r)$",
        "name": "distributivity of $\\Rightarrow$ over $\\equiv$"
      },
      {
        "rule": "3.63.1",
        "eq": "$p \\Rightarrow q \\wedge r\\ \\equiv\\ (p \\Rightarrow q) \\wedge (p \\Rightarrow r)$",
        "name": "distributivity of $\\Rightarrow$ over $\\wedge$"
      },
      {
        "rule": "3.63.2",
        "eq": "$p \\Rightarrow q \\vee r\\ \\equiv\\ (p \\Rightarrow q) \\vee (p \\Rightarrow r)$",
        "name": "distributivity of $\\Rightarrow$ over $\\vee$"
      },
      {
        "rule": "3.64",
        "eq": "$p \\Rightarrow (q \\Rightarrow r)\\ \\equiv\\ (p \\Rightarrow q) \\Rightarrow (p \\Rightarrow r)$"
      },
      {
        "rule": "3.65",
        "eq": "$p \\wedge q \\Rightarrow r\\ \\equiv\\ p \\Rightarrow (q \\Rightarrow r)$",
        "name": "shunting"
      },
      {
        "rule": "3.66",
        "eq": "$p \\wedge (p \\Rightarrow q)\\ \\equiv\\ p \\wedge q$"
      },
      {
        "rule": "3.67",
        "eq": "$p \\wedge (q \\Rightarrow p)\\ \\equiv\\ p$"
      },
      {
        "rule": "3.68",
        "eq": "$p \\vee (p \\Rightarrow q)\\ \\equiv\\ \\textit{true}$"
      },
      {
        "rule": "3.69",
        "eq": "$p \\vee (q \\Rightarrow p)\\ \\equiv\\ q \\Rightarrow p$"
      },
      {
        "rule": "3.70",
        "eq": "$p \\vee q \\Rightarrow p \\wedge q\\ \\equiv\\ p\\ \\equiv\\ q$"
      },
      {
        "rule": "3.71",
        "eq": "$p \\Rightarrow p$",
        "name": "reflexivity of $\\Rightarrow$"
      },
      {
        "rule": "3.72",
        "eq": "$p \\Rightarrow \\textit{true}\\ \\equiv\\ \\textit{true}$",
        "name": "right zero of $\\Rightarrow$"
      },
      {
        "rule": "3.73",
        "eq": "$\\textit{true} \\Rightarrow p\\ \\equiv\\ p$",
        "name": "left identity of $\\Rightarrow$"
      },
      {
        "rule": "3.74",
        "eq": "$p \\Rightarrow false\\ \\equiv\\ \\neg p$"
      },
      {
        "rule": "3.74.1",
        "eq": "$\\neg p \\Rightarrow false\\ \\equiv\\ p$"
      },
      {
        "rule": "3.75",
        "eq": "$\\textit{false} \\Rightarrow p\\ \\equiv\\ \\textit{true}$"
      },
      {
        "rule": "3.76a",
        "eq": "$p \\Rightarrow p \\vee q$",
        "name": "weakening/strengthening"
      },
      {
        "rule": "3.76b",
        "eq": "$p \\wedge q \\Rightarrow p$",
        "name": "weakening/strengthening"
      },
      {
        "rule": "3.76c",
        "eq": "$p \\wedge q \\Rightarrow p \\vee q$",
        "name": "weakening/strengthening"
      },
      {
        "rule": "3.76d",
        "eq": "$p \\vee (q \\wedge r) \\Rightarrow p \\vee q$",
        "name": "weakening/strengthening"
      },
      {
        "rule": "3.76e",
        "eq": "$p \\wedge q \\Rightarrow p \\wedge (q \\vee r)$",
        "name": "weakening/strengthening"
      },
      {
        "rule": "3.76.1",
        "eq": "$p \\wedge q \\Rightarrow p \\vee r$",
        "name": "weakening/strengthening"
      },
      {
        "rule": "3.76.2",
        "eq": "$(p \\Rightarrow q) \\Rightarrow ((q \\Rightarrow r) \\Rightarrow (p \\Rightarrow r))$"
      },
      {
        "rule": "3.77",
        "eq": "$p \\wedge (p \\Rightarrow q) \\Rightarrow q$",
        "name": "modus ponens"
      },
      {
        "rule": "3.77.1",
        "eq": "$(p \\Rightarrow q) \\wedge \\neg q \\Rightarrow \\neg p$",
        "name": "modus tollens"
      },
      {
        "rule": "3.78",
        "eq": "$(p \\Rightarrow r) \\wedge (q \\Rightarrow r)\\ \\equiv\\ (p \\vee q \\Rightarrow r)$"
      },
      {
        "rule": "3.79",
        "eq": "$(p \\Rightarrow r) \\wedge (\\neg p \\Rightarrow r)\\ \\equiv\\ r$"
      },
      {
        "rule": "3.80",
        "eq": "$(p \\Rightarrow q) \\wedge (q \\Rightarrow p)\\ \\equiv\\ (p \\equiv q)$",
        "name": "mutual implication"
      },
      {
        "rule": "3.81",
        "eq": "$(p \\Rightarrow q) \\wedge (q \\Rightarrow p) \\Rightarrow (p \\equiv q)$",
        "name": "antisymmetry"
      },
      {
        "rule": "3.82a",
        "eq": "$(p \\Rightarrow q) \\wedge (q \\Rightarrow r) \\Rightarrow (p \\Rightarrow r)$",
        "name": "transitivity"
      },
      {
        "rule": "3.82b",
        "eq": "$(p \\equiv q) \\wedge (q \\Rightarrow r) \\Rightarrow (p \\Rightarrow r)$",
        "name": "transitivity"
      },
      {
        "rule": "3.82c",
        "eq": "$(p \\Rightarrow q) \\wedge (q \\equiv r) \\Rightarrow (p \\Rightarrow r)$",
        "name": "transitivity"
      },
      {
        "rule": "3.82.1",
        "eq": "$(p \\equiv q) \\wedge (q \\equiv r) \\Rightarrow (p \\equiv r)$",
        "name": "transitivity of $\\equiv$"
      },
      {
        "rule": "3.82.2",
        "eq": "$(p \\equiv q) \\Rightarrow (p \\Rightarrow q)$"
      },
  
  
  
      {
        "section": "Leibniz as an axiom",
        "type": "axiom",
        "rule": "3.83",
        "eq": "$e = f \\Rightarrow E^z_e = E^z_f$",
        "name": "Leibniz"
      },
      {
        "rule": "3.84a",
        "eq": "$(e = f) \\wedge E^z_e\\ \\equiv\\ (e = f) \\wedge E^z_f$",
        "name": "substitution"
      },
      {
        "rule": "3.84b",
        "eq": "$(e = f) \\Rightarrow E^z_e\\ \\equiv\\ (e = f) \\Rightarrow E^z_f$",
        "name": "substitution"
      },
      {
        "rule": "3.84c",
        "eq": "$q \\wedge (e = f) \\Rightarrow E^z_e\\ \\equiv\\ q \\wedge (e = f) \\Rightarrow E^z_f$",
        "name": "substitution"
      },
      {
        "rule": "3.85a",
        "eq": "$p \\Rightarrow E^z_p\\ \\equiv\\ p \\Rightarrow E^z_\\textit{true}$</li>",
        "name": "replace by $\\textit{true}$"
      },
      {
        "rule": "3.85b",
        "eq": "$q \\wedge p \\Rightarrow E^z_p\\ \\equiv\\ q \\wedge p \\Rightarrow E^z_\\textit{true}$",
        "name": "replace by $\\textit{true}$"
      },
      {
        "rule": "3.86a",
        "eq": "$E^z_p \\Rightarrow p\\ \\equiv\\ E^z_\\textit{false} \\Rightarrow p$</li>",
        "name": "replace by $\\textit{false}$"
      },
      {
        "rule": "3.86b",
        "eq": "$E^z_p \\Rightarrow p \\vee q\\ \\equiv\\ E^z_\\textit{false} \\Rightarrow p \\vee q$",
        "name": "replace by $\\textit{false}$"
      },
      {
        "rule": "3.87",
        "eq": "$p \\wedge E^z_p\\ \\equiv\\ p \\wedge E^z_\\textit{true}$",
        "name": "replace by $\\textit{true}$"
      },
      {
        "rule": "3.88",
        "eq": "$p \\vee E^z_p\\ \\equiv\\ p \\vee E^z_\\textit{false}$",
        "name": "replace by $\\textit{false}$"
      },
      {
        "rule": "3.89",
        "eq": "$E^z_p\\ \\equiv\\ (p \\wedge E^z_\\textit{true}) \\vee (\\neg p \\wedge E^z_\\textit{false})$",
        "name": "Shannon"
      },
      {
        "rule": "3.89.1",
        "eq": "$E^z_\\mathit{true} \\wedge E^z_\\mathit{false}\\ \\Rightarrow\\ E^z_p$"
      },
  
  
  
      {
        "section": "Additional theorems concerning implication",
        "rule": "4.1",
        "eq": "$p \\Rightarrow (q \\Rightarrow p)$"
      },
      {
        "rule": "4.2",
        "eq": "$(p \\Rightarrow q) \\Rightarrow (p \\vee r \\Rightarrow q \\vee r)$",
        "name": "monotonicity of $\\vee$"
      },
      {
        "rule": "4.3",
        "eq": "$(p \\Rightarrow q) \\Rightarrow (p \\wedge r \\Rightarrow q \\wedge r)$",
        "name": "monotonicity of $\\wedge$"
      },
  
  
  
      {
        "section": "Proof technique metatheorems",
        "rule": "4.4",
        "eq": "To prove $P_1 \\wedge P_2 \\Rightarrow Q$, assume $P_1$ and $P_2$, and prove $Q$.",
        "name": "assume conjuncts of antecedent"
      },
      {
        "rule": "4.5",
        "eq": "If $E^z_\\textit{true}$ and $E^z_\\textit{false}$ are theorems, then so is $E^z_p$.",
        "name": "case analysis"
      },
      {
        "rule": "4.6",
        "eq": "$(p \\vee q \\vee r) \\wedge (p \\Rightarrow s) \\wedge (q \\Rightarrow s) \\wedge (r \\Rightarrow s)\\ \\Rightarrow\\ s$",
        "name": "case analysis"
      },
      {
        "rule": "4.7",
        "eq": "To prove $P \\equiv Q$, prove $P \\Rightarrow Q$ and $Q \\Rightarrow P$.",
        "name": "mutual implication"
      },
      {
        "rule": "4.7.1",
        "eq": "To prove $P$, prove $\\textit{true} \\Rightarrow P$.",
        "name": "truth implication"
      },
      {
        "rule": "4.9",
        "eq": "To prove $P$, prove $\\neg P \\Rightarrow \\textit{false}$.",
        "name": "proof by contradiction"
      },
      {
        "rule": "4.12",
        "eq": "To prove $P \\Rightarrow Q$, prove $\\neg Q \\Rightarrow \\neg P$.",
        "name": "proof by contrapositive"
      },
  
  
  
      {
        "section": "General laws of quantification",
        "type": "axiom",
        "rule": "8.13",
        "eq": "$(\\star x\\mid\\textit{false}:P) = u$",
        "name": "empty range rule"
      },
      {
        "type": "axiom",
        "rule": "8.14",
        "eq": "$(\\star x\\mid x = E:P) = P[x:=E]$",
        "name": "one-point rule"
      },
      {
        "type": "axiom",
        "rule": "8.15",
        "eq": "$(\\star x\\mid R:P) \\star (\\star x \\mid R: Q) = (\\star x \\mid R : P \\star Q)$",
        "name": "distributivity"
      },
      {
        "type": "axiom",
        "rule": "8.16",
        "eq": "$(\\star x\\mid R \\vee S : P) = (\\star x \\mid R: P) \\star (\\star x \\mid S : P)$",
        "name": "range split for independent R and S"
      },
      {
        "type": "axiom",
        "rule": "8.17",
        "eq": "$(\\star x\\mid R \\vee S : P) \\star (\\star x \\mid R \\wedge S : P) = (\\star x \\mid R : P) \\star (\\star x \\mid S : P)$",
        "name": "range split"
      },
      {
        "type": "axiom",
        "rule": "8.18",
        "eq": "$(\\star x\\mid R \\vee S : P) = (\\star x\\mid R : P) \\star (\\star x\\mid S : P)$",
        "name": "range split for idempotent $\\star$"
      },
      {
        "type": "axiom",
        "rule": "8.19",
        "eq": "$(\\star x\\mid R : (\\star y\\mid Q : P)) = (\\star y\\mid R : (\\star x \\mid Q : P))$",
        "name": "interchange of dummies"
      },
      {
        "type": "axiom",
        "rule": "8.20",
        "eq": "$(\\star x, y \\mid R \\wedge Q : P) = (\\star x \\wedge R : (\\star y \\mid Q : P))$",
        "name": "nesting"
      },
      {
        "type": "axiom",
        "rule": "8.21",
        "eq": "$(\\star x \\mid R : P) = (\\star y \\mid R[x := y] : P[x := y])$",
        "name": "dummy renaming"
      },
      {
        "rule": "8.22",
        "eq": "$(\\star x \\mid R : P) = (\\star y \\mid R[x := f.y]: P[x := f.y])$",
        "name": "change of dummy"
      },
      {
        "rule": "8.23a",
        "eq": "$(\\star i \\mid 0 \\le i < n + 1 : P) = (\\star i \\mid 0 \\le i < n : P) \\star P[i := n]$",
        "name": "split off term"
      },
      {
        "rule": "8.23b",
        "eq": "$(\\star i \\mid 0 \\le i < n + 1 : P) = P[i := 0] \\star (\\star i \\mid 0 < i < n + 1: P)$",
        "name": "split off term"
      },
      {
        "section": "Universal quantification",
        "subtext": "Notation: $\\star x \\mid : P)$ means $(\\star x \\mid \\textit{true} : P)$.",
        "type": "axiom",
        "rule": "9.2",
        "eq": "$(\\forall x \\mid R : P) \\equiv (\\forall x \\mid : R \\Rightarrow P)$",
        "name": "trading"
      },
      {
        "rule": "9.3a",
        "eq": "$(\\forall x \\mid R : P) \\equiv (\\forall x \\mid : \\neg R \\vee P)$",
        "name": "trading"
      },
      {
        "rule": "9.3b",
        "eq": "$(\\forall x \\mid R : P) \\equiv (\\forall x \\mid : R \\wedge P \\equiv R)$",
        "name": "trading"
      },
      {
        "rule": "9.3c",
        "eq": "$(\\forall x \\mid R : P) \\equiv (\\forall x \\mid : R \\vee P \\equiv P)$",
        "name": "trading"
      },
      {
        "rule": "9.4a",
        "eq": "$(\\forall x \\mid Q \\wedge R : P) \\equiv (\\forall x \\mid Q : R \\Rightarrow P)$",
        "name": "trading"
      },
      {
        "rule": "9.4b",
        "eq": "$(\\forall x \\mid Q \\wedge R : P) \\equiv (\\forall x \\mid Q : \\neg R \\vee P)$",
        "name": "trading"
      },
      {
        "rule": "9.4c",
        "eq": "$(\\forall x \\mid Q \\wedge R : P) \\equiv (\\forall x \\mid Q : R \\wedge P \\equiv R)$",
        "name": "trading"
      },
      {
        "rule": "9.4d",
        "eq": "$(\\forall x \\mid Q \\wedge R : P) \\equiv (\\forall x \\mid Q : R \\vee P \\equiv P)$",
        "name": "trading"
      },
      {
        "rule": "9.4.1",
        "eq": "$(\\forall x \\mid R : P) \\equiv (\\forall x \\mid \\neg P: \\neg R)$",
        "name": "universal double trading"
      },
      {
        "type": "axiom",
        "rule": "9.5",
        "eq": "$P \\vee (\\forall x \\mid R : Q) \\equiv (\\forall x \\mid R : P \\vee Q)$",
        "name": "distributivity of $\\vee$ over $\\forall$"
      },
      {
        "rule": "9.6",
        "eq": "$(\\forall x \\mid R : P) \\equiv P \\vee (\\forall x \\mid : \\neg R)$"
      },
      {
        "rule": "9.7",
        "eq": "$\\neg (\\forall x \\mid : \\neg R) \\Rightarrow ((\\forall x \\mid R: P \\wedge Q) \\equiv P \\wedge (\\forall x \\mid R : Q))$",
        "name": "distributivity of $\\wedge$ over $\\forall$"
      },
      {
        "rule": "9.8",
        "eq": "$(\\forall x \\mid R : \\textit{true}) \\equiv \\textit{true}$"
      },
      {
        "rule": "9.9",
        "eq": "$(\\forall x \\mid R : P \\equiv Q) \\Rightarrow ((\\forall x \\mid R : P) \\equiv (\\forall x \\mid R : Q))$"
      },
      {
        "rule": "9.10",
        "eq": "$(\\forall x \\mid Q \\vee R : P) \\Rightarrow (\\forall x \\mid Q : P)$",
        "name": "range weakening/strengthening"
      },
      {
        "rule": "9.11",
        "eq": "$(\\forall x \\mid R : P \\wedge Q) \\Rightarrow (\\forall x \\mid R: P)$",
        "name": "body weakening/strengthening"
      },
      {
        "rule": "9.12",
        "eq": "$(\\forall x \\mid R : Q \\Rightarrow P) \\Rightarrow ((\\forall x \\mid R : Q) \\Rightarrow (\\forall x \\mid R : P))$",
        "name": "monotonicity of $\\forall$"
      },
      {
        "rule": "9.13",
        "eq": "$(\\forall x \\mid : P) \\Rightarrow P[x := E]$",
        "name": "instantiation"
      },
      {
        "rule": "9.16",
        "eq": "$P \\text{ is a theorem iff }(\\forall x \\mid : P) \\text{ is a theorem.}$",
        "name": "metatheorem"
      },
  
  
  
      {
        "section": "Existential quantification",
        "type": "axiom",
        "rule": "9.17",
        "eq": "$(\\exists x \\mid R : P) \\equiv \\neg(\\forall \\mid R : \\neg P)$",
        "name": "generalized De Morgan"
      },
      {
        "rule": "9.18a",
        "eq": "$\\neg (\\exists x \\mid R : \\neg P) \\equiv (\\forall x \\mid R : P)$",
        "name": "generalized De Morgan"
      },
      {
        "rule": "9.18b",
        "eq": "$\\neg (\\exists x \\mid R : P) \\equiv (\\forall x \\mid R: \\neg P)$",
        "name": "generalized De Morgan"
      },
      {
        "rule": "9.18c",
        "eq": "$(\\exists x \\mid R : \\neg P) \\equiv \\neg (\\forall x \\mid R : P)$",
        "name": "generalized De Morgan"
      },
      {
        "rule": "9.19",
        "eq": "$(\\exists x \\mid R : P) \\equiv (\\exists x \\mid : R \\wedge P)$",
        "name": "trading"
      },
      {
        "rule": "9.20",
        "eq": "$(\\exists x \\mid Q \\wedge R : P) \\equiv (\\exists x \\mid Q : R \\wedge P)$",
        "name": "trading"
      },
      {
        "rule": "9.20.1",
        "eq": "$(\\exists x \\mid R : P) \\equiv (\\exists x \\mid P : R)$",
        "name": "existential double trading"
      },
      {
        "rule": "9.20.2",
        "eq": "$(\\exists x \\mid : R) \\Rightarrow ((\\forall x \\mid R : P) \\Rightarrow (\\exists x \\mid R : P))$"
      },
      {
        "rule": "9.21",
        "eq": "$P \\wedge (\\exists x \\mid R : Q) \\equiv (\\exists x \\mid R : P \\wedge Q)$",
        "name": "distributivity of $\\wedge$ over $\\exists$"
      },
      {
        "rule": "9.22",
        "eq": "$(\\exists x \\mid R : P) \\equiv P \\wedge (\\exists x \\mid : R)$"
      },
      {
        "rule": "9.23",
        "eq": "$(\\exists x \\mid : R) \\Rightarrow ((\\exists x \\mid R : P \\vee Q) \\equiv P \\vee (\\exists x \\mid R : Q)$",
        "name": "distributivity of $\\vee$ over $\\exists$"
      },
      {
        "rule": "9.24",
        "eq": "$(\\exists x \\mid R : \\textit{false}) \\equiv \\textit{false}$"
      },
      {
        "rule": "9.25",
        "eq": "$(\\exists x \\mid R : P) \\Rightarrow (\\exists x \\mid Q \\vee R : P)$",
        "name": "range weakening/strengthening"
      },
      {
        "rule": "9.26",
        "eq": "$(\\exists x \\mid R : P) \\Rightarrow (\\exists x \\mid R : P \\vee Q)$",
        "name": "body weakening/strengthening"
      },
      {
        "rule": "9.27",
        "eq": "$(\\forall x \\mid R : Q \\Rightarrow P) \\Rightarrow ((\\exists x \\mid R : Q) \\Rightarrow (\\exists x \\mid R : P))$",
        "name": "monotonicity of $\\exists$"
      },
      {
        "rule": "9.28",
        "eq": "$P[x := E] \\Rightarrow (\\exists x \\mid : P)$",
        "name": "$\\exists$-introduction"
      },
      {
        "rule": "9.29",
        "eq": "$(\\exists x \\mid R : (\\forall y \\mid Q : P)) \\Rightarrow (\\forall y \\mid Q : (\\exists x \\mid R : P))$",
        "name": "interchange of quantification"
      },
      {
        "rule": "9.30",
        "eq": "$(\\exists x \\mid R : P) \\Rightarrow Q \\text{ is a theorem iff}\\$R \\wedge P)[x := \\hat{x}] \\Rightarrow Q \\text{ is a theorem.}$"
      },
  
  
  
      {
        "section": "A theory of sets",
        "rule": "11.2",
        "eq": "$\\{e_0, \\dots , e_{n - 1}\\} = \\{x \\mid x = e_0 \\vee \\dots \\vee x = e_{n - 1} : x\\}$"
      },
      {
        "type": "axiom",
        "rule": "11.3",
        "eq": "$F \\in \\{x \\mid R : E\\} \\equiv (\\exists x \\mid R : F = E)$",
        "name": "set membership"
      },
      {
        "type": "axiom",
        "rule": "11.4",
        "eq": "$S = T\\ \\ \\equiv\\ \\ (\\forall x \\mid : x \\in S\\ \\equiv\\ x \\in T)$",
        "name": "extensionallity"
      },
      {
        "type": "axiom",
        "rule": "11.4.1",
        "eq": "$\\emptyset = \\{x \\mid \\textit{false} : E\\}$",
        "name": "empty set"
      },
      {
        "rule": "11.4.2",
        "eq": "$e \\in \\emptyset\\ \\equiv\\ \\textit{false}$"
      },
      {
        "type": "axiom",
        "rule": "11.4.3",
        "eq": "$\\textbf{U} = \\{x \\mid: x\\}$",
        "name": "universe"
      },
      {
        "rule": "11.4.4",
        "eq": "$e \\in \\textbf{U}\\ \\equiv\\ \\textit{true}$"
      },
      {
        "rule": "11.5",
        "eq": "$S = \\{x \\mid x \\in S : x\\}$"
      },
      {
        "type": "axiom",
        "rule": "11.5.1",
        "eq": "$\\{x \\mid R\\} = \\{x \\mid R : x\\}$",
        "name": "abbreviation"
      },
      {
        "rule": "11.6",
        "eq": "$\\{x \\mid R : E\\} = \\{y \\mid (\\exists x \\mid R: y = E)\\}$"
      },
      {
        "rule": "11.7",
        "eq": "$x \\in \\{x \\mid R\\}\\ \\equiv\\ R$"
      },
      {
        "rule": "11.7.1",
        "eq": "$y \\in \\{x \\mid R\\}\\ \\equiv\\ R[x := y]$"
      },
      {
        "rule": "11.9",
        "eq": "$\\{x \\mid Q\\} = \\{x \\mid R\\}\\ \\equiv\\ (\\forall x \\mid : Q \\equiv R)$"
      },
      {
        "rule": "11.10",
        "eq": "$\\{x \\mid Q\\} = \\{x \\mid R\\} \\text{ is valid iff } Q \\equiv R \\text{ is valid.}$"
      },
      {
        "rule": "11.11",
        "eq": "<ol class=\"norm\"><li>Use Leibniz directly.</li><li>Use axiom Extensionality (11.4) and prove the (9.8) Lemma<br/>$v \\in S\\ \\equiv\\ v \\in T$ for an arbitrary value $v$.</li><li>Prove $Q \\equiv R$ and conclude $\\{x \\mid Q\\} = \\{x \\mid R\\}$.</li></ol>",
        "name": "methods for proving set equality"
      },
  
  
  
      {
        "section": "Operations on sets",
        "type": "axiom",
        "rule": "11.12",
        "eq": "$\\#S = (\\Sigma x \\mid x \\in S : 1)$",
        "name": "size"
      },
      {
        "type": "axiom",
        "rule": "11.13",
        "eq": "$S \\subseteq T\\ \\equiv\\ (\\forall x \\mid x \\in S : x \\in T)$",
        "name": "subset"
      },
      {
        "type": "axiom",
        "rule": "11.14",
        "eq": "$S \\subset T\\ \\equiv\\ S \\subseteq T \\wedge S \\neq T$",
        "name": "proper subset"
      },
      {
        "type": "axiom",
        "rule": "11.15",
        "eq": "$S \\supseteq T\\ \\equiv\\ T \\subseteq S$",
        "name": "superset"
      },
      {
        "type": "axiom",
        "rule": "11.16",
        "eq": "$S \\supset T\\ \\equiv\\ T \\subset S$",
        "name": "proper superset"
      },
      {
        "type": "axiom",
        "rule": "11.17",
        "eq": "$v \\in\\,\\,\\sim S\\ \\equiv\\ v \\in \\textbf{U} \\wedge v \\not \\in S$",
        "name": "complement"
      },
      {
        "rule": "11.18",
        "eq": "$v \\in\\,\\,\\sim S\\ \\equiv\\ v \\not \\in S\\text{,}\\quad\\text{for } v \\text{ in } \\textbf{U}$"
      },
      {
        "rule": "11.19",
        "eq": "$\\sim\\sim S\\ =\\ S$"
      },
      {
        "type": "axiom",
        "rule": "11.20",
        "eq": "$v \\in S \\cup T\\ \\equiv\\ v \\in S \\vee v \\in T$",
        "name": "union"
      },
      {
        "type": "axiom",
        "rule": "11.21",
        "eq": "$v \\in S \\cap T\\ \\equiv\\ v \\in S \\wedge v \\in T$",
        "name": "intersection"
      },
      {
        "type": "axiom",
        "rule": "11.22",
        "eq": "$v \\in S - T\\ \\equiv\\ v \\in S \\wedge v \\not \\in T$",
        "name": "difference"
      },
      {
        "type": "axiom",
        "rule": "11.23",
        "eq": "$v \\in \\mathcal{P}S\\ \\equiv\\ v \\subseteq S$",
        "name": "power set"
      },
      {
        "rule": "11.24",
        "eq": "Let $E_s$ be a set expression constructed from set variables,<br/>$\\emptyset$, $\\textbf{U}$, $\\sim$, $\\cup$, and $\\cap$. Then $E_p$ is the expression constructed from $E_s$<br/>by replacing: $\\emptyset$ with $\\textit{false}$, $\\textbf{U}$ with $\\textit{true}$, $\\cup$ with $\\vee$, $\\cap$ with $\\wedge$, $\\sim$ with $\\neg$.<br/>The construction is reversible: $E_s$ can be constructed from $E_p$.<br/>",
        "name": "$E_p$"
      },
      {
        "rule": "11.25",
        "eq": "For any set expressions $E_s$ and $F_s$:<ol class=\"norm\"><li>$E_s = F_s$ is valid iff $E_p \\equiv F_p$ is valid,</li><li>$E_s \\subseteq F_s$ is valid iff $E_p \\rightarrow F_p$ is valid,</li><li>$E_s = \\textbf{U}$ is valid iff $E_p$ is valid.</li></ol>",
        "name": "metatheorem"
      },
  
  
  
      {
        "section": "Basic properties of $\\cup$",
        "rule": "11.26",
        "eq": "$S \\cup T\\ =\\ T \\cup S$",
        "name": "symmetry of $\\cup$"
      },
      {
        "rule": "11.27",
        "eq": "$S \\cup (T \\cup U)\\ =\\ (S \\cup T) \\cup U$",
        "name": "associativity of $\\cup$"
      },
      {
        "rule": "11.28",
        "eq": "$S \\cup S\\ =\\ S$",
        "name": "idempotency of $\\cup$"
      },
      {
        "rule": "11.29",
        "eq": "$S \\cup \\textbf{U}\\ =\\ \\textbf{U}$",
        "name": "zero of $\\cup$"
      },
      {
        "rule": "11.30",
        "eq": "$S \\cup \\emptyset\\ =\\ S$",
        "name": "identity of $\\cup$"
      },
      {
        "rule": "11.31",
        "eq": "$S \\subseteq S \\cup T$",
        "name": "weakening"
      },
      {
        "rule": "11.32",
        "eq": "$S \\,\\,\\cup\\, \\sim S\\ =\\ \\emptyset$",
        "name": "excluded middle"
      },
  
  
  
      {
        "section": "Basic properties of $\\cap$",
        "rule": "11.33",
        "eq": "$S \\cap T\\ =\\ T \\cap S$",
        "name": "symmetry of $\\cap$"
      },
      {
        "rule": "11.34",
        "eq": "$(S \\cap T) \\cap U\\ =\\ S \\cap (T \\cap U)$",
        "name": "associativity of $\\cap$"
      },
      {
        "rule": "11.35",
        "eq": "$S \\cap S\\ =\\ S$",
        "name": "idempotency of $\\cap$"
      },
      {
        "rule": "11.36",
        "eq": "$S \\cap \\emptyset\\ =\\ \\emptyset$",
        "name": "zero of $\\cap$"
      },
      {
        "rule": "11.37",
        "eq": "$S \\cap \\mathbf{U}\\ =\\ S$",
        "name": "identity of $\\cap$"
      },
      {
        "rule": "11.38",
        "eq": "$S \\cap T\\ \\subseteq\\ S$",
        "name": "strengthening"
      },
      {
        "rule": "11.39",
        "eq": "$S\\;\\cap \\sim S\\ =\\ \\emptyset$",
        "name": "contradiction"
      },
  
  
  
      {
        "section": "Basic properties of combinations of $\\cup$ and $\\cap$",
        "rule": "11.40",
        "eq": "$S \\cup (T \\cap U)\\ =\\ (S \\cup T) \\cap (S \\cup U)$",
        "name": "distributivity of $\\cup$ over $\\cap$"
      },
      {
        "rule": "11.41",
        "eq": "$S \\cap (T \\cup U)\\ =\\ (S \\cap T) \\cup (S \\cap U)$",
        "name": "distributivity of $\\cap$ over $\\cup$"
      },
      {
        "rule": "11.42a",
        "eq": "$\\sim (S \\cup T)\\ =\\ \\sim S\\;\\cap \\sim T$",
        "name": "De Morgan"
      },
      {
        "rule": "11.42b",
        "eq": "$\\sim (S \\cap T)\\ =\\ \\sim S\\;\\cup \\sim T$",
        "name": "De Morgan"
      },
  
  
  
      {
        "section": "Additional properties of $\\cup$ and $\\cap$",
        "rule": "11.43",
        "eq": "$S \\subseteq T \\wedge U \\subseteq V\\ \\Rightarrow\\ (S \\cup U) \\subseteq (T \\cup V)$"
      },
      {
        "rule": "11.44",
        "eq": "$S \\subseteq T \\wedge U \\subseteq V\\ \\Rightarrow\\ (S \\cap U) \\subseteq (T \\cap V)$"
      },
      {
        "rule": "11.45",
        "eq": "$S \\subseteq T\\ \\equiv\\ S \\cup T = T$"
      },
      {
        "rule": "11.46",
        "eq": "$S \\subseteq T\\ \\equiv\\ S \\cap T = S$"
      },
      {
        "rule": "11.47",
        "eq": "$S \\cup T = \\mathbf{U}\\ \\equiv\\ (\\forall x \\mid x \\in \\textbf{U} : x \\not \\in S \\Rightarrow x \\in T)$"
      },
      {
        "rule": "11.48",
        "eq": "$S \\cap T = \\emptyset\\ \\equiv\\ (\\forall x \\mid : x \\in S \\Rightarrow x \\not \\in T)$"
      },
  
  
  
      {
        "section": "Properties of set difference",
        "rule": "11.49",
        "eq": "$S - T\\ =\\ S \\,\\,\\cap\\,\\sim T$"
      },
      {
        "rule": "11.50",
        "eq": "$S - T\\ \\subseteq\\ S$"
      },
      {
        "rule": "11.51",
        "eq": "$S - \\emptyset\\ =\\ S$"
      },
      {
        "rule": "11.52",
        "eq": "$S \\cap (T - S)\\ =\\ \\emptyset$"
      },
      {
        "rule": "11.53",
        "eq": "$S \\cup (T - S)\\ =\\ S \\cup T$"
      },
      {
        "rule": "11.54",
        "eq": "$S - (T \\cup U)\\ =\\ (S - T) \\cap (S - U)$"
      },
      {
        "rule": "11.55",
        "eq": "$S - (T \\cap U)\\ =\\ (S - T) \\cup (S - U)$"
      },
  
  
  
      {
        "section": "Implication versus subset",
        "rule": "11.56",
        "eq": "$(\\forall x \\mid : P \\Rightarrow Q)\\ \\equiv\\ \\{x \\mid P\\} \\subseteq \\{x \\mid Q\\}$"
      },
  
  
  
      {
        "section": "Properties of subset",
        "rule": "11.57",
        "eq": "$S \\subseteq T \\wedge T \\subseteq S\\ \\equiv\\ S = T$",
        "name": "antisymmetry"
      },
      {
        "rule": "11.58",
        "eq": "$S \\subseteq S$",
        "name": "reflexivity"
      },
      {
        "rule": "11.59",
        "eq": "$S \\subseteq T \\wedge T \\subseteq U\\ \\Rightarrow\\ S \\subseteq U$",
        "name": "transitivity"
      },
      {
        "rule": "11.60",
        "eq": "$\\emptyset \\subseteq S$"
      },
      {
        "rule": "11.61",
        "eq": "$S \\subset T\\ \\equiv\\ S \\subseteq T \\wedge \\neg (T \\subseteq S)$"
      },
      {
        "rule": "11.62",
        "eq": "$S \\subset T\\ \\equiv\\ S \\subseteq T \\wedge (\\exists x \\mid x \\in T : x \\not \\in S)$"
      },
      {
        "rule": "11.63",
        "eq": "$S \\subseteq T\\ \\equiv\\ S \\subset T \\vee S = T$"
      },
      {
        "rule": "11.64",
        "eq": "$S \\not \\subset S$"
      },
      {
        "rule": "11.65",
        "eq": "$S \\subset T\\ \\Rightarrow\\ S \\subseteq T$"
      },
      {
        "rule": "11.66",
        "eq": "$S \\subset T\\ \\Rightarrow\\ T \\not \\subseteq S$"
      },
      {
        "rule": "11.67",
        "eq": "$S \\subseteq T\\ \\Rightarrow\\ T \\not \\subset S$"
      },
      {
        "rule": "11.68",
        "eq": "$S \\subseteq T \\wedge \\neg(U \\subseteq T)\\ \\Rightarrow\\ \\neg(U \\subseteq S)$"
      },
      {
        "rule": "11.69",
        "eq": "$(\\exists x \\mid x \\in S: x \\not \\in T)\\ \\Rightarrow\\ S \\neq T$"
      },
      {
        "rule": "11.70a",
        "eq": "$S \\subseteq T \\wedge T \\subset U\\ \\Rightarrow\\ S \\subset U$",
        "name": "transitivity"
      },
      {
        "rule": "11.70b",
        "eq": "$S \\subset T \\wedge T \\subseteq U\\ \\Rightarrow\\ S \\subset U$",
        "name": "transitivity"
      },
      {
        "rule": "11.70c",
        "eq": "$S \\subset T \\wedge T \\subset U\\ \\Rightarrow\\ S \\subset U$",
        "name": "transitivity"
      },
  
  
  
      {
        "section": "Theorems concerning power set $\\mathcal{P}$",
        "rule": "11.71",
        "eq": "$\\mathcal{P}\\,\\emptyset\\ =\\ \\{\\emptyset\\}$"
      },
      {
        "rule": "11.72",
        "eq": "$S \\in \\mathcal{P}S$"
      },
      {
        "rule": "11.73",
        "eq": "$\\#(\\mathcal{P}S)\\ =\\ 2^{\\#S}\\quad\\text{(for finite set }S\\text{)}$"
      },
      {
        "type": "axiom",
        "rule": "11.76",
        "eq": "$\\text{Set }S\\text{ partitions }T\\text{ if}\\\\\\text{(i) the sets in }S\\text{ are pairwise disjoint and}\\\\\\text{(ii) the union of the sets in }S\\text{ is }T\\text{, that is, if}\\$\\forall u,v\\mid u \\in S \\wedge v \\in S \\wedge u \\neq v: u \\cap v = \\emptyset) \\wedge (\\cup u \\mid u \\in S : u) = T$",
        "name": "partition"
      },
  
  
  
      {
        "section": "Bags",
        "type": "axiom",
        "rule": "11.79",
        "eq": "$v \\in \\lbag x \\mid R : E \\rbag\\ \\equiv\\ (\\exists x \\mid R : v = E) $",
        "name": "membership"
      },
      {
        "rule": "",
        "eq": "&vellip;"
      },
  
  
  
      {
        "section": "Mathematical induction",
        "type": "axiom",
        "rule": "12.3",
        "eq": "$(\\forall n : \\mathbb{N} \\mid : (\\forall i \\mid 0 \\leq i < n : P.i) \\Rightarrow P.n)\\ \\Rightarrow\\ (\\forall n : \\mathbb{N} \\mid : P.n)$",
        "name": "mathematical induction over $\\mathbb{N}$"
      },
      {
        "rule": "12.4",
        "eq": "$(\\forall n: \\mathbb{N} \\mid : (\\forall i \\mid 0 \\leq i < n: P.i) \\Rightarrow P.n)\\ \\equiv\\ (\\forall n: \\mathbb{N} \\mid : P.n)$",
        "name": "mathematical induction over $\\mathbb{N}$"
      },
      {
        "rule": "12.5",
        "eq": "$P.0 \\wedge (\\forall n:\\mathbb{N} \\mid : (\\forall i \\mid 0 \\leq i \\leq n : P.i) \\Rightarrow P.(n + 1))\\\\\\ \\ \\ \\ \\equiv\\ (\\forall n : \\mathbb{N} \\mid : P.n)$",
        "name": "mathematical induction over $\\mathbb{N}$"
      },
      {
        "type": "axiom",
        "rule": "12.11",
        "eq": "$b^{0} = 1\\\\b^{n+1} = b \\cdot b^{n}\\quad\\text{for } n \\geq 0$",
        "name": "definition, $b$ to the power $n$"
      },
      {
        "rule": "12.12",
        "eq": "$b^{0} = 1\\\\b^{n} = b^{n} \\cdot b^{n-1}\\quad\\text{for } n \\geq 1$",
        "name": "$b$ to the power $n$"
      },
      {
        "type": "axiom",
        "rule": "12.13",
        "eq": "$0! = 1\\\\n! = n \\cdot (n - 1)!\\quad\\text{for } n > 0$",
        "name": "definition, factorial"
      },
      {
        "type": "axiom",
        "rule": "12.14",
        "eq": "$F_{0} = 0,\\quad F_{1} = 1\\\\F_{n} = F_{n - 1} + F_{n - 2}\\quad \\text{for } n > 1$",
        "name": "definition, Fibonacci"
      },
      {
        "type": "axiom",
        "rule": "12.14.1",
        "eq": "$\\phi = (1 + \\sqrt{5})/2 \\approx 1.618\\\\\\hat \\phi = (1 - \\sqrt{5})/2 \\approx -0.618$",
        "name": "definition, golden ratio"
      },
      {
        "rule": "12.15",
        "eq": "$\\phi^{2} = \\phi + 1\\quad \\text{and}\\quad \\hat\\phi^{2} = \\phi + 1$"
      },
      {
        "rule": "12.16",
        "eq": "$F_{n} \\leq \\phi^{n-1}\\quad\\text{for }n \\geq 1$"
      },
      {
        "rule": "12.16.1",
        "eq": "$\\phi^{n - 2} \\leq F_{n}\\quad\\text{for }n \\geq 1$"
      },
      {
        "rule": "12.17",
        "eq": "$F_{n + m} = F_{m} \\cdot F_{n + 1} + F_{m - 1} \\cdot F_{n}\\quad\\text{for }n \\geq 0\\text{ and }m \\geq 1$"
      },
      {
        "section": "Inductively defined binary trees",
        "type": "axiom",
        "rule": "12.30",
        "eq": "$\\emptyset\\text{ is a binary tree, called the empty tree.}\\$d,l,r)\\text{ is a binary tree, for } d: \\mathbb{Z}\\text{ and } l, r\\text{ binary trees.}$",
        "name": "definition, binary tree"
      },
      {
        "type": "axiom",
        "rule": "12.31",
        "eq": "$\\#\\emptyset = 0\\\\\\#(d,l,r) = 1 + \\#l + \\#r$",
        "name": "definition, number of nodes"
      },
      {
        "type": "axiom",
        "rule": "12.32",
        "eq": "$\\textit{height.}\\emptyset = 0\\\\\\textit{height.}(d,l,r) = 1 + \\textit{max}(\\textit{height.}l + \\textit{height.}r)$",
        "name": "definition, height"
      },
      {
        "type": "axiom",
        "rule": "12.32.1",
        "eq": "$\\text{A leaf is a node with no children (i.e. two empty subtrees).}$",
        "name": "definition, leaf"
      },
      {
        "type": "axiom",
        "rule": "12.32.2",
        "eq": "$\\text{An internal node is a node that is not a leaf.}$",
        "name": "definition, internal node"
      },
      {
        "type": "axiom",
        "rule": "12.32.3",
        "eq": "$\\text{A binary tree is complete if every node has}\\\\\\text{either 0 or 2 children.}$",
        "name": "definition, complete"
      },
      {
        "rule": "12.33",
        "eq": "$\\text{The maximum number of nodes in a tree with}\\\\\\text{height }n\\text{ is }2^{n}-1\\quad\\text{for }n \\geq 0\\text{.}$"
      },
      {
        "rule": "12.34",
        "eq": "$\\text{The minimum number of nodes in a tree with}\\\\\\text{height }n\\text{ is }n\\quad\\text{for }n \\geq 0\\text{.}$"
      },
      {
        "rule": "12.35",
        "eq": "$\\text{(a) The maximum number of leaves in a tree with}\\\\\\text{height }n\\text{ is }2^{n - 1}\\quad\\text{for }n > 0\\text{.}\\\\\\text{(b) The maximum number of internal nodes in a tree with}\\\\\\text{height }n\\text{ is }2^{n - 1} - 1\\quad\\text{for }n > 0\\text{.}$"
      },
      {
        "rule": "12.36",
        "eq": "$\\text{(a) The minimum number of leaves in a tree with}\\\\\\text{height }n\\text{ is }1\\quad\\text{for }n > 0\\text{.}\\\\\\text{(b) The minimum number of internal nodes in a tree with}\\\\\\text{height }n\\text{ is }n - 1\\quad\\text{for }n > 0\\text{.}$"
      },
      {
        "rule": "12.37",
        "eq": "$\\text{Every nonempty complete tree has an odd number of nodes.}$"
      },
      {
        "section": "A theory of programs",
        "type": "axiom",
        "rule": "p.1",
        "eq": "$wp.S.\\textit{false} \\equiv \\textit{false}$",
        "name": "excluded miracle"
      },
      {
        "type": "axiom",
        "rule": "p.2",
        "eq": "$wp.S.(X \\wedge Y)\\ \\equiv\\ wp.S.X \\wedge wp.S.Y$",
        "name": "conjunctivity"
      },
      {
        "rule": "p.3",
        "eq": "$(X \\Rightarrow Y)\\ \\Rightarrow\\ (wp.S.X \\Rightarrow wp.S.Y)$",
        "name": "monotonicity"
      },
      {
        "type": "axiom",
        "rule": "p.4",
        "eq": "$\\{Q\\}\\;S\\;\\{R\\}\\ \\equiv\\ (Q \\Rightarrow wp.S.R)$",
        "name": "definition, Hoare triple"
      },
      {
        "rule": "p.5",
        "eq": "$\\{Q\\}\\;S\\;\\{A\\}\\wedge (A \\Rightarrow R)\\ \\Rightarrow\\ \\{Q\\}\\;S\\;\\{R\\}$",
        "name": "postcondition rule"
      },
      {
        "type": "axiom",
        "rule": "p.6",
        "eq": "$S = T\\ \\equiv\\ (\\text{For all }R, wp.S.R \\equiv wp.T.R)$",
        "name": "definition, program equivalence"
      },
      {
        "rule": "p.7",
        "eq": "$(Q \\Rightarrow A) \\wedge \\{A\\}\\;S\\;\\{R\\}\\ \\Rightarrow\\ \\{Q\\}\\;S\\;\\{R\\}$"
      },
      {
        "rule": "p.8",
        "eq": "$\\{Q0\\}\\;S\\;\\{R0\\}\\wedge\\{Q1\\}\\;S\\;\\{R1\\}\\ \\Rightarrow\\ \\{Q0 \\wedge Q1\\}\\;S\\;\\{R0 \\wedge R1\\}$"
      },
      {
        "rule": "p.9",
        "eq": "$\\{Q0\\}\\;S\\;\\{R0\\}\\wedge\\{Q1\\}\\;S\\;\\{R1\\}\\ \\Rightarrow\\ \\{Q0 \\vee Q1\\}\\;S\\;\\{R0 \\vee R1\\}$"
      },
      {
        "type": "axiom",
        "rule": "p.10",
        "eq": "$wp.\\textit{skip}.R\\ \\equiv\\ R$",
        "name": "definition, skip"
      },
      {
        "rule": "p.11",
        "eq": "$\\{Q\\}\\;\\textit{skip}\\;\\{R\\}\\ \\equiv\\ Q \\Rightarrow R$"
      },
      {
        "type": "axiom",
        "rule": "p.12",
        "eq": "$wp.\\textit{abort}.R\\ \\equiv\\ \\textit{false}$",
        "name": "definition, abort"
      },
      {
        "rule": "p.13",
        "eq": "$\\{Q\\}\\;\\textit{abort}\\;\\{R\\}\\ \\equiv\\ Q \\equiv \\textit{false}$"
      },
      {
        "type": "axiom",
        "rule": "p.14",
        "eq": "$wp.(S; T).R\\ \\equiv\\ wp.S.(wp.T.R)$",
        "name": "definition, composition"
      },
      {
        "rule": "p.15",
        "eq": "$\\{Q\\}\\;S\\;\\{H\\}\\wedge\\{H\\}\\;T\\;\\{R\\}\\ \\Rightarrow\\ \\{Q\\}\\;S;T\\;\\{R\\}$"
      },
      {
        "rule": "p.16",
        "eq": "$\\text{(a)}\\ S;\\textit{skip}\\ =\\ S\\\\\\text{(b)}\\ \\textit{skip};S\\ =\\ S$",
        "name": "identity of composition"
      },
      {
        "rule": "p.17",
        "eq": "$\\text{(a)}\\ S;\\textit{abort}\\ =\\ \\textit{abort}\\\\\\text{(b)}\\ \\textit{abort};S\\ =\\ \\textit{abort}$",
        "name": "zero of composition"
      },
      {
        "type": "axiom",
        "rule": "p.18",
        "eq": "$wp.(x := E).R\\ \\equiv\\ R[x := E]$",
        "name": "definition, assignment"
      },
      {
        "rule": "p.19",
        "eq": "$\\text{To show that }x := E\\text{ is an implementation of }\\{Q\\}\\;S\\;\\{R\\}\\text{,}\\\\\\text{prove }Q \\Rightarrow R[x := E]\\text{.}$",
        "name": "proof method for assignment"
      },
      {
        "rule": "p.20",
        "eq": "$x := x\\ =\\ \\textit{skip}$"
      },
      {
        "type": "axiom",
        "rule": "p.21",
        "eq": "$\\mathbf{if}\\ B1 \\rightarrow S1\\\\\\square\\ B2 \\rightarrow S2\\\\\\square\\ B3 \\rightarrow S3\\\\\\mathbf{fi}$",
        "name": "$IFG$"
      },
      {
        "type": "axiom",
        "rule": "p.22",
        "eq" : "$wp.IFG.R\\ \\equiv\\ (B1 \\vee B2 \\vee B3) \\wedge\\$B1 \\Rightarrow wp.S1.R) \\wedge (B2 \\Rightarrow wp.S2.R) \\wedge (B3 \\Rightarrow wp.S3.R)$",
        "name": "definition, $IFG$"
      },
      {
        "rule": "p.23",
        "eq": "$\\mathbf{if}\\ \\ \\mathbf{fi}\\ =\\ \\mathbf{abort}$",
        "name": "empty guard"
      },
  
      {
        "rule": "p.24",
        "eq": "$\\text{To prove }\\{Q\\}\\;IFG\\;\\{R\\}\\text{, it suffices to prove}\\\\\\text{(a) }Q \\Rightarrow B1 \\vee B2 \\vee B3\\text{,}\\\\\\text{(b) }\\{Q \\wedge B1\\}\\;S1\\;\\{R\\}\\text{,}\\\\\\text{(c) }\\{Q \\wedge B2\\}\\;S2\\;\\{R\\}\\text{, and}\\\\\\text{(d) }\\{Q \\wedge B3\\}\\;S3\\;\\{R\\}\\text{.}$",
        "name": "proof method for $IFG$"
      },
      {
        "rule": "p.25",
        "eq": "$\\neg (B1 \\vee B2 \\vee B3) \\Rightarrow IFG\\ =\\ \\mathit{abort}$"
      },    {
        "rule": "p.26",
        "eq": "$\\{Q\\}\\;\\mathbf{if}\\ B \\rightarrow S\\ \\mathbf{fi}\\;\\{R\\}\\ \\Rightarrow\\ \\{Q\\}\\;S\\;\\{R\\}$",
        "name": "one-guard rule"
      },
      {
        "rule": "p.27",
        "eq": "$\\quad\\mathbf{if}\\ B1 \\rightarrow S1\\;;T\\;\\square\\;B2 \\rightarrow S2\\;;T\\ \\mathbf{fi}\\\\=\\\\\\quad\\mathbf{if}\\ B1 \\rightarrow S1\\;\\square\\;B2 \\rightarrow S2\\ \\mathbf{fi}\\;;\\;T$",
        "name": "distributivity of program over alternation"
      },
      {
        "type": "axiom",
        "rule": "p.28",
        "eq": "$\\mathbf{do}\\ B \\rightarrow S\\ \\mathbf{od}$",
        "name": "$DO$"
      },
      {
        "rule": "p.29",
        "eq": "$\\text{Suppose}$<ul class=\"norm\"><li>$\\{P \\wedge B\\}\\;S\\;\\{P\\}\\ \\text{holds---i.e. execution of S begun in a state}\\\\\\text{in which }P\\text{ and }B\\text{ are }\\textit{true}\\text{ terminates with }P\\textit{ true}\\text{---and}$</li><li>$\\{P\\}\\ \\mathbf{do}\\ B \\rightarrow S\\ \\mathbf{od}\\ \\{\\textit{true}\\}\\text{---i.e. execution of the loop begun}\\\\\\text{in a state in which }P\\text{ is }\\textit{true}\\text{ terminates.}$</li><br/>$\\text{Then }\\{P\\}\\ \\mathbf{do}\\ B \\rightarrow S\\ \\mathbf{od}\\ \\{P \\wedge \\neg B\\}\\ \\text{holds.}$</ul>",
        "name": "fundamental invariance theorem"
      },
      {
        "rule": "p.30",
        "eq": "$\\text{To prove }\\{Q\\}\\;\\textit{initialization}\\text{;}\\;\\{P\\}\\ \\mathbf{do}\\ B \\rightarrow S\\ \\mathbf{od}\\ \\{R\\}\\text{,}\\\\\\text{it suffices to prove}\\\\\\text{(a) }P \\text{ is }\\textit{true}\\text{ before execution of the loop: }\\{Q\\}\\;\\textit{initialization}\\text{;}\\;{P}\\text{,}\\\\\\text{(b) }P\\text{ is a loop invariant: }\\{P \\wedge B\\}\\;S\\;\\{P\\}\\text{,}\\\\\\text{(c) Execution of the loop terminates, and}\\\\\\text{(d) }R\\text{ holds upon termination: }P \\wedge \\neg B \\Rightarrow R\\text{.}$",
        "name": "proof method for $DO$"
      },
      {
        "rule": "p.31",
        "eq": "$\\mathbf{do}\\ \\mathit{false} \\rightarrow S\\ \\mathbf{od} = \\mathit{skip}$",
        "name": "false guard"
      },
      {
        "section": "Relations and functions",
        "type": "axiom",
        "rule": "14.2",
        "eq": "$\\langle b,c \\rangle = \\langle b', c'\\rangle\\ \\equiv\\ \\ b = b' \\wedge c = c'$",
        "name": "pair equality"
  
      },
      {
        "rule": "",
        "eq": "&vellip;"
      }
  
  
    ];
  //[{"User_Name":"John Doe","score":"10","team":"1"},{"User_Name":"Jane Smith","score":"15","team":"2"},{"User_Name":"Chuck Berry","score":"12","team":"2"}];
        var tr;
        for (var i = 0; i < json.length; i++) {
            tr = $('<tr/>');
            tr.append("<td>" + json[i].name + "</td>");
            tr.append("<td>" + json[i].eq + "</td>");
            // tr.append("<td>" + json[i].team + "</td>");
            $('table').append(tr);
        }
}