// Autogenerated AST node
package org.python.antlr.ast;
import org.antlr.runtime.CommonToken;
import org.antlr.runtime.Token;
import org.python.antlr.AST;
import org.python.antlr.PythonTree;
import org.python.antlr.adapter.AstAdapters;
import org.python.antlr.base.excepthandler;
import org.python.antlr.base.expr;
import org.python.antlr.base.mod;
import org.python.antlr.base.slice;
import org.python.antlr.base.stmt;
import org.python.core.ArgParser;
import org.python.core.AstList;
import org.python.core.Py;
import org.python.core.PyObject;

import org.python.core.PyUnicode;
import org.python.core.PyStringMap;
import org.python.core.PyType;
import org.python.core.Visitproc;
import org.python.expose.ExposedGet;
import org.python.expose.ExposedMethod;
import org.python.expose.ExposedNew;
import org.python.expose.ExposedSet;
import org.python.expose.ExposedType;
import java.io.DataOutputStream;
import java.io.IOException;
import java.util.ArrayList;

@ExposedType(name = "_ast.Dict", base = expr.class)
public class Dict extends expr {
public static final PyType TYPE = PyType.fromClass(Dict.class);
    private java.util.List<expr> keys;
    public java.util.List<expr> getInternalKeys() {
        return keys;
    }
    @ExposedGet(name = "keys")
    public PyObject getKeys() {
        return new AstList(keys, AstAdapters.exprAdapter);
    }
    @ExposedSet(name = "keys")
    public void setKeys(PyObject keys) {
        this.keys = AstAdapters.py2exprList(keys);
    }
    public void setKeys(java.util.List<expr> keys) {
        this.keys =  keys;
    }

    private java.util.List<expr> values;
    public java.util.List<expr> getInternalValues() {
        return values;
    }
    @ExposedGet(name = "values")
    public PyObject getValues() {
        return new AstList(values, AstAdapters.exprAdapter);
    }
    @ExposedSet(name = "values")
    public void setValues(PyObject values) {
        this.values = AstAdapters.py2exprList(values);
    }
    public void setValues(java.util.List<expr> values) {
        this.values =  values;
    }

    private final static PyUnicode[] fields =
    new PyUnicode[] {new PyUnicode("keys"), new PyUnicode("values")};
    @ExposedGet(name = "_fields")
    public PyUnicode[] get_fields() { return fields; }

    private final static PyUnicode[] attributes =
    new PyUnicode[] {new PyUnicode("lineno"), new PyUnicode("col_offset")};
    @ExposedGet(name = "_attributes")
    public PyUnicode[] get_attributes() { return attributes; }

    public Dict(PyType subType) {
        super(subType);
    }
    public Dict() {
        this(TYPE);
    }
    @ExposedNew
    @ExposedMethod
    public void Dict___init__(PyObject[] args, String[] keywords) {
        ArgParser ap = new ArgParser("Dict", args, keywords, new String[]
            {"keys", "values", "lineno", "col_offset"}, 2, true);
        setKeys(ap.getPyObject(0, Py.None));
        setValues(ap.getPyObject(1, Py.None));
        int lin = ap.getInt(2, -1);
        if (lin != -1) {
            setLineno(lin);
        }

        int col = ap.getInt(3, -1);
        if (col != -1) {
            setLineno(col);
        }

    }

    public Dict(PyObject keys, PyObject values) {
        setKeys(keys);
        setValues(values);
    }

    public Dict(Token token, java.util.List<expr> keys, java.util.List<expr> values) {
        super(token);
        this.keys = keys;
        if (keys == null) {
            this.keys = new ArrayList<expr>();
        }
        for(PythonTree t : this.keys) {
            addChild(t);
        }
        this.values = values;
        if (values == null) {
            this.values = new ArrayList<expr>();
        }
        for(PythonTree t : this.values) {
            addChild(t);
        }
    }

    public Dict(Integer ttype, Token token, java.util.List<expr> keys, java.util.List<expr> values)
    {
        super(ttype, token);
        this.keys = keys;
        if (keys == null) {
            this.keys = new ArrayList<expr>();
        }
        for(PythonTree t : this.keys) {
            addChild(t);
        }
        this.values = values;
        if (values == null) {
            this.values = new ArrayList<expr>();
        }
        for(PythonTree t : this.values) {
            addChild(t);
        }
    }

    public Dict(PythonTree tree, java.util.List<expr> keys, java.util.List<expr> values) {
        super(tree);
        this.keys = keys;
        if (keys == null) {
            this.keys = new ArrayList<expr>();
        }
        for(PythonTree t : this.keys) {
            addChild(t);
        }
        this.values = values;
        if (values == null) {
            this.values = new ArrayList<expr>();
        }
        for(PythonTree t : this.values) {
            addChild(t);
        }
    }

    @ExposedGet(name = "repr")
    public String toString() {
        return "Dict";
    }

    public String toStringTree() {
        StringBuffer sb = new StringBuffer("Dict(");
        sb.append("keys=");
        sb.append(dumpThis(keys));
        sb.append(",");
        sb.append("values=");
        sb.append(dumpThis(values));
        sb.append(",");
        sb.append(")");
        return sb.toString();
    }

    public <R> R accept(VisitorIF<R> visitor) throws Exception {
        return visitor.visitDict(this);
    }

    public void traverse(VisitorIF<?> visitor) throws Exception {
        if (keys != null) {
            for (PythonTree t : keys) {
                if (t != null)
                    t.accept(visitor);
            }
        }
        if (values != null) {
            for (PythonTree t : values) {
                if (t != null)
                    t.accept(visitor);
            }
        }
    }

    public PyObject __dict__;

    @Override
    public PyObject fastGetDict() {
        ensureDict();
        return __dict__;
    }

    @ExposedGet(name = "__dict__")
    public PyObject getDict() {
        return fastGetDict();
    }

    private void ensureDict() {
        if (__dict__ == null) {
            __dict__ = new PyStringMap();
        }
    }

    private int lineno = -1;
    @ExposedGet(name = "lineno")
    public int getLineno() {
        if (lineno != -1) {
            return lineno;
        }
        return getLine();
    }

    @ExposedSet(name = "lineno")
    public void setLineno(int num) {
        lineno = num;
    }

    private int col_offset = -1;
    @ExposedGet(name = "col_offset")
    public int getCol_offset() {
        if (col_offset != -1) {
            return col_offset;
        }
        return getCharPositionInLine();
    }

    @ExposedSet(name = "col_offset")
    public void setCol_offset(int num) {
        col_offset = num;
    }

}
