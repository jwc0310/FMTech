public final class kmd
  implements kie
{
  public final boolean a(gnb paramgnb)
  {
    return (paramgnb != null) && (!paramgnb.b()) && ((paramgnb.c.length > 0) || (paramgnb.e.length > 0));
  }
  
  public final gnb b(gnb paramgnb)
  {
    if (a(paramgnb)) {
      return new gnb(null, paramgnb.c, null, paramgnb.e);
    }
    return null;
  }
}


/* Location:           F:\apktool\apktool\com.google.android.apps.plus\classes-dex2jar.jar
 * Qualified Name:     kmd
 * JD-Core Version:    0.7.0.1
 */