/* Generated By:JJTree: Do not edit this line. ASTname_addr.java Version 4.3 */
/* JavaCCOptions:MULTI=true,NODE_USES_PARSER=false,VISITOR=true,TRACK_TOKENS=false,NODE_PREFIX=AST,NODE_EXTENDS=org.apache.james.mime4j.field.address.parser.BaseNode,NODE_FACTORY=,SUPPORT_CLASS_VISIBILITY_PUBLIC=true */
package org.apache.james.mime4j.field.address.parser;

public
class ASTname_addr extends SimpleNode {
  public ASTname_addr(int id) {
    super(id);
  }

  public ASTname_addr(AddressListParser p, int id) {
    super(p, id);
  }


  /** Accept the visitor. **/
  public Object jjtAccept(AddressListParserVisitor visitor, Object data) {
    return visitor.visit(this, data);
  }
}
/* JavaCC - OriginalChecksum=37e69dc07dfc157b3fb2449483ff82b6 (do not edit this line) */
