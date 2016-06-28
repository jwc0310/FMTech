public final class kme
  implements kif
{
  public final boolean a(gnb paramgnb)
  {
    return (paramgnb != null) && (!paramgnb.b()) && (paramgnb.c.length + paramgnb.e.length + paramgnb.d.length > 0);
  }
  
  public final gnb b(gnb paramgnb)
  {
    if (a(paramgnb)) {
      return new gnb(null, paramgnb.c, paramgnb.d, paramgnb.e);
    }
    return null;
  }
}


/* Location:           F:\apktool\apktool\com.google.android.apps.plus\classes-dex2jar.jar
 * Qualified Name:     kme
 * JD-Core Version:    0.7.0.1
 */