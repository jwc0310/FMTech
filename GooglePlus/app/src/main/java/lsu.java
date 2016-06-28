final class lsu
{
  lss a;
  
  public final lss a()
  {
    lss locallss = this.a;
    if (locallss != null) {
      this.a = locallss.m;
    }
    return locallss;
  }
  
  public final boolean a(lss paramlss)
  {
    boolean bool1 = true;
    lss locallss = this.a;
    if (locallss != null) {
      if (locallss != paramlss) {}
    }
    for (boolean bool2 = bool1;; bool2 = false)
    {
      if (!bool2) {
        break label40;
      }
      return false;
      locallss = locallss.m;
      break;
    }
    label40:
    if (this.a == null) {}
    for (;;)
    {
      paramlss.m = this.a;
      this.a = paramlss;
      return bool1;
      bool1 = false;
    }
  }
}


/* Location:           F:\apktool\apktool\com.google.android.apps.plus\classes-dex2jar.jar
 * Qualified Name:     lsu
 * JD-Core Version:    0.7.0.1
 */