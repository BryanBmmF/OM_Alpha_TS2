
//----------------------------------------------------
// The following code was generated by CUP v0.11b 20160615 (GIT 4ac7450)
//----------------------------------------------------

package gnz.analizadores;

import java_cup.runtime.*;
import java.util.LinkedList;
import gnz.backend.objetoMovil.Movimiento;
import java_cup.runtime.XMLElement;

/** CUP v0.11b 20160615 (GIT 4ac7450) generated parser.
  */
@SuppressWarnings({"rawtypes"})
public class parser1 extends java_cup.runtime.lr_parser {

 public final Class getSymbolContainer() {
    return sym1.class;
}

  /** Default constructor. */
  @Deprecated
  public parser1() {super();}

  /** Constructor which sets the default scanner. */
  @Deprecated
  public parser1(java_cup.runtime.Scanner s) {super(s);}

  /** Constructor which sets the default scanner. */
  public parser1(java_cup.runtime.Scanner s, java_cup.runtime.SymbolFactory sf) {super(s,sf);}

  /** Production table. */
  protected static final short _production_table[][] = 
    unpackFromStrings(new String[] {
    "\000\012\000\002\002\004\000\002\002\007\000\002\005" +
    "\004\000\002\005\003\000\002\004\013\000\002\004\014" +
    "\000\002\003\003\000\002\003\003\000\002\003\003\000" +
    "\002\003\003" });

  /** Access to production table. */
  public short[][] production_table() {return _production_table;}

  /** Parse-action table. */
  protected static final short[][] _action_table = 
    unpackFromStrings(new String[] {
    "\000\041\000\004\007\005\001\002\000\004\002\043\001" +
    "\002\000\004\011\006\001\002\000\006\012\007\013\010" +
    "\001\002\000\004\005\027\001\002\000\004\005\016\001" +
    "\002\000\010\010\ufffe\012\ufffe\013\ufffe\001\002\000\010" +
    "\010\013\012\007\013\010\001\002\000\004\011\015\001" +
    "\002\000\010\010\uffff\012\uffff\013\uffff\001\002\000\004" +
    "\002\000\001\002\000\004\022\017\001\002\000\004\020" +
    "\020\001\002\000\004\004\021\001\002\000\004\022\022" +
    "\001\002\000\004\004\023\001\002\000\004\022\024\001" +
    "\002\000\004\021\025\001\002\000\004\006\026\001\002" +
    "\000\010\010\ufffc\012\ufffc\013\ufffc\001\002\000\004\022" +
    "\030\001\002\000\004\020\031\001\002\000\004\004\032" +
    "\001\002\000\004\022\033\001\002\000\004\004\034\001" +
    "\002\000\012\014\040\015\037\016\036\017\041\001\002" +
    "\000\004\006\042\001\002\000\004\006\ufff9\001\002\000" +
    "\004\006\ufffa\001\002\000\004\006\ufffb\001\002\000\004" +
    "\006\ufff8\001\002\000\010\010\ufffd\012\ufffd\013\ufffd\001" +
    "\002\000\004\002\001\001\002" });

  /** Access to parse-action table. */
  public short[][] action_table() {return _action_table;}

  /** <code>reduce_goto</code> table. */
  protected static final short[][] _reduce_table = 
    unpackFromStrings(new String[] {
    "\000\041\000\004\002\003\001\001\000\002\001\001\000" +
    "\002\001\001\000\006\004\010\005\011\001\001\000\002" +
    "\001\001\000\002\001\001\000\002\001\001\000\004\004" +
    "\013\001\001\000\002\001\001\000\002\001\001\000\002" +
    "\001\001\000\002\001\001\000\002\001\001\000\002\001" +
    "\001\000\002\001\001\000\002\001\001\000\002\001\001" +
    "\000\002\001\001\000\002\001\001\000\002\001\001\000" +
    "\002\001\001\000\002\001\001\000\002\001\001\000\002" +
    "\001\001\000\002\001\001\000\004\003\034\001\001\000" +
    "\002\001\001\000\002\001\001\000\002\001\001\000\002" +
    "\001\001\000\002\001\001\000\002\001\001\000\002\001" +
    "\001" });

  /** Access to <code>reduce_goto</code> table. */
  public short[][] reduce_table() {return _reduce_table;}

  /** Instance of action encapsulation class. */
  protected CUP$parser1$actions action_obj;

  /** Action encapsulation object initializer. */
  protected void init_actions()
    {
      action_obj = new CUP$parser1$actions(this);
    }

  /** Invoke a user supplied parse action. */
  public java_cup.runtime.Symbol do_action(
    int                        act_num,
    java_cup.runtime.lr_parser parser,
    java.util.Stack            stack,
    int                        top)
    throws java.lang.Exception
  {
    /* call code in generated class */
    return action_obj.CUP$parser1$do_action(act_num, parser, stack, top);
  }

  /** Indicates start state. */
  public int start_state() {return 0;}
  /** Indicates start production. */
  public int start_production() {return 0;}

  /** <code>EOF</code> Symbol index. */
  public int EOF_sym() {return 0;}

  /** <code>error</code> Symbol index. */
  public int error_sym() {return 1;}



    public LinkedList<Movimiento> listavalores;

    /**
     * Método al que se llama automáticamente ante algún error sintactico.
     **/ 
    public void syntax_error(Symbol s){ 
        int fil = (s.right)+1;
        int col = (s.left)+1;
        System.out.println("Error Sintáctico en la Línea " + (col) +
        " Columna "+(fil)+ ". No se esperaba este componente: " +s.value+"."); 
    } 

    /**
     * Método al que se llama automáticamente ante algún error sintáctico 
     * en el que ya no es posible una recuperación de errores.
     **/ 
    public void unrecovered_syntax_error(Symbol s) throws java.lang.Exception{ 
        int fil = (s.right)+1;
        int col = (s.left)+1;
        System.out.println("Error síntactico irrecuperable en la Línea " + 
        (col)+ " Columna "+(fil)+". Componente " + s.value + 
        " no reconocido."); 
    }  


/** Cup generated class to encapsulate user supplied action code.*/
@SuppressWarnings({"rawtypes", "unchecked", "unused"})
class CUP$parser1$actions {
  private final parser1 parser;

  /** Constructor */
  CUP$parser1$actions(parser1 parser) {
    this.parser = parser;
  }

  /** Method 0 with the actual generated action code for actions 0 to 300. */
  public final java_cup.runtime.Symbol CUP$parser1$do_action_part00000000(
    int                        CUP$parser1$act_num,
    java_cup.runtime.lr_parser CUP$parser1$parser,
    java.util.Stack            CUP$parser1$stack,
    int                        CUP$parser1$top)
    throws java.lang.Exception
    {
      /* Symbol object for return from actions */
      java_cup.runtime.Symbol CUP$parser1$result;

      /* select the action based on the action number */
      switch (CUP$parser1$act_num)
        {
          /*. . . . . . . . . . . . . . . . . . . .*/
          case 0: // $START ::= S EOF 
            {
              Object RESULT =null;
		int start_valleft = ((java_cup.runtime.Symbol)CUP$parser1$stack.elementAt(CUP$parser1$top-1)).left;
		int start_valright = ((java_cup.runtime.Symbol)CUP$parser1$stack.elementAt(CUP$parser1$top-1)).right;
		Object start_val = (Object)((java_cup.runtime.Symbol) CUP$parser1$stack.elementAt(CUP$parser1$top-1)).value;
		RESULT = start_val;
              CUP$parser1$result = parser.getSymbolFactory().newSymbol("$START",0, ((java_cup.runtime.Symbol)CUP$parser1$stack.elementAt(CUP$parser1$top-1)), ((java_cup.runtime.Symbol)CUP$parser1$stack.peek()), RESULT);
            }
          /* ACCEPT */
          CUP$parser1$parser.done_parsing();
          return CUP$parser1$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 1: // S ::= RIni RTra LVALORES RFin RTra 
            {
              Object RESULT =null;
		int aleft = ((java_cup.runtime.Symbol)CUP$parser1$stack.elementAt(CUP$parser1$top-2)).left;
		int aright = ((java_cup.runtime.Symbol)CUP$parser1$stack.elementAt(CUP$parser1$top-2)).right;
		LinkedList<Movimiento> a = (LinkedList<Movimiento>)((java_cup.runtime.Symbol) CUP$parser1$stack.elementAt(CUP$parser1$top-2)).value;
		
    parser.listavalores=a;
    
              CUP$parser1$result = parser.getSymbolFactory().newSymbol("S",0, ((java_cup.runtime.Symbol)CUP$parser1$stack.elementAt(CUP$parser1$top-4)), ((java_cup.runtime.Symbol)CUP$parser1$stack.peek()), RESULT);
            }
          return CUP$parser1$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 2: // LVALORES ::= LVALORES VALOR 
            {
              LinkedList<Movimiento> RESULT =null;
		int aleft = ((java_cup.runtime.Symbol)CUP$parser1$stack.elementAt(CUP$parser1$top-1)).left;
		int aright = ((java_cup.runtime.Symbol)CUP$parser1$stack.elementAt(CUP$parser1$top-1)).right;
		LinkedList<Movimiento> a = (LinkedList<Movimiento>)((java_cup.runtime.Symbol) CUP$parser1$stack.elementAt(CUP$parser1$top-1)).value;
		int bleft = ((java_cup.runtime.Symbol)CUP$parser1$stack.peek()).left;
		int bright = ((java_cup.runtime.Symbol)CUP$parser1$stack.peek()).right;
		Movimiento b = (Movimiento)((java_cup.runtime.Symbol) CUP$parser1$stack.peek()).value;
		
    RESULT=a;
    RESULT.add(b);
    
              CUP$parser1$result = parser.getSymbolFactory().newSymbol("LVALORES",3, ((java_cup.runtime.Symbol)CUP$parser1$stack.elementAt(CUP$parser1$top-1)), ((java_cup.runtime.Symbol)CUP$parser1$stack.peek()), RESULT);
            }
          return CUP$parser1$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 3: // LVALORES ::= VALOR 
            {
              LinkedList<Movimiento> RESULT =null;
		int aleft = ((java_cup.runtime.Symbol)CUP$parser1$stack.peek()).left;
		int aright = ((java_cup.runtime.Symbol)CUP$parser1$stack.peek()).right;
		Movimiento a = (Movimiento)((java_cup.runtime.Symbol) CUP$parser1$stack.peek()).value;
		
    LinkedList<Movimiento> listavalores= new LinkedList<Movimiento>();
    RESULT=listavalores;
    RESULT.add(a);
    
              CUP$parser1$result = parser.getSymbolFactory().newSymbol("LVALORES",3, ((java_cup.runtime.Symbol)CUP$parser1$stack.peek()), ((java_cup.runtime.Symbol)CUP$parser1$stack.peek()), RESULT);
            }
          return CUP$parser1$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 4: // VALOR ::= RMre Para numerico Rcm com numerico com DIRECCION Parc 
            {
              Movimiento RESULT =null;
		int aleft = ((java_cup.runtime.Symbol)CUP$parser1$stack.elementAt(CUP$parser1$top-6)).left;
		int aright = ((java_cup.runtime.Symbol)CUP$parser1$stack.elementAt(CUP$parser1$top-6)).right;
		String a = (String)((java_cup.runtime.Symbol) CUP$parser1$stack.elementAt(CUP$parser1$top-6)).value;
		int bleft = ((java_cup.runtime.Symbol)CUP$parser1$stack.elementAt(CUP$parser1$top-3)).left;
		int bright = ((java_cup.runtime.Symbol)CUP$parser1$stack.elementAt(CUP$parser1$top-3)).right;
		String b = (String)((java_cup.runtime.Symbol) CUP$parser1$stack.elementAt(CUP$parser1$top-3)).value;
		int cleft = ((java_cup.runtime.Symbol)CUP$parser1$stack.elementAt(CUP$parser1$top-1)).left;
		int cright = ((java_cup.runtime.Symbol)CUP$parser1$stack.elementAt(CUP$parser1$top-1)).right;
		String c = (String)((java_cup.runtime.Symbol) CUP$parser1$stack.elementAt(CUP$parser1$top-1)).value;
		
        Movimiento mov=new Movimiento(c, a, b, "0"); 
        RESULT=mov;
    
              CUP$parser1$result = parser.getSymbolFactory().newSymbol("VALOR",2, ((java_cup.runtime.Symbol)CUP$parser1$stack.elementAt(CUP$parser1$top-8)), ((java_cup.runtime.Symbol)CUP$parser1$stack.peek()), RESULT);
            }
          return CUP$parser1$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 5: // VALOR ::= RMdi Para numerico Rcm com numerico com numerico RGra Parc 
            {
              Movimiento RESULT =null;
		int aleft = ((java_cup.runtime.Symbol)CUP$parser1$stack.elementAt(CUP$parser1$top-7)).left;
		int aright = ((java_cup.runtime.Symbol)CUP$parser1$stack.elementAt(CUP$parser1$top-7)).right;
		String a = (String)((java_cup.runtime.Symbol) CUP$parser1$stack.elementAt(CUP$parser1$top-7)).value;
		int bleft = ((java_cup.runtime.Symbol)CUP$parser1$stack.elementAt(CUP$parser1$top-4)).left;
		int bright = ((java_cup.runtime.Symbol)CUP$parser1$stack.elementAt(CUP$parser1$top-4)).right;
		String b = (String)((java_cup.runtime.Symbol) CUP$parser1$stack.elementAt(CUP$parser1$top-4)).value;
		int cleft = ((java_cup.runtime.Symbol)CUP$parser1$stack.elementAt(CUP$parser1$top-2)).left;
		int cright = ((java_cup.runtime.Symbol)CUP$parser1$stack.elementAt(CUP$parser1$top-2)).right;
		String c = (String)((java_cup.runtime.Symbol) CUP$parser1$stack.elementAt(CUP$parser1$top-2)).value;
		
        Movimiento mov=new Movimiento("4", a, b, c);
        RESULT=mov;
    
              CUP$parser1$result = parser.getSymbolFactory().newSymbol("VALOR",2, ((java_cup.runtime.Symbol)CUP$parser1$stack.elementAt(CUP$parser1$top-9)), ((java_cup.runtime.Symbol)CUP$parser1$stack.peek()), RESULT);
            }
          return CUP$parser1$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 6: // DIRECCION ::= RAde 
            {
              String RESULT =null;
		
        RESULT="0";
    
              CUP$parser1$result = parser.getSymbolFactory().newSymbol("DIRECCION",1, ((java_cup.runtime.Symbol)CUP$parser1$stack.peek()), ((java_cup.runtime.Symbol)CUP$parser1$stack.peek()), RESULT);
            }
          return CUP$parser1$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 7: // DIRECCION ::= RAtr 
            {
              String RESULT =null;
		
        RESULT="1";
    
              CUP$parser1$result = parser.getSymbolFactory().newSymbol("DIRECCION",1, ((java_cup.runtime.Symbol)CUP$parser1$stack.peek()), ((java_cup.runtime.Symbol)CUP$parser1$stack.peek()), RESULT);
            }
          return CUP$parser1$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 8: // DIRECCION ::= RArr 
            {
              String RESULT =null;
		
        RESULT="2";    
    
              CUP$parser1$result = parser.getSymbolFactory().newSymbol("DIRECCION",1, ((java_cup.runtime.Symbol)CUP$parser1$stack.peek()), ((java_cup.runtime.Symbol)CUP$parser1$stack.peek()), RESULT);
            }
          return CUP$parser1$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 9: // DIRECCION ::= RAba 
            {
              String RESULT =null;
		
        RESULT="3";
    
              CUP$parser1$result = parser.getSymbolFactory().newSymbol("DIRECCION",1, ((java_cup.runtime.Symbol)CUP$parser1$stack.peek()), ((java_cup.runtime.Symbol)CUP$parser1$stack.peek()), RESULT);
            }
          return CUP$parser1$result;

          /* . . . . . .*/
          default:
            throw new Exception(
               "Invalid action number "+CUP$parser1$act_num+"found in internal parse table");

        }
    } /* end of method */

  /** Method splitting the generated action code into several parts. */
  public final java_cup.runtime.Symbol CUP$parser1$do_action(
    int                        CUP$parser1$act_num,
    java_cup.runtime.lr_parser CUP$parser1$parser,
    java.util.Stack            CUP$parser1$stack,
    int                        CUP$parser1$top)
    throws java.lang.Exception
    {
              return CUP$parser1$do_action_part00000000(
                               CUP$parser1$act_num,
                               CUP$parser1$parser,
                               CUP$parser1$stack,
                               CUP$parser1$top);
    }
}

}