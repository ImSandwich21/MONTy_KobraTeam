package expression;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class ExpressionProcessor 
{
    List<Expression> list;
    public Map<String, Number> variaveisValor;
    public Map<String, String> variaveisTipo;
    public Map<String, List<Number>> variaveisLista;

    public List<String> listaTemporaria; // Usada para guardar variáveis temporárias para Cod. Intermediário

    public ExpressionProcessor(List<Expression> list)
    {
        this.list = list;
        variaveisValor = new HashMap<>();
        variaveisTipo = new HashMap<>();
        variaveisLista = new HashMap<>();
        listaTemporaria = new ArrayList<>();
    }

    public List<String> getMiddleCode()
    {
        List<String> codigoIntermediario = new ArrayList<>();

        for (Expression e: list)
        {
            if (e instanceof IntDeclaration)
            {
                IntDeclaration decl = (IntDeclaration) e;
                for(Map.Entry<String, Integer> variavel: decl.variaveis.entrySet())
                {
                    codigoIntermediario.add(variavel.getKey() + " = " + variavel.getValue().intValue());
                }
            }
            else if(e instanceof FloatDeclaration)
            {
                FloatDeclaration decl = (FloatDeclaration) e;
                for(Map.Entry<String, Number> variavel: decl.variaveis.entrySet())
                {
                    codigoIntermediario.add(variavel.getKey() + " = " + variavel.getValue().floatValue());
                }
            }
            else if(e instanceof ListDeclaration)
            {
                ListDeclaration decl = (ListDeclaration) e;
                codigoIntermediario.add(decl.id + " = allocate(0)\n");
            }
            else if(e instanceof VariableAssign)
            {
                VariableAssign va = (VariableAssign) e;
                // Código intermediário
                if (!(va.value instanceof Inteiro) && !(va.value instanceof Flutuante) && !(va.value instanceof Variable))
                {
                    String tmp = "t";
                    if (listaTemporaria.contains(va.value.toString()))
                    {
                        
                        tmp = tmp + (listaTemporaria.indexOf(va.value.toString() + 1));
                    }
                    else
                    {
                        listaTemporaria.add(va.value.toString());
                        tmp = tmp + listaTemporaria.size();
                    }
                    codigoIntermediario.add(tmp + " = " + va.value.toString());
                    codigoIntermediario.add(va.id + " = " + tmp);
                }
                else
                {
                    codigoIntermediario.add(va.id + " = " + va.value.toString());
                }
                // Fim Código Intermediário
            }
            else if(e instanceof ListAssign)
            {
                ListAssign la = (ListAssign) e;

                int i = 0;
                for (Number valor : la.values)
                {
                    codigoIntermediario.add(la.id + "[" + i + "] = " + valor);
                    i++;
                }

            }
            else if(e instanceof ListAdd)
            {
                ListAdd la = (ListAdd) e;

                int posicao = getEvalResult(la.position, new ArrayList<>()).intValue();
                int valor = getEvalResult(la.value, new ArrayList<>()).intValue();

                // Código intermediário
                codigoIntermediario.add("N = get_size(" +  la.id + ") // Tamanho da lista");
                codigoIntermediario.add("if " + posicao + " > N goto ERROR");
                codigoIntermediario.add("if " + posicao + " < 0 goto ERROR");
                codigoIntermediario.add("if " +  posicao + " == N goto L2 // Sinal de que se está a adiconar ao fim da lista");
                codigoIntermediario.add("j = N");
                codigoIntermediario.add("L1:");
                codigoIntermediario.add("if j <= " +  posicao + " goto L2");
                codigoIntermediario.add(la.id + "[j] = " + la.id +"[j - 1]");
                codigoIntermediario.add("j = j - 1");
                codigoIntermediario.add("goto L1");
                codigoIntermediario.add("L2:");
                codigoIntermediario.add(la.id + "[" + posicao + "] = " + valor);
                codigoIntermediario.add("N = N + 1");
                codigoIntermediario.add("set_size(x, N) // Atualizar tamanho da lista");
                codigoIntermediario.add("goto END");
                codigoIntermediario.add("ERROR:");
                codigoIntermediario.add("print('Error: Value of " + posicao + " is out of range.')");
                codigoIntermediario.add("END:");
                // Fim código intermediário
            }
            else if(e instanceof ListRemove)
            {
                ListRemove lr = (ListRemove) e;

                int posicao = lr.position;

                // Código intermediário
                codigoIntermediario.add("N = get_size(" +  lr.id + ") // Tamanho da lista");
                codigoIntermediario.add("if " + posicao + " < 0 goto ERROR // Posição tem de estar entre os limites");
                codigoIntermediario.add("if " + posicao + " >= N goto ERROR // Posição tem de estar entre os limites");
                codigoIntermediario.add("i = " + posicao);
                codigoIntermediario.add("L1:");
                codigoIntermediario.add("if i >= N - 1 goto L2 // Indicação de última posição");
                codigoIntermediario.add(lr.id + "[i] = " + lr.id + "[i+1]");
                codigoIntermediario.add("i = i + 1");
                codigoIntermediario.add("goto L1");
                codigoIntermediario.add("L2");
                codigoIntermediario.add("N = N - 1");
                codigoIntermediario.add("set_size(x, N) // atualizar o novo tamanho da lista");
                codigoIntermediario.add(lr.id + "[N] = null");
                codigoIntermediario.add("goto END");
                codigoIntermediario.add("ERROR:");
                codigoIntermediario.add("print('Error: Value of " + posicao + " is out of range.')");
                codigoIntermediario.add("END:");
                // Fim Código intermediário
            }
            else if(e instanceof InputFunction)
            {
                InputFunction iFunc = (InputFunction) e;

                codigoIntermediario.add(iFunc.id + " = print(" + iFunc.msg +")");
            }
            else if(e instanceof WhileInstrunction)
            {
                WhileInstrunction wi = (WhileInstrunction) e;
                Number left = getEvalResult(wi.left, new ArrayList<>());
                Number right = getEvalResult(wi.right, new ArrayList<>());

                // Código intermediário
                codigoIntermediario.add("L1:");
                codigoIntermediario.add("if " + left + getOppositeOp(wi.op) + right + " goto L2");
                codigoIntermediario.add("// Bloco de código identado");
                codigoIntermediario.add(left + " = " + left + " " + getCicleSequence(wi.op) + " 1");
                codigoIntermediario.add("goto L1");
                codigoIntermediario.add("L2:");
                // Fim código intermediário
            }
        }

        return codigoIntermediario;
    }

    public List<String> getEvaluationResults()
    {
        List<String> evaluations = new ArrayList<>();

        for (Expression e: list)
        {
            if (e instanceof IntDeclaration)
            {
                IntDeclaration decl = (IntDeclaration) e;
                for(Map.Entry<String, Integer> variavel: decl.variaveis.entrySet())
                {
                    variaveisValor.put(variavel.getKey(), variavel.getValue());
                    variaveisTipo.put(variavel.getKey(), "int");

                }
                
                evaluations.add(decl.toString());
            }
            else if(e instanceof FloatDeclaration)
            {
                FloatDeclaration decl = (FloatDeclaration) e;
                for(Map.Entry<String, Number> variavel: decl.variaveis.entrySet())
                {
                    variaveisValor.put(variavel.getKey(), variavel.getValue());
                    variaveisTipo.put(variavel.getKey(), "float");

                }
                evaluations.add(decl.toString());
            }
            else if(e instanceof ListDeclaration)
            {
                ListDeclaration decl = (ListDeclaration) e;

                variaveisTipo.put(decl.id, decl.type + "[]");
                variaveisLista.put(decl.id, new ArrayList<>());

                evaluations.add(decl.type + "[] " + decl.id + " = []");
            }
            else if(e instanceof VariableAssign)
            {
                VariableAssign va = (VariableAssign) e;

                if (!variaveisTipo.containsKey(va.id))
                {
                    variaveisTipo.put(va.id, "float");
                }
                Number resultado = getEvalResult(va.value, evaluations);

                variaveisValor.put(va.id, variaveisTipo.get(va.id) == "int" ? resultado.intValue() : resultado);
                
                evaluations.add(va.id + " = " +  (variaveisTipo.get(va.id) == "int" ? resultado.intValue() : resultado));
            }
            else if(e instanceof ListAssign)
            {
                ListAssign la = (ListAssign) e;

                if (!variaveisTipo.containsKey(la.id))
                {
                    variaveisTipo.put(la.id, "float[]");
                }

                variaveisLista.put(la.id, la.values);
                evaluations.add(la.toString());
            }
            else if(e instanceof ListAdd)
            {
                ListAdd la = (ListAdd) e;

                int posicao = getEvalResult(la.position, evaluations).intValue();
                int valor = getEvalResult(la.value, evaluations).intValue();

                if (posicao == variaveisLista.get(la.id).size())
                {
                    variaveisLista.get(la.id).add(valor);
                    evaluations.add(la.toString());
                }
                else if (posicao < variaveisLista.get(la.id).size() && posicao >= 0)
                {
                    variaveisLista.get(la.id).set(posicao, valor);
                    evaluations.add(la.toString());
                }
                else
                {
                    evaluations.add("Value of " + posicao + " is out of range.");
                }
            }
            else if(e instanceof ListRemove)
            {
                ListRemove lr = (ListRemove) e;

                int posicao = lr.position;

                if (posicao < 0 && posicao >= variaveisLista.get(lr.id).size())
                {
                    variaveisLista.get(lr.id).remove(posicao);
                    evaluations.add(lr.toString());
                }
                else
                {
                    evaluations.add("Error: remove("+lr.id + ", " + posicao + ") - Value of " + posicao + " is out of range.");
                }
            }
            else if(e instanceof InputFunction)
            {
                InputFunction iFunc = (InputFunction) e;
                
                if (!variaveisTipo.containsKey(iFunc.id))
                {
                    variaveisTipo.put(iFunc.id, "float");
                }

                variaveisValor.put(iFunc.id, 0);
                
                evaluations.add(iFunc.type + " " + iFunc.id + " = print(" + iFunc.msg +")");
            }
            else if(e instanceof WhileInstrunction)
            {
                WhileInstrunction wi = (WhileInstrunction) e;

                evaluations.add(wi.toString());
            }
        }

        return evaluations;
    }

    private String getOppositeOp(String op)
    {
        switch (op) {
            case "<":
                return ">=";
            case ">":
                return "<=";
            case "<=":
                return ">";
            case ">=":
                return "<";
            case "==":
                return "!=";
            case "!=":          
                return "==";
            default:
                break;
        }
        return "";
    }

    private String getCicleSequence(String op)
    {
        switch (op) 
        {
            case "<":
            case ">=":
                return "+";
            case ">":
            case "<=":
                return "-";
            case "==":
            case "!=":          
                return "+";
            default:
                break;
        }
        return "";
    }

    private Number getEvalResult(Expression e, List<String> evaluations)
    {
        Number result = 0;

        if (e instanceof Inteiro)
        {
            Inteiro i = (Inteiro) e;
            result = i.value;
        }
        else if (e instanceof Flutuante)
        {
            Flutuante f = (Flutuante) e;
            result = f.value;
        }
        else if (e instanceof Variable)
        {
            Variable v = (Variable) e;
            result = variaveisValor.get(v.id);
        }
        else if (e instanceof ListIndex)
        {
            ListIndex li = (ListIndex) e;

            if (li.index < 0 || li.index >= variaveisLista.get(li.id).size())
            {
                evaluations.add("Value of " + li.index + " out of range.");
            }
            else
            {
                result = variaveisLista.get(li.id).get(li.index);
            }
        }
        else if (e instanceof Logical)
        {
            Logical l = (Logical) e;

            Number left = getEvalResult(l.left, evaluations);
            Number right = getEvalResult(l.right, evaluations);

            if (l.operator == "AND")
            {
                return (left.intValue() > 0 && right.intValue() > 0) ? 1 : 0;
            }
            else
            {
                return (left.intValue() > 0 || right.intValue() > 0) ? 1 : 0;
            }
        }
        else if (e instanceof Relational)
        {
            Relational r = (Relational) e;
            Number left = getEvalResult(r.left, evaluations);
            Number right = getEvalResult(r.right, evaluations);

            switch (r.operator) 
            {
                case "<":
                    return left.intValue() < right.intValue() ? 1 : 0;
                case "<=":
                    return left.intValue() <= right.intValue() ? 1 : 0;
                case ">":
                    return left.intValue() > right.intValue() ? 1 : 0;
                case ">=":
                    return left.intValue() >= right.intValue() ? 1 : 0;
                case "!=": 
                    return left.intValue() != right.intValue() ? 1 : 0;
                case "==":
                    return left.intValue() == right.intValue() ? 1 : 0;            
                default:
                    break;
            }
        }
        else if (e instanceof UnaryOp)
        {
            UnaryOp u = (UnaryOp) e;
            Number left = getEvalResult(u.left, evaluations);
            Number right = getEvalResult(u.right, evaluations);

            if (u.operator == "-")
            {
                return (left.floatValue() - right.floatValue());
            }
            else
            {
                return (left.floatValue() + right.floatValue());
            }
        }
        else if (e instanceof MultDiv)
        {
            MultDiv md = (MultDiv) e;
            Number left = getEvalResult(md.left, evaluations);
            Number right = getEvalResult(md.right, evaluations);

            switch (md.operator) 
            {
                case "*":
                    return left.floatValue() * right.floatValue();
                case "/":
                    return left.floatValue() / right.floatValue();
                case "%":
                    if (left instanceof Integer && right instanceof Integer)
                    {
                        return (Integer) (left.intValue() % right.intValue());
                    }
                    else
                    {
                        evaluations.add("Both values must be of Type Integer (" + left.toString() + ", " + right.toString() + ")");
                    }
                case "//":
                    if (left instanceof Integer && right instanceof Integer)
                    {
                        return (Integer) (left.intValue() / right.intValue());
                    }
                    else
                    {
                        evaluations.add("Both values must be of Type Integer (" + left.toString() + ", " + right.toString() + ")");
                    }
                default:
                    break;
            }
        }
        else if (e instanceof Pow)
        {
            Pow p = (Pow) e;
            Number left = getEvalResult(p.left, evaluations);
            Number right = getEvalResult(p.rigth, evaluations);

            return Math.pow(left.doubleValue(), right.doubleValue());
        }
        else if (e instanceof GroupExp)
        {
            GroupExp ge = (GroupExp) e;

            if (ge.negado)
            {
                return (getEvalResult(ge.expression, evaluations).intValue() > 0 ? 0 : 1);
            }
            else
            {
                return getEvalResult(ge.expression, evaluations);
            }
        }

        return result;
    }

    public List<String> getAssemblyCode(List<String> intermediateCode) {
        List<String> assemblyCode = new ArrayList<>();

        int checkvar = 0;
        int checklist = 0;

        for (String instruction : intermediateCode) {
            // Remove leading and trailing whitespace
            instruction = instruction.trim();

            // Split instructions that are concatenated with new lines
            String[] instructions = instruction.split("\\n");

            for (String instr : instructions) {
                instr = instr.trim(); // Trim each instruction

                if (instr.matches("int\\s+\\w+\\s*=\\s*\\d+")) { // Declaracao implicita de tipo "int x = 0"

                    String instructionWithoutType = instr.replaceFirst("int\\s+", "");
                    String[] parts = instructionWithoutType.split("\\s*=\\s*");
                    String var = parts[0];
                    String value = parts[1];
                    if (checkvar == 0) {
                        assemblyCode.add("\n; Inicialização das variáveis");
                        checkvar = 1;
                    }
                    assemblyCode.add("MOV " + var + ", " + value + "    ; int " + var + " = " + value);

                } else if (instr.matches("float\\s+\\w+\\s*=\\s*\\d+")) { // Declaracao implicita de tipo "float x = 0"

                    String instructionWithoutType = instr.replaceFirst("float\\s+", "");
                    String[] parts = instructionWithoutType.split("\\s*=\\s*");
                    String var = parts[0];
                    String value = parts[1];
                    if (checkvar == 0) {
                        assemblyCode.add("\n; Inicialização das variáveis");
                        checkvar = 1;
                    }
                    assemblyCode.add("MOV " + var + ", " + value + "    ; int " + var + " = " + value);

                } else if (instr.matches("float\\[\\]\\s+\\w+\\s*=\\s*\\[\\]")) { // Matches initialization like
                                                                                  // "float[] lista = []"

                    String var = instr.replaceFirst("float\\[\\]\\s+", "").split("\\s*=\\s*")[0];

                    if (checklist == 0) {
                        assemblyCode.add("\n; Alocação e Inicialização da lista");
                        checklist = 1;
                    }

                    assemblyCode.add("ALLOC " + var + "    ; Aloca espaço para a lista");

                } else if (instr.matches("int\\[\\]\\s+\\w+\\s*=\\s*\\[\\]")) { // Matches initialization like "int[]
                                                                                // lista = []"

                    String var = instr.replaceFirst("int\\[\\]\\s+", "").split("\\s*=\\s*")[0];

                    if (checklist == 0) {
                        assemblyCode.add("\n; Alocação e Inicialização da lista");
                        checklist = 1;
                    }

                    assemblyCode.add("ALLOC " + var + "    ; Aloca espaço para a lista");

                } else if (instr.matches("\\w+\\s*=\\s*\\d+")) { // Atribuicao de valor a variavel "x = 5"

                    String[] parts = instr.split("\\s*=\\s*");
                    String var = parts[0];
                    String value = parts[1];
                    assemblyCode.add("\n; Atribuição de valor a " + var);
                    assemblyCode.add("MOV " + var + ", " + value + "    ; " + var + " = " + value);

                } else if (instr.matches("\\w+ = \\w+ \\+ \\w+")) { // Soma "a = b + c"

                    String[] parts = instr.split(" = | \\+ ");
                    String result = parts[0];
                    String operand1 = parts[1];
                    String operand2 = parts[2];
                    assemblyCode.add("ADD " + result + ", " + operand1 + ", " + operand2);

                } else if (instr.matches("\\w+ = \\w+ - \\w+")) { // Subtracao "a = b - c"

                    String[] parts = instr.split(" = | - ");
                    String result = parts[0];
                    String operand1 = parts[1];
                    String operand2 = parts[2];
                    assemblyCode.add("SUB " + result + ", " + operand1 + ", " + operand2);

                } else if (instr.matches("\\w+ = allocate\\(\\d+\\)")) { // Alocacao de Lista "a = allocate(0)"

                    String var = instr.split(" = ")[0];
                    assemblyCode.add("ALLOC " + var);

                } else if (instr.matches("\\w+\\[\\d+\\] = \\d+")) { // Atribuicao de Valor em index de Lista
                                                                     // assignment, e.g., "a[0] = 5"

                    String[] parts = instr.split("\\[|\\] = ");
                    String list = parts[0];
                    String index = parts[1];
                    String value = parts[2];

                    assemblyCode.add("STORE " + list + ", " + index + ", " + value + "    ; " + list + "[" + index
                            + "] = " + value);

                } else if (instruction.matches("\\w+ = \\[\\d+(, \\d+)*\\]")) { // Atribuicao de valores a uma lista,
                                                                                // e.g., "lista = [1, 2, 3]"
                    String[] parts = instruction.split(" = ");
                    String var = parts[0];
                    String values = parts[1].replaceAll("[\\[\\]]", "");
                    String[] valueArray = values.split(",\\s*");
                    for (int i = 0; i < valueArray.length; i++) {
                        assemblyCode.add("STORE " + var + ", " + i + ", " + valueArray[i] + "    ; " + var + "[" + i
                                + "] = " + valueArray[i]);
                    }

                } else if (instr.matches("add \\(\\w+, \\d+, \\d+\\)")) { // Addition to list element, e.g., "ADD
                                                                          // List[2], 4"
                    String[] parts = instr.split("\\(|, |\\)");
                    String list = parts[1];
                    String index = parts[2];
                    String value = parts[3];

                    assemblyCode.add("\n; Adição de elemento na lista");
                    assemblyCode.add("LOAD R1, " + list + "     ; R1 = endereço base da lista");
                    assemblyCode.add("MOV R2, " + index + "     ; R2 = índice do elemento a adicionar");
                    assemblyCode.add("MOV R3, " + value + "     ; R3 = valor a adicionar");

                    assemblyCode.add("\n; Verificar se o índice é válido");
                    assemblyCode.add("LOAD R4, lista_size     ; R4 = tamanho da lista");
                    assemblyCode.add("CMP R2, R4    ; Comparar índice com tamanho da lista");
                    assemblyCode.add("JL ERROR   ; Se índice < tamanho da lista, saltar para ERROR");

                    assemblyCode.add("\n; Adicionar elemento à lista");
                    assemblyCode.add("ADD R1, R1, R2    ; R1 = endereço do elemento a adicionar");
                    assemblyCode.add("STORE R1, R3    ; " + list + "[" + index + "] = " + value);

                    assemblyCode.add("\n; Atualizar tamanho da lista");
                    assemblyCode.add("ADD R4, R4, 1    ; R4 = novo tamanho da lista");
                    assemblyCode.add("STORE lista_size, R4    ; Atualizar tamanho da lista");

                    assemblyCode.add("\nJMP END");

                    // assemblyCode.add("ADD " + list + "[" + index + "], " + value);

                } else if (instr.matches("print\\(.+\\)")) { // Print statement, e.g., "print('Error')"

                    String message = instr.substring(6, instr.length() - 1);
                    assemblyCode.add("PRINT " + message);

                } else if (instr.matches("if \\d+ > \\d+ goto \\w+")) { // Conditional jump, e.g., "if 5 > 3 goto L1"

                    String[] parts = instr.split(" if | > | goto ");
                    String condition1 = parts[0];
                    String condition2 = parts[1];
                    String label = parts[2];
                    assemblyCode.add("CMP " + condition1 + ", " + condition2);
                    assemblyCode.add("JG " + label);

                } else if (instr.startsWith("L")) { // Labels, e.g., "L1:"

                    assemblyCode.add(instr);

                } else if (instr.startsWith("goto")) { // Unconditional jump, e.g., "goto END"

                    String label = instr.split(" ")[1];
                    assemblyCode.add("JMP " + label);

                } else { // Verificar tudo o que nao foi reconhecido

                    assemblyCode.add("Erro: " + instr);
                }
            }
        }

        assemblyCode.add("\nEND:");

        return assemblyCode;

    }
}
