/* This file was generated by SableCC (http://www.sablecc.org/). */

package tp6.node;

import tp6.analysis.*;

@SuppressWarnings("nls")
public final class TModulo extends Token
{
    public TModulo()
    {
        super.setText("%");
    }

    public TModulo(int line, int pos)
    {
        super.setText("%");
        setLine(line);
        setPos(pos);
    }

    @Override
    public Object clone()
    {
      return new TModulo(getLine(), getPos());
    }

    public void apply(Switch sw)
    {
        ((Analysis) sw).caseTModulo(this);
    }

    @Override
    public void setText(@SuppressWarnings("unused") String text)
    {
        throw new RuntimeException("Cannot change TModulo text.");
    }
}
