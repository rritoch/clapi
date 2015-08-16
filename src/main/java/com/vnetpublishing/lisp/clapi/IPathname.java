package com.vnetpublishing.lisp.clapi;

public interface IPathname extends ILispObject {

	ILispObject getDirectory();
	ILispObject getDirectory(IKeyword pcase);
	ILispObject getDevice();
	ILispObject getDevice(IKeyword pcase);
	ILispObject getHost();
	ILispObject getHost(IKeyword pcase);
	ILispObject getName();
	ILispObject getName(IKeyword pcase);
	ILispObject getType();
	ILispObject getType(IKeyword pcase);
	
}
