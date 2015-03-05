
package com.zippyrate.dsls.md.parser;

public class MDDumpVisitor implements MDParserVisitor
{
  public void defaultVisit(SimpleNode node, Object data){
    node.childrenAccept(this, data);
  }
  public void visit(SimpleNode node, Object data){
    defaultVisit(node, data);
  }
  public void visit(ASTFileExpression node, Object data){
    defaultVisit(node, data);
  }
  public void visit(ASTMDExpression node, Object data){
    defaultVisit(node, data);
  }
  public void visit(ASTMDNamespace node, Object data){
    System.out.println("Namespace: " + node.namespace);
  }
  public void visit(ASTMDPrefix node, Object data){
    defaultVisit(node, data);
  }
  public void visit(ASTMDElement node, Object data){
    defaultVisit(node, data);
  }
  public void visit(ASTLiteral node, Object data){
    defaultVisit(node, data);
  }
  public void visit(ASTIntegerLiteral node, Object data){
    defaultVisit(node, data);
  }
  public void visit(ASTFloatLiteral node, Object data){
    defaultVisit(node, data);
  }
  public void visit(ASTStringLiteral node, Object data){
    defaultVisit(node, data);
  }
  public void visit(ASTBooleanLiteral node, Object data){
    defaultVisit(node, data);
  }
  public void visit(ASTLanguage node, Object data){
    defaultVisit(node, data);
  }
}
