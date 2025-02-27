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

@ExposedType(name = "_ast.Nonlocal", base = stmt.class)
public class Nonlocal extends stmt {
public static final PyType TYPE = PyType.fromClass(Nonlocal.class);
    private java.util.List<String> names;
    public java.util.List<String> getInternalNames() {
        return names;
    }
    @ExposedGet(name = "names")
    public PyObject getNames() {
        return new AstList(names, AstAdapters.identifierAdapter);
    }
    @ExposedSet(name = "names")
    public void setNames(PyObject names) {
        this.names = AstAdapters.py2identifierList(names);
    }


    private final static PyUnicode[] fields =
    new PyUnicode[] {new PyUnicode("names")};
    @ExposedGet(name = "_fields")
    public PyUnicode[] get_fields() { return fields; }

    private final static PyUnicode[] attributes =
    new PyUnicode[] {new PyUnicode("lineno"), new PyUnicode("col_offset")};
    @ExposedGet(name = "_attributes")
    public PyUnicode[] get_attributes() { return attributes; }

    public Nonlocal(PyType subType) {
        super(subType);
    }
    public Nonlocal() {
        this(TYPE);
    }
    @ExposedNew
    @ExposedMethod
    public void Nonlocal___init__(PyObject[] args, String[] keywords) {
        ArgParser ap = new ArgParser("Nonlocal", args, keywords, new String[]
            {"names", "lineno", "col_offset"}, 1, true);
        setNames(ap.getPyObject(0, Py.None));
        int lin = ap.getInt(1, -1);
        if (lin != -1) {
            setLineno(lin);
        }

        int col = ap.getInt(2, -1);
        if (col != -1) {
            setLineno(col);
        }

    }

    public Nonlocal(PyObject names) {
        setNames(names);
    }

    public Nonlocal(Token token, java.util.List<String> names) {
        super(token);
        this.names = names;
    }

    public Nonlocal(Integer ttype, Token token, java.util.List<String> names) {
        super(ttype, token);
        this.names = names;
    }

    public Nonlocal(PythonTree tree, java.util.List<String> names) {
        super(tree);
        this.names = names;
    }

    @ExposedGet(name = "repr")
    public String toString() {
        return "Nonlocal";
    }

    public String toStringTree() {
        StringBuffer sb = new StringBuffer("Nonlocal(");
        sb.append("names=");
        sb.append(dumpThis(names));
        sb.append(",");
        sb.append(")");
        return sb.toString();
    }

    public <R> R accept(VisitorIF<R> visitor) throws Exception {
        return visitor.visitNonlocal(this);
    }

    public void traverse(VisitorIF<?> visitor) throws Exception {
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

    // Support for indexer below

    private java.util.List<Name> nameNodes;
    public java.util.List<Name> getInternalNameNodes() {
        return nameNodes;
    }
    public Nonlocal(Token token, java.util.List<String> names, java.util.List<Name> nameNodes) {
        super(token);
        this.names = names;
        this.nameNodes = nameNodes;
    }
    // End indexer support


    @Override
    public int getNodeType(){return NONLOCAL;};
}
