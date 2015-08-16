package com.vnetpublishing.lisp.clapi;

public interface IList {
	ILispObject car(IList list_in);
	ILispObject cdr(IList list_in);
}
